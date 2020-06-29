package net.ajaskey.market.tools.SIP.BigDB;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DbTests5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2501");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(2015, 10);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2502");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) (short) 100, (-1));
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2503");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) (byte) 0, (int) ' ');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2504");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2505");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) 'a', 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) 'a', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 0, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 0, 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(100, (int) (short) -1, fieldDataList21);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2506");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) -1, (int) (byte) 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 10, (int) 'a', fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2507");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, 1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2508");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 1, 0);
        java.lang.Class<?> wildcardClass35 = fieldDataList34.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2509");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(100, (int) (short) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, 10, fieldDataList4);
        java.lang.Class<?> wildcardClass6 = fieldDataList4.getClass();
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2510");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 10, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 2020, (-1));
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(10, 10, fieldDataList26);
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
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2511");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 2020, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 0, (int) '#');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(10, (int) '#', fieldDataList14);
        java.lang.Class<?> wildcardClass16 = fieldDataList14.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2512");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 1, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 10, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, (int) ' ');
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
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2513");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2514");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (-1));
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2515");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2516");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 0, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) 'a', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList29 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 100, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList32 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) '4', (int) (short) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(10, (int) (byte) -1, fieldDataList32);
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
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2517");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (byte) -1, (-1));
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2518");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (-1), (int) (short) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2519");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '#', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList37 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) (short) 0);
        java.lang.Class<?> wildcardClass38 = fieldDataList37.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2520");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) '#', (int) (short) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2521");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 100, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2015, (int) (byte) 1);
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
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2522");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 10, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2523");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 2015);
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
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2524");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList9, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList9, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList9, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList9, (int) (byte) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList9, (int) (short) -1, (int) '#');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2020, (int) (short) 10, fieldDataList25);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 0, 100, fieldDataList25);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) ' ', fieldDataList25);
        java.lang.Class<?> wildcardClass29 = fieldDataList25.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList19);
        org.junit.Assert.assertNotNull(fieldDataList22);
        org.junit.Assert.assertNotNull(fieldDataList25);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2525");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 10, (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) (byte) -1, fieldDataList10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 10, 2020, fieldDataList10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) ' ', (int) (short) 0, fieldDataList10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) -1, (int) (byte) 100, fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList10);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2526");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 2020, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) '#', 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 0, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) '4', (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 1, (int) '4');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) -1, 2020, fieldDataList20);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2527");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, (int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = fieldDataList6.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2528");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) ' ', (int) '4');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((-1), (int) (byte) 100, fieldDataList8);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 0, 1, fieldDataList8);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 10, (int) '#', fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList8);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2529");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = null;
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 0, (int) (byte) 0, fieldDataList2);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2530");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2531");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) -1, (int) (short) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, 2015, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2532");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 100, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 0, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 2020, (int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 0, 1, fieldDataList27);
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
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2533");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 0, (int) (byte) 100);
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
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2534");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 0, (int) (byte) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 10, 2020, fieldDataList4);
        java.lang.Class<?> wildcardClass6 = fieldDataList4.getClass();
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2535");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '#', (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, (int) '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList19);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2536");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", 2020, (int) (byte) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2537");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList9, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList9, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList9, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList9, (-1), (int) (short) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) (byte) 10, fieldDataList22);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) 'a', (int) (short) 0, fieldDataList22);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2015, 0, fieldDataList22);
        java.lang.Class<?> wildcardClass26 = fieldDataList22.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList19);
        org.junit.Assert.assertNotNull(fieldDataList22);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2538");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) (short) 10);
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
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2539");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList37 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList40 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 10);
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
        org.junit.Assert.assertNotNull(fieldDataList40);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2540");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', 2015);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((-1), 0, fieldDataList24);
        java.lang.Class<?> wildcardClass26 = fieldDataList24.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(fieldDataList24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2541");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 100, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 10, (int) (byte) 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 100, (int) (byte) 0, fieldDataList18);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2542");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) '#', 2015);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 0, (int) ' ', fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2543");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(10, (int) 'a');
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2544");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(10, 2020);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((-1), (int) '4', fieldDataList4);
        java.lang.Class<?> wildcardClass6 = fieldDataList4.getClass();
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2545");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2546");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList33 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 0, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList36 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '4', (int) (short) 0);
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
        org.junit.Assert.assertNotNull(fieldDataList36);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2547");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray6 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList7, fieldDataArray6);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '#', 0, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList7);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(10, (int) (byte) 1, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList7);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2015, (int) (short) 10, (java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2548");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', (int) (short) 1);
        java.lang.Class<?> wildcardClass35 = fieldDataList34.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2549");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (-1), (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (short) -1);
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
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2550");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 100, (int) (short) 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) -1, 0, fieldDataList27);
        java.lang.Class<?> wildcardClass29 = fieldDataList27.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(fieldDataList24);
        org.junit.Assert.assertNotNull(fieldDataList27);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2551");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 10, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList29 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) '#', (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList32 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 10, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) 'a', (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList38 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 10, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList41 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) 'a', (int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) 'a', 0, fieldDataList41);
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
        org.junit.Assert.assertNotNull(fieldDataList38);
        org.junit.Assert.assertNotNull(fieldDataList41);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2552");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 0, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, 0);
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
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2553");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '#', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 0);
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
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2554");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 0, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 100, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass28 = fieldDataList27.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2555");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 2015, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 100, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList33 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 0, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList36 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 0, 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) ' ', (-1), fieldDataList36);
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
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2556");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) (short) 100, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, 0, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) (short) 1, 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((-1), (int) (short) 0, fieldDataList25);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 1, (int) (byte) 0, fieldDataList25);
        java.lang.Class<?> wildcardClass28 = fieldDataList25.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList19);
        org.junit.Assert.assertNotNull(fieldDataList22);
        org.junit.Assert.assertNotNull(fieldDataList25);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2557");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 0, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (-1), (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (byte) -1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(100, 0, fieldDataList18);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2558");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', (int) (short) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, 10, fieldDataList18);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2559");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2560");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 2020, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (-1), (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 0, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 2015, 2015);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) ' ', (int) (byte) 100, fieldDataList24);
        java.lang.Class<?> wildcardClass26 = fieldDataList24.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(fieldDataList24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2561");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) -1, (int) (short) 1, fieldDataList6);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 10, (int) '4', fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList6);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2562");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 10, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, 0);
        java.lang.Class<?> wildcardClass32 = fieldDataList31.getClass();
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
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2563");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = null;
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 0, 100, fieldDataList2);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2564");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 0, (int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '#', 2015, fieldDataList4);
        java.lang.Class<?> wildcardClass6 = fieldDataList4.getClass();
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2565");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) -1, (int) ' ');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(100, (-1), fieldDataList6);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((-1), 100, fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList6);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2566");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, 100);
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
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2567");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) -1, (int) (short) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '4', 2015, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2568");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 0, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, 10);
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
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2569");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList33 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) '#');
        java.lang.Class<?> wildcardClass34 = strList2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2570");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 100, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 10, (int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '#', 2020, fieldDataList18);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2571");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(2020, (-1));
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((-1), (int) 'a', fieldDataList6);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 10, (int) '4', fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList6);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2572");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 100, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList33 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) (short) 10);
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
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2573");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, 2015);
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
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2574");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (byte) -1, 2020);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, 2020, fieldDataList14);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) 'a', (int) '#', fieldDataList14);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2575");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2576");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(100, (int) 'a');
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2577");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList8, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList8, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList8, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList8, (int) (byte) 0, (int) (byte) 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 10, (int) 'a', fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) (short) -1, fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(1, (int) (short) 0, fieldDataList21);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2578");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 100, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (int) 'a');
        java.lang.Class<?> wildcardClass28 = fieldDataList27.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2579");
        java.util.List<java.lang.String> strList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory(strList0, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2580");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 1, 0);
        java.lang.Class<?> wildcardClass35 = strList3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2581");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2015, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 0, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '4', (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) (short) 100);
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
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2582");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, (int) (short) 100);
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
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2583");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(10, 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((-1), 2020, fieldDataList6);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, 10, fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList6);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2584");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList10, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList10, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList10, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList10, (int) (byte) 0, (int) (byte) 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 100, 0, fieldDataList23);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) -1, (int) (byte) 100, fieldDataList23);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((-1), (int) (byte) 1, fieldDataList23);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((-1), (int) (short) 10, fieldDataList23);
        java.lang.Class<?> wildcardClass28 = fieldDataList23.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
        org.junit.Assert.assertNotNull(fieldDataList23);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2585");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", 2015, (int) (short) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2586");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2015, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '#', (int) 'a');
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
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2587");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 0, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 0, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 2015, (int) (short) 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 100, 10, fieldDataList20);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2588");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 2020, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 100, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) '#', (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 10, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 2020, (int) (byte) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) -1, (int) (short) 1, fieldDataList26);
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
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2589");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 1, (int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '4', 0, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2590");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(0, (int) (byte) 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 10, (int) (byte) 100, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2591");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (-1), (int) (short) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 10, (int) (byte) 1, fieldDataList18);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2592");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 100, (int) (short) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) -1, (int) (short) 10, fieldDataList6);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 10, 100, fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList6);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2593");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 100, 10);
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2594");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) '4', (int) (byte) 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(100, (int) (byte) 0, fieldDataList6);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '4', (int) (short) 1, fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList6);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2595");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (byte) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '#', (int) (short) 1, fieldDataList18);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2596");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2015, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList19);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2597");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2015, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList37 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList40 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) (byte) -1);
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
        org.junit.Assert.assertNotNull(fieldDataList40);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2598");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2015, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) 'a', (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 0, (int) (byte) 10);
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
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2599");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (byte) 10, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (byte) 0, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (byte) 1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList29 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (short) 1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(100, (int) (byte) 10, fieldDataList29);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) -1, (int) (byte) 1, fieldDataList29);
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
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2600");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (-1), 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2601");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) 'a', (int) (short) 100);
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
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2602");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, (int) ' ');
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
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2603");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", 2015, (int) (short) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2604");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) (byte) 10);
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
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2605");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, (int) '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2606");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, 2015);
        java.lang.Class<?> wildcardClass10 = fieldDataList9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2607");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = null;
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(1, (int) ' ', fieldDataList2);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2608");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 0, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 2020, 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) -1, 100, fieldDataList24);
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
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2609");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 100, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (-1), (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '#', (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, (int) (byte) -1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '4', (int) '#', fieldDataList24);
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
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2610");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) '4', (int) (short) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 100, (int) '#', fieldDataList6);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) 'a', (int) (byte) 0, fieldDataList6);
        java.lang.Class<?> wildcardClass9 = fieldDataList6.getClass();
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2611");
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
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList1;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList1;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList1;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList1;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList1;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList1;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList1;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList1;
        java.lang.Class<?> wildcardClass36 = fieldDataYearList1.getClass();
        org.junit.Assert.assertNotNull(fieldDataYearArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2612");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 100, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, (int) (short) 0);
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
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2613");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '#', (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, (int) 'a');
        java.lang.Class<?> wildcardClass32 = fieldDataList31.getClass();
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
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2614");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 100, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (-1), (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 0, (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, 2020, fieldDataList18);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2615");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) '4');
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
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2616");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 0, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) 'a', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList33 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2015, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList36 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 100, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList39 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) 'a', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList42 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList45 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2015, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList48 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 0, (int) (byte) 1);
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
        org.junit.Assert.assertNotNull(fieldDataList36);
        org.junit.Assert.assertNotNull(fieldDataList39);
        org.junit.Assert.assertNotNull(fieldDataList42);
        org.junit.Assert.assertNotNull(fieldDataList45);
        org.junit.Assert.assertNotNull(fieldDataList48);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2617");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (-1), 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) -1, (int) 'a', fieldDataList24);
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
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2618");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2015, (int) (short) 100);
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
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2619");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 1, (int) (byte) -1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(100, (int) (byte) 1, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2620");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 100, (int) (byte) 100);
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
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2621");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) '#');
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
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2622");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 2020, (int) '#');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) 'a', (int) ' ', fieldDataList24);
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
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2623");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 0, (int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '#', 2015, fieldDataList6);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 1, 2015, fieldDataList6);
        java.lang.Class<?> wildcardClass9 = fieldDataList6.getClass();
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2624");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList10, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList10, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList10, (int) (byte) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList10, (int) (short) 10, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList10, (int) (byte) 1, 2020);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(10, (int) (short) 10, fieldDataList26);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 10, 0, fieldDataList26);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 1, (int) '4', fieldDataList26);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 1, (-1), fieldDataList26);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
        org.junit.Assert.assertNotNull(fieldDataList23);
        org.junit.Assert.assertNotNull(fieldDataList26);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2625");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 100, 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2015, (int) (byte) 10, fieldDataList6);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 1, (int) (byte) 1, fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList6);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2626");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 1, (int) (byte) 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 100, (int) ' ', fieldDataList6);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '#', (int) (byte) 0, fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList6);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2627");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(2015, 2015);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 10, (-1), fieldDataList6);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) 'a', fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList6);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2628");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList9, (int) (short) 100, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList9, 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList9, 0, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList9, (int) (short) 1, 2015);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 1, (int) (short) 1, fieldDataList22);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 0, (int) (byte) -1, fieldDataList22);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 1, 0, fieldDataList22);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList19);
        org.junit.Assert.assertNotNull(fieldDataList22);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2629");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '#', 0);
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
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2630");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2631");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, (-1));
        java.lang.Class<?> wildcardClass26 = fieldDataList25.getClass();
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
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2632");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 2020, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 100, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) -1, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 1, (int) (byte) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 1, (-1), fieldDataList23);
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
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2633");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) (byte) 10, (-1));
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2634");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2015, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (-1), (-1));
        java.lang.Class<?> wildcardClass32 = fieldDataList31.getClass();
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
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2635");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList10, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList10, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList10, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList10, (int) (short) 100, 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) ' ', (int) (short) 0, fieldDataList23);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) ' ', 2015, fieldDataList23);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '#', (int) (byte) 100, fieldDataList23);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) -1, (int) (byte) 10, fieldDataList23);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
        org.junit.Assert.assertNotNull(fieldDataList23);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2636");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '#', 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) 10);
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
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2637");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) 'a', 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) -1, (int) ' ', fieldDataList15);
        java.lang.Class<?> wildcardClass17 = fieldDataList15.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2638");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) -1, (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 10, 10, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2639");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 100, (int) (short) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) -1, (int) (short) 10, fieldDataList4);
        java.lang.Class<?> wildcardClass6 = fieldDataList4.getClass();
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2640");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 0, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 0, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 0, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 1, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 0, (int) '#');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(10, (int) (byte) -1, fieldDataList21);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2641");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 100, (int) (byte) 1);
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
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2642");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(2015, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2643");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(2020, (int) 'a');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 10, (int) (byte) 10, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2644");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2645");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) '#');
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
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2646");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 100, 2015);
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
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2647");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 1, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 1, (int) (byte) 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2020, (int) (byte) -1, fieldDataList18);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2648");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, 2020);
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
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2649");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 2020, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (-1), (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 0, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 0, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (-1), 2015);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2020, 10, fieldDataList24);
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
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2650");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) 'a', 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 0, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, 2020);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) -1, (int) (byte) 0, fieldDataList21);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2651");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 1, 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '#', 2015, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2652");
        java.util.List<java.lang.String> strList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory(strList0, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2653");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) ' ', (int) (short) 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '#', (int) ' ', fieldDataList8);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 1, 0, fieldDataList8);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(1, (int) (short) 0, fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList8);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2654");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2015, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) 'a', (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 0, (int) (byte) 10);
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
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2655");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (-1), (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, (int) (byte) 0);
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
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2656");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 100, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 10, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList33 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 0, (int) '#');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 1, (int) (byte) 1, fieldDataList33);
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
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2657");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 100, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 1, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList33 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList36 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 100, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList39 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 10, (int) (short) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 0, (int) (short) 10, fieldDataList39);
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
        org.junit.Assert.assertNotNull(fieldDataList39);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2658");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) (byte) 10);
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
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2659");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) 'a');
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
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2660");
        java.util.List<java.lang.String> strList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory(strList0, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2661");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList33 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList36 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList39 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(fieldDataList36);
        org.junit.Assert.assertNotNull(fieldDataList39);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2662");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 1, (int) ' ');
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2663");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) -1, (int) '#');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2020, (int) ' ', fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2664");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (short) 10, 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2665");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2666");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) 'a', 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) 'a', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) -1, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '#', 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) -1, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 10, (int) (byte) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) -1, (int) (short) 100, fieldDataList27);
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
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2667");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 0, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (-1), (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 100, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) 'a', (int) '4');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 100, (int) '#', fieldDataList30);
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

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2668");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 0, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 0, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 0, 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 0, 2020, fieldDataList15);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2669");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 0, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) -1, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (-1), (int) (short) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 100, (-1), fieldDataList18);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2670");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 100, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, 100);
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
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2671");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (byte) -1, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (byte) 1, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (byte) 100, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) '4', 2015);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 0, (int) (short) 100, fieldDataList23);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 1, (int) (byte) -1, fieldDataList23);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
        org.junit.Assert.assertNotNull(fieldDataList23);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2672");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) '#', (int) (byte) -1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 100, (int) (short) 100, fieldDataList12);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) 'a', (int) '#', fieldDataList12);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((-1), (int) (byte) -1, fieldDataList12);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 10, (int) (short) 10, fieldDataList12);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2020, 0, fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList12);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2673");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, (int) (short) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(100, 2020, fieldDataList21);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2674");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", 0, (int) (short) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2675");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) 0);
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
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2676");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
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
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2677");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) -1, 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) (byte) 1, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2678");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '#', (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) '#');
        java.lang.Class<?> wildcardClass35 = strList3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2679");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 10);
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
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2680");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 10, 10, fieldDataList23);
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
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2681");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 0, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 100, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 100, (int) (short) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 10, (int) '#', fieldDataList30);
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

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2682");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (byte) 1);
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
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2683");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 1, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 100, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 0, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '#', 2020);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2020, (int) (byte) 1, fieldDataList24);
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
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2684");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (-1), (int) (short) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) (byte) 10, fieldDataList20);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) (byte) 100, fieldDataList20);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2685");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '#', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, (-1));
        java.lang.Class<?> wildcardClass35 = strList3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2686");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList19);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2687");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 10, (int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 1, (int) (byte) 100, fieldDataList6);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) -1, (int) (byte) 0, fieldDataList6);
        java.lang.Class<?> wildcardClass9 = fieldDataList6.getClass();
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2688");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) -1, 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 10, (int) (short) 0, fieldDataList6);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 100, (int) (byte) 10, fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList6);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2689");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, (int) '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2690");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 1);
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
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2691");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2015, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) (short) -1);
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
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2692");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 10, (int) (byte) -1);
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
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2693");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", 2015, (int) (byte) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2694");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 0, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 100, (int) ' ');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(1, (int) ' ', fieldDataList20);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2695");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 100, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 2020, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 1, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 2020, 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) (short) -1, fieldDataList24);
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
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2696");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) ' ', (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2697");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(2015, (int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '#', (int) (byte) 10, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2698");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) '#', (int) (byte) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 1, (int) (byte) 1, fieldDataList8);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 1, (int) ' ', fieldDataList8);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 1, 2020, fieldDataList8);
        java.lang.Class<?> wildcardClass12 = fieldDataList8.getClass();
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2699");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass26 = fieldDataList25.getClass();
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
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2700");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 1, (int) '#');
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2701");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) (byte) 0);
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
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2702");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
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
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2703");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, 100);
        java.lang.Class<?> wildcardClass11 = strList3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2704");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 0, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) 'a', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList33 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) 1);
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
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2705");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2706");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList33 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 0, (int) '#');
        java.lang.Class<?> wildcardClass34 = strList2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2707");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (byte) 10, 2015);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) (byte) 100, fieldDataList20);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) ' ', fieldDataList20);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2708");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList9, (int) (short) 100, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList9, (int) (short) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList9, (-1), (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList9, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList9, (int) '#', (int) (byte) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) (short) 1, fieldDataList25);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(10, (int) (short) 10, fieldDataList25);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, 0, fieldDataList25);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList19);
        org.junit.Assert.assertNotNull(fieldDataList22);
        org.junit.Assert.assertNotNull(fieldDataList25);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2709");
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList15, (int) (byte) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 100, (int) (short) 100, fieldDataList19);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) ' ', (int) '#', fieldDataList19);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2015, 2020, fieldDataList19);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(10, (int) (short) 10, fieldDataList19);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(10, (int) (byte) 1, fieldDataList19);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '#', (int) (short) 1, fieldDataList19);
        java.lang.Class<?> wildcardClass26 = fieldDataList19.getClass();
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(fieldDataList19);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2710");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList37 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 1);
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
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2711");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (-1), (int) (byte) -1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2712");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) '4', (int) (short) 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 0, (int) (byte) 0, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2713");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2714");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 100, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 100, 100, fieldDataList24);
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
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2715");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 2020, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) -1, (int) 'a');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) (short) 1, fieldDataList15);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2716");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (-1), (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList19);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2717");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) 10);
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
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2718");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) '4');
        java.lang.Class<?> wildcardClass14 = strList3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2719");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList9, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList9, (int) '4', 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 10, (int) (byte) -1, fieldDataList16);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(10, (int) ' ', fieldDataList16);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) 'a', 0, fieldDataList16);
        java.lang.Class<?> wildcardClass20 = fieldDataList16.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2720");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) 'a');
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
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2721");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(1, (int) (byte) 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 10, (int) 'a', fieldDataList6);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '4', (int) (byte) 100, fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList6);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2722");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, (int) 'a');
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
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2723");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList8, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList8, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList8, (int) (short) 0, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList8, 10, 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 100, 100, fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 100, 2015, fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2015, (int) 'a', fieldDataList21);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2724");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) '#', (int) (byte) -1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2725");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 1, (int) ' ');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 1, (int) (short) -1, fieldDataList6);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2015, 1, fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList6);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2726");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass35 = fieldDataList34.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2727");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, 2020);
        java.lang.Class<?> wildcardClass13 = fieldDataList12.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2728");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (byte) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (short) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (byte) 1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList29 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, 2020, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList32 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (byte) -1, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (short) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList38 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (byte) 10, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList41 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) '#', (int) (short) 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 10, 0, fieldDataList41);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 0, (int) (short) -1, fieldDataList41);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
        org.junit.Assert.assertNotNull(fieldDataList23);
        org.junit.Assert.assertNotNull(fieldDataList26);
        org.junit.Assert.assertNotNull(fieldDataList29);
        org.junit.Assert.assertNotNull(fieldDataList32);
        org.junit.Assert.assertNotNull(fieldDataList35);
        org.junit.Assert.assertNotNull(fieldDataList38);
        org.junit.Assert.assertNotNull(fieldDataList41);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2729");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, 100);
        java.lang.Class<?> wildcardClass35 = fieldDataList34.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2730");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 100, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) (byte) 100);
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
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2731");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 100, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 2020, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (-1), (-1));
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 100, 0, fieldDataList18);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2732");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList37 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 0);
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
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2733");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 2020, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) '#', 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 2015, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) 'a', (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 0, (int) (byte) 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) -1, 2020, fieldDataList20);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2734");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '#', (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList37 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 10);
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
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2735");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 100, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 100, 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 10, (int) (short) 100, fieldDataList18);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2736");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) -1, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 10, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList33 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 0, (-1));
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, 10, fieldDataList33);
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
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2737");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (-1));
        java.lang.Class<?> wildcardClass35 = fieldDataList34.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2738");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((-1), (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2739");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 0, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, (int) '#');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((-1), (int) '4', fieldDataList15);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2740");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '#', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList37 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList40 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList43 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, 2015);
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
        org.junit.Assert.assertNotNull(fieldDataList40);
        org.junit.Assert.assertNotNull(fieldDataList43);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2741");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 10, (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 1, 10, fieldDataList23);
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
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2742");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList9, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList9, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList9, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList9, 0, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList9, 100, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList9, (int) ' ', (int) (short) 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '#', 0, fieldDataList28);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, 1, fieldDataList28);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 0, (int) (short) -1, fieldDataList28);
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
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2743");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '#', (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, (int) 'a');
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
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2744");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 10, (int) (short) 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '4', (int) (byte) 10, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2745");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (short) 1);
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
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2746");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', 1);
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
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2747");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 0, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) '#', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 2020, (int) (byte) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(10, (int) (short) 1, fieldDataList26);
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
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2748");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 0, (-1));
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(1, (int) (short) 0, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2749");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 100, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2015, 100);
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
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2750");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '#', (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2751");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2015, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) (byte) 100);
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
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2752");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 1, (int) (byte) -1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) (short) 0, fieldDataList21);
        java.lang.Class<?> wildcardClass23 = fieldDataList21.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2753");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 0, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 100, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 100, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) ' ');
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
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2754");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '#', 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, (int) ' ');
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
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2755");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) -1, (int) '#');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) -1, (int) (byte) 10, fieldDataList6);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(10, (int) (short) 0, fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList6);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2756");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2757");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) (short) 1);
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
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2758");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (-1), (int) (short) 1);
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
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2759");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 0, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) -1, 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 1, (-1), fieldDataList21);
        java.lang.Class<?> wildcardClass23 = fieldDataList21.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2760");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) 100);
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
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2761");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '4', (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 0, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, (int) ' ');
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
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2762");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 10, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList37 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList40 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 1, (int) (short) 100);
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
        org.junit.Assert.assertNotNull(fieldDataList40);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2763");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 1, (-1));
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2764");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 10, (int) '4');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) 'a', (int) (byte) 100, fieldDataList10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 10, (int) (byte) -1, fieldDataList10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 10, (int) (short) 100, fieldDataList10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 10, (int) (byte) 0, fieldDataList10);
        java.lang.Class<?> wildcardClass15 = fieldDataList10.getClass();
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2765");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 2015, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 100, (-1));
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 10, (int) (byte) 100, fieldDataList27);
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
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2766");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) '4', 2020);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) ' ', (int) (short) 0, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2767");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 0, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 100, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) (short) 100);
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
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2768");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 0, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) -1, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 1, (int) 'a');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 0, (int) (byte) 10, fieldDataList23);
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
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2769");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) (short) 0, (int) '4');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (-1), fieldDataList10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) 'a', 1, fieldDataList10);
        java.lang.Class<?> wildcardClass13 = fieldDataList10.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2770");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) -1, 2015);
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2771");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2015, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) (short) 10);
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
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2772");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 10, (int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '#', (int) (byte) -1, fieldDataList6);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 0, 2020, fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList6);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2773");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", 100, (int) '#');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2774");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2775");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((-1), 2015);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(10, (int) 'a', fieldDataList4);
        java.lang.Class<?> wildcardClass6 = fieldDataList4.getClass();
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2776");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) (byte) -1, 2020);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2777");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) '4', (int) (byte) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(10, 0, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2778");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 100, (int) (short) 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 0, (-1), fieldDataList4);
        java.lang.Class<?> wildcardClass6 = fieldDataList4.getClass();
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2779");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(0, (int) (short) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) 'a', 0, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2780");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 1, 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 10, 0, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2781");
        java.util.List<java.lang.String> strList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory(strList0, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2782");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, 2020, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) (byte) 1, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, 1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) (byte) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) (byte) 1, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) '#', (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) ' ', 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) (byte) 1, (int) (byte) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) -1, (int) 'a', fieldDataList31);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 100, (int) (short) -1, fieldDataList31);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
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
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2783");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 2020, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 100, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) -1, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList29 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 1, 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((-1), (int) (byte) 0, fieldDataList29);
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
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2784");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) 'a');
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
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2785");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (byte) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) ' ', (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, 2015, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList29 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList32 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (byte) 100, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, 0, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList38 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, 0, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList41 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) 'a', (int) (byte) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '4', (int) (byte) 0, fieldDataList41);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2015, (int) '#', fieldDataList41);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
        org.junit.Assert.assertNotNull(fieldDataList23);
        org.junit.Assert.assertNotNull(fieldDataList26);
        org.junit.Assert.assertNotNull(fieldDataList29);
        org.junit.Assert.assertNotNull(fieldDataList32);
        org.junit.Assert.assertNotNull(fieldDataList35);
        org.junit.Assert.assertNotNull(fieldDataList38);
        org.junit.Assert.assertNotNull(fieldDataList41);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2786");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass14 = strList3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2787");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (-1), (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '#', (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, (int) (byte) 1);
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
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2788");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2789");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) -1, (int) (byte) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) -1, (int) '#', fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2790");
        java.util.List<java.lang.String> strList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory(strList0, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2791");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, 2015);
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
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2792");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (byte) -1);
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
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2793");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '4', (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) 'a');
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
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2794");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (-1), (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) ' ');
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
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2795");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 0, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 0, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (-1), (int) (short) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, 0, fieldDataList15);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2796");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) 'a', (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 10, 2015, fieldDataList21);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2797");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 10, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (-1), 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList37 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, 100);
        java.lang.Class<?> wildcardClass38 = strList3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2798");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (-1), (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, 0);
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
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2799");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 1, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) (byte) 0);
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
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2800");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 100, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 0, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 1, 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2015, (int) (byte) 0, fieldDataList23);
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
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2801");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) '4');
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
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2802");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 0, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 2015, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList33 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 1, 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2020, 10, fieldDataList33);
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
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2803");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, 2020, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) '#', 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, 0, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) '4', (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, (-1), (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, 0, (int) (short) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 100, (int) (short) 0, fieldDataList25);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(1, (int) (short) 100, fieldDataList25);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList19);
        org.junit.Assert.assertNotNull(fieldDataList22);
        org.junit.Assert.assertNotNull(fieldDataList25);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2804");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, 0);
        java.lang.Class<?> wildcardClass14 = strList3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2805");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (-1), (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, 100);
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
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2806");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 0, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 100, (int) (short) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 10, (int) (byte) 10, fieldDataList27);
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
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2807");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 0, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) (byte) 1);
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
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2808");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 1, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 10, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) (short) 1);
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
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2809");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 10, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, 10);
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
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2810");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '4', (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) '4');
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
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2811");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(2015, 0);
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2812");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (byte) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) ' ', (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, 2015, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList29 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, 100, (-1));
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 10, 100, fieldDataList29);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) (short) -1, fieldDataList29);
        java.lang.Class<?> wildcardClass32 = fieldDataList29.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
        org.junit.Assert.assertNotNull(fieldDataList23);
        org.junit.Assert.assertNotNull(fieldDataList26);
        org.junit.Assert.assertNotNull(fieldDataList29);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2813");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) 'a', 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) 'a', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) -1, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '#', 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) -1, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 10, (int) (byte) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) ' ', (int) '#', fieldDataList27);
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
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2814");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 2020);
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
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2815");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = null;
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) -1, (int) (byte) 10, fieldDataList2);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2816");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 0, (int) (short) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 0, (int) (byte) 0, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2817");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) -1, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 10, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList33 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 0, (-1));
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2015, (int) (byte) 100, fieldDataList33);
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
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2818");
        java.util.List<java.lang.String> strList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory(strList0, (int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2819");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2015, (int) '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2820");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (-1), (int) '4');
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
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2821");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) '#');
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
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2822");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (-1), (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList19);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2823");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 100, (-1));
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
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2824");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 100, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList33 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 0);
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
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2825");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 10, 1);
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
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2826");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass14 = strList3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2827");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) -1, (int) (short) 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 1, (int) (short) 10, fieldDataList21);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2828");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 0, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 2015, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 0, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 10, (int) (byte) -1, fieldDataList30);
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

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2829");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) 'a', 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) 'a', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 0, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 100, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (int) '#');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 0, (int) ' ', fieldDataList27);
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
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2830");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 0, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 100, (int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) (byte) 100, fieldDataList21);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2831");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) 'a', (int) 'a');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2020, (int) (byte) 100, fieldDataList4);
        java.lang.Class<?> wildcardClass6 = fieldDataList4.getClass();
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2832");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 0, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) 'a', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 0, 2015);
        java.lang.Class<?> wildcardClass28 = fieldDataList27.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2833");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) 1);
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
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2834");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (short) 100, (int) '#');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2835");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, (int) (byte) 0);
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
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2836");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2015, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) (byte) 0);
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
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2837");
        java.util.List<java.lang.String> strList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory(strList0, (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2838");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(1, 1);
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2839");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) (short) -1, 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2840");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) -1, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList33 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 0, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList36 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (-1), 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList39 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList42 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 0, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList45 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 100, 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '4', (int) (short) 0, fieldDataList45);
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
        org.junit.Assert.assertNotNull(fieldDataList39);
        org.junit.Assert.assertNotNull(fieldDataList42);
        org.junit.Assert.assertNotNull(fieldDataList45);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2841");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 10, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList37 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, (int) ' ');
        java.lang.Class<?> wildcardClass38 = strList3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2842");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 2020, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 0, (int) '4');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) 'a', 2020, fieldDataList15);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2843");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (short) 100);
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
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2844");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, 2020, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (byte) 100, (int) (byte) 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) -1, (int) (short) 1, fieldDataList17);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) (byte) -1, fieldDataList17);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2845");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) 'a', 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) 'a', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (short) 0, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (byte) 100, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, 1, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList29 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) '4', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList32 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (byte) 10, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, 1, (int) (short) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((-1), (int) 'a', fieldDataList35);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 10, (-1), fieldDataList35);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
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
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2846");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 0, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) 'a', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) 'a');
        java.lang.Class<?> wildcardClass28 = fieldDataList27.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2847");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 2020, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 100, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) '#', (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 10, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 100, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) -1, (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 0, (int) 'a', fieldDataList26);
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
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2848");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) (byte) 100, (int) '#');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2849");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) ' ', (int) '4');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((-1), (int) (byte) 100, fieldDataList12);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 100, (int) (short) 10, fieldDataList12);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 1, 2015, fieldDataList12);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(1, 100, fieldDataList12);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(1, 2020, fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList12);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2850");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 0, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) 'a', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 100, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList33 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '4', (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList36 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(fieldDataList36);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2851");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList11, (int) (byte) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 100, (int) (short) 100, fieldDataList15);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 0, (int) '#', fieldDataList15);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2020, 0, fieldDataList15);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(1, 2020, fieldDataList15);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(fieldDataList15);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2852");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '#', (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList19);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2853");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (-1), (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, 100);
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
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2854");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (-1), (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (short) 0);
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
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2855");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 10, (-1));
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2020, (int) ' ', fieldDataList6);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2020, (int) (byte) 100, fieldDataList6);
        java.lang.Class<?> wildcardClass9 = fieldDataList6.getClass();
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2856");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 10, (int) (short) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(10, 2015, fieldDataList6);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 10, (int) ' ', fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList6);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2857");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList8, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList8, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList8, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList8, (int) (short) 100, 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 1, 100, fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2020, 0, fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) -1, (int) (byte) 0, fieldDataList21);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2858");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2859");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList37 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList40 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, 1);
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
        org.junit.Assert.assertNotNull(fieldDataList40);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2860");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, 2020);
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
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2861");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 100, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 2020, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) 'a', (int) (short) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(10, (int) (byte) 100, fieldDataList18);
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
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2862");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2863");
        java.lang.String[] strArray16 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList17, (int) (byte) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 100, (int) (short) 100, fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 0, (int) '#', fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 10, (int) (short) 0, fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 0, (int) (byte) 0, fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '4', 2020, fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) -1, 2015, fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) 'a', (int) (byte) 10, fieldDataList21);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(fieldDataList21);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2864");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) (byte) 100);
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
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2865");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", 10, (int) (short) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2866");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) (short) 100);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2867");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) 'a', 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2868");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", 2015, 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2869");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 10, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (-1), 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (-1), (-1));
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
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2870");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) -1, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '#', (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 0, (int) (short) 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) 'a', (int) (short) 0, fieldDataList30);
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

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2871");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, 0);
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
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2872");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2873");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 100, 100);
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
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2874");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(10, (int) (byte) 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 10, 0, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2875");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 10, (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) (byte) -1, fieldDataList4);
        java.lang.Class<?> wildcardClass6 = fieldDataList4.getClass();
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2876");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, (-1));
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
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2877");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (-1), (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 1, (int) (byte) -1);
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
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2878");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 0, (int) 'a');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(100, 0, fieldDataList18);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2879");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) 'a', (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 10, (int) (byte) 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '#', (int) (short) 10, fieldDataList21);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2880");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList9, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList9, (int) (short) 100, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList9, 2020, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList9, (int) (short) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList9, (int) (byte) 1, (int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2020, (int) (short) 10, fieldDataList25);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 0, (int) (short) 100, fieldDataList25);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 1, (int) (byte) -1, fieldDataList25);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList19);
        org.junit.Assert.assertNotNull(fieldDataList22);
        org.junit.Assert.assertNotNull(fieldDataList25);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2881");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, 2020, (int) '#');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) ' ', 10, fieldDataList26);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) (byte) 1, fieldDataList26);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
        org.junit.Assert.assertNotNull(fieldDataList23);
        org.junit.Assert.assertNotNull(fieldDataList26);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2882");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) (short) 0, (int) 'a');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2883");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(100, 2020);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 100, (int) (short) 0, fieldDataList8);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 100, 10, fieldDataList8);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 0, (int) (byte) 0, fieldDataList8);
        java.lang.Class<?> wildcardClass12 = fieldDataList8.getClass();
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2884");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) 'a', 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) 'a', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 0, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 100, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 10, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList33 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 0, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList36 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 10, (int) (byte) 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(10, (int) (short) 100, fieldDataList36);
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
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2885");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 1, 2020);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((-1), (int) ' ', fieldDataList6);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) 'a', fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList6);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2886");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 100, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, 1);
        java.lang.Class<?> wildcardClass25 = strList2.getClass();
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
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2887");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2888");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 10, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList29 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) '#', (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList32 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) -1, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList35 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) -1, (int) (short) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) '4', fieldDataList35);
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
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2889");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) ' ', (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) (short) 100, 2015);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) -1, 0, fieldDataList22);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 10, (int) (short) -1, fieldDataList22);
        java.lang.Class<?> wildcardClass25 = fieldDataList22.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList19);
        org.junit.Assert.assertNotNull(fieldDataList22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2890");
        java.lang.String[] strArray16 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList17, (int) (byte) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 100, (int) (short) 100, fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) ' ', (int) '#', fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2015, 2020, fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(10, (int) (short) 10, fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 100, (int) (short) 10, fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 0, (int) 'a', fieldDataList21);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2015, (int) '#', fieldDataList21);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(fieldDataList21);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2891");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) 'a', (int) (short) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2892");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2015, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList37 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList40 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, 0);
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
        org.junit.Assert.assertNotNull(fieldDataList40);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2893");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) ' ', (int) '4');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((-1), (int) (byte) 100, fieldDataList10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 100, (int) (short) 10, fieldDataList10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 1, 2015, fieldDataList10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 1, 10, fieldDataList10);
        java.lang.Class<?> wildcardClass15 = fieldDataList10.getClass();
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2894");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (-1), 2015);
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
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2895");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear> fieldDataYearList0 = net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList0;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList0;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList0;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList0;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList0;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList0;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList0;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList0;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList0;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList0;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList0;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList0;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList0;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList0;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList0;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList0;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList0;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList0;
        net.ajaskey.market.tools.SIP.BigDB.Globals.allDataList = fieldDataYearList0;
        java.lang.Class<?> wildcardClass20 = fieldDataYearList0.getClass();
        org.junit.Assert.assertNotNull(fieldDataYearList0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2896");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) -1, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (-1), 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 2015, (-1));
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 100, (int) (short) 1, fieldDataList27);
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
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2897");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) 'a', 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) 'a', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (short) 0, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (byte) 100, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, 1, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList29 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) '4', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList32 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, 2015, 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 0, (int) (byte) 0, fieldDataList32);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(1, (int) '4', fieldDataList32);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
        org.junit.Assert.assertNotNull(fieldDataList23);
        org.junit.Assert.assertNotNull(fieldDataList26);
        org.junit.Assert.assertNotNull(fieldDataList29);
        org.junit.Assert.assertNotNull(fieldDataList32);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2898");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(2020, (int) (byte) 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 10, (int) (byte) -1, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2899");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((-1), 2020);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 10, 10, fieldDataList4);
        java.lang.Class<?> wildcardClass6 = fieldDataList4.getClass();
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2900");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(0, (int) '4');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(1, (int) (short) 100, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2901");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 10, (int) '4');
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
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2902");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 0, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) '#', (int) ' ');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) -1, 100, fieldDataList26);
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
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2903");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, (int) (byte) 100);
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
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2904");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, 2015);
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
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2905");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) '4', (int) '4');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2906");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 10, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (-1), 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList37 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList40 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList43 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (-1), 1);
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
        org.junit.Assert.assertNotNull(fieldDataList40);
        org.junit.Assert.assertNotNull(fieldDataList43);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2907");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = null;
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) 'a', (int) (byte) 0, fieldDataList2);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2908");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2909");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (byte) 0);
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
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2910");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 0);
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
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2911");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) (byte) 0, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, 100, (int) ' ');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(100, 0, fieldDataList22);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) (byte) 10, fieldDataList22);
        java.lang.Class<?> wildcardClass25 = fieldDataList22.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList19);
        org.junit.Assert.assertNotNull(fieldDataList22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2912");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) -1, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2913");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 1, (int) ' ');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(1, (-1), fieldDataList6);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((-1), (int) (byte) -1, fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList6);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2914");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '#', (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2915");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 1, 2015);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) (byte) 0, fieldDataList6);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 10, 100, fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList6);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2916");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, 0);
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
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2917");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, 0);
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
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2918");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 2020, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 100, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) '#', (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (int) (short) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(10, 0, fieldDataList20);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2919");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2015, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, 2020);
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
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2920");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 1, 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 0, (int) (byte) 0, fieldDataList6);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 1, (int) ' ', fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList6);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2921");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) 10, (-1));
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2922");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2015, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList37 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2015, (int) (short) 0);
        java.lang.Class<?> wildcardClass38 = fieldDataList37.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2923");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '#', 2020);
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
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2924");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) (short) 100);
        java.lang.Class<?> wildcardClass14 = fieldDataList13.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2925");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 10, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, (int) (byte) 100);
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
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2926");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", 2020, (int) (short) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2927");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, (int) (byte) 100);
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
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2928");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(2015, 2015);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 10, (-1), fieldDataList6);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(100, (-1), fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList6);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2929");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 2015, 2015);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2015, 100, fieldDataList24);
        java.lang.Class<?> wildcardClass26 = fieldDataList24.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(fieldDataList24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2930");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (-1), (int) '#');
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
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2931");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 10, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 10, 2015);
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
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2932");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2015, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass28 = fieldDataList27.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2933");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(2020, (int) 'a');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 1, (int) (byte) 0, fieldDataList6);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) 'a', 100, fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList6);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2934");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2015, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass35 = fieldDataList34.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2935");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) -1, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList33 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 1, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList36 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, (int) (byte) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 10, (int) ' ', fieldDataList36);
        java.lang.Class<?> wildcardClass38 = fieldDataList36.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2936");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) ' ');
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
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2937");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(1, (int) '#');
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2938");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2015, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 2015);
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
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2939");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 100, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 2020, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (-1), (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (byte) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '#', (int) (byte) 100, fieldDataList21);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2940");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) (short) -1, (int) ' ');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2941");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 100, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 10, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 100, (int) (short) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 10, 2015, fieldDataList23);
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
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2942");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) 100);
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
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2943");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2015, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, (int) (short) 100);
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
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2944");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) 'a', (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2015, (int) (short) -1, fieldDataList17);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2945");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, (int) (short) 100);
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
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2946");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) '#', (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2947");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 0, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (-1), (int) (short) 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 1, 100, fieldDataList21);
        java.lang.Class<?> wildcardClass23 = fieldDataList21.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2948");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) -1, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '#', (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 0, (int) (short) 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '#', (int) '#', fieldDataList30);
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
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2949");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 100, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 10, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 2015, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 0, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 100, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList33 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 0, (-1));
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(1, 2020, fieldDataList33);
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
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2950");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) '4', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, (int) (byte) 100, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, 10, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList7, 2015, (int) (short) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 1, (int) ' ', fieldDataList23);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) -1, (int) (short) 1, fieldDataList23);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
        org.junit.Assert.assertNotNull(fieldDataList23);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2951");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList33 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass34 = strList2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2952");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 0, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) 'a', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2020, (int) '4', fieldDataList26);
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
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2953");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (-1), (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, 10);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2954");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList11, (int) (byte) -1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 100, (int) (short) 100, fieldDataList15);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 1, (int) ' ', fieldDataList15);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) ' ', (int) (byte) 0, fieldDataList15);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(100, 2015, fieldDataList15);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(fieldDataList15);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2955");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 2020);
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
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2956");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 100, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 2020, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '#', (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', (int) (byte) 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(10, (int) '4', fieldDataList21);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2957");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 100);
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
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2958");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '#', (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, 2015);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList19);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2959");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 100, (int) (short) 0);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2015, 100, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2960");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", 2015, (int) (byte) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2961");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 100, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 1, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList33 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (int) '#');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (-1), fieldDataList33);
        java.lang.Class<?> wildcardClass35 = fieldDataList33.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2962");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2963");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (-1), (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2015, (int) ' ');
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
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2964");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '4', (int) '4');
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
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2965");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2015, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 10, (int) (byte) 0);
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
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2966");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 10, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 100, 2020);
        java.lang.Class<?> wildcardClass35 = strList3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2967");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) (byte) 0, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, (-1), (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) '#', 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2015, (int) (short) 10, fieldDataList25);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '#', (int) (byte) -1, fieldDataList25);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList19);
        org.junit.Assert.assertNotNull(fieldDataList22);
        org.junit.Assert.assertNotNull(fieldDataList25);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2968");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", 2020, 2020);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2969");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 0, 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, 0, fieldDataList6);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) -1, 2015, fieldDataList6);
        java.lang.Class<?> wildcardClass9 = fieldDataList6.getClass();
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2970");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList37 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '#', (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList40 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) '#');
        java.lang.Class<?> wildcardClass41 = strList3.getClass();
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
        org.junit.Assert.assertNotNull(fieldDataList40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2971");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 100, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 100, (int) (short) -1);
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
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2972");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 0, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 0, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 1, (int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(1, 2020, fieldDataList21);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
        org.junit.Assert.assertNotNull(fieldDataList18);
        org.junit.Assert.assertNotNull(fieldDataList21);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2973");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) (byte) 100);
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
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2974");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) (byte) 100);
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
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2975");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) (short) 100, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) (short) 10, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList6, (int) (short) 0, 2015);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 100, (int) (short) 0, fieldDataList25);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 100, 1, fieldDataList25);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList19);
        org.junit.Assert.assertNotNull(fieldDataList22);
        org.junit.Assert.assertNotNull(fieldDataList25);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2976");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 0, (int) '#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList15);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2977");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) -1, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) 'a', (int) (short) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '4', 1, fieldDataList23);
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
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2978");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', 2015);
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
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2979");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList33 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) 'a', (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList36 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList39 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, 0);
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
        org.junit.Assert.assertNotNull(fieldDataList36);
        org.junit.Assert.assertNotNull(fieldDataList39);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2980");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (short) -1, (int) '4');
        org.junit.Assert.assertNotNull(fieldDataList2);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2981");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) '#', 2015);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2982");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 0, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) 'a', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 10, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList29 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 10, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList32 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 2015, (-1));
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, 1, fieldDataList32);
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
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2983");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", 2020, (int) (short) -1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2984");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 1, 100);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertNotNull(fieldDataList13);
        org.junit.Assert.assertNotNull(fieldDataList16);
        org.junit.Assert.assertNotNull(fieldDataList19);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2985");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((-1), (int) (byte) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) 'a', 2015, fieldDataList4);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2986");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) (byte) 0, (int) (short) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) -1, (int) ' ', fieldDataList4);
        java.lang.Class<?> wildcardClass6 = fieldDataList4.getClass();
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2987");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = fieldDataList12.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2988");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) 10);
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
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2989");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList33 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList36 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass37 = strList2.getClass();
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
        org.junit.Assert.assertNotNull(fieldDataList36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2990");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (-1), (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 1, (int) '4');
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
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2991");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 100, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '4', 100, fieldDataList20);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2992");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList12);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2993");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList13, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList13, (int) '4', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList13, (int) 'a', 10);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(100, (int) (byte) -1, fieldDataList23);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 1, (int) (byte) 0, fieldDataList23);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '4', (int) (byte) 100, fieldDataList23);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2015, 10, fieldDataList23);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 10, (int) (short) 10, fieldDataList23);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(fieldDataList17);
        org.junit.Assert.assertNotNull(fieldDataList20);
        org.junit.Assert.assertNotNull(fieldDataList23);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2994");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 2020, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 10, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 0, (int) '#');
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2015, (int) (byte) 0, fieldDataList14);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList11);
        org.junit.Assert.assertNotNull(fieldDataList14);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2995");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) (short) 1);
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
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2996");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '#', (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2015, 2020);
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
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2997");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory((int) '#', (int) (short) 100);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 1, 0, fieldDataList6);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) -1, (int) ' ', fieldDataList6);
        java.lang.Class<?> wildcardClass9 = fieldDataList6.getClass();
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2998");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, 1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 100, 2015);
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((-1), 10, fieldDataList20);
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
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test2999");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) '4', (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 100, 2020);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 1, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, 0, 2015);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 100, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList5, (-1), (-1));
        net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 10, (int) (byte) 100, fieldDataList27);
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
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DbTests5.test3000");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 10, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 100, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals.getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, (int) (short) 100);
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
}

