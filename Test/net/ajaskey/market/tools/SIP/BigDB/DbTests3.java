package net.ajaskey.market.tools.SIP.BigDB;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DbTests3 {

  public static boolean debug = false;

  @Test
  public void test1501() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1501");
    java.lang.String[] strArray3 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 100, (int) (short) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList4, 100, (int) (short) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 0, (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, 10, (int) ' ');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList4, 2015, (-1));
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(1, (int) ' ', fieldDataList26);
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
  public void test1502() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1502");
    java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
    java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
    boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList7, 100, (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList7, (int) ' ', (int) (byte) 0);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 10, (int) '4', fieldDataList14);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 1, 100, fieldDataList14);
    java.lang.Class<?> wildcardClass17 = fieldDataList14.getClass();
    org.junit.Assert.assertNotNull(strArray6);
    org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    org.junit.Assert.assertNotNull(fieldDataList11);
    org.junit.Assert.assertNotNull(fieldDataList14);
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test1503() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1503");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) 1, (int) (short) 1, filetypeEnum2, true);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1505() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1505");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) 0, (int) (short) 100, filetypeEnum2);
  }

  @Test
  public void test1506() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1506");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 100, (int) (byte) 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) (short) 0);
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
  public void test1507() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1507");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) (byte) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) 'a', (int) (short) -1);
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
  public void test1508() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1508");
    java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
    java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 2015, (int) '4');
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
  public void test1509() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1509");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(2015, (int) '4', filetypeEnum2);
  }

  @Test
  public void test1510() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1510");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(0,
        1);
    java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(wildcardClass3);
  }

  @Test
  public void test1511() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1511");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (-1));
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, (int) ' ');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (int) (short) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 100, (-1));
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
  public void test1512() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1512");
    boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (short) 10, 100);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test1513() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1513");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) (byte) 10,
        (int) '#', filetypeEnum3);
    org.junit.Assert.assertNull(fieldData4);
  }

  @Test
  public void test1514() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1514");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(10, (int) '4', filetypeEnum2, true);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1515() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1515");
    java.lang.String[] strArray3 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 1, 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) -1, (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList4, 100, 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList29 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 1, (int) (short) 1);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 0, (int) (byte) 0, fieldDataList29);
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
  public void test1516() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1516");
    boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((-1), (int) '4');
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test1517() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1517");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) ' ', (int) ' ', filetypeEnum2);
  }

  @Test
  public void test1518() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1518");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) 1, (int) (short) 10, filetypeEnum2);
  }

  @Test
  public void test1519() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1519");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", 10, (int) ' ',
        filetypeEnum3);
    org.junit.Assert.assertNull(fieldData4);
  }

  @Test
  public void test1520() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1520");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE",
        (int) (short) -1, 0, filetypeEnum3);
    org.junit.Assert.assertNull(fieldData4);
  }

  @Test
  public void test1521() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1521");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getQFromMemory((int) (byte) 0, (int) (short) 10);
    org.junit.Assert.assertNotNull(fieldDataList2);
  }

  @Test
  public void test1522() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1522");
    java.lang.String[] strArray5 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
    boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList6, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList6, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList6, (-1), (int) (short) -1);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((-1), (int) (short) 1, fieldDataList16);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(10, 1, fieldDataList16);
    org.junit.Assert.assertNotNull(strArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNotNull(fieldDataList10);
    org.junit.Assert.assertNotNull(fieldDataList13);
    org.junit.Assert.assertNotNull(fieldDataList16);
  }

  @Test
  public void test1523() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1523");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) (short) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, (-1));
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, 10);
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
  public void test1524() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1524");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", (int) 'a',
        (int) (byte) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1525() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1525");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) '4', (-1), filetypeEnum2, true);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1526() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1526");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", (int) 'a',
        (int) (short) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1527() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1527");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getQFromMemory((int) (byte) 0, 2020);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 100, 10, fieldDataList8);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 10, 10, fieldDataList8);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2020, 0, fieldDataList8);
    org.junit.Assert.assertNotNull(fieldDataList8);
  }

  @Test
  public void test1528() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1528");
    java.util.List<java.lang.String> strList0 = null;
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory(strList0, (int) '4', (-1));
    org.junit.Assert.assertNotNull(fieldDataList3);
  }

  @Test
  public void test1529() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1529");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", (int) 'a',
        (int) (byte) -1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1530() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1530");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getQFromMemory((int) (short) -1, (int) (byte) 0);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 10, (int) (short) 100, fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList4);
  }

  @Test
  public void test1531() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1531");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 100, (int) '#', filetypeEnum2);
  }

  @Test
  public void test1532() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1532");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) 10, (int) (short) -1, filetypeEnum2);
  }

  @Test
  public void test1533() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1533");
    boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (short) 10, (int) (short) 1);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test1534() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1534");
    java.lang.String[] strArray3 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) '#', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, 1, (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 1, (int) (short) 100);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2015, (int) (short) 100, fieldDataList26);
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
  public void test1535() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1535");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", (int) ' ',
        0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1536() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1536");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (short) 0, 10, filetypeEnum2);
  }

  @Test
  public void test1537() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1537");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (byte) 100,
        (int) (short) 0, filetypeEnum3);
    org.junit.Assert.assertNull(fieldData4);
  }

  @Test
  public void test1538() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1538");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getQFromMemory((int) (byte) 100, (int) (short) 1);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '4', (int) 'a', fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList4);
  }

  @Test
  public void test1539() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1539");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", (int) (byte) -1,
        2020);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1540() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1540");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(10, (int) (byte) -1, filetypeEnum2);
  }

  @Test
  public void test1541() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1541");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE",
        (int) (byte) -1, (int) (short) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1542() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1542");
    boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) '#', (int) (short) 100);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test1543() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1543");
    java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
    java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
    boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList5, 100, (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) -1, (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 1, (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList5, 1, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) -1, (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList5, 1, (int) '4');
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '#', (int) '#', fieldDataList24);
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
  public void test1544() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1544");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", (int) '4',
        (int) (short) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1545() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1545");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!",
        (int) (byte) 100, 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1546() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1546");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) (byte) 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) 'a');
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
  public void test1547() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1547");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", 2015, 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1548() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1548");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (short) 100,
        (int) (byte) 1, filetypeEnum3);
    org.junit.Assert.assertNull(fieldData4);
  }

  @Test
  public void test1549() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1549");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) 100, (int) '#', filetypeEnum2, false);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1550() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1550");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (int) (byte) 10,
        100);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1551() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1551");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) 1, (int) (byte) 10, filetypeEnum2, false);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1552() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1552");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getQFromMemory((int) (short) -1, 10);
    org.junit.Assert.assertNotNull(fieldDataList2);
  }

  @Test
  public void test1553() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1553");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) (short) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 100, (int) (short) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 1, 100);
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
  public void test1554() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1554");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) (short) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, 0);
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
  public void test1555() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1555");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) 10, (int) (byte) 0, filetypeEnum2, false);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1556() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1556");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = null;
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) -1, (int) (short) -1, fieldDataList2);
  }

  @Test
  public void test1557() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1557");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) -1, (int) (short) 0, filetypeEnum2, false);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1558() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1558");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((-1), 0, filetypeEnum2, false);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1559() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1559");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) 1, (int) (byte) 1, filetypeEnum2, false);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1560() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1560");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE",
        (int) (byte) 10, (int) (short) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1561() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1561");
    java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
    java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 0, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '#', (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, (int) (short) 1);
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(fieldDataList7);
    org.junit.Assert.assertNotNull(fieldDataList10);
    org.junit.Assert.assertNotNull(fieldDataList13);
    org.junit.Assert.assertNotNull(fieldDataList16);
    org.junit.Assert.assertNotNull(fieldDataList19);
  }

  @Test
  public void test1562() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1562");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getQFromMemory((int) (byte) 100, (int) (short) 0);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2020, (int) (short) 1, fieldDataList6);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) -1, 1, fieldDataList6);
    org.junit.Assert.assertNotNull(fieldDataList6);
  }

  @Test
  public void test1563() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1563");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!",
        (int) (short) 0, 100);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1564() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1564");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getQFromMemory(2020, (int) 'a');
    org.junit.Assert.assertNotNull(fieldDataList2);
  }

  @Test
  public void test1565() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1565");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) 0, (int) (short) -1, filetypeEnum2, false);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1566() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1566");
    java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
    java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 0, 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '#', (int) (byte) 10);
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
  public void test1567() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1567");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) '4', 100,
        filetypeEnum3);
    org.junit.Assert.assertNull(fieldData4);
  }

  @Test
  public void test1568() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1568");
    boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists(100, 10);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test1569() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1569");
    boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) '4', (int) ' ');
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test1570() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1570");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getQFromMemory((int) (byte) 1, (-1));
    org.junit.Assert.assertNotNull(fieldDataList2);
  }

  @Test
  public void test1571() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1571");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(10, (int) (byte) 0, filetypeEnum2);
  }

  @Test
  public void test1572() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1572");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) -1, (int) '#', filetypeEnum2, true);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1573() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1573");
    boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (short) 10, (int) (byte) 10);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test1574() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1574");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!",
        (int) (short) 100, (int) (short) 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1575() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1575");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (int) (byte) 0,
        (int) (short) -1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1576() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1576");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 100, (int) '4');
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
  public void test1577() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1577");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", (int) ' ', 10,
        filetypeEnum3);
    org.junit.Assert.assertNull(fieldData4);
  }

  @Test
  public void test1578() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1578");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", (int) (short) 1,
        (int) (short) 1, filetypeEnum3);
    org.junit.Assert.assertNull(fieldData4);
  }

  @Test
  public void test1579() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1579");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (byte) 10,
        (int) (byte) 100, filetypeEnum3);
    org.junit.Assert.assertNull(fieldData4);
  }

  @Test
  public void test1580() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1580");
    java.lang.String[] strArray9 = new java.lang.String[] { "", "", "" };
    java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
    boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList10, (int) 'a', 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList10, (int) ' ', (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList10, (int) (short) 1, 2015);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 1, (int) (byte) -1, fieldDataList20);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 10, (int) ' ', fieldDataList20);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((-1), (int) (byte) 1, fieldDataList20);
    org.junit.Assert.assertNotNull(strArray9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    org.junit.Assert.assertNotNull(fieldDataList14);
    org.junit.Assert.assertNotNull(fieldDataList17);
    org.junit.Assert.assertNotNull(fieldDataList20);
  }

  @Test
  public void test1581() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1581");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) 'a',
        (int) ' ');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1582() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1582");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getQFromMemory((int) (byte) 10, 2015);
    java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(wildcardClass3);
  }

  @Test
  public void test1583() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1583");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) (byte) 100,
        (int) (byte) -1, filetypeEnum3);
    org.junit.Assert.assertNull(fieldData4);
  }

  @Test
  public void test1584() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1584");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) 100, (int) (byte) 100, filetypeEnum2, false);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1585() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1585");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(100, (int) '#', filetypeEnum2);
  }

  @Test
  public void test1586() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1586");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (-1));
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, (int) (short) 0);
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
  public void test1587() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1587");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (byte) 100,
        (int) (short) -1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1588() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1588");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(10, (int) ' ', filetypeEnum2);
  }

  @Test
  public void test1589() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1589");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (-1),
        (int) (byte) 0, filetypeEnum3);
    org.junit.Assert.assertNull(fieldData4);
  }

  @Test
  public void test1590() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1590");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", 1, (int) ' ');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1591() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1591");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getQFromMemory((int) ' ', (int) (byte) 100);
    org.junit.Assert.assertNotNull(fieldDataList2);
  }

  @Test
  public void test1592() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1592");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE",
        (int) (short) -1, (int) (short) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1593() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1593");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", 2020,
        (int) (short) 100, filetypeEnum3);
    org.junit.Assert.assertNull(fieldData4);
  }

  @Test
  public void test1594() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1594");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, (-1));
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) '#');
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
  public void test1595() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1595");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) (short) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 100, (int) (short) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
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
  public void test1596() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1596");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(2020, (int) '#', filetypeEnum2, false);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1597() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1597");
    java.lang.String[] strArray7 = new java.lang.String[] { "", "", "" };
    java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
    boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList8, (int) 'a', 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList8, (int) ' ', (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList8, (int) (short) 1, 2015);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 1, (int) (byte) -1, fieldDataList18);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 100, 0, fieldDataList18);
    org.junit.Assert.assertNotNull(strArray7);
    org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    org.junit.Assert.assertNotNull(fieldDataList12);
    org.junit.Assert.assertNotNull(fieldDataList15);
    org.junit.Assert.assertNotNull(fieldDataList18);
  }

  @Test
  public void test1598() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1598");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', 0);
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
  public void test1599() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1599");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (int) (byte) -1,
        (int) ' ');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1600() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1600");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) 1, (int) (short) 0, filetypeEnum2, true);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1601() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1601");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(0,
        10);
    org.junit.Assert.assertNotNull(fieldDataList2);
  }

  @Test
  public void test1602() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1602");
    java.lang.String[] strArray3 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, 1, (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) 'a', (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, 0, (-1));
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList29 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, 0, (int) (short) 10);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 0, 1, fieldDataList29);
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
  public void test1603() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1603");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (short) -1, (int) ' ', filetypeEnum2);
  }

  @Test
  public void test1604() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1604");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) -1, (int) (byte) 1, filetypeEnum2);
  }

  @Test
  public void test1605() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1605");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) (byte) 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 0, (int) (short) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 0, (int) (byte) 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) 'a');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList33 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, 2020);
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
  public void test1606() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1606");
    boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists(1, (int) 'a');
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test1607() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1607");
    boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists(0, (int) '4');
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test1608() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1608");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("NONE", (int) '#',
        2015);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1609() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1609");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getQFromMemory((int) 'a', (int) '#');
    org.junit.Assert.assertNotNull(fieldDataList2);
  }

  @Test
  public void test1610() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1610");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE",
        (int) (short) 100, 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1611() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1611");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getQFromMemory(2020, 1);
    org.junit.Assert.assertNotNull(fieldDataList2);
  }

  @Test
  public void test1612() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1612");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (short) -1, (int) (short) 10, filetypeEnum2);
  }

  @Test
  public void test1613() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1613");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (short) 1, (int) (short) 1, filetypeEnum2);
  }

  @Test
  public void test1614() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1614");
    java.lang.String[] strArray3 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList4, 2020, 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 100, (-1));
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, 10, (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) '4', 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) -1, (int) (short) 100);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 1, 100, fieldDataList26);
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
  public void test1615() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1615");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) (short) 1,
        (int) (short) 100, filetypeEnum3);
    org.junit.Assert.assertNull(fieldData4);
  }

  @Test
  public void test1616() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1616");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", (int) (byte) 10,
        0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1617() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1617");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((-1), 0, filetypeEnum2, true);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1618() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1618");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!",
        (int) (short) 10, (-1));
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1619() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1619");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(10, (int) (short) -1, filetypeEnum2, true);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1620() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1620");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(0, (-1), filetypeEnum2);
  }

  @Test
  public void test1621() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1621");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", 100, 0,
        filetypeEnum3);
    org.junit.Assert.assertNull(fieldData4);
  }

  @Test
  public void test1622() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1622");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(100, 1, filetypeEnum2);
  }

  @Test
  public void test1623() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1623");
    java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
    java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 10, (-1));
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 0);
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
  public void test1624() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1624");
    java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
    java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) ' ');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 10, (int) (short) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, (int) (byte) 0);
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
  public void test1625() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1625");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(100, (int) 'a', filetypeEnum2);
  }

  @Test
  public void test1626() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1626");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (short) 1,
        10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1627() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1627");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) 0, (int) 'a', filetypeEnum2);
  }

  @Test
  public void test1628() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1628");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) '#',
        (int) 'a');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1629() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1629");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 100, (int) '4', filetypeEnum2);
  }

  @Test
  public void test1630() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1630");
    boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (short) 10, 10);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test1631() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1631");
    boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (byte) -1, 2020);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test1632() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1632");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) 0, (int) '#', filetypeEnum2, false);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1633() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1633");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", (int) '4', 100);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1634() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1634");
    boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (short) 10, (int) (short) 10);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test1635() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1635");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", 0,
        (int) (byte) 1, filetypeEnum3);
    org.junit.Assert.assertNull(fieldData4);
  }

  @Test
  public void test1636() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1636");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) (byte) 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 100, (int) (short) 100);
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
  public void test1637() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1637");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (int) '4',
        2015);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1638() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1638");
    java.util.List<java.lang.String> strList0 = null;
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory(strList0, (int) '#', (int) (byte) -1);
    org.junit.Assert.assertNotNull(fieldDataList3);
  }

  @Test
  public void test1639() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1639");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '4', 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) ' ');
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
  public void test1640() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1640");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(10, (int) (short) -1, filetypeEnum2, false);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1641() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1641");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 100, 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', 100);
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
  public void test1642() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1642");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(100, (int) (byte) 0, filetypeEnum2, false);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1643() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1643");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (byte) 1,
        (int) (byte) 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1644() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1644");
    java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
    java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
    boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList5, 100, (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) -1, (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 1, (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList5, 1, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) 0, (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) 100, (int) (byte) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (byte) -1, (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList33 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList5, 2015, (int) (byte) 10);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2015, (int) (short) -1, fieldDataList33);
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
  public void test1645() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1645");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) -1, (int) (byte) 0, filetypeEnum2);
  }

  @Test
  public void test1646() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1646");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getQFromMemory((int) (byte) -1, 1);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) 'a', fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList4);
  }

  @Test
  public void test1647() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1647");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (short) 100, 0, filetypeEnum2);
  }

  @Test
  public void test1648() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1648");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) (byte) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 2015, (int) (byte) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) 'a', (int) (byte) 0);
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
  public void test1649() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1649");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (short) 100,
        (int) '#');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1650() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1650");
    boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((-1), 100);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test1651() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1651");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", (int) (byte) 0,
        (int) (short) 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1652() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1652");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) '#', (int) '#', filetypeEnum2);
  }

  @Test
  public void test1653() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1653");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", (int) (short) 0,
        (int) '4', filetypeEnum3);
    org.junit.Assert.assertNull(fieldData4);
  }

  @Test
  public void test1654() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1654");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", (int) 'a',
        (int) (short) 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1655() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1655");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getQFromMemory((int) 'a', 100);
    org.junit.Assert.assertNotNull(fieldDataList2);
  }

  @Test
  public void test1656() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1656");
    java.lang.String[] strArray3 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 100, (int) (short) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) -1, 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 100, 10);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 1, 2020, fieldDataList17);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(fieldDataList8);
    org.junit.Assert.assertNotNull(fieldDataList11);
    org.junit.Assert.assertNotNull(fieldDataList14);
    org.junit.Assert.assertNotNull(fieldDataList17);
  }

  @Test
  public void test1657() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1657");
    java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
    java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, (int) (byte) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList34 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList37 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 0, (int) 'a');
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
  public void test1658() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1658");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 10, 100, filetypeEnum2);
  }

  @Test
  public void test1659() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1659");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) -1, 2015, filetypeEnum2, false);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1660() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1660");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) ' ', (int) '#', filetypeEnum2);
  }

  @Test
  public void test1661() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1661");
    java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
    java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) ' ');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 10, 2020);
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
  public void test1662() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1662");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getQFromMemory(2020, (int) (short) 10);
    org.junit.Assert.assertNotNull(fieldDataList2);
  }

  @Test
  public void test1663() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1663");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) (byte) 1,
        (int) (short) 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1664() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1664");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(0, (int) (byte) 100, filetypeEnum2, false);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1665() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1665");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) 'a', (int) (byte) 10, filetypeEnum2);
  }

  @Test
  public void test1666() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1666");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(100, (int) '#', filetypeEnum2);
  }

  @Test
  public void test1667() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1667");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (-1));
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (byte) 10);
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
  public void test1668() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1668");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (short) 1, (int) (byte) 10, filetypeEnum2);
  }

  @Test
  public void test1669() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1669");
    java.lang.String[] strArray3 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 1, 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) -1, (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList4, 100, 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList29 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList4, 100, (int) (short) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList32 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, 2015, (int) (short) 0);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 1, (int) (byte) 1, fieldDataList32);
    java.lang.Class<?> wildcardClass34 = fieldDataList32.getClass();
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
    org.junit.Assert.assertNotNull(wildcardClass34);
  }

  @Test
  public void test1670() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1670");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) (short) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 2015, (int) ' ');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (int) (byte) -1);
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
  public void test1671() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1671");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", 2015,
        (int) (byte) 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1672() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1672");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (-1));
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '4', 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) (short) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 2015, (int) ' ');
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
  public void test1673() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1673");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) (short) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) (byte) -1);
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(fieldDataList6);
    org.junit.Assert.assertNotNull(fieldDataList9);
    org.junit.Assert.assertNotNull(fieldDataList12);
    org.junit.Assert.assertNotNull(fieldDataList15);
    org.junit.Assert.assertNotNull(fieldDataList18);
  }

  @Test
  public void test1674() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1674");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", 2020, 2015);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1675() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1675");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) 'a', (int) (short) 10, filetypeEnum2);
  }

  @Test
  public void test1676() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1676");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(1, (int) 'a', filetypeEnum2);
  }

  @Test
  public void test1677() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1677");
    java.lang.String[] strArray2 = new java.lang.String[] { "", "NONE" };
    java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (short) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, 0);
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(fieldDataList7);
    org.junit.Assert.assertNotNull(fieldDataList10);
    org.junit.Assert.assertNotNull(fieldDataList13);
  }

  @Test
  public void test1678() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1678");
    java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
    java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) 'a', 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList4, 0, (int) 'a');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, 2020, (int) ' ');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, 2020, (int) (short) -1);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(fieldDataList8);
    org.junit.Assert.assertNotNull(fieldDataList11);
    org.junit.Assert.assertNotNull(fieldDataList14);
    org.junit.Assert.assertNotNull(fieldDataList17);
  }

  @Test
  public void test1679() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1679");
    java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
    java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 2015, (int) (byte) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) '4', 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, 2020);
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
  public void test1680() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1680");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(1,
        (int) ' ');
    java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(wildcardClass3);
  }

  @Test
  public void test1681() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1681");
    java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
    java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (-1));
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
  public void test1682() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1682");
    java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
    java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
    boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList5, 100, (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList5, (int) (short) -1, (int) (short) -1);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 10, (int) (byte) 100, fieldDataList12);
    java.lang.Class<?> wildcardClass14 = fieldDataList12.getClass();
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    org.junit.Assert.assertNotNull(fieldDataList9);
    org.junit.Assert.assertNotNull(fieldDataList12);
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test1683() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1683");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) ' ', (int) (byte) 0, filetypeEnum2);
  }

  @Test
  public void test1684() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1684");
    boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (byte) 100, (int) '4');
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test1685() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1685");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(1, (int) (short) 1, filetypeEnum2, false);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1686() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1686");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(2020, 1, filetypeEnum2);
  }

  @Test
  public void test1687() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1687");
    boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (short) 1, 0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test1688() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1688");
    java.util.List<java.lang.String> strList0 = null;
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory(strList0, (int) (byte) 100, (int) (short) 100);
    org.junit.Assert.assertNotNull(fieldDataList3);
  }

  @Test
  public void test1689() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1689");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", 1,
        (int) (short) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1690() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1690");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) (byte) 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 0, (int) (short) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 100, (int) (short) 10);
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
  public void test1691() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1691");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE",
        (int) (short) -1, (int) (byte) -1, filetypeEnum3);
    org.junit.Assert.assertNull(fieldData4);
  }

  @Test
  public void test1692() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1692");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (byte) 0,
        (int) (byte) 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1693() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1693");
    boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (byte) -1, (int) (byte) 100);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test1694() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1694");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (byte) 1, 1, filetypeEnum2, true);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1695() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1695");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) '#', (int) (byte) 100, filetypeEnum2);
  }

  @Test
  public void test1696() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1696");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (byte) 0,
        (int) (short) 10, filetypeEnum3);
    org.junit.Assert.assertNull(fieldData4);
  }

  @Test
  public void test1697() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1697");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(2020, 2020, filetypeEnum2, true);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1698() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1698");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(100, (int) (short) 10, filetypeEnum2);
  }

  @Test
  public void test1699() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1699");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", (int) (byte) -1,
        (int) (short) 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1700() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1700");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(0, 0, filetypeEnum2, true);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1701() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1701");
    java.lang.String[] strArray3 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList4, 2020, 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 100, (-1));
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) -1, 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) 'a', (int) '4');
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 1, (int) (short) 1, fieldDataList23);
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
  public void test1702() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1702");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getQFromMemory((int) (short) 1, (int) '4');
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) -1, (int) '#', fieldDataList6);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 10, (-1), fieldDataList6);
    java.lang.Class<?> wildcardClass9 = fieldDataList6.getClass();
    org.junit.Assert.assertNotNull(fieldDataList6);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test1703() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1703");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getQFromMemory((int) (byte) 0, 0);
    org.junit.Assert.assertNotNull(fieldDataList2);
  }

  @Test
  public void test1704() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1704");
    java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
    java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
    boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList5, 100, (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList5, (int) ' ', (int) (byte) 0);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) ' ', (int) (short) 0, fieldDataList12);
    java.lang.Class<?> wildcardClass14 = fieldDataList12.getClass();
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    org.junit.Assert.assertNotNull(fieldDataList9);
    org.junit.Assert.assertNotNull(fieldDataList12);
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test1705() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1705");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", 0,
        (int) (byte) -1, filetypeEnum3);
    org.junit.Assert.assertNull(fieldData4);
  }

  @Test
  public void test1706() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1706");
    java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
    java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, (int) (byte) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList31 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) (byte) -1);
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
  public void test1707() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1707");
    boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists(10, (int) (byte) -1);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test1708() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1708");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (-1),
        (int) (byte) 10, filetypeEnum3);
    org.junit.Assert.assertNull(fieldData4);
  }

  @Test
  public void test1709() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1709");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) (byte) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) 'a', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, (int) (short) 1);
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
  public void test1710() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1710");
    java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
    java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) 'a', 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList4, 0, (int) 'a');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, 2020, (int) ' ');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, 1, (int) (short) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 100, 1);
    java.lang.Class<?> wildcardClass21 = fieldDataList20.getClass();
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(fieldDataList8);
    org.junit.Assert.assertNotNull(fieldDataList11);
    org.junit.Assert.assertNotNull(fieldDataList14);
    org.junit.Assert.assertNotNull(fieldDataList17);
    org.junit.Assert.assertNotNull(fieldDataList20);
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test1711() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1711");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getQFromMemory((int) (byte) 10, (int) (short) 0);
    org.junit.Assert.assertNotNull(fieldDataList2);
  }

  @Test
  public void test1712() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1712");
    java.util.List<java.lang.String> strList2 = null;
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory(strList2, (int) (short) 10, 100);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(1, (int) (byte) -1, fieldDataList5);
    org.junit.Assert.assertNotNull(fieldDataList5);
  }

  @Test
  public void test1713() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1713");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', 2020);
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
  public void test1714() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1714");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (short) 1,
        (int) 'a');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1715() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1715");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", 1,
        (int) (short) 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1716() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1716");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", (int) (byte) 10,
        (int) (short) 1, filetypeEnum3);
    org.junit.Assert.assertNull(fieldData4);
  }

  @Test
  public void test1717() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1717");
    java.util.List<java.lang.String> strList0 = null;
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory(strList0, (int) (byte) -1, 2015);
    org.junit.Assert.assertNotNull(fieldDataList3);
  }

  @Test
  public void test1718() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1718");
    java.lang.String[] strArray3 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, 0, (int) (byte) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) '4', (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) -1, (int) (short) 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList29 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) -1, 10);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 10, (int) (byte) 1, fieldDataList29);
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
  public void test1719() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1719");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(1, (int) (byte) 10, filetypeEnum2);
  }

  @Test
  public void test1720() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1720");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getQFromMemory(2015, (int) (byte) 100);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(0, (int) 'a', fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList4);
  }

  @Test
  public void test1721() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1721");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getQFromMemory((int) ' ', (-1));
    org.junit.Assert.assertNotNull(fieldDataList2);
  }

  @Test
  public void test1722() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1722");
    java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
    java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) 'a', 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 100, (-1));
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList4, 0, 2015);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) -1, (int) ' ');
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(fieldDataList8);
    org.junit.Assert.assertNotNull(fieldDataList11);
    org.junit.Assert.assertNotNull(fieldDataList14);
    org.junit.Assert.assertNotNull(fieldDataList17);
  }

  @Test
  public void test1723() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1723");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) '4', 10, filetypeEnum2, true);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1724() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1724");
    java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
    java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 10, (-1));
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 1, 2020);
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
  public void test1725() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1725");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE",
        (int) (short) -1, (int) (byte) -1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1726() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1726");
    java.lang.String[] strArray3 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 1, 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) -1, (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList26 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) 0, (int) (short) 100);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) ' ', 10, fieldDataList26);
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
  public void test1727() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1727");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) ' ', 2015, filetypeEnum2);
  }

  @Test
  public void test1728() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1728");
    java.lang.String[] strArray5 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
    boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList6, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList6, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList6, 2020, 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList6, (int) (short) 100, (-1));
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList6, 10, (int) '#');
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) '4', 100, fieldDataList22);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 1, (int) (byte) 1, fieldDataList22);
    org.junit.Assert.assertNotNull(strArray5);
    org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    org.junit.Assert.assertNotNull(fieldDataList10);
    org.junit.Assert.assertNotNull(fieldDataList13);
    org.junit.Assert.assertNotNull(fieldDataList16);
    org.junit.Assert.assertNotNull(fieldDataList19);
    org.junit.Assert.assertNotNull(fieldDataList22);
  }

  @Test
  public void test1729() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1729");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 100, (int) (byte) 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 100, (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) (short) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, (int) (short) 1);
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
  public void test1730() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1730");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (int) (byte) -1,
        (int) (byte) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1731() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1731");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (-1),
        (int) (byte) 100);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1732() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1732");
    boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists(0, (int) (byte) 1);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test1733() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1733");
    java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
    java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 2020, (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) ' ', (int) '#');
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(fieldDataList7);
    org.junit.Assert.assertNotNull(fieldDataList10);
    org.junit.Assert.assertNotNull(fieldDataList13);
    org.junit.Assert.assertNotNull(fieldDataList16);
  }

  @Test
  public void test1734() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1734");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) -1, (int) (byte) 100, filetypeEnum2);
  }

  @Test
  public void test1735() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1735");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", 1,
        (int) '#');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1736() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1736");
    boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (short) -1, 1);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test1737() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1737");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("",
        (int) (short) 100, (int) (short) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1738() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1738");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getQFromMemory((int) (byte) 100, (int) (byte) 1);
    org.junit.Assert.assertNotNull(fieldDataList2);
  }

  @Test
  public void test1739() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1739");
    java.lang.String[] strArray9 = new java.lang.String[] { "", "", "" };
    java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
    boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList10, (int) 'a', 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList10, (int) ' ', (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList10, (int) (short) 1, 2015);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 1, (int) (byte) -1, fieldDataList20);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 1, (int) '#', fieldDataList20);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (short) 1, (int) (short) 10, fieldDataList20);
    org.junit.Assert.assertNotNull(strArray9);
    org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    org.junit.Assert.assertNotNull(fieldDataList14);
    org.junit.Assert.assertNotNull(fieldDataList17);
    org.junit.Assert.assertNotNull(fieldDataList20);
  }

  @Test
  public void test1740() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1740");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(100, (int) ' ', filetypeEnum2);
  }

  @Test
  public void test1741() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1741");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (-1));
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
  public void test1742() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1742");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) (byte) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) (byte) 100);
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
  public void test1743() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1743");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) 'a', (int) (byte) -1);
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
  public void test1744() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1744");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (byte) -1,
        100);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1745() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1745");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getQFromMemory((int) '#', 2015);
    org.junit.Assert.assertNotNull(fieldDataList2);
  }

  @Test
  public void test1746() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1746");
    java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
    java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 0);
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
  public void test1747() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1747");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(2015, (int) 'a', filetypeEnum2);
  }

  @Test
  public void test1748() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1748");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) '#', 1, filetypeEnum2);
  }

  @Test
  public void test1749() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1749");
    java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
    java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) 'a', 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (short) 1, 2015);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, 0, 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, 2015, (int) '4');
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(fieldDataList8);
    org.junit.Assert.assertNotNull(fieldDataList11);
    org.junit.Assert.assertNotNull(fieldDataList14);
    org.junit.Assert.assertNotNull(fieldDataList17);
    org.junit.Assert.assertNotNull(fieldDataList20);
  }

  @Test
  public void test1750() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1750");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", 0, 0,
        filetypeEnum3);
    org.junit.Assert.assertNull(fieldData4);
  }

  @Test
  public void test1751() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1751");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("", (int) (byte) 1,
        (int) '4');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1752() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1752");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE",
        (int) (short) 100, 2020, filetypeEnum3);
    org.junit.Assert.assertNull(fieldData4);
  }

  @Test
  public void test1753() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1753");
    java.lang.String[] strArray2 = new java.lang.String[] { "", "NONE" };
    java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (short) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 0, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) 'a', 0);
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(fieldDataList7);
    org.junit.Assert.assertNotNull(fieldDataList10);
    org.junit.Assert.assertNotNull(fieldDataList13);
  }

  @Test
  public void test1754() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1754");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", (int) (short) 0,
        (int) ' ');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1755() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1755");
    java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
    java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 10, (int) (short) 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 1, 0);
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(fieldDataList7);
    org.junit.Assert.assertNotNull(fieldDataList10);
    org.junit.Assert.assertNotNull(fieldDataList13);
    org.junit.Assert.assertNotNull(fieldDataList16);
  }

  @Test
  public void test1756() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1756");
    java.lang.String[] strArray3 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList4, 1, (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, 0, (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) '4', 100);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(10, (int) '4', fieldDataList23);
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
  public void test1757() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1757");
    boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (byte) 100, 2015);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test1758() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1758");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getQFromMemory((int) (byte) 10, 1);
    org.junit.Assert.assertNotNull(fieldDataList2);
  }

  @Test
  public void test1759() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1759");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", (int) (byte) -1,
        (int) ' ', filetypeEnum3);
    org.junit.Assert.assertNull(fieldData4);
  }

  @Test
  public void test1760() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1760");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) (short) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) (byte) 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 0, 0);
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
  public void test1761() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1761");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", 1, (int) '#',
        filetypeEnum3);
    org.junit.Assert.assertNull(fieldData4);
  }

  @Test
  public void test1762() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1762");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getQFromMemory((int) '4', (int) (short) 10);
    org.junit.Assert.assertNotNull(fieldDataList2);
  }

  @Test
  public void test1763() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1763");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (byte) 10,
        (int) '#', filetypeEnum3);
    org.junit.Assert.assertNull(fieldData4);
  }

  @Test
  public void test1764() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1764");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) ' ', (int) (byte) 0, filetypeEnum2);
  }

  @Test
  public void test1765() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1765");
    java.util.List<java.lang.String> strList0 = null;
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory(strList0, (int) (short) 0, (int) ' ');
    org.junit.Assert.assertNotNull(fieldDataList3);
  }

  @Test
  public void test1766() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1766");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) 10, (int) ' ', filetypeEnum2);
  }

  @Test
  public void test1767() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1767");
    java.lang.String[] strArray3 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList14 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (-1), (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList17 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList4, 1, (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList20 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) '#', (int) (byte) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList23 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) (byte) -1, 2015);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists(2020, (int) (short) 100, fieldDataList23);
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
  public void test1768() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1768");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getQFromMemory((-1), 0);
    java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(wildcardClass3);
  }

  @Test
  public void test1769() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1769");
    java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
    java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 0, 10);
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
  public void test1770() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1770");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getQFromMemory((int) ' ', 2015);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) ' ', (int) (short) 0, fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList4);
  }

  @Test
  public void test1771() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1771");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) '4', 0, filetypeEnum2);
  }

  @Test
  public void test1772() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1772");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getQFromMemory((int) (byte) 100, (int) (short) 100);
    org.junit.Assert.assertNotNull(fieldDataList2);
  }

  @Test
  public void test1773() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1773");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("",
        (int) (short) -1, 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1774() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1774");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (short) 1, 0,
        filetypeEnum3);
    org.junit.Assert.assertNull(fieldData4);
  }

  @Test
  public void test1775() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1775");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getQFromMemory((int) (byte) 1, 2020);
    java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(wildcardClass3);
  }

  @Test
  public void test1776() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1776");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear[] fieldDataYearArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear[] {};
    java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear> fieldDataYearList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear>();
    boolean boolean2 = java.util.Collections
        .addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldDataYear>) fieldDataYearList1, fieldDataYearArray0);
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
  public void test1777() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1777");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) (byte) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 0, 1);
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
  public void test1778() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1778");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData(2020, (int) (byte) 10, filetypeEnum2, false);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1779() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1779");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) (short) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) '4');
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
  public void test1780() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1780");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) 'a', (int) (short) 0, filetypeEnum2);
  }

  @Test
  public void test1781() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1781");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("", (int) (short) 1, 1,
        filetypeEnum3);
    org.junit.Assert.assertNull(fieldData4);
  }

  @Test
  public void test1782() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1782");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (byte) 100, (int) (byte) 10, filetypeEnum2);
  }

  @Test
  public void test1783() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1783");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("hi!", (int) (byte) 1,
        1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1784() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1784");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.Globals.getFromMemory("NONE", 10,
        (int) (short) 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1785() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1785");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(1, (int) (byte) -1, filetypeEnum2);
  }

  @Test
  public void test1786() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1786");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", 0, (-1),
        filetypeEnum3);
    org.junit.Assert.assertNull(fieldData4);
  }

  @Test
  public void test1787() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1787");
    boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (short) 0, (int) (byte) 100);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test1788() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1788");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (-1));
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '4', 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) (short) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 1, (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList30 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 10);
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
  public void test1790() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1790");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getQFromMemory((int) ' ', 10);
    org.junit.Assert.assertNotNull(fieldDataList2);
  }

  @Test
  public void test1791() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1791");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 0);
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
  public void test1792() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1792");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory(0, (-1), filetypeEnum2);
  }

  @Test
  public void test1793() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1793");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("NONE", (int) ' ',
        (int) (byte) 1, filetypeEnum3);
    org.junit.Assert.assertNull(fieldData4);
  }

  @Test
  public void test1794() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1794");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getQFromMemory((int) ' ', (int) ' ');
    org.junit.Assert.assertNotNull(fieldDataList2);
  }

  @Test
  public void test1795() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1795");
    java.lang.String[] strArray3 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList4, 10, 2020);
    net.ajaskey.market.tools.SIP.BigDB.Globals.setLists((int) (byte) 10, (int) (byte) 1, fieldDataList11);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(fieldDataList8);
    org.junit.Assert.assertNotNull(fieldDataList11);
  }

  @Test
  public void test1796() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1796");
    java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
    java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 0, (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 0, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) (short) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) 'a');
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(fieldDataList7);
    org.junit.Assert.assertNotNull(fieldDataList10);
    org.junit.Assert.assertNotNull(fieldDataList13);
    org.junit.Assert.assertNotNull(fieldDataList16);
    org.junit.Assert.assertNotNull(fieldDataList19);
  }

  @Test
  public void test1797() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1797");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", (int) '#',
        (int) 'a');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1798() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1798");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) (short) 1,
        (int) 'a', filetypeEnum3);
    org.junit.Assert.assertNull(fieldData4);
  }

  @Test
  public void test1799() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1799");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", 0,
        (int) (short) 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1800() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1800");
    boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (byte) -1, (int) '4');
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test1801() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1801");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory(2020, (int) (byte) -1, filetypeEnum2);
  }

  @Test
  public void test1802() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1802");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 100, (int) (byte) 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 10, (int) 'a');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) '#');
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
  public void test1803() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1803");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromDb("hi!", (int) 'a',
        (int) (byte) 0, filetypeEnum3);
    org.junit.Assert.assertNull(fieldData4);
  }

  @Test
  public void test1804() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1804");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getQFromMemory((int) (byte) 0, (int) (byte) -1);
    java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(wildcardClass3);
  }

  @Test
  public void test1805() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1805");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setQMemory((int) (short) 0, (int) '#', filetypeEnum2);
  }

  @Test
  public void test1806() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1806");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getQFromMemory(100, (int) (byte) 1);
    org.junit.Assert.assertNotNull(fieldDataList2);
  }

  @Test
  public void test1807() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1807");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 2015, (-1));
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 0, (int) (byte) 1);
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
  public void test1808() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1808");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("", (int) (byte) -1,
        (int) (short) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1809() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1809");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals.getQFromMemory(10,
        (int) (byte) 100);
    java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(wildcardClass3);
  }

  @Test
  public void test1810() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1810");
    java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
    java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 100, (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) -1, (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 1, (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList16 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, 1, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList19 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList22 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) 0, (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList25 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (short) 100, (int) (byte) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList28 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) '#');
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
  public void test1811() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1811");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) (byte) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, (int) ' ');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) 'a', (-1));
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
  public void test1812() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1812");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) '#', (int) (byte) -1, filetypeEnum2, true);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1813() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1813");
    boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (byte) 1, 0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test1814() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1814");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    net.ajaskey.market.tools.SIP.BigDB.MarketTools.setMemory((int) (byte) 1, (int) '#', filetypeEnum2);
  }

  @Test
  public void test1815() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1815");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getQFromMemory(2020, (int) (byte) 1);
    org.junit.Assert.assertNotNull(fieldDataList2);
  }

  @Test
  public void test1816() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1816");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) (short) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 100, 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, (-1));
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList27 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 2020, 0);
    java.lang.Class<?> wildcardClass28 = strList2.getClass();
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
  public void test1817() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1817");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.getFromMemory("hi!", 0,
        (int) 'a');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1818() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1818");
    boolean boolean2 = net.ajaskey.market.tools.SIP.BigDB.Globals.checkLists((int) (byte) 100, 1);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
  }

  @Test
  public void test1819() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1819");
    net.ajaskey.market.tools.SIP.BigDB.FiletypeEnum filetypeEnum2 = null;
    boolean boolean4 = net.ajaskey.market.tools.SIP.BigDB.MarketTools.parseSipData((int) (short) 1, 2020, filetypeEnum2, false);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
  }

  @Test
  public void test1820() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1820");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 1, (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) (byte) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) (byte) -1);
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
  public void test1821() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1821");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 0, (int) ' ');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 100, (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) -1, 0);
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
  public void test1822() throws Throwable {
    if (debug) System.out.format("%n%s%n", "DbTests3.test1822");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) ' ', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (-1), (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList15 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (short) 10, 2020);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList18 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) '#', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList21 = net.ajaskey.market.tools.SIP.BigDB.MarketTools
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) -1, 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList24 = net.ajaskey.market.tools.SIP.BigDB.Globals
        .getListFromMemory((java.util.List<java.lang.String>) strList2, (int) (byte) 100, 0);
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
}
