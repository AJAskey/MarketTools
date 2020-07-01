package net.ajaskey.market.tools.SIP.BigDB.collation;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CollationTests1 {

  public static boolean debug = false;

  @Test
  public void test0501() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0501");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double9 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.getMostRecent();
    double[] doubleArray11 = quarterlyDouble6.dArr;
    java.lang.Class<?> wildcardClass12 = quarterlyDouble6.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test0502() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0502");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double[] doubleArray12 = new double[] { 1L, 100, (short) 10 };
    quarterlyDouble7.dArr = doubleArray12;
    double double15 = quarterlyDouble7.get((int) (byte) -1);
    java.lang.String str16 = quarterlyDouble7.toString();
    double double17 = quarterlyDouble7.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      double double18 = quarterlyDouble7.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 100.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9999.9999d) + "'", double15 == (-9999.9999d));
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000" + "'", str16,
        "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
  }

  @Test
  public void test0503() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0503");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray9 = quarterlyDouble8.dArr;
    double double11 = quarterlyDouble8.get((-1));
    double[] doubleArray17 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    double double19 = quarterlyDouble18.getTtmAvg();
    double[] doubleArray25 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray25);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray25);
    quarterlyDouble18.dArr = doubleArray25;
    double[] doubleArray34 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble35 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray34);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray34);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray34);
    quarterlyDouble18.dArr = doubleArray34;
    quarterlyDouble8.dArr = doubleArray34;
    double double40 = quarterlyDouble8.getQseqQ();
    double[] doubleArray46 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble47 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray46);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble48 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray46);
    double[] doubleArray51 = new double[] { 0.0d, 0 };
    quarterlyDouble48.dArr = doubleArray51;
    double double53 = quarterlyDouble48.getPrevTtm();
    double[] doubleArray59 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble60 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray59);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble61 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray59);
    java.lang.String str62 = quarterlyDouble61.toString();
    double[] doubleArray66 = new double[] { 1L, 100, (short) 10 };
    quarterlyDouble61.dArr = doubleArray66;
    quarterlyDouble48.dArr = doubleArray66;
    quarterlyDouble8.dArr = doubleArray66;
    double double71 = quarterlyDouble8.get(0);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray34);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1100.0d + "'", double40 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray46);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray51);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray59);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str62 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str62,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray66);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[1.0, 100.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double71 + "' != '" + 1.0d + "'", double71 == 1.0d);
  }

  @Test
  public void test0504() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0504");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.get2QTtm();
    java.lang.String str9 = quarterlyDouble6.toString();
    double double10 = quarterlyDouble6.getPrevTtm();
    double double11 = quarterlyDouble6.get2QTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str13 = quarterlyDouble6.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str9,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
  }

  @Test
  public void test0505() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0505");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) -1,
        (int) 'a');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) 'a', (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList10 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) '4', 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList11 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
    org.junit.Assert.assertNotNull(companyDataList7);
    org.junit.Assert.assertNotNull(companyDataList10);
    org.junit.Assert.assertNotNull(companyDataList11);
  }

  @Test
  public void test0506() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0506");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double double10 = quarterlyDouble6.getPrevTtm();
    double double11 = quarterlyDouble6.getTtm();
    java.lang.String str12 = quarterlyDouble6.toString();
    double double13 = quarterlyDouble6.getQseqQ();
    java.lang.String str14 = quarterlyDouble6.toString();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str16 = quarterlyDouble6.fmtGrowth4Q("\t i=0 0.0000\t i=1 0.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str12,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1100.0d + "'", double13 == 1100.0d);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str14,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test0507() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0507");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) -1, 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0508() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0508");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(100, 1);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0509() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0509");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double[] doubleArray15 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    java.lang.String str18 = quarterlyDouble17.toString();
    double[] doubleArray19 = quarterlyDouble17.dArr;
    quarterlyDouble6.dArr = doubleArray19;
    double[] doubleArray21 = quarterlyDouble6.dArr;
    double double22 = quarterlyDouble6.get2QTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str18,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
  }

  @Test
  public void test0510() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0510");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) -1,
        (int) (short) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0511() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0511");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.lang.String str5 = companyData1.getTicker();
    java.lang.Class<?> wildcardClass6 = companyData1.getClass();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test0512() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0512");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double double12 = quarterlyDouble6.deltaQ((int) '4', (int) (byte) 100);
    double double13 = quarterlyDouble6.getQseqQ();
    double double14 = quarterlyDouble6.get2QTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1100.0d + "'", double13 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
  }

  @Test
  public void test0513() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0513");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double10 = quarterlyDouble8.get((int) (byte) -1);
    double double11 = quarterlyDouble8.get2QTtm();
    double double12 = quarterlyDouble8.getMostRecent();
    double[] doubleArray18 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    double[] doubleArray22 = quarterlyDouble21.dArr;
    quarterlyDouble8.dArr = doubleArray22;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray22);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0514() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0514");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double9 = quarterlyDouble8.getPrevTtm();
    double double10 = quarterlyDouble8.getTtm();
    double double11 = quarterlyDouble8.get2QTtm();
    double double12 = quarterlyDouble8.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
  }

  @Test
  public void test0515() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0515");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) ' ', 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, (int) (byte) 0, 100);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList5);
  }

  @Test
  public void test0516() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0516");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (short) 0, (int) '4');
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0517() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0517");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtm();
    double double8 = quarterlyDouble6.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str10 = quarterlyDouble6.fmtGrowth4Q("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
  }

  @Test
  public void test0518() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0518");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.get2QTtm();
    java.lang.String str9 = quarterlyDouble6.toString();
    double[] doubleArray10 = quarterlyDouble6.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str12 = quarterlyDouble6.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str9,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0519() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0519");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double double10 = quarterlyDouble7.get((int) (byte) -1);
    java.lang.String str11 = quarterlyDouble7.toString();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str13 = quarterlyDouble7.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str11,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test0520() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0520");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getQseqQ();
    double[] doubleArray14 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    java.lang.String str17 = quarterlyDouble16.toString();
    double[] doubleArray21 = new double[] { 1L, 100, (short) 10 };
    quarterlyDouble16.dArr = doubleArray21;
    quarterlyDouble7.dArr = doubleArray21;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray21);
    double double26 = quarterlyDouble24.get((int) (short) 100);
    java.lang.String str27 = quarterlyDouble24.toString();
    double[] doubleArray28 = quarterlyDouble24.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str30 = quarterlyDouble24.fmtGrowth1Q("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1100.0d + "'", double8 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str17,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 100.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-9999.9999d) + "'", double26 == (-9999.9999d));
    org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000" + "'", str27,
        "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
    org.junit.Assert.assertNotNull(doubleArray28);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 100.0, 10.0]");
  }

  @Test
  public void test0521() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0521");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) ' ', (int) (short) 0);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0522() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0522");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double double10 = quarterlyDouble6.getPrevTtm();
    double double13 = quarterlyDouble6.deltaQ((int) (byte) 10, 0);
    double[] doubleArray19 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    java.lang.String str22 = quarterlyDouble21.toString();
    double[] doubleArray23 = quarterlyDouble21.dArr;
    quarterlyDouble6.dArr = doubleArray23;
    java.lang.String str25 = quarterlyDouble6.toString();
    double[] doubleArray31 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray31);
    double double33 = quarterlyDouble32.getTtmAvg();
    double[] doubleArray39 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble40 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray39);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray39);
    quarterlyDouble32.dArr = doubleArray39;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble43 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray39);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble44 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray39);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble45 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray39);
    quarterlyDouble6.dArr = doubleArray39;
    java.lang.String str47 = quarterlyDouble6.toString();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str22,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str25,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray31);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray39);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str47,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test0523() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0523");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) 'a', (int) (short) 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0524() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0524");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, 100, (int) (byte) 10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0525() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0525");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      double double10 = quarterlyDouble6.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
  }

  @Test
  public void test0526() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0526");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) 'a',
        (int) (short) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0527() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0527");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 1,
        (int) '4');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0528() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0528");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (byte) 100,
          (int) (byte) 10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0529() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0529");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (-1), (int) (byte) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0530() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0530");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str9 = quarterlyDouble7.fmtGrowth1Q("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0531() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0531");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) ' ', (int) '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0532() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0532");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) '#', 0);
  }

  @Test
  public void test0533() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0533");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) 100,
        (int) (byte) -1);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0534() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0534");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) 'a', (-1));
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0535() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0535");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (short) 100, (int) 'a');
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0536() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0536");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData7 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList4, (int) (short) 1, (int) (short) 0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData10 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList4, (int) (short) -1, (int) (short) 100);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNull(fieldData7);
    org.junit.Assert.assertNull(fieldData10);
  }

  @Test
  public void test0537() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0537");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 10, (int) (short) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0538() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0538");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) '#', (int) (byte) 1);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0539() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0539");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) -1, 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0540() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0540");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) '#', (int) (byte) 0);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0541() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0541");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (short) 10,
          (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0542() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0542");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) '#', (int) (short) -1);
  }

  @Test
  public void test0543() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0543");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((-1), (int) 'a');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, (int) (short) 0, (int) (short) 10);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList5);
  }

  @Test
  public void test0544() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0544");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) ' ', (int) (byte) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0545() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0545");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtm();
    double double8 = quarterlyDouble6.getTtm();
    double double9 = quarterlyDouble6.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
  }

  @Test
  public void test0546() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0546");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) 'a', 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0547() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0547");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double10 = quarterlyDouble8.get((int) (byte) -1);
    double double11 = quarterlyDouble8.get2QTtm();
    java.lang.String str12 = quarterlyDouble8.toString();
    double double15 = quarterlyDouble8.deltaQ((int) (short) 10, (int) (short) -1);
    // The following exception was thrown during execution in test generation
    try {
      double double16 = quarterlyDouble8.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str12,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
  }

  @Test
  public void test0548() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0548");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000", (int) '#', (int) (byte) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0549() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0549");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double9 = quarterlyDouble8.getPrevTtm();
    double double10 = quarterlyDouble8.get2QTtm();
    double double13 = quarterlyDouble8.deltaQ(100, 100);
    double double16 = quarterlyDouble8.deltaQ((int) '#', 100);
    double double19 = quarterlyDouble8.deltaQ(10, 10);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
  }

  @Test
  public void test0550() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0550");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str9 = quarterlyDouble6.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0551() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0551");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 1, 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0552() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0552");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str10 = quarterlyDouble8.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0553() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0553");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 1, (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, 0, 0);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test0554() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0554");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) '#',
        (int) (short) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0555() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0555");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray9 = quarterlyDouble8.dArr;
    double double11 = quarterlyDouble8.get((-1));
    double[] doubleArray17 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    double double19 = quarterlyDouble18.getTtmAvg();
    double[] doubleArray25 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray25);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray25);
    quarterlyDouble18.dArr = doubleArray25;
    double[] doubleArray34 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble35 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray34);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray34);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray34);
    quarterlyDouble18.dArr = doubleArray34;
    quarterlyDouble8.dArr = doubleArray34;
    double double40 = quarterlyDouble8.getQseqQ();
    double double41 = quarterlyDouble8.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str43 = quarterlyDouble8.fmtGrowth1Q("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray34);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1100.0d + "'", double40 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1100.0d + "'", double41 == 1100.0d);
  }

  @Test
  public void test0556() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0556");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double double10 = quarterlyDouble6.getPrevTtm();
    double double11 = quarterlyDouble6.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str13 = quarterlyDouble6.fmtGrowth4Q("\t i=0 0.0000\t i=1 0.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
  }

  @Test
  public void test0557() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0557");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 0,
        (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (byte) 10, (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(companyDataList7);
  }

  @Test
  public void test0558() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0558");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 1, 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0559() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0559");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double double9 = quarterlyDouble7.get2QTtm();
    double[] doubleArray15 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    double double17 = quarterlyDouble16.getTtmAvg();
    double double18 = quarterlyDouble16.getTtmAvg();
    double double19 = quarterlyDouble16.getQseqQ();
    double double20 = quarterlyDouble16.getPrevTtm();
    double[] doubleArray26 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray26);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray26);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray26);
    double[] doubleArray30 = quarterlyDouble29.dArr;
    double double32 = quarterlyDouble29.get((-1));
    double[] doubleArray38 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray38);
    double double40 = quarterlyDouble39.getTtmAvg();
    double[] doubleArray46 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble47 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray46);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble48 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray46);
    quarterlyDouble39.dArr = doubleArray46;
    double[] doubleArray55 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble56 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray55);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble57 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray55);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble58 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray55);
    quarterlyDouble39.dArr = doubleArray55;
    quarterlyDouble29.dArr = doubleArray55;
    quarterlyDouble16.dArr = doubleArray55;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble62 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray55);
    quarterlyDouble7.dArr = doubleArray55;
    // The following exception was thrown during execution in test generation
    try {
      double double64 = quarterlyDouble7.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1100.0d + "'", double19 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray26);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray30);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-9999.9999d) + "'", double32 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray38);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray46);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray55);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0560() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0560");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (byte) 100,
        (int) (short) 10);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0561() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0561");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 10, 0);
  }

  @Test
  public void test0562() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0562");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) '#', (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, (int) (byte) 0, 10);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList5);
  }

  @Test
  public void test0563() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0563");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t i=0 0.0000\t i=1 0.0000", 100, 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0564() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0564");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (byte) -1, (int) '4');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0565() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0565");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData10 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList7, (int) (short) -1, 1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertNotNull(fieldDataList6);
    org.junit.Assert.assertNotNull(fieldDataList7);
    org.junit.Assert.assertNull(fieldData10);
  }

  @Test
  public void test0566() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0566");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double10 = quarterlyDouble6.get((int) (short) 1);
    double double11 = quarterlyDouble6.getPrevTtm();
    double double14 = quarterlyDouble6.deltaQ((int) (short) 100, (int) (short) 1);
    double double15 = quarterlyDouble6.getMostRecent();
    double double16 = quarterlyDouble6.getTtmAvg();
    double double17 = quarterlyDouble6.getPrevTtm();
    java.lang.String str18 = quarterlyDouble6.toString();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str20 = quarterlyDouble6.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str18,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test0567() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0567");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(100, (int) 'a');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0568() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0568");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getPrevTtm();
    double double9 = quarterlyDouble6.getQseqQ();
    double[] doubleArray10 = quarterlyDouble6.dArr;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0569() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0569");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) 'a', (int) 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0570() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0570");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000", 100, (int) (byte) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0571() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0571");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (byte) 10, (int) (short) -1);
    java.lang.Class<?> wildcardClass3 = companySummaryList2.getClass();
    org.junit.Assert.assertNotNull(companySummaryList2);
    org.junit.Assert.assertNotNull(wildcardClass3);
  }

  @Test
  public void test0572() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0572");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray14 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    double double16 = quarterlyDouble15.getTtmAvg();
    double[] doubleArray22 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray22);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray22);
    quarterlyDouble15.dArr = doubleArray22;
    double double26 = quarterlyDouble15.getPrevTtm();
    double double27 = quarterlyDouble15.getPrevTtm();
    double[] doubleArray33 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray33);
    double double35 = quarterlyDouble34.getTtmAvg();
    double[] doubleArray41 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble42 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray41);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble43 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray41);
    quarterlyDouble34.dArr = doubleArray41;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble45 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray41);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble46 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray41);
    quarterlyDouble15.dArr = doubleArray41;
    quarterlyDouble8.dArr = doubleArray41;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble49 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray41);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str51 = quarterlyDouble49.fmtGrowth4Q("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray22);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray33);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray41);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0573() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0573");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray9 = quarterlyDouble8.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    double[] doubleArray12 = quarterlyDouble11.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray12);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0574() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0574");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getPrevTtm();
    double double11 = quarterlyDouble6.getPrevTtm();
    double double12 = quarterlyDouble6.getMostRecent();
    double double13 = quarterlyDouble6.getTtmAvg();
    double double14 = quarterlyDouble6.getPrevTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
  }

  @Test
  public void test0575() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0575");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray14 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    double double16 = quarterlyDouble15.getTtmAvg();
    double[] doubleArray22 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray22);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray22);
    quarterlyDouble15.dArr = doubleArray22;
    double double26 = quarterlyDouble15.getPrevTtm();
    double double27 = quarterlyDouble15.getPrevTtm();
    double[] doubleArray33 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray33);
    double double35 = quarterlyDouble34.getTtmAvg();
    double[] doubleArray41 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble42 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray41);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble43 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray41);
    quarterlyDouble34.dArr = doubleArray41;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble45 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray41);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble46 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray41);
    quarterlyDouble15.dArr = doubleArray41;
    quarterlyDouble8.dArr = doubleArray41;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble49 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray41);
    double double50 = quarterlyDouble49.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray22);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray33);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray41);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
  }

  @Test
  public void test0576() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0576");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(0, 0);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0577() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0577");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) '4', (int) (byte) 100);
  }

  @Test
  public void test0578() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0578");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, 1, (int) (byte) 10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0579() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0579");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) 'a', (int) (byte) 1);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0580() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0580");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) -1, 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) '4', (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList9 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (short) 100, (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList12 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, 0, 0);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(companyDataList9);
    org.junit.Assert.assertNotNull(companyDataList12);
  }

  @Test
  public void test0581() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0581");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    java.lang.String str6 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
    java.lang.String str8 = companyData1.getTicker();
    java.lang.String str9 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData13 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList10, 1, (int) ' ');
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList10);
    org.junit.Assert.assertNull(fieldData13);
  }

  @Test
  public void test0582() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0582");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double[] doubleArray15 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    java.lang.String str18 = quarterlyDouble17.toString();
    double[] doubleArray19 = quarterlyDouble17.dArr;
    quarterlyDouble6.dArr = doubleArray19;
    double[] doubleArray21 = quarterlyDouble6.dArr;
    double[] doubleArray25 = new double[] { (short) 10, (byte) -1, 0.0d };
    quarterlyDouble6.dArr = doubleArray25;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray25);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str18,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, -1.0, 0.0]");
  }

  @Test
  public void test0583() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0583");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 100, (int) (byte) 1);
  }

  @Test
  public void test0584() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0584");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (byte) -1, (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0585() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0585");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.lang.String str5 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData9 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList6, 100, (int) 'a');
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList6);
    org.junit.Assert.assertNull(fieldData9);
  }

  @Test
  public void test0586() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0586");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(10, (int) (byte) -1);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0587() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0587");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 1,
        (int) (short) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0588() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0588");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double[] doubleArray13 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    quarterlyDouble6.dArr = doubleArray13;
    double[] doubleArray22 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray22);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray22);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray22);
    quarterlyDouble6.dArr = doubleArray22;
    double double28 = quarterlyDouble6.get(100);
    double double30 = quarterlyDouble6.get(1);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray22);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-9999.9999d) + "'", double28 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
  }

  @Test
  public void test0589() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0589");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 100,
        (int) (short) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0590() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0590");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) -1, 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, 1, (int) (short) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(companyDataList7);
  }

  @Test
  public void test0591() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0591");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double9 = quarterlyDouble8.getTtm();
    double double10 = quarterlyDouble8.get2QTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
  }

  @Test
  public void test0593() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0593");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double10 = quarterlyDouble8.get((int) (byte) -1);
    double double11 = quarterlyDouble8.get2QTtm();
    java.lang.String str12 = quarterlyDouble8.toString();
    double double14 = quarterlyDouble8.get((-1));
    double double15 = quarterlyDouble8.getTtmAvg();
    double double17 = quarterlyDouble8.get((int) (short) 1);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str19 = quarterlyDouble8.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str12,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
  }

  @Test
  public void test0594() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0594");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.get2QTtm();
    double double10 = quarterlyDouble6.get((int) (byte) 100);
    double double11 = quarterlyDouble6.getQseqQ();
    double double12 = quarterlyDouble6.getTtm();
    double double13 = quarterlyDouble6.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      double double14 = quarterlyDouble6.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1100.0d + "'", double11 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1100.0d + "'", double13 == 1100.0d);
  }

  @Test
  public void test0595() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0595");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray9 = quarterlyDouble8.dArr;
    double double10 = quarterlyDouble8.getMostRecent();
    double double11 = quarterlyDouble8.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      double double12 = quarterlyDouble8.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
  }

  @Test
  public void test0596() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0596");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getPrevTtm();
    double double11 = quarterlyDouble6.getPrevTtm();
    double double12 = quarterlyDouble6.getMostRecent();
    double double13 = quarterlyDouble6.getTtmAvg();
    double[] doubleArray14 = quarterlyDouble6.dArr;
    // The following exception was thrown during execution in test generation
    try {
      double double17 = quarterlyDouble6.deltaQ((int) (byte) -1, (int) (short) 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0597() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0597");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) '#', 100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0598() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0598");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 1,
        (int) (byte) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0599() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0599");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) -1,
        (int) 'a');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, 100, (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList10 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, 10, (int) (short) 100);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(companyDataList7);
    org.junit.Assert.assertNotNull(companyDataList10);
  }

  @Test
  public void test0600() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0600");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double[] doubleArray13 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    quarterlyDouble6.dArr = doubleArray13;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    java.lang.Class<?> wildcardClass18 = quarterlyDouble17.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test0601() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0601");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(0, (-1));
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0602() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0602");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getPrevTtm();
    double double8 = quarterlyDouble6.getPrevTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str10 = quarterlyDouble6.fmtGrowth4Q("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
  }

  @Test
  public void test0603() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0603");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 10, (int) (byte) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0604() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0604");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double9 = quarterlyDouble8.getPrevTtm();
    double double10 = quarterlyDouble8.get2QTtm();
    double double13 = quarterlyDouble8.deltaQ(100, 100);
    double double16 = quarterlyDouble8.deltaQ((int) '#', 100);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str18 = quarterlyDouble8.fmtGrowth4Q("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
  }

  @Test
  public void test0605() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0605");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (byte) 1,
          (int) '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0606() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0606");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.get2QTtm();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
  }

  @Test
  public void test0607() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0607");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) 'a', (int) ' ');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0608() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0608");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double10 = quarterlyDouble6.get((int) (short) 1);
    double double11 = quarterlyDouble6.getPrevTtm();
    // The following exception was thrown during execution in test generation
    try {
      double double12 = quarterlyDouble6.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
  }

  @Test
  public void test0609() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0609");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (byte) 0, 10);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0610() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0610");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.deltaQ((int) (short) 100, (int) '#');
    double double13 = quarterlyDouble6.get(0);
    double double14 = quarterlyDouble6.getTtm();
    double double15 = quarterlyDouble6.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1100.0d + "'", double15 == 1100.0d);
  }

  @Test
  public void test0611() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0611");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double double9 = quarterlyDouble7.get2QTtm();
    double double10 = quarterlyDouble7.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
  }

  @Test
  public void test0612() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0612");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 1, (int) (byte) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0613() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0613");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.lang.String str5 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
    java.lang.String str7 = companyData1.getTicker();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList6);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
  }

  @Test
  public void test0614() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0614");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double9 = quarterlyDouble8.getPrevTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
  }

  @Test
  public void test0615() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0615");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getTtmAvg();
    double double10 = quarterlyDouble6.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str12 = quarterlyDouble6.fmtGrowth1Q("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
  }

  @Test
  public void test0616() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0616");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double double11 = quarterlyDouble7.deltaQ((int) (short) 10, (int) ' ');
    double[] doubleArray12 = quarterlyDouble7.dArr;
    double double13 = quarterlyDouble7.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
  }

  @Test
  public void test0617() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0617");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray9 = quarterlyDouble8.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    double double12 = quarterlyDouble11.get2QTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str14 = quarterlyDouble11.fmtGrowth1Q("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
  }

  @Test
  public void test0618() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0618");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double9 = quarterlyDouble6.get((int) 'a');
    double double10 = quarterlyDouble6.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9999.9999d) + "'", double9 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
  }

  @Test
  public void test0619() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0619");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.get2QTtm();
    double double10 = quarterlyDouble6.get((int) (byte) 100);
    double[] doubleArray11 = quarterlyDouble6.dArr;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0620() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0620");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (byte) 1, (int) ' ');
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0621() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0621");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double double12 = quarterlyDouble6.deltaQ((int) '4', (int) (byte) 100);
    double double13 = quarterlyDouble6.getQseqQ();
    double double14 = quarterlyDouble6.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1100.0d + "'", double13 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
  }

  @Test
  public void test0622() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0622");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t i=0 0.0000\t i=1 0.0000", 10, (int) (byte) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0623() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0623");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (short) 10,
          (int) (short) -1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0624() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0624");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 0, (int) '4');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0625() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0625");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.get2QTtm();
    double double13 = quarterlyDouble6.deltaQ((int) '#', (int) ' ');
    double double14 = quarterlyDouble6.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1100.0d + "'", double14 == 1100.0d);
  }

  @Test
  public void test0626() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0626");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
    java.lang.String str2 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.lang.String str4 = companyData1.getTicker();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000" + "'", str2,
        "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000" + "'", str4,
        "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
  }

  @Test
  public void test0627() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0627");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.deltaQ((int) '#', (int) (short) 100);
    double double11 = quarterlyDouble6.getPrevTtm();
    double double12 = quarterlyDouble6.getPrevTtm();
    // The following exception was thrown during execution in test generation
    try {
      double double13 = quarterlyDouble6.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
  }

  @Test
  public void test0628() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0628");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.deltaQ((int) '#', (int) (short) 100);
    double double11 = quarterlyDouble6.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
  }

  @Test
  public void test0629() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0629");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) '4', 100);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0630() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0630");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 0, (int) ' ');
  }

  @Test
  public void test0631() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0631");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.deltaQ((int) '#', (int) (short) 100);
    double double11 = quarterlyDouble6.getPrevTtm();
    double double12 = quarterlyDouble6.getPrevTtm();
    double double13 = quarterlyDouble6.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
  }

  @Test
  public void test0632() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0632");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    java.lang.String str6 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
    java.lang.String str8 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = companyData1.getFdList();
    java.lang.String str10 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData14 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList11, (int) (short) 1, (int) '4');
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList9);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList11);
    org.junit.Assert.assertNull(fieldData14);
  }

  @Test
  public void test0633() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0633");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) -1, (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, (int) 'a', (int) 'a');
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList5);
  }

  @Test
  public void test0634() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0634");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 1, (int) (byte) 0);
  }

  @Test
  public void test0635() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0635");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.deltaQ((int) (short) 100, (int) '#');
    double double12 = quarterlyDouble6.getTtm();
    double[] doubleArray13 = quarterlyDouble6.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str15 = quarterlyDouble6.fmtGrowth4Q("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0636() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0636");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(0, (int) (short) 10);
  }

  @Test
  public void test0637() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0637");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (short) 0,
          (int) (byte) -1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0638() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0638");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 100, 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
  }

  @Test
  public void test0639() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0639");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double10 = quarterlyDouble8.get((int) (byte) -1);
    double double11 = quarterlyDouble8.get2QTtm();
    java.lang.String str12 = quarterlyDouble8.toString();
    double double14 = quarterlyDouble8.get((-1));
    double double15 = quarterlyDouble8.getTtmAvg();
    double double17 = quarterlyDouble8.get((int) (short) 1);
    double[] doubleArray18 = quarterlyDouble8.dArr;
    double double19 = quarterlyDouble8.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str12,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 40.0d + "'", double19 == 40.0d);
  }

  @Test
  public void test0640() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0640");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) ' ', (int) 'a');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (short) -1, (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList9 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (byte) 1, (int) '#');
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(companyDataList9);
  }

  @Test
  public void test0641() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0641");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 1,
        (int) (short) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0642() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0642");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((-1), (int) (byte) 1);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0643() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0643");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) 'a',
        (int) (short) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0644() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0644");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double10 = quarterlyDouble8.get((int) (byte) -1);
    double double11 = quarterlyDouble8.get2QTtm();
    double double13 = quarterlyDouble8.get((int) (short) 100);
    double[] doubleArray19 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    double double21 = quarterlyDouble20.getMostRecent();
    double double22 = quarterlyDouble20.getTtm();
    double double24 = quarterlyDouble20.get((int) (short) 1);
    double double25 = quarterlyDouble20.getPrevTtm();
    double double28 = quarterlyDouble20.deltaQ((int) (short) 100, (int) (short) 1);
    double double29 = quarterlyDouble20.getMostRecent();
    double double30 = quarterlyDouble20.getTtmAvg();
    double[] doubleArray31 = quarterlyDouble20.dArr;
    quarterlyDouble8.dArr = doubleArray31;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9999.9999d) + "'", double13 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 40.0d + "'", double22 == 40.0d);
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray31);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0645() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0645");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) 'a',
          (int) (short) 10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0646() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0646");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.deltaQ((int) (short) 100, (int) '#');
    double double13 = quarterlyDouble6.get(0);
    double double14 = quarterlyDouble6.getQseqQ();
    double[] doubleArray15 = quarterlyDouble6.dArr;
    double double16 = quarterlyDouble6.getQseqQ();
    double double17 = quarterlyDouble6.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      double double18 = quarterlyDouble6.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1100.0d + "'", double14 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1100.0d + "'", double16 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
  }

  @Test
  public void test0647() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0647");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) (short) 100, (int) (short) 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0648() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0648");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.getTtmAvg();
    double double12 = quarterlyDouble6.get2QTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
  }

  @Test
  public void test0649() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0649");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 10, (int) (byte) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0650() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0650");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double10 = quarterlyDouble6.get(1);
    double double11 = quarterlyDouble6.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
  }

  @Test
  public void test0651() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0651");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) 'a', (int) (short) 1);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0652() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0652");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) '#', 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test0653() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0653");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 10, 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0654() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0654");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double double11 = quarterlyDouble7.deltaQ((int) (short) 10, (int) ' ');
    double[] doubleArray17 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    double double19 = quarterlyDouble18.getMostRecent();
    double double20 = quarterlyDouble18.getTtm();
    double double21 = quarterlyDouble18.getQseqQ();
    double double22 = quarterlyDouble18.get2QTtm();
    java.lang.String str23 = quarterlyDouble18.toString();
    double[] doubleArray29 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray29);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray29);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray29);
    double double34 = quarterlyDouble32.get((int) (byte) -1);
    double double35 = quarterlyDouble32.get2QTtm();
    java.lang.String str36 = quarterlyDouble32.toString();
    double double38 = quarterlyDouble32.get((-1));
    double double39 = quarterlyDouble32.getTtmAvg();
    double double41 = quarterlyDouble32.get((int) (short) 1);
    double[] doubleArray42 = quarterlyDouble32.dArr;
    quarterlyDouble18.dArr = doubleArray42;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble44 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray42);
    quarterlyDouble7.dArr = doubleArray42;
    double[] doubleArray46 = null;
    quarterlyDouble7.dArr = doubleArray46;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 40.0d + "'", double20 == 40.0d);
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1100.0d + "'", double21 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str23,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray29);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-9999.9999d) + "'", double34 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
    org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str36,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-9999.9999d) + "'", double38 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
    org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray42);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0655() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0655");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 1, 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0656() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0656");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.getTtmAvg();
    double[] doubleArray17 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    double double20 = quarterlyDouble19.getQseqQ();
    double[] doubleArray26 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray26);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray26);
    java.lang.String str29 = quarterlyDouble28.toString();
    double[] doubleArray33 = new double[] { 1L, 100, (short) 10 };
    quarterlyDouble28.dArr = doubleArray33;
    quarterlyDouble19.dArr = doubleArray33;
    quarterlyDouble6.dArr = doubleArray33;
    double double37 = quarterlyDouble6.getPrevTtm();
    double double38 = quarterlyDouble6.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1100.0d + "'", double20 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray26);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str29,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray33);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, 100.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
    org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
  }

  @Test
  public void test0657() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0657");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.lang.String str5 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
    java.lang.String str8 = companyData1.getTicker();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList6);
    org.junit.Assert.assertNotNull(fieldDataList7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
  }

  @Test
  public void test0658() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0658");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((-1), 10);
  }

  @Test
  public void test0659() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0659");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (short) 1,
          (int) (short) 100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0660() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0660");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double double10 = quarterlyDouble6.getPrevTtm();
    double double11 = quarterlyDouble6.getPrevTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
  }

  @Test
  public void test0661() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0661");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) 10,
        (int) (byte) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0662() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0662");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    java.lang.String str6 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
    java.lang.String str8 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData12 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList9, (int) (short) -1, (int) (byte) 1);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData15 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList9, 1, 100);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList9);
    org.junit.Assert.assertNull(fieldData12);
    org.junit.Assert.assertNull(fieldData15);
  }

  @Test
  public void test0663() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0663");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) -1, (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, (int) (byte) 100, (int) '4');
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList5);
  }

  @Test
  public void test0664() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0664");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double[] doubleArray13 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    quarterlyDouble6.dArr = doubleArray13;
    double double17 = quarterlyDouble6.getPrevTtm();
    double double18 = quarterlyDouble6.getPrevTtm();
    double[] doubleArray24 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray24);
    double double26 = quarterlyDouble25.getTtmAvg();
    double[] doubleArray32 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray32);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray32);
    quarterlyDouble25.dArr = doubleArray32;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray32);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray32);
    quarterlyDouble6.dArr = doubleArray32;
    double double39 = quarterlyDouble6.getMostRecent();
    double double41 = quarterlyDouble6.get((int) (byte) -1);
    java.lang.Class<?> wildcardClass42 = quarterlyDouble6.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray24);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray32);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
    org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-9999.9999d) + "'", double41 == (-9999.9999d));
    org.junit.Assert.assertNotNull(wildcardClass42);
  }

  @Test
  public void test0665() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0665");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 10, (int) (byte) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0666() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0666");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    java.lang.String str6 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
    java.lang.String str8 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData13 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList10, 1, 0);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList9);
    org.junit.Assert.assertNotNull(fieldDataList10);
    org.junit.Assert.assertNull(fieldData13);
  }

  @Test
  public void test0667() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0667");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double[] doubleArray15 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    java.lang.String str18 = quarterlyDouble17.toString();
    double[] doubleArray19 = quarterlyDouble17.dArr;
    quarterlyDouble6.dArr = doubleArray19;
    double[] doubleArray21 = quarterlyDouble6.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray21);
    java.lang.Class<?> wildcardClass23 = quarterlyDouble22.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str18,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test0668() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0668");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getPrevTtm();
    java.lang.String str8 = quarterlyDouble6.toString();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test0669() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0669");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.get2QTtm();
    double double13 = quarterlyDouble6.deltaQ((int) '#', (int) ' ');
    double double14 = quarterlyDouble6.getTtmAvg();
    double double15 = quarterlyDouble6.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      double double16 = quarterlyDouble6.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
  }

  @Test
  public void test0670() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0670");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.getTtmAvg();
    double[] doubleArray17 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    double double20 = quarterlyDouble19.getQseqQ();
    double[] doubleArray26 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray26);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray26);
    java.lang.String str29 = quarterlyDouble28.toString();
    double[] doubleArray33 = new double[] { 1L, 100, (short) 10 };
    quarterlyDouble28.dArr = doubleArray33;
    quarterlyDouble19.dArr = doubleArray33;
    quarterlyDouble6.dArr = doubleArray33;
    double double39 = quarterlyDouble6.deltaQ((int) 'a', 0);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str41 = quarterlyDouble6.fmtGrowth4Q("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1100.0d + "'", double20 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray26);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str29,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray33);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, 100.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
  }

  @Test
  public void test0671() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0671");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double[] doubleArray13 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    quarterlyDouble6.dArr = doubleArray13;
    double[] doubleArray22 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray22);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray22);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray22);
    quarterlyDouble6.dArr = doubleArray22;
    java.lang.Class<?> wildcardClass27 = doubleArray22.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray22);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(wildcardClass27);
  }

  @Test
  public void test0672() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0672");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) 1,
        (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (short) 10, (int) (short) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(companyDataList7);
  }

  @Test
  public void test0673() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0673");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (byte) -1, (int) ' ');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0674() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0674");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.getQseqQ();
    double double14 = quarterlyDouble6.deltaQ((int) '4', (int) (short) -1);
    double double15 = quarterlyDouble6.getMostRecent();
    java.lang.String str16 = quarterlyDouble6.toString();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str18 = quarterlyDouble6.fmtGrowth1Q("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1100.0d + "'", double11 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str16,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test0675() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0675");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getQseqQ();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double11 = quarterlyDouble7.get((int) ' ');
    double double12 = quarterlyDouble7.getTtm();
    double double13 = quarterlyDouble7.getPrevTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1100.0d + "'", double8 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
  }

  @Test
  public void test0676() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0676");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000", (-1), (int) (short) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0677() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0677");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray10 = new double[] { 0.0d, 0 };
    quarterlyDouble7.dArr = doubleArray10;
    // The following exception was thrown during execution in test generation
    try {
      double double12 = quarterlyDouble7.getQseqQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0]");
  }

  @Test
  public void test0678() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0678");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double double10 = quarterlyDouble7.get((int) (byte) -1);
    java.lang.String str11 = quarterlyDouble7.toString();
    double double14 = quarterlyDouble7.deltaQ(1, 0);
    double double15 = quarterlyDouble7.getTtm();
    double double17 = quarterlyDouble7.get((int) (byte) 100);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str11,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9999.9999d) + "'", double17 == (-9999.9999d));
  }

  @Test
  public void test0679() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0679");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (short) 1, (int) (byte) 100);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0680() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0680");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 1, (int) (short) -1);
  }

  @Test
  public void test0681() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0681");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double[] doubleArray15 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    java.lang.String str18 = quarterlyDouble17.toString();
    double[] doubleArray19 = quarterlyDouble17.dArr;
    quarterlyDouble6.dArr = doubleArray19;
    double[] doubleArray21 = quarterlyDouble6.dArr;
    double[] doubleArray25 = new double[] { (short) 10, (byte) -1, 0.0d };
    quarterlyDouble6.dArr = doubleArray25;
    double double27 = quarterlyDouble6.getPrevTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str29 = quarterlyDouble6.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str18,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, -1.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
  }

  @Test
  public void test0682() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0682");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 0, (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
  }

  @Test
  public void test0683() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0683");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 0, (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0684() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0684");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (short) -1, 10);
    java.lang.Class<?> wildcardClass3 = strList2.getClass();
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(wildcardClass3);
  }

  @Test
  public void test0685() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0685");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtm();
    double double8 = quarterlyDouble6.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1100.0d + "'", double8 == 1100.0d);
  }

  @Test
  public void test0686() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0686");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray14 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    double double16 = quarterlyDouble15.getTtmAvg();
    double[] doubleArray22 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray22);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray22);
    quarterlyDouble15.dArr = doubleArray22;
    double double26 = quarterlyDouble15.getPrevTtm();
    double double27 = quarterlyDouble15.getPrevTtm();
    double[] doubleArray33 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray33);
    double double35 = quarterlyDouble34.getTtmAvg();
    double[] doubleArray41 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble42 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray41);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble43 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray41);
    quarterlyDouble34.dArr = doubleArray41;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble45 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray41);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble46 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray41);
    quarterlyDouble15.dArr = doubleArray41;
    quarterlyDouble8.dArr = doubleArray41;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble49 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray41);
    java.lang.Class<?> wildcardClass50 = quarterlyDouble49.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray22);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray33);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray41);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(wildcardClass50);
  }

  @Test
  public void test0687() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0687");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) -1,
        (int) '4');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0688() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0688");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (short) -1,
          100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0689() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0689");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getTtmAvg();
    java.lang.String str10 = quarterlyDouble6.toString();
    double double11 = quarterlyDouble6.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str10,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
  }

  @Test
  public void test0690() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0690");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) -1, (int) (short) -1);
  }

  @Test
  public void test0691() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0691");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000", (int) 'a', (int) (byte) 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0692() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0692");
    double[] doubleArray0 = new double[] {};
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray0);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str3 = quarterlyDouble1.fmtGrowth4Q("\t i=0 0.0000\t i=1 0.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray0);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
  }

  @Test
  public void test0693() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0693");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) -1,
        (int) (short) -1);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0694() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0694");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.getQseqQ();
    double double12 = quarterlyDouble6.getQseqQ();
    double double13 = quarterlyDouble6.getPrevTtm();
    double double14 = quarterlyDouble6.getPrevTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1100.0d + "'", double11 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1100.0d + "'", double12 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
  }

  @Test
  public void test0695() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0695");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(100, (int) (short) 100);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0696() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0696");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double[] doubleArray13 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    quarterlyDouble6.dArr = doubleArray13;
    double double17 = quarterlyDouble6.getPrevTtm();
    double double18 = quarterlyDouble6.getPrevTtm();
    double[] doubleArray24 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray24);
    double double26 = quarterlyDouble25.getTtmAvg();
    double[] doubleArray32 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray32);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray32);
    quarterlyDouble25.dArr = doubleArray32;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray32);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray32);
    quarterlyDouble6.dArr = doubleArray32;
    double[] doubleArray39 = quarterlyDouble6.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble40 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray39);
    double double43 = quarterlyDouble40.deltaQ((int) '#', (int) ' ');
    // The following exception was thrown during execution in test generation
    try {
      double double44 = quarterlyDouble40.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray24);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray32);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray39);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
  }

  @Test
  public void test0697() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0697");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double double10 = quarterlyDouble6.getPrevTtm();
    double double11 = quarterlyDouble6.getTtm();
    java.lang.String str12 = quarterlyDouble6.toString();
    double double15 = quarterlyDouble6.deltaQ((int) (byte) 100, (int) (short) 10);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str12,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
  }

  @Test
  public void test0698() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0698");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray9 = quarterlyDouble8.dArr;
    double double11 = quarterlyDouble8.get((-1));
    double[] doubleArray17 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    double double19 = quarterlyDouble18.getTtmAvg();
    double[] doubleArray25 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray25);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray25);
    quarterlyDouble18.dArr = doubleArray25;
    double[] doubleArray34 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble35 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray34);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray34);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray34);
    quarterlyDouble18.dArr = doubleArray34;
    quarterlyDouble8.dArr = doubleArray34;
    double[] doubleArray45 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble46 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray45);
    double double47 = quarterlyDouble46.getTtmAvg();
    double double48 = quarterlyDouble46.getTtmAvg();
    double double49 = quarterlyDouble46.getQseqQ();
    double double50 = quarterlyDouble46.getPrevTtm();
    double[] doubleArray51 = quarterlyDouble46.dArr;
    quarterlyDouble8.dArr = doubleArray51;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str54 = quarterlyDouble8.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray34);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray45);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
    org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
    org.junit.Assert.assertTrue("'" + double49 + "' != '" + 1100.0d + "'", double49 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray51);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0699() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0699");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 10, (int) ' ');
  }

  @Test
  public void test0700() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0700");
    java.util.List<java.lang.String> strList0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
          .createList(strList0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0701() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0701");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double9 = quarterlyDouble6.getQseqQ();
    double double12 = quarterlyDouble6.deltaQ((int) (byte) 1, 0);
    java.lang.String str13 = quarterlyDouble6.toString();
    double double15 = quarterlyDouble6.get((int) (short) -1);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str13,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9999.9999d) + "'", double15 == (-9999.9999d));
  }

  @Test
  public void test0702() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0702");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.lang.String str3 = companyData1.getTicker();
    java.lang.Class<?> wildcardClass4 = companyData1.getClass();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test0703() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0703");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double9 = quarterlyDouble6.getQseqQ();
    double double12 = quarterlyDouble6.deltaQ((int) (byte) 1, 0);
    java.lang.String str13 = quarterlyDouble6.toString();
    double[] doubleArray19 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    double double22 = quarterlyDouble21.getQseqQ();
    double[] doubleArray28 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray28);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray28);
    java.lang.String str31 = quarterlyDouble30.toString();
    double[] doubleArray35 = new double[] { 1L, 100, (short) 10 };
    quarterlyDouble30.dArr = doubleArray35;
    quarterlyDouble21.dArr = doubleArray35;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble38 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray35);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray35);
    quarterlyDouble6.dArr = doubleArray35;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str13,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1100.0d + "'", double22 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray28);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str31,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray35);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 100.0, 10.0]");
  }

  @Test
  public void test0704() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0704");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double double9 = quarterlyDouble7.get2QTtm();
    double double10 = quarterlyDouble7.get2QTtm();
    // The following exception was thrown during execution in test generation
    try {
      double double11 = quarterlyDouble7.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
  }

  @Test
  public void test0705() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0705");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 10,
        (int) '4');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0706() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0706");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) '4', (int) 'a');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0707() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0707");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 0, 1);
  }

  @Test
  public void test0708() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0708");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) -1,
        (int) '#');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0709() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0709");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) 'a', (int) '#');
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0710() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0710");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double double9 = quarterlyDouble7.get2QTtm();
    double double10 = quarterlyDouble7.getTtmAvg();
    double double11 = quarterlyDouble7.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      double double14 = quarterlyDouble7.deltaQ(1, (int) 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
  }

  @Test
  public void test0711() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0711");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getPrevTtm();
    double double8 = quarterlyDouble6.getPrevTtm();
    // The following exception was thrown during execution in test generation
    try {
      double double9 = quarterlyDouble6.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
  }

  @Test
  public void test0712() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0712");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.lang.String str5 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
    java.lang.String str7 = companyData1.getTicker();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList6);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
  }

  @Test
  public void test0713() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0713");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double10 = quarterlyDouble8.get((int) (byte) -1);
    double double11 = quarterlyDouble8.get2QTtm();
    double double12 = quarterlyDouble8.getTtmAvg();
    java.lang.String str13 = quarterlyDouble8.toString();
    java.lang.String str14 = quarterlyDouble8.toString();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str13,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str14,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test0714() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0714");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getQseqQ();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double11 = quarterlyDouble7.get((int) ' ');
    // The following exception was thrown during execution in test generation
    try {
      double double12 = quarterlyDouble7.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1100.0d + "'", double8 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
  }

  @Test
  public void test0715() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0715");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray9 = quarterlyDouble8.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    java.lang.Class<?> wildcardClass11 = doubleArray9.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test0716() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0716");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) ' ',
        (int) (short) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0717() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0717");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) '#',
        (int) (short) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0718() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0718");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double10 = quarterlyDouble8.get((int) (byte) -1);
    double double11 = quarterlyDouble8.get2QTtm();
    double double12 = quarterlyDouble8.getPrevTtm();
    double double15 = quarterlyDouble8.deltaQ(0, (int) (short) 1);
    // The following exception was thrown during execution in test generation
    try {
      double double16 = quarterlyDouble8.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
  }

  @Test
  public void test0719() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0719");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 100,
        (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (byte) 0, 0);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test0720() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0720");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) '4', (int) '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0721() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0721");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 10, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (short) 0, 0);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
    org.junit.Assert.assertNotNull(companyDataList7);
  }

  @Test
  public void test0722() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0722");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 10, 100);
  }

  @Test
  public void test0723() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0723");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getQseqQ();
    double[] doubleArray14 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    java.lang.String str17 = quarterlyDouble16.toString();
    double[] doubleArray21 = new double[] { 1L, 100, (short) 10 };
    quarterlyDouble16.dArr = doubleArray21;
    quarterlyDouble7.dArr = doubleArray21;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray21);
    double double26 = quarterlyDouble24.get((int) (short) 100);
    double double27 = quarterlyDouble24.get2QTtm();
    double double28 = quarterlyDouble24.getQseqQ();
    java.lang.Class<?> wildcardClass29 = quarterlyDouble24.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1100.0d + "'", double8 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str17,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 100.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-9999.9999d) + "'", double26 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + 900.0d + "'", double28 == 900.0d);
    org.junit.Assert.assertNotNull(wildcardClass29);
  }

  @Test
  public void test0724() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0724");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray9 = quarterlyDouble8.dArr;
    double double11 = quarterlyDouble8.get((-1));
    double[] doubleArray17 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    double double19 = quarterlyDouble18.getTtmAvg();
    double[] doubleArray25 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray25);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray25);
    quarterlyDouble18.dArr = doubleArray25;
    double[] doubleArray34 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble35 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray34);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray34);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray34);
    quarterlyDouble18.dArr = doubleArray34;
    quarterlyDouble8.dArr = doubleArray34;
    double double40 = quarterlyDouble8.getTtmAvg();
    double double41 = quarterlyDouble8.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      double double42 = quarterlyDouble8.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray34);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
    org.junit.Assert.assertTrue("'" + double41 + "' != '" + 40.0d + "'", double41 == 40.0d);
  }

  @Test
  public void test0725() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0725");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 0, (int) '4');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0726() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0726");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.get2QTtm();
    double double13 = quarterlyDouble6.deltaQ((int) '#', (int) ' ');
    double double14 = quarterlyDouble6.getTtmAvg();
    double double15 = quarterlyDouble6.getMostRecent();
    double double16 = quarterlyDouble6.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
  }

  @Test
  public void test0727() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0727");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.getQseqQ();
    double double14 = quarterlyDouble6.deltaQ((int) '4', (int) '#');
    double double15 = quarterlyDouble6.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str17 = quarterlyDouble6.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1100.0d + "'", double11 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
  }

  @Test
  public void test0728() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0728");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (byte) 0,
          (int) (byte) -1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0729() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0729");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double[] doubleArray13 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    quarterlyDouble6.dArr = doubleArray13;
    double[] doubleArray22 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray22);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray22);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray22);
    quarterlyDouble6.dArr = doubleArray22;
    double double27 = quarterlyDouble6.getMostRecent();
    double double28 = quarterlyDouble6.getPrevTtm();
    double[] doubleArray29 = quarterlyDouble6.dArr;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray22);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray29);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0730() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0730");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.getQseqQ();
    double double14 = quarterlyDouble6.deltaQ((int) '4', (int) (short) -1);
    double double15 = quarterlyDouble6.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str17 = quarterlyDouble6.fmtGrowth4Q("\t i=0 0.0000\t i=1 0.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1100.0d + "'", double11 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
  }

  @Test
  public void test0731() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0731");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getTtmAvg();
    java.lang.String str11 = quarterlyDouble6.toString();
    double double12 = quarterlyDouble6.getPrevTtm();
    double double14 = quarterlyDouble6.get((int) (byte) 10);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str11,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
  }

  @Test
  public void test0732() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0732");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 1, 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0733() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0733");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.getQseqQ();
    double double14 = quarterlyDouble6.deltaQ((int) '4', (int) (short) -1);
    double double15 = quarterlyDouble6.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      double double16 = quarterlyDouble6.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1100.0d + "'", double11 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
  }

  @Test
  public void test0734() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0734");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double10 = quarterlyDouble8.get((int) (byte) -1);
    double double11 = quarterlyDouble8.get2QTtm();
    double double13 = quarterlyDouble8.get((int) (short) 100);
    double[] doubleArray14 = quarterlyDouble8.dArr;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9999.9999d) + "'", double13 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0735() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0735");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double double9 = quarterlyDouble7.get2QTtm();
    double double10 = quarterlyDouble7.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      double double13 = quarterlyDouble7.deltaQ((-1), (int) '#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
  }

  @Test
  public void test0736() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0736");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) '4',
        (int) (short) 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
  }

  @Test
  public void test0737() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0737");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) ' ', 0);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0738() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0738");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData6 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList3, (int) (byte) 10, (int) (byte) -1);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData9 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList3, (int) '#', (int) (short) 100);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNull(fieldData6);
    org.junit.Assert.assertNull(fieldData9);
  }

  @Test
  public void test0739() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0739");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 0, 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (byte) 10, 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(manyCompanyDataList7);
  }

  @Test
  public void test0740() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0740");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getPrevTtm();
    double[] doubleArray16 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray16);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray16);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray16);
    double[] doubleArray20 = quarterlyDouble19.dArr;
    double double22 = quarterlyDouble19.get((-1));
    double[] doubleArray28 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray28);
    double double30 = quarterlyDouble29.getTtmAvg();
    double[] doubleArray36 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray36);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble38 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray36);
    quarterlyDouble29.dArr = doubleArray36;
    double[] doubleArray45 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble46 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray45);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble47 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray45);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble48 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray45);
    quarterlyDouble29.dArr = doubleArray45;
    quarterlyDouble19.dArr = doubleArray45;
    quarterlyDouble6.dArr = doubleArray45;
    double double52 = quarterlyDouble6.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      double double55 = quarterlyDouble6.deltaQ((int) (byte) 1, (int) (short) 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray20);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-9999.9999d) + "'", double22 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray28);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray36);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray45);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double52 + "' != '" + 40.0d + "'", double52 == 40.0d);
  }

  @Test
  public void test0741() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0741");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) 'a', (int) (byte) -1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0742() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0742");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    // The following exception was thrown during execution in test generation
    try {
      double double8 = quarterlyDouble7.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0743() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0743");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) ' ',
        (int) (short) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, 10, (int) '#');
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test0744() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0744");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double[] doubleArray9 = quarterlyDouble7.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    java.lang.String str11 = quarterlyDouble10.toString();
    // The following exception was thrown during execution in test generation
    try {
      double double14 = quarterlyDouble10.deltaQ((-1), 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str11,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test0745() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0745");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 10,
        (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
  }

  @Test
  public void test0746() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0746");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double[] doubleArray13 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    quarterlyDouble6.dArr = doubleArray13;
    double[] doubleArray22 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray22);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray22);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray22);
    quarterlyDouble6.dArr = doubleArray22;
    double double27 = quarterlyDouble6.getMostRecent();
    double double28 = quarterlyDouble6.getPrevTtm();
    double[] doubleArray34 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble35 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray34);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray34);
    double double37 = quarterlyDouble36.getQseqQ();
    double[] doubleArray43 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble44 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray43);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble45 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray43);
    java.lang.String str46 = quarterlyDouble45.toString();
    double[] doubleArray50 = new double[] { 1L, 100, (short) 10 };
    quarterlyDouble45.dArr = doubleArray50;
    quarterlyDouble36.dArr = doubleArray50;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble53 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray50);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble54 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray50);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble55 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray50);
    quarterlyDouble6.dArr = doubleArray50;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray22);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray34);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1100.0d + "'", double37 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray43);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str46,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray50);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[1.0, 100.0, 10.0]");
  }

  @Test
  public void test0747() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0747");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double double10 = quarterlyDouble6.getPrevTtm();
    double double11 = quarterlyDouble6.getQseqQ();
    double[] doubleArray12 = quarterlyDouble6.dArr;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1100.0d + "'", double11 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0748() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0748");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList5, (int) (short) -1, 10);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList5, 1, (int) ' ');
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData14 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList5, (int) '4', 10);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData17 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList5, (int) (short) 0, (int) (byte) -1);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData20 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList5, (int) (short) 10, (int) ' ');
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertNull(fieldData8);
    org.junit.Assert.assertNull(fieldData11);
    org.junit.Assert.assertNull(fieldData14);
    org.junit.Assert.assertNull(fieldData17);
    org.junit.Assert.assertNull(fieldData20);
  }

  @Test
  public void test0749() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0749");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray10 = new double[] { 0.0d, 0 };
    quarterlyDouble7.dArr = doubleArray10;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str13 = quarterlyDouble7.fmtGrowth1Q("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0]");
  }

  @Test
  public void test0750() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0750");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) 'a', 100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0751() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0751");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (short) 0,
          (int) '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0752() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0752");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    java.lang.String str6 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
    java.lang.String str8 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = companyData1.getFdList();
    java.lang.String str10 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData14 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList11, 0, (int) (short) -1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList9);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList11);
    org.junit.Assert.assertNull(fieldData14);
  }

  @Test
  public void test0753() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0753");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 1,
        (int) '4');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0754() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0754");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double[] doubleArray9 = quarterlyDouble7.dArr;
    double double10 = quarterlyDouble7.getPrevTtm();
    java.lang.String str11 = quarterlyDouble7.toString();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str13 = quarterlyDouble7.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str11,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test0755() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0755");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList5, 0, (int) (byte) 1);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList5, (int) (short) 1, 10);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertNull(fieldData8);
    org.junit.Assert.assertNull(fieldData11);
  }

  @Test
  public void test0756() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0756");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.getQseqQ();
    double double14 = quarterlyDouble6.deltaQ((int) '4', (int) (short) -1);
    double double15 = quarterlyDouble6.getMostRecent();
    double double18 = quarterlyDouble6.deltaQ((int) (byte) 0, (-1));
    java.lang.Class<?> wildcardClass19 = quarterlyDouble6.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1100.0d + "'", double11 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test0757() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0757");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.deltaQ((int) (short) -1, (int) (byte) 0);
    double double11 = quarterlyDouble6.get2QTtm();
    double double12 = quarterlyDouble6.getQseqQ();
    double double13 = quarterlyDouble6.get2QTtm();
    java.lang.String str14 = quarterlyDouble6.toString();
    double double15 = quarterlyDouble6.get2QTtm();
    double double18 = quarterlyDouble6.deltaQ((int) (short) 1, (int) (byte) 0);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1100.0d + "'", double12 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str14,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
  }

  @Test
  public void test0758() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0758");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.get2QTtm();
    double double10 = quarterlyDouble6.get((int) (byte) 100);
    double double13 = quarterlyDouble6.deltaQ(10, 0);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str15 = quarterlyDouble6.fmtGrowth4Q("\t i=0 0.0000\t i=1 0.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
  }

  @Test
  public void test0759() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0759");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 1, (int) (byte) 10);
  }

  @Test
  public void test0760() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0760");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double9 = quarterlyDouble6.getQseqQ();
    double double12 = quarterlyDouble6.deltaQ(100, (int) '4');
    java.lang.String str13 = quarterlyDouble6.toString();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str15 = quarterlyDouble6.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str13,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test0761() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0761");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1100.0d + "'", double10 == 1100.0d);
  }

  @Test
  public void test0762() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0762");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double double10 = quarterlyDouble6.get2QTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str12 = quarterlyDouble6.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
  }

  @Test
  public void test0763() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0763");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) ' ', (int) 'a');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0764() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0764");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double10 = quarterlyDouble8.get((int) (byte) -1);
    double double11 = quarterlyDouble8.get2QTtm();
    java.lang.String str12 = quarterlyDouble8.toString();
    double double15 = quarterlyDouble8.deltaQ((int) (short) 10, (int) (short) -1);
    double double16 = quarterlyDouble8.get2QTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str12,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
  }

  @Test
  public void test0765() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0765");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getTtmAvg();
    double double10 = quarterlyDouble6.getTtmAvg();
    double[] doubleArray11 = quarterlyDouble6.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str13 = quarterlyDouble6.fmtGrowth4Q("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0766() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0766");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double9 = quarterlyDouble6.getQseqQ();
    double double12 = quarterlyDouble6.deltaQ(100, (int) '4');
    double double13 = quarterlyDouble6.getQseqQ();
    double double15 = quarterlyDouble6.get(100);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1100.0d + "'", double13 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9999.9999d) + "'", double15 == (-9999.9999d));
  }

  @Test
  public void test0767() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0767");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double double10 = quarterlyDouble6.getPrevTtm();
    double double11 = quarterlyDouble6.getTtm();
    java.lang.String str12 = quarterlyDouble6.toString();
    double double13 = quarterlyDouble6.getQseqQ();
    java.lang.String str14 = quarterlyDouble6.toString();
    double double15 = quarterlyDouble6.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      double double16 = quarterlyDouble6.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str12,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1100.0d + "'", double13 == 1100.0d);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str14,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1100.0d + "'", double15 == 1100.0d);
  }

  @Test
  public void test0768() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0768");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double[] doubleArray13 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    quarterlyDouble6.dArr = doubleArray13;
    double double17 = quarterlyDouble6.getPrevTtm();
    double double18 = quarterlyDouble6.getPrevTtm();
    java.lang.String str19 = quarterlyDouble6.toString();
    double double22 = quarterlyDouble6.deltaQ((int) (short) 1, (int) (short) 0);
    double[] doubleArray23 = quarterlyDouble6.dArr;
    // The following exception was thrown during execution in test generation
    try {
      double double26 = quarterlyDouble6.deltaQ((int) (short) -1, (int) '#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str19,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0769() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0769");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double double10 = quarterlyDouble7.get((int) (byte) -1);
    java.lang.String str11 = quarterlyDouble7.toString();
    double double12 = quarterlyDouble7.getQseqQ();
    double[] doubleArray13 = quarterlyDouble7.dArr;
    double double14 = quarterlyDouble7.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str11,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1100.0d + "'", double12 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1100.0d + "'", double14 == 1100.0d);
  }

  @Test
  public void test0770() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0770");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray9 = quarterlyDouble8.dArr;
    double double10 = quarterlyDouble8.getMostRecent();
    double double13 = quarterlyDouble8.deltaQ((int) (short) 100, (int) (byte) 1);
    double[] doubleArray14 = quarterlyDouble8.dArr;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0771() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0771");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.lang.String str5 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList8, (int) (byte) 10, (int) (byte) 1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList6);
    org.junit.Assert.assertNotNull(fieldDataList7);
    org.junit.Assert.assertNotNull(fieldDataList8);
    org.junit.Assert.assertNull(fieldData11);
  }

  @Test
  public void test0772() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0772");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) 'a',
        (int) (short) 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test0773() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0773");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000", 0, (int) (byte) -1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0774() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0774");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) 'a', (int) (byte) -1);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0775() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0775");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 1, 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0776() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0776");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 100,
        (int) (byte) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0777() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0777");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 10, 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0778() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0778");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getQseqQ();
    double[] doubleArray14 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    java.lang.String str17 = quarterlyDouble16.toString();
    double[] doubleArray21 = new double[] { 1L, 100, (short) 10 };
    quarterlyDouble16.dArr = doubleArray21;
    quarterlyDouble7.dArr = doubleArray21;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray21);
    double double26 = quarterlyDouble24.get(10);
    double double27 = quarterlyDouble24.getTtm();
    double double28 = quarterlyDouble24.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1100.0d + "'", double8 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str17,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 100.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-9999.9999d) + "'", double26 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + 900.0d + "'", double28 == 900.0d);
  }

  @Test
  public void test0779() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0779");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 0, 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0780() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0780");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    java.lang.String str6 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
    java.lang.String str8 = companyData1.getTicker();
    java.lang.String str9 = companyData1.getTicker();
    java.lang.String str10 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = companyData1.getFdList();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList11);
    org.junit.Assert.assertNotNull(fieldDataList12);
  }

  @Test
  public void test0781() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0781");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 10, (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test0782() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0782");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (short) -1, 100);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0783() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0783");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(10, (int) (short) -1);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0784() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0784");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) '#',
        (int) (short) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0785() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0785");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) '4', (-1));
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0786() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0786");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double[] doubleArray13 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    quarterlyDouble6.dArr = doubleArray13;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    java.lang.Class<?> wildcardClass19 = quarterlyDouble18.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test0787() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0787");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.getTtmAvg();
    double double13 = quarterlyDouble6.get((-1));
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9999.9999d) + "'", double13 == (-9999.9999d));
  }

  @Test
  public void test0788() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0788");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getQseqQ();
    double[] doubleArray14 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    java.lang.String str17 = quarterlyDouble16.toString();
    double[] doubleArray21 = new double[] { 1L, 100, (short) 10 };
    quarterlyDouble16.dArr = doubleArray21;
    quarterlyDouble7.dArr = doubleArray21;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray21);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray21);
    double double26 = quarterlyDouble25.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1100.0d + "'", double8 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str17,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 100.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
  }

  @Test
  public void test0789() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0789");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) 0, (-1));
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0790() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0790");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (byte) 1, (int) (byte) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList2);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(manyCompanyDataList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test0791() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0791");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 10,
        (int) (byte) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0792() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0792");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) '#', 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    java.lang.Class<?> wildcardClass5 = manyCompanyDataList4.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test0793() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0793");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtm();
    double double8 = quarterlyDouble6.getTtm();
    double[] doubleArray9 = quarterlyDouble6.dArr;
    java.lang.Class<?> wildcardClass10 = quarterlyDouble6.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0794() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0794");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((-1), 10);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0795() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0795");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double double10 = quarterlyDouble6.getPrevTtm();
    double double11 = quarterlyDouble6.getTtm();
    double double12 = quarterlyDouble6.getMostRecent();
    double double13 = quarterlyDouble6.getMostRecent();
    double double14 = quarterlyDouble6.getTtm();
    double[] doubleArray20 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray20);
    double double22 = quarterlyDouble21.getTtmAvg();
    double double23 = quarterlyDouble21.getTtmAvg();
    java.lang.String str24 = quarterlyDouble21.toString();
    double double25 = quarterlyDouble21.get2QTtm();
    double[] doubleArray31 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray31);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray31);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray31);
    double double36 = quarterlyDouble34.get((int) (byte) -1);
    double double37 = quarterlyDouble34.get2QTtm();
    double double38 = quarterlyDouble34.getPrevTtm();
    double[] doubleArray39 = null;
    quarterlyDouble34.dArr = doubleArray39;
    double[] doubleArray46 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble47 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray46);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble48 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray46);
    java.lang.String str49 = quarterlyDouble48.toString();
    double[] doubleArray53 = new double[] { 1L, 100, (short) 10 };
    quarterlyDouble48.dArr = doubleArray53;
    quarterlyDouble34.dArr = doubleArray53;
    quarterlyDouble21.dArr = doubleArray53;
    quarterlyDouble6.dArr = doubleArray53;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    org.junit.Assert.assertNotNull(doubleArray20);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str24,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray31);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-9999.9999d) + "'", double36 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
    org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray46);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str49,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray53);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[1.0, 100.0, 10.0]");
  }

  @Test
  public void test0796() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0796");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double9 = quarterlyDouble6.getQseqQ();
    double double12 = quarterlyDouble6.deltaQ(100, (int) '4');
    double double13 = quarterlyDouble6.getQseqQ();
    java.lang.String str14 = quarterlyDouble6.toString();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1100.0d + "'", double13 == 1100.0d);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str14,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test0797() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0797");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.lang.String str4 = companyData1.getTicker();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
  }

  @Test
  public void test0798() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0798");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (short) 1, (int) 'a');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0799() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0799");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 0,
        (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (byte) 100, 0);
    java.lang.Class<?> wildcardClass8 = strList3.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
    org.junit.Assert.assertNotNull(companyDataList7);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test0800() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0800");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 0, 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0801() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0801");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 10, (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0802() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0802");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) 0, 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0803() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0803");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double[] doubleArray13 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    quarterlyDouble6.dArr = doubleArray13;
    double double17 = quarterlyDouble6.getPrevTtm();
    double double18 = quarterlyDouble6.getPrevTtm();
    java.lang.String str19 = quarterlyDouble6.toString();
    double double22 = quarterlyDouble6.deltaQ((int) (short) 1, (int) (short) 0);
    double[] doubleArray23 = quarterlyDouble6.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str25 = quarterlyDouble6.fmtGrowth4Q("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str19,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0804() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0804");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) '#', (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, 100, (int) (short) 100);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList5);
  }

  @Test
  public void test0805() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0805");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getQseqQ();
    double[] doubleArray14 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    java.lang.String str17 = quarterlyDouble16.toString();
    double[] doubleArray21 = new double[] { 1L, 100, (short) 10 };
    quarterlyDouble16.dArr = doubleArray21;
    quarterlyDouble7.dArr = doubleArray21;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray21);
    double double26 = quarterlyDouble24.get(10);
    double double27 = quarterlyDouble24.getTtm();
    double[] doubleArray33 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray33);
    double double35 = quarterlyDouble34.getTtmAvg();
    double[] doubleArray41 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble42 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray41);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble43 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray41);
    quarterlyDouble34.dArr = doubleArray41;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble45 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray41);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble46 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray41);
    quarterlyDouble24.dArr = doubleArray41;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1100.0d + "'", double8 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str17,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 100.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-9999.9999d) + "'", double26 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray33);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray41);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0806() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0806");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) 100,
        (int) (short) 0);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0807() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0807");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.lang.String str5 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData9 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList6, (int) (byte) 100, (int) ' ');
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData12 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList6, (int) (byte) 10, 0);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList6);
    org.junit.Assert.assertNull(fieldData9);
    org.junit.Assert.assertNull(fieldData12);
  }

  @Test
  public void test0808() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0808");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double[] doubleArray13 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    quarterlyDouble6.dArr = doubleArray13;
    double double17 = quarterlyDouble6.getPrevTtm();
    double double18 = quarterlyDouble6.getPrevTtm();
    double[] doubleArray24 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray24);
    double double26 = quarterlyDouble25.getTtmAvg();
    double[] doubleArray32 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray32);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray32);
    quarterlyDouble25.dArr = doubleArray32;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray32);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray32);
    quarterlyDouble6.dArr = doubleArray32;
    double[] doubleArray39 = quarterlyDouble6.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble40 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray39);
    double double43 = quarterlyDouble40.deltaQ((int) '#', (int) ' ');
    double double44 = quarterlyDouble40.getTtm();
    double double45 = quarterlyDouble40.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray24);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray32);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray39);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
    org.junit.Assert.assertTrue("'" + double44 + "' != '" + 40.0d + "'", double44 == 40.0d);
    org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1100.0d + "'", double45 == 1100.0d);
  }

  @Test
  public void test0809() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0809");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double10 = quarterlyDouble8.get((int) (byte) -1);
    double double11 = quarterlyDouble8.get2QTtm();
    double double12 = quarterlyDouble8.getTtmAvg();
    double double13 = quarterlyDouble8.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str15 = quarterlyDouble8.fmtGrowth4Q("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
  }

  @Test
  public void test0810() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0810");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double10 = quarterlyDouble8.get((int) (byte) -1);
    double double11 = quarterlyDouble8.get2QTtm();
    java.lang.String str12 = quarterlyDouble8.toString();
    double double14 = quarterlyDouble8.get((-1));
    double double15 = quarterlyDouble8.getTtmAvg();
    double double17 = quarterlyDouble8.get((int) (short) 1);
    double[] doubleArray18 = quarterlyDouble8.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    double double20 = quarterlyDouble19.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      double double21 = quarterlyDouble19.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str12,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 40.0d + "'", double20 == 40.0d);
  }

  @Test
  public void test0811() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0811");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList5, (int) (short) -1, 10);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList5, 1, (int) ' ');
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData14 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList5, (int) '#', (int) (byte) 0);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertNull(fieldData8);
    org.junit.Assert.assertNull(fieldData11);
    org.junit.Assert.assertNull(fieldData14);
  }

  @Test
  public void test0812() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0812");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 10,
        (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0813() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0813");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.get2QTtm();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str12 = quarterlyDouble6.fmtGrowth4Q("\t i=0 0.0000\t i=1 0.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
  }

  @Test
  public void test0814() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0814");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double double11 = quarterlyDouble7.deltaQ((int) (short) 10, (int) ' ');
    double[] doubleArray12 = quarterlyDouble7.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str14 = quarterlyDouble7.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0815() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0815");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray9 = quarterlyDouble8.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    double[] doubleArray12 = quarterlyDouble11.dArr;
    double double14 = quarterlyDouble11.get((-1));
    double double15 = quarterlyDouble11.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
  }

  @Test
  public void test0816() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0816");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.deltaQ((int) (short) 100, (int) '#');
    double double13 = quarterlyDouble6.get(0);
    double double14 = quarterlyDouble6.getQseqQ();
    double[] doubleArray15 = quarterlyDouble6.dArr;
    double double16 = quarterlyDouble6.getQseqQ();
    double double17 = quarterlyDouble6.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str19 = quarterlyDouble6.fmtGrowth1Q("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1100.0d + "'", double14 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1100.0d + "'", double16 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
  }

  @Test
  public void test0817() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0817");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000", (int) ' ', (int) (byte) -1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0818() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0818");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) 100, 100);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0819() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0819");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (byte) 0, (int) '#');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0820() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0820");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getPrevTtm();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.get2QTtm();
    double double11 = quarterlyDouble6.getPrevTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str13 = quarterlyDouble6.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
  }

  @Test
  public void test0821() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0821");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 1,
        (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (short) 10, 0);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test0822() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0822");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.getQseqQ();
    double double14 = quarterlyDouble6.deltaQ((int) '4', (int) (short) -1);
    double double15 = quarterlyDouble6.getMostRecent();
    double double16 = quarterlyDouble6.get2QTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1100.0d + "'", double11 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
  }

  @Test
  public void test0823() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0823");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray10 = new double[] { 0.0d, 0 };
    quarterlyDouble7.dArr = doubleArray10;
    double double12 = quarterlyDouble7.getPrevTtm();
    double double13 = quarterlyDouble7.getMostRecent();
    double double14 = quarterlyDouble7.getPrevTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
  }

  @Test
  public void test0824() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0824");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double10 = quarterlyDouble8.get((int) (byte) -1);
    double double11 = quarterlyDouble8.get2QTtm();
    java.lang.String str12 = quarterlyDouble8.toString();
    double double14 = quarterlyDouble8.get((-1));
    double double15 = quarterlyDouble8.getTtmAvg();
    double[] doubleArray21 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray21);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray21);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray21);
    double[] doubleArray25 = quarterlyDouble24.dArr;
    double[] doubleArray31 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray31);
    double double33 = quarterlyDouble32.getTtmAvg();
    double[] doubleArray39 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble40 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray39);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray39);
    quarterlyDouble32.dArr = doubleArray39;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble43 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray39);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble44 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray39);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble45 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray39);
    quarterlyDouble24.dArr = doubleArray39;
    quarterlyDouble8.dArr = doubleArray39;
    double double48 = quarterlyDouble8.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str12,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray31);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray39);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
  }

  @Test
  public void test0825() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0825");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double10 = quarterlyDouble8.get((int) (byte) -1);
    double double11 = quarterlyDouble8.get2QTtm();
    java.lang.String str12 = quarterlyDouble8.toString();
    double double13 = quarterlyDouble8.get2QTtm();
    double double14 = quarterlyDouble8.getTtmAvg();
    double double15 = quarterlyDouble8.getMostRecent();
    double double17 = quarterlyDouble8.get((-1));
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str12,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9999.9999d) + "'", double17 == (-9999.9999d));
  }

  @Test
  public void test0826() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0826");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double9 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.getQseqQ();
    double double12 = quarterlyDouble6.get((int) (byte) 100);
    double double13 = quarterlyDouble6.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1100.0d + "'", double10 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
  }

  @Test
  public void test0827() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0827");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) '#', (int) 'a');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (-1), 0);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test0828() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0828");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double double11 = quarterlyDouble7.deltaQ((int) (short) 10, (int) ' ');
    double[] doubleArray12 = quarterlyDouble7.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str14 = quarterlyDouble7.fmtGrowth1Q("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0829() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0829");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double double10 = quarterlyDouble6.getPrevTtm();
    double double11 = quarterlyDouble6.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
  }

  @Test
  public void test0830() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0830");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double[] doubleArray15 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    java.lang.String str18 = quarterlyDouble17.toString();
    double[] doubleArray19 = quarterlyDouble17.dArr;
    quarterlyDouble6.dArr = doubleArray19;
    double[] doubleArray21 = quarterlyDouble6.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray21);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray21);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str18,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0831() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0831");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 1,
        (int) (short) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0832() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0832");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double10 = quarterlyDouble6.get((int) (short) 1);
    double double11 = quarterlyDouble6.getPrevTtm();
    double double14 = quarterlyDouble6.deltaQ((int) (short) 100, (int) (short) 1);
    double double15 = quarterlyDouble6.getMostRecent();
    double double16 = quarterlyDouble6.getTtmAvg();
    double double17 = quarterlyDouble6.getPrevTtm();
    java.lang.String str18 = quarterlyDouble6.toString();
    double double19 = quarterlyDouble6.getTtmAvg();
    java.lang.String str20 = quarterlyDouble6.toString();
    double double21 = quarterlyDouble6.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str18,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str20,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1100.0d + "'", double21 == 1100.0d);
  }

  @Test
  public void test0833() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0833");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 0, (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test0834() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0834");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double double10 = quarterlyDouble6.getPrevTtm();
    double double13 = quarterlyDouble6.deltaQ((int) (byte) 10, 0);
    double[] doubleArray19 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    java.lang.String str22 = quarterlyDouble21.toString();
    double[] doubleArray23 = quarterlyDouble21.dArr;
    quarterlyDouble6.dArr = doubleArray23;
    java.lang.String str25 = quarterlyDouble6.toString();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str27 = quarterlyDouble6.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str22,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str25,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test0835() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0835");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray9 = quarterlyDouble8.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    double[] doubleArray12 = quarterlyDouble11.dArr;
    double[] doubleArray13 = quarterlyDouble11.dArr;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0836() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0836");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.deltaQ((int) (short) -1, (int) (byte) 0);
    double double11 = quarterlyDouble6.get2QTtm();
    java.lang.String str12 = quarterlyDouble6.toString();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str12,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test0837() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0837");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 10,
        (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0838() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0838");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) -1,
        (int) 'a');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) 'a', (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    java.lang.Class<?> wildcardClass9 = companyDataList8.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
    org.junit.Assert.assertNotNull(companyDataList7);
    org.junit.Assert.assertNotNull(companyDataList8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test0839() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0839");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(0, 100);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0840() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0840");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getQseqQ();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1100.0d + "'", double8 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1100.0d + "'", double10 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1100.0d + "'", double11 == 1100.0d);
  }

  @Test
  public void test0841() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0841");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.deltaQ((int) (short) -1, (int) (byte) 0);
    double double11 = quarterlyDouble6.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str13 = quarterlyDouble6.fmtGrowth1Q("\t i=0 0.0000\t i=1 0.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
  }

  @Test
  public void test0842() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0842");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double10 = quarterlyDouble6.get((int) (short) 1);
    double double11 = quarterlyDouble6.getPrevTtm();
    double double14 = quarterlyDouble6.deltaQ((int) (short) 100, (int) (short) 1);
    double double15 = quarterlyDouble6.getMostRecent();
    double double16 = quarterlyDouble6.getTtmAvg();
    double double19 = quarterlyDouble6.deltaQ((int) (byte) 1, (int) (short) 0);
    double double20 = quarterlyDouble6.getPrevTtm();
    double double21 = quarterlyDouble6.getPrevTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
  }

  @Test
  public void test0843() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0843");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.get2QTtm();
    double double9 = quarterlyDouble6.getPrevTtm();
    double double10 = quarterlyDouble6.getMostRecent();
    java.lang.String str11 = quarterlyDouble6.toString();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str11,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test0844() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0844");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    org.junit.Assert.assertNotNull(fieldDataList2);
  }

  @Test
  public void test0845() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0845");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 100,
        (int) (byte) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0846() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0846");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 0, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
    org.junit.Assert.assertNotNull(companyDataList5);
  }

  @Test
  public void test0847() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0847");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) -1, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (short) 0, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList9 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (short) 1, (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(companyDataList9);
  }

  @Test
  public void test0848() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0848");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double10 = quarterlyDouble8.get((int) (byte) -1);
    double double11 = quarterlyDouble8.get2QTtm();
    double double12 = quarterlyDouble8.getMostRecent();
    double double13 = quarterlyDouble8.get2QTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
  }

  @Test
  public void test0849() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0849");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.deltaQ((int) (short) 100, (int) '#');
    double double12 = quarterlyDouble6.getTtm();
    double[] doubleArray13 = quarterlyDouble6.dArr;
    double double14 = quarterlyDouble6.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      double double15 = quarterlyDouble6.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1100.0d + "'", double14 == 1100.0d);
  }

  @Test
  public void test0850() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0850");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    java.lang.String str9 = quarterlyDouble6.toString();
    java.lang.String str10 = quarterlyDouble6.toString();
    java.lang.String str11 = quarterlyDouble6.toString();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str9,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str10,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str11,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test0851() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0851");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getPrevTtm();
    double[] doubleArray16 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray16);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray16);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray16);
    double[] doubleArray20 = quarterlyDouble19.dArr;
    double double22 = quarterlyDouble19.get((-1));
    double[] doubleArray28 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray28);
    double double30 = quarterlyDouble29.getTtmAvg();
    double[] doubleArray36 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray36);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble38 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray36);
    quarterlyDouble29.dArr = doubleArray36;
    double[] doubleArray45 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble46 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray45);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble47 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray45);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble48 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray45);
    quarterlyDouble29.dArr = doubleArray45;
    quarterlyDouble19.dArr = doubleArray45;
    quarterlyDouble6.dArr = doubleArray45;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble52 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray45);
    double[] doubleArray58 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble59 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray58);
    double double60 = quarterlyDouble59.getTtmAvg();
    double[] doubleArray66 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble67 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray66);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble68 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray66);
    quarterlyDouble59.dArr = doubleArray66;
    double[] doubleArray75 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble76 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray75);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble77 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray75);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble78 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray75);
    quarterlyDouble59.dArr = doubleArray75;
    quarterlyDouble52.dArr = doubleArray75;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str82 = quarterlyDouble52.fmtGrowth4Q("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray20);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-9999.9999d) + "'", double22 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray28);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray36);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray45);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray58);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray66);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray75);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0852() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0852");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 0, (int) (short) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0853() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0853");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) 'a', 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0854() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0854");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 0, (int) (byte) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0855() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0855");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getPrevTtm();
    double double11 = quarterlyDouble6.getPrevTtm();
    double double12 = quarterlyDouble6.getMostRecent();
    double double13 = quarterlyDouble6.getTtmAvg();
    double[] doubleArray14 = quarterlyDouble6.dArr;
    // The following exception was thrown during execution in test generation
    try {
      double double17 = quarterlyDouble6.deltaQ(0, (int) (short) 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0856() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0856");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNotNull(fieldDataList4);
  }

  @Test
  public void test0857() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0857");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double double9 = quarterlyDouble7.get2QTtm();
    double double10 = quarterlyDouble7.getMostRecent();
    double double11 = quarterlyDouble7.getTtm();
    double double12 = quarterlyDouble7.getPrevTtm();
    double double14 = quarterlyDouble7.get(10);
    double double15 = quarterlyDouble7.getPrevTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
  }

  @Test
  public void test0858() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0858");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList0 = null;
    // The following exception was thrown during execution in test generation
    try {
      net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
          .getFieldData(fieldDataList0, (int) (short) 10, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0859() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0859");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) -1, (int) (byte) 10);
  }

  @Test
  public void test0860() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0860");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData7 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList4, 0, (int) (short) 10);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNull(fieldData7);
  }

  @Test
  public void test0861() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0861");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) 10,
        (int) (byte) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0862() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0862");
    double[] doubleArray4 = new double[] { 100, 100.0f, 10.0f, 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray4);
    double double7 = quarterlyDouble5.get((int) (short) 100);
    org.junit.Assert.assertNotNull(doubleArray4);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0, 100.0, 10.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
  }

  @Test
  public void test0863() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0863");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) (short) -1, (int) (short) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0864() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0864");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.getTtmAvg();
    double[] doubleArray17 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    double double20 = quarterlyDouble19.getQseqQ();
    double[] doubleArray26 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray26);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray26);
    java.lang.String str29 = quarterlyDouble28.toString();
    double[] doubleArray33 = new double[] { 1L, 100, (short) 10 };
    quarterlyDouble28.dArr = doubleArray33;
    quarterlyDouble19.dArr = doubleArray33;
    quarterlyDouble6.dArr = doubleArray33;
    java.lang.String str37 = quarterlyDouble6.toString();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1100.0d + "'", double20 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray26);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str29,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray33);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, 100.0, 10.0]");
    org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000" + "'", str37,
        "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
  }

  @Test
  public void test0865() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0865");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 0,
        (int) '#');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0866() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0866");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 1, (-1));
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0867() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0867");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) 100,
        (int) (short) 100);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0868() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0868");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double9 = quarterlyDouble6.getQseqQ();
    double double12 = quarterlyDouble6.deltaQ(100, (int) '4');
    java.lang.String str13 = quarterlyDouble6.toString();
    double double14 = quarterlyDouble6.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str13,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1100.0d + "'", double14 == 1100.0d);
  }

  @Test
  public void test0869() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0869");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 10, 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0870() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0870");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getTtmAvg();
    double double10 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
  }

  @Test
  public void test0871() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0871");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 10, (int) 'a');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0872() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0872");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double9 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.getQseqQ();
    double double11 = quarterlyDouble6.getTtmAvg();
    double double12 = quarterlyDouble6.getTtmAvg();
    double double13 = quarterlyDouble6.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1100.0d + "'", double10 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
  }

  @Test
  public void test0873() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0873");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) ' ', (int) '#');
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0874() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0874");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double10 = quarterlyDouble6.get((int) (short) 1);
    double double11 = quarterlyDouble6.getPrevTtm();
    double double14 = quarterlyDouble6.deltaQ((int) (short) 100, (int) (short) 1);
    java.lang.String str15 = quarterlyDouble6.toString();
    // The following exception was thrown during execution in test generation
    try {
      double double18 = quarterlyDouble6.deltaQ((int) (byte) 0, (int) '#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str15,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test0875() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0875");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (short) 100,
          (int) 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0876() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0876");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray9 = quarterlyDouble8.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    double double12 = quarterlyDouble11.get2QTtm();
    double double13 = quarterlyDouble11.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
  }

  @Test
  public void test0877() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0877");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.lang.String str5 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData9 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList6, (int) (byte) 1, (int) (short) -1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList6);
    org.junit.Assert.assertNull(fieldData9);
  }

  @Test
  public void test0878() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0878");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double double10 = quarterlyDouble6.getPrevTtm();
    double double11 = quarterlyDouble6.getQseqQ();
    double double12 = quarterlyDouble6.get2QTtm();
    double double13 = quarterlyDouble6.get2QTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1100.0d + "'", double11 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
  }

  @Test
  public void test0879() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0879");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) ' ',
        (int) (short) 0);
    java.lang.Class<?> wildcardClass4 = strList3.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test0880() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0880");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double10 = quarterlyDouble6.get((int) '#');
    double double11 = quarterlyDouble6.get2QTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
  }

  @Test
  public void test0881() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0881");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.lang.String str5 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData9 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList6, 0, (int) '#');
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList6);
    org.junit.Assert.assertNull(fieldData9);
  }

  @Test
  public void test0882() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0882");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double10 = quarterlyDouble8.get((int) (byte) -1);
    double double11 = quarterlyDouble8.get2QTtm();
    double double12 = quarterlyDouble8.getMostRecent();
    double double15 = quarterlyDouble8.deltaQ((int) (byte) 10, 1);
    double[] doubleArray16 = quarterlyDouble8.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray16);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0883() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0883");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double10 = quarterlyDouble6.get((int) (short) 1);
    double double11 = quarterlyDouble6.getPrevTtm();
    double double14 = quarterlyDouble6.deltaQ((int) (short) 100, (int) (short) 1);
    double double15 = quarterlyDouble6.getMostRecent();
    double double16 = quarterlyDouble6.getTtmAvg();
    double double17 = quarterlyDouble6.getPrevTtm();
    java.lang.String str18 = quarterlyDouble6.toString();
    double double19 = quarterlyDouble6.getTtmAvg();
    java.lang.String str20 = quarterlyDouble6.toString();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str22 = quarterlyDouble6.fmtGrowth1Q("\t i=0 0.0000\t i=1 0.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str18,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str20,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test0884() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0884");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double10 = quarterlyDouble8.get((int) (byte) -1);
    java.lang.String str11 = quarterlyDouble8.toString();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str11,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test0885() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0885");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 1, (int) ' ');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, 0, (int) (short) 100);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
    org.junit.Assert.assertNotNull(companyDataList7);
  }

  @Test
  public void test0886() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0886");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList2, 10, (int) (short) -1);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList2, (int) (short) 0, 100);
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNull(fieldData5);
    org.junit.Assert.assertNull(fieldData8);
  }

  @Test
  public void test0887() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0887");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.get2QTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
  }

  @Test
  public void test0888() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0888");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getQseqQ();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.getQseqQ();
    java.lang.String str11 = quarterlyDouble7.toString();
    java.lang.String str12 = quarterlyDouble7.toString();
    double[] doubleArray13 = quarterlyDouble7.dArr;
    double double14 = quarterlyDouble7.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1100.0d + "'", double8 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1100.0d + "'", double10 == 1100.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str11,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str12,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
  }

  @Test
  public void test0889() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0889");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.getQseqQ();
    double double14 = quarterlyDouble6.deltaQ((int) '4', (int) (short) -1);
    double double16 = quarterlyDouble6.get(0);
    double double17 = quarterlyDouble6.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1100.0d + "'", double11 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
  }

  @Test
  public void test0890() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0890");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) ' ',
          (int) (short) 1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0891() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0891");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (short) 1, (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, 0, (int) (short) 10);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList5);
  }

  @Test
  public void test0892() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0892");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (byte) 0, (int) (short) 0);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0893() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0893");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) '#', 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (short) 1, 0);
    java.lang.Class<?> wildcardClass7 = companyDataList6.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test0894() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0894");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t i=0 0.0000\t i=1 0.0000");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(fieldDataList3);
  }

  @Test
  public void test0895() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0895");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.deltaQ((int) '#', (int) (short) 100);
    double double11 = quarterlyDouble6.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      double double14 = quarterlyDouble6.deltaQ((int) (byte) 1, (int) (byte) 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
  }

  @Test
  public void test0896() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0896");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 1,
        (int) ' ');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0897() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0897");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList5, (int) (short) -1, 10);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList5, 1, (int) ' ');
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData14 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList5, (int) '#', 0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData17 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList5, (int) '#', (int) (byte) -1);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData20 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList5, (int) (short) 100, (int) '#');
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertNull(fieldData8);
    org.junit.Assert.assertNull(fieldData11);
    org.junit.Assert.assertNull(fieldData14);
    org.junit.Assert.assertNull(fieldData17);
    org.junit.Assert.assertNull(fieldData20);
  }

  @Test
  public void test0898() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0898");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) -1, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (short) 0, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(companyDataList7);
  }

  @Test
  public void test0899() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0899");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str10 = quarterlyDouble8.toString();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str10,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test0900() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0900");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double10 = quarterlyDouble6.get((int) (short) 1);
    double double11 = quarterlyDouble6.getPrevTtm();
    double double14 = quarterlyDouble6.deltaQ((int) (short) 100, (int) (short) 1);
    double double15 = quarterlyDouble6.getMostRecent();
    double double16 = quarterlyDouble6.getTtmAvg();
    double double17 = quarterlyDouble6.get2QTtm();
    double double18 = quarterlyDouble6.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
  }

  @Test
  public void test0901() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0901");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.lang.String str5 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData10 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList7, (int) (short) 1, (int) '#');
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList6);
    org.junit.Assert.assertNotNull(fieldDataList7);
    org.junit.Assert.assertNull(fieldData10);
  }

  @Test
  public void test0902() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0902");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) 100,
        (int) (short) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0903() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0903");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) -1,
        (int) (short) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0904() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0904");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.deltaQ((int) '#', (int) (short) 100);
    double double11 = quarterlyDouble6.getQseqQ();
    double double12 = quarterlyDouble6.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1100.0d + "'", double11 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
  }

  @Test
  public void test0905() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0905");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double[] doubleArray13 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    quarterlyDouble6.dArr = doubleArray13;
    double double17 = quarterlyDouble6.getPrevTtm();
    java.lang.Class<?> wildcardClass18 = quarterlyDouble6.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test0906() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0906");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.get2QTtm();
    double double9 = quarterlyDouble6.getPrevTtm();
    double double10 = quarterlyDouble6.getMostRecent();
    double double11 = quarterlyDouble6.get2QTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
  }

  @Test
  public void test0907() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0907");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (-1),
        (int) (byte) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0908() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0908");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double10 = quarterlyDouble8.get((int) (byte) -1);
    double double11 = quarterlyDouble8.get2QTtm();
    double double12 = quarterlyDouble8.getPrevTtm();
    double double14 = quarterlyDouble8.get((int) (byte) -1);
    double double15 = quarterlyDouble8.getTtmAvg();
    double[] doubleArray21 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray21);
    double double23 = quarterlyDouble22.getTtmAvg();
    double[] doubleArray29 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray29);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray29);
    quarterlyDouble22.dArr = doubleArray29;
    double double33 = quarterlyDouble22.getPrevTtm();
    double double34 = quarterlyDouble22.getPrevTtm();
    java.lang.String str35 = quarterlyDouble22.toString();
    double double38 = quarterlyDouble22.deltaQ((int) (short) 1, (int) (short) 0);
    double[] doubleArray39 = quarterlyDouble22.dArr;
    quarterlyDouble8.dArr = doubleArray39;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray29);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
    org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str35,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray39);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0909() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0909");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double10 = quarterlyDouble6.get((int) (short) 1);
    double double11 = quarterlyDouble6.getPrevTtm();
    double double14 = quarterlyDouble6.deltaQ((int) (short) 100, (int) (short) 1);
    double double15 = quarterlyDouble6.getMostRecent();
    double double16 = quarterlyDouble6.getTtmAvg();
    double double17 = quarterlyDouble6.getPrevTtm();
    double[] doubleArray23 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray23);
    double double25 = quarterlyDouble24.getMostRecent();
    double double26 = quarterlyDouble24.getTtm();
    double double28 = quarterlyDouble24.get((int) (short) 1);
    double double29 = quarterlyDouble24.getPrevTtm();
    double double32 = quarterlyDouble24.deltaQ((int) (short) 100, (int) (short) 1);
    java.lang.String str33 = quarterlyDouble24.toString();
    double[] doubleArray34 = quarterlyDouble24.dArr;
    quarterlyDouble6.dArr = doubleArray34;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + 40.0d + "'", double26 == 40.0d);
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
    org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str33,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray34);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0910() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0910");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (byte) 0, 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList2);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(manyCompanyDataList3);
  }

  @Test
  public void test0911() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0911");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) 10, 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0912() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0912");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 10, 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
    org.junit.Assert.assertNotNull(manyCompanyDataList5);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test0913() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0913");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double double10 = quarterlyDouble6.getPrevTtm();
    double double11 = quarterlyDouble6.getTtm();
    double double12 = quarterlyDouble6.getMostRecent();
    double double13 = quarterlyDouble6.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str15 = quarterlyDouble6.fmtGrowth1Q("\t i=0 0.0000\t i=1 0.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
  }

  @Test
  public void test0914() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0914");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (byte) 100, (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0915() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0915");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 1, (int) (byte) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0916() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0916");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray9 = quarterlyDouble8.dArr;
    double double11 = quarterlyDouble8.get((-1));
    double[] doubleArray17 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    double double19 = quarterlyDouble18.getTtmAvg();
    double[] doubleArray25 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray25);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray25);
    quarterlyDouble18.dArr = doubleArray25;
    double[] doubleArray34 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble35 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray34);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray34);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray34);
    quarterlyDouble18.dArr = doubleArray34;
    quarterlyDouble8.dArr = doubleArray34;
    double[] doubleArray45 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble46 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray45);
    double double47 = quarterlyDouble46.getTtmAvg();
    double double48 = quarterlyDouble46.getTtmAvg();
    double double49 = quarterlyDouble46.getQseqQ();
    double double50 = quarterlyDouble46.getPrevTtm();
    double[] doubleArray51 = quarterlyDouble46.dArr;
    quarterlyDouble8.dArr = doubleArray51;
    double double53 = quarterlyDouble8.getPrevTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray34);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray45);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
    org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
    org.junit.Assert.assertTrue("'" + double49 + "' != '" + 1100.0d + "'", double49 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray51);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
  }

  @Test
  public void test0917() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0917");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray9 = quarterlyDouble8.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0918() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0918");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 10,
        (-1));
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, 10, (int) (byte) 0);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test0919() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0919");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 1, (int) (byte) 10);
  }

  @Test
  public void test0920() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0920");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) '#', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
  }

  @Test
  public void test0921() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0921");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) '#', 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0922() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0922");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray9 = quarterlyDouble8.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    double double12 = quarterlyDouble11.getQseqQ();
    double double13 = quarterlyDouble11.getTtmAvg();
    double[] doubleArray14 = quarterlyDouble11.dArr;
    double double15 = quarterlyDouble11.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1100.0d + "'", double12 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1100.0d + "'", double15 == 1100.0d);
  }

  @Test
  public void test0923() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0923");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double10 = quarterlyDouble8.get((int) (byte) -1);
    double double11 = quarterlyDouble8.get2QTtm();
    java.lang.String str12 = quarterlyDouble8.toString();
    double double13 = quarterlyDouble8.get2QTtm();
    double double14 = quarterlyDouble8.getTtmAvg();
    double double16 = quarterlyDouble8.get((int) (short) -1);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str12,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9999.9999d) + "'", double16 == (-9999.9999d));
  }

  @Test
  public void test0924() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0924");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray9 = quarterlyDouble8.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    double double12 = quarterlyDouble11.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
  }

  @Test
  public void test0925() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0925");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double[] doubleArray15 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    java.lang.String str18 = quarterlyDouble17.toString();
    double[] doubleArray19 = quarterlyDouble17.dArr;
    quarterlyDouble6.dArr = doubleArray19;
    double double21 = quarterlyDouble6.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str23 = quarterlyDouble6.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str18,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
  }

  @Test
  public void test0926() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0926");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray9 = quarterlyDouble8.dArr;
    double double11 = quarterlyDouble8.get((-1));
    double[] doubleArray17 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    java.lang.String str20 = quarterlyDouble19.toString();
    double double23 = quarterlyDouble19.deltaQ((int) (short) 10, (int) ' ');
    double double24 = quarterlyDouble19.getPrevTtm();
    double[] doubleArray30 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray30);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray30);
    java.lang.String str33 = quarterlyDouble32.toString();
    double double35 = quarterlyDouble32.get((int) (byte) -1);
    java.lang.String str36 = quarterlyDouble32.toString();
    double double39 = quarterlyDouble32.deltaQ(1, 0);
    double[] doubleArray40 = quarterlyDouble32.dArr;
    quarterlyDouble19.dArr = doubleArray40;
    quarterlyDouble8.dArr = doubleArray40;
    // The following exception was thrown during execution in test generation
    try {
      double double43 = quarterlyDouble8.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str20,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray30);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str33,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-9999.9999d) + "'", double35 == (-9999.9999d));
    org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str36,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray40);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0927() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0927");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double double10 = quarterlyDouble6.getPrevTtm();
    double double12 = quarterlyDouble6.get((int) '#');
    // The following exception was thrown during execution in test generation
    try {
      double double13 = quarterlyDouble6.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
  }

  @Test
  public void test0928() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0928");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getTtmAvg();
    java.lang.String str11 = quarterlyDouble6.toString();
    java.lang.String str12 = quarterlyDouble6.toString();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str11,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str12,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test0929() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0929");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double[] doubleArray12 = new double[] { 1L, 100, (short) 10 };
    quarterlyDouble7.dArr = doubleArray12;
    double double15 = quarterlyDouble7.get((int) (byte) -1);
    double double16 = quarterlyDouble7.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 100.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9999.9999d) + "'", double15 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
  }

  @Test
  public void test0930() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0930");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) (byte) 0, (int) (byte) 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0931() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0931");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double double10 = quarterlyDouble6.getPrevTtm();
    double double13 = quarterlyDouble6.deltaQ((int) (byte) 10, 0);
    double[] doubleArray19 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    java.lang.String str22 = quarterlyDouble21.toString();
    double[] doubleArray23 = quarterlyDouble21.dArr;
    quarterlyDouble6.dArr = doubleArray23;
    double double27 = quarterlyDouble6.deltaQ((int) 'a', (int) ' ');
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str22,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
  }

  @Test
  public void test0932() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0932");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.get2QTtm();
    java.lang.String str9 = quarterlyDouble6.toString();
    double[] doubleArray10 = quarterlyDouble6.dArr;
    double double11 = quarterlyDouble6.getQseqQ();
    double[] doubleArray17 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    double double19 = quarterlyDouble18.getMostRecent();
    double double22 = quarterlyDouble18.deltaQ((int) (short) -1, (int) (byte) 0);
    double double23 = quarterlyDouble18.getTtm();
    double double24 = quarterlyDouble18.getTtm();
    double double25 = quarterlyDouble18.getTtm();
    double[] doubleArray31 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray31);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray31);
    double double34 = quarterlyDouble33.getQseqQ();
    double[] doubleArray40 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray40);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble42 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray40);
    java.lang.String str43 = quarterlyDouble42.toString();
    double[] doubleArray47 = new double[] { 1L, 100, (short) 10 };
    quarterlyDouble42.dArr = doubleArray47;
    quarterlyDouble33.dArr = doubleArray47;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble50 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray47);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble51 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray47);
    quarterlyDouble18.dArr = doubleArray47;
    quarterlyDouble6.dArr = doubleArray47;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str9,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1100.0d + "'", double11 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 40.0d + "'", double23 == 40.0d);
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + 40.0d + "'", double24 == 40.0d);
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + 40.0d + "'", double25 == 40.0d);
    org.junit.Assert.assertNotNull(doubleArray31);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1100.0d + "'", double34 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray40);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str43,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray47);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0, 100.0, 10.0]");
  }

  @Test
  public void test0933() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0933");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList2, 1, (int) '4');
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList2, (int) (byte) 100, (int) (byte) -1);
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNull(fieldData5);
    org.junit.Assert.assertNull(fieldData8);
  }

  @Test
  public void test0934() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0934");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str13 = quarterlyDouble6.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1100.0d + "'", double11 == 1100.0d);
  }

  @Test
  public void test0935() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0935");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str12 = quarterlyDouble6.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
  }

  @Test
  public void test0936() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0936");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 100, 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0937() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0937");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.getQseqQ();
    double double14 = quarterlyDouble6.deltaQ((int) '4', (int) '#');
    java.lang.String str15 = quarterlyDouble6.toString();
    double double17 = quarterlyDouble6.get((int) (short) 100);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1100.0d + "'", double11 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str15,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9999.9999d) + "'", double17 == (-9999.9999d));
  }

  @Test
  public void test0938() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0938");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.deltaQ((int) (short) -1, (int) (byte) 0);
    double double11 = quarterlyDouble6.get2QTtm();
    double double12 = quarterlyDouble6.getQseqQ();
    double double13 = quarterlyDouble6.get2QTtm();
    double double14 = quarterlyDouble6.getPrevTtm();
    double double15 = quarterlyDouble6.getMostRecent();
    double double16 = quarterlyDouble6.getPrevTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1100.0d + "'", double12 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
  }

  @Test
  public void test0939() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0939");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double double10 = quarterlyDouble7.get((int) (byte) -1);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str12 = quarterlyDouble7.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
  }

  @Test
  public void test0940() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0940");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(1, (int) (byte) 100);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0941() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0941");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getQseqQ();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double11 = quarterlyDouble7.get((int) ' ');
    java.lang.String str12 = quarterlyDouble7.toString();
    double double13 = quarterlyDouble7.getPrevTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1100.0d + "'", double8 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str12,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
  }

  @Test
  public void test0942() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0942");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 1, (int) (short) 10);
  }

  @Test
  public void test0943() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0943");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 1, (int) (byte) 1);
  }

  @Test
  public void test0944() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0944");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double double11 = quarterlyDouble7.deltaQ((int) (short) 10, (int) ' ');
    double double12 = quarterlyDouble7.getPrevTtm();
    double double13 = quarterlyDouble7.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
  }

  @Test
  public void test0945() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0945");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double double9 = quarterlyDouble7.get2QTtm();
    double double10 = quarterlyDouble7.getMostRecent();
    double double11 = quarterlyDouble7.getTtm();
    double double12 = quarterlyDouble7.getPrevTtm();
    double double14 = quarterlyDouble7.get(10);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str16 = quarterlyDouble7.fmtGrowth4Q("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
  }

  @Test
  public void test0946() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0946");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.deltaQ((int) (short) -1, (int) (byte) 0);
    double double11 = quarterlyDouble6.getTtm();
    double double12 = quarterlyDouble6.getTtm();
    double[] doubleArray13 = quarterlyDouble6.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0947() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0947");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t i=0 0.0000\t i=1 0.0000", (int) '4', (int) ' ');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0948() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0948");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 1, (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) ' ', (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
    org.junit.Assert.assertNotNull(manyCompanyDataList5);
    org.junit.Assert.assertNotNull(companyDataList8);
  }

  @Test
  public void test0949() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0949");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.deltaQ((int) (short) 100, (int) '#');
    double double13 = quarterlyDouble6.get(0);
    double double14 = quarterlyDouble6.getQseqQ();
    double[] doubleArray15 = quarterlyDouble6.dArr;
    double[] doubleArray16 = quarterlyDouble6.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray16);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1100.0d + "'", double14 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0950() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0950");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t i=0 0.0000\t i=1 0.0000", (int) (short) 0, (int) (short) 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0951() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0951");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    java.lang.String str6 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
    java.lang.String str8 = companyData1.getTicker();
    java.lang.String str9 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = companyData1.getFdList();
    java.lang.String str12 = companyData1.getTicker();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList10);
    org.junit.Assert.assertNotNull(fieldDataList11);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
  }

  @Test
  public void test0952() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0952");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getPrevTtm();
    double[] doubleArray11 = quarterlyDouble6.dArr;
    java.lang.String str12 = quarterlyDouble6.toString();
    double double13 = quarterlyDouble6.get2QTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str15 = quarterlyDouble6.fmtGrowth4Q("\t i=0 0.0000\t i=1 0.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str12,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
  }

  @Test
  public void test0953() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0953");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray9 = quarterlyDouble8.dArr;
    double double11 = quarterlyDouble8.get((-1));
    double[] doubleArray17 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    double double19 = quarterlyDouble18.getTtmAvg();
    double[] doubleArray25 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray25);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray25);
    quarterlyDouble18.dArr = doubleArray25;
    double[] doubleArray34 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble35 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray34);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray34);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray34);
    quarterlyDouble18.dArr = doubleArray34;
    quarterlyDouble8.dArr = doubleArray34;
    double double40 = quarterlyDouble8.getTtmAvg();
    double double41 = quarterlyDouble8.getTtm();
    double[] doubleArray47 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble48 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray47);
    double double49 = quarterlyDouble48.getTtmAvg();
    double[] doubleArray55 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble56 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray55);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble57 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray55);
    quarterlyDouble48.dArr = doubleArray55;
    double double59 = quarterlyDouble48.getPrevTtm();
    double double60 = quarterlyDouble48.getPrevTtm();
    double[] doubleArray66 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble67 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray66);
    double double68 = quarterlyDouble67.getTtmAvg();
    double[] doubleArray74 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble75 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray74);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble76 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray74);
    quarterlyDouble67.dArr = doubleArray74;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble78 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray74);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble79 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray74);
    quarterlyDouble48.dArr = doubleArray74;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble81 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray74);
    quarterlyDouble8.dArr = doubleArray74;
    double double83 = quarterlyDouble8.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray34);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
    org.junit.Assert.assertTrue("'" + double41 + "' != '" + 40.0d + "'", double41 == 40.0d);
    org.junit.Assert.assertNotNull(doubleArray47);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray55);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
    org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray66);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray74);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double83 + "' != '" + 10.0d + "'", double83 == 10.0d);
  }

  @Test
  public void test0954() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0954");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) 10,
        (int) '#');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0955() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0955");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.deltaQ((int) (short) -1, (int) (byte) 0);
    double double11 = quarterlyDouble6.get2QTtm();
    double double12 = quarterlyDouble6.getQseqQ();
    double double13 = quarterlyDouble6.get2QTtm();
    double double14 = quarterlyDouble6.getTtm();
    double double15 = quarterlyDouble6.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1100.0d + "'", double12 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
  }

  @Test
  public void test0956() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0956");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData7 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList4, 10, (int) (short) -1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNull(fieldData7);
  }

  @Test
  public void test0957() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0957");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getPrevTtm();
    double[] doubleArray16 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray16);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray16);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray16);
    double[] doubleArray20 = quarterlyDouble19.dArr;
    double double22 = quarterlyDouble19.get((-1));
    double[] doubleArray28 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray28);
    double double30 = quarterlyDouble29.getTtmAvg();
    double[] doubleArray36 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray36);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble38 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray36);
    quarterlyDouble29.dArr = doubleArray36;
    double[] doubleArray45 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble46 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray45);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble47 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray45);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble48 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray45);
    quarterlyDouble29.dArr = doubleArray45;
    quarterlyDouble19.dArr = doubleArray45;
    quarterlyDouble6.dArr = doubleArray45;
    double double52 = quarterlyDouble6.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray20);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-9999.9999d) + "'", double22 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray28);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray36);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray45);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
  }

  @Test
  public void test0958() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0958");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.get2QTtm();
    java.lang.String str9 = quarterlyDouble6.toString();
    double[] doubleArray10 = quarterlyDouble6.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str12 = quarterlyDouble6.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str9,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0959() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0959");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double double10 = quarterlyDouble6.getPrevTtm();
    double double11 = quarterlyDouble6.getTtm();
    java.lang.String str12 = quarterlyDouble6.toString();
    double double13 = quarterlyDouble6.getQseqQ();
    double double14 = quarterlyDouble6.getTtmAvg();
    double double17 = quarterlyDouble6.deltaQ((int) (short) 1, (int) (short) 1);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str12,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1100.0d + "'", double13 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
  }

  @Test
  public void test0960() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0960");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    java.lang.String str9 = quarterlyDouble6.toString();
    double double10 = quarterlyDouble6.get2QTtm();
    // The following exception was thrown during execution in test generation
    try {
      double double13 = quarterlyDouble6.deltaQ(1, (int) (byte) 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str9,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
  }

  @Test
  public void test0961() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0961");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double10 = quarterlyDouble8.get((int) (byte) -1);
    double double11 = quarterlyDouble8.get2QTtm();
    double double12 = quarterlyDouble8.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      double double13 = quarterlyDouble8.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
  }

  @Test
  public void test0962() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0962");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double[] doubleArray12 = new double[] { 1L, 100, (short) 10 };
    quarterlyDouble7.dArr = doubleArray12;
    double double15 = quarterlyDouble7.get((int) (byte) -1);
    java.lang.String str16 = quarterlyDouble7.toString();
    double double17 = quarterlyDouble7.getTtmAvg();
    double double18 = quarterlyDouble7.getPrevTtm();
    java.lang.String str19 = quarterlyDouble7.toString();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 100.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9999.9999d) + "'", double15 == (-9999.9999d));
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000" + "'", str16,
        "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000" + "'", str19,
        "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
  }

  @Test
  public void test0963() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0963");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 1, 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0964() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0964");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) '4',
        (int) (short) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0965() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0965");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double[] doubleArray13 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    quarterlyDouble6.dArr = doubleArray13;
    double double17 = quarterlyDouble6.getPrevTtm();
    double double18 = quarterlyDouble6.getPrevTtm();
    java.lang.String str19 = quarterlyDouble6.toString();
    double double20 = quarterlyDouble6.get2QTtm();
    double[] doubleArray21 = quarterlyDouble6.dArr;
    double double22 = quarterlyDouble6.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str19,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
  }

  @Test
  public void test0966() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0966");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(0, (int) (short) 1);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0967() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0967");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((-1), (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList3);
  }

  @Test
  public void test0968() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0968");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.getTtmAvg();
    double[] doubleArray17 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    double double20 = quarterlyDouble19.getQseqQ();
    double[] doubleArray26 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray26);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray26);
    java.lang.String str29 = quarterlyDouble28.toString();
    double[] doubleArray33 = new double[] { 1L, 100, (short) 10 };
    quarterlyDouble28.dArr = doubleArray33;
    quarterlyDouble19.dArr = doubleArray33;
    quarterlyDouble6.dArr = doubleArray33;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray33);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1100.0d + "'", double20 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray26);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str29,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray33);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, 100.0, 10.0]");
  }

  @Test
  public void test0969() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0969");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double10 = quarterlyDouble6.get((int) (short) 1);
    double double11 = quarterlyDouble6.getTtm();
    double double12 = quarterlyDouble6.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
  }

  @Test
  public void test0970() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0970");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getTtmAvg();
    java.lang.String str10 = quarterlyDouble6.toString();
    double double11 = quarterlyDouble6.get2QTtm();
    double double12 = quarterlyDouble6.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str10,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
  }

  @Test
  public void test0971() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0971");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.deltaQ((int) '#', (int) (short) 100);
    double double11 = quarterlyDouble6.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str13 = quarterlyDouble6.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
  }

  @Test
  public void test0972() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0972");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) 100,
        (int) (short) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0973() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0973");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) (byte) 100, (-1));
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0974() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0974");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double10 = quarterlyDouble6.get((int) (short) 1);
    double double11 = quarterlyDouble6.getPrevTtm();
    double double14 = quarterlyDouble6.deltaQ((int) (short) 100, (int) (short) 1);
    double double15 = quarterlyDouble6.getMostRecent();
    double double16 = quarterlyDouble6.getTtmAvg();
    double double17 = quarterlyDouble6.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str19 = quarterlyDouble6.fmtGrowth4Q("\t i=0 0.0000\t i=1 0.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
  }

  @Test
  public void test0975() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0975");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.deltaQ((int) (short) 100, (int) '#');
    double double13 = quarterlyDouble6.get(0);
    double double14 = quarterlyDouble6.getQseqQ();
    double double15 = quarterlyDouble6.getPrevTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str17 = quarterlyDouble6.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1100.0d + "'", double14 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
  }

  @Test
  public void test0976() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0976");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", 100,
        (int) (byte) 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0977() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0977");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t i=0 0.0000\t i=1 0.0000", (int) (byte) -1, (int) '#');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0978() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0978");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 0,
        (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) ' ', (int) (short) 0);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
    org.junit.Assert.assertNotNull(companyDataList7);
  }

  @Test
  public void test0979() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0979");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getQseqQ();
    double[] doubleArray14 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    java.lang.String str17 = quarterlyDouble16.toString();
    double[] doubleArray21 = new double[] { 1L, 100, (short) 10 };
    quarterlyDouble16.dArr = doubleArray21;
    quarterlyDouble7.dArr = doubleArray21;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray21);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray21);
    double double26 = quarterlyDouble25.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str28 = quarterlyDouble25.fmtGrowth1Q("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1100.0d + "'", double8 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str17,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 100.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + 900.0d + "'", double26 == 900.0d);
  }

  @Test
  public void test0980() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0980");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) '4', (-1));
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0981() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0981");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getPrevTtm();
    double[] doubleArray16 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray16);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray16);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray16);
    double[] doubleArray20 = quarterlyDouble19.dArr;
    double double22 = quarterlyDouble19.get((-1));
    double[] doubleArray28 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray28);
    double double30 = quarterlyDouble29.getTtmAvg();
    double[] doubleArray36 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray36);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble38 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray36);
    quarterlyDouble29.dArr = doubleArray36;
    double[] doubleArray45 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble46 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray45);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble47 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray45);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble48 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray45);
    quarterlyDouble29.dArr = doubleArray45;
    quarterlyDouble19.dArr = doubleArray45;
    quarterlyDouble6.dArr = doubleArray45;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble52 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray45);
    double[] doubleArray58 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble59 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray58);
    double double60 = quarterlyDouble59.getTtmAvg();
    double[] doubleArray66 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble67 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray66);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble68 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray66);
    quarterlyDouble59.dArr = doubleArray66;
    double[] doubleArray75 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble76 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray75);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble77 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray75);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble78 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray75);
    quarterlyDouble59.dArr = doubleArray75;
    quarterlyDouble52.dArr = doubleArray75;
    java.lang.Class<?> wildcardClass81 = doubleArray75.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray20);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-9999.9999d) + "'", double22 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray28);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray36);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray45);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray58);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray66);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray75);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(wildcardClass81);
  }

  @Test
  public void test0982() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0982");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (byte) 10, (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList3);
  }

  @Test
  public void test0983() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0983");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double[] doubleArray15 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    java.lang.String str18 = quarterlyDouble17.toString();
    double[] doubleArray19 = quarterlyDouble17.dArr;
    quarterlyDouble6.dArr = doubleArray19;
    double[] doubleArray21 = quarterlyDouble6.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray21);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str24 = quarterlyDouble22.fmtGrowth1Q("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str18,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0984() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0984");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double double10 = quarterlyDouble6.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
  }

  @Test
  public void test0985() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0985");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.lang.String str2 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    org.junit.Assert.assertNotNull(fieldDataList3);
  }

  @Test
  public void test0986() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0986");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 0, (-1));
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0987() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0987");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList5, (int) (short) -1, 10);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList5, 1, (int) ' ');
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData14 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList5, (int) '4', 10);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData17 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList5, 1, 100);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData20 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList5, (int) 'a', (int) (short) -1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertNull(fieldData8);
    org.junit.Assert.assertNull(fieldData11);
    org.junit.Assert.assertNull(fieldData14);
    org.junit.Assert.assertNull(fieldData17);
    org.junit.Assert.assertNull(fieldData20);
  }

  @Test
  public void test0988() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0988");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.get2QTtm();
    java.lang.String str9 = quarterlyDouble6.toString();
    double double10 = quarterlyDouble6.getPrevTtm();
    double double11 = quarterlyDouble6.get2QTtm();
    double double14 = quarterlyDouble6.deltaQ((int) '#', (-1));
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str9,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
  }

  @Test
  public void test0989() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0989");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.get2QTtm();
    java.lang.String str9 = quarterlyDouble6.toString();
    double[] doubleArray10 = quarterlyDouble6.dArr;
    double double11 = quarterlyDouble6.getQseqQ();
    double[] doubleArray12 = quarterlyDouble6.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str14 = quarterlyDouble6.fmtGrowth4Q("\t i=0 0.0000\t i=1 0.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str9,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1100.0d + "'", double11 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0990() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0990");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    java.lang.String str6 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList8, 100, (int) (byte) 0);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList7);
    org.junit.Assert.assertNotNull(fieldDataList8);
    org.junit.Assert.assertNull(fieldData11);
  }

  @Test
  public void test0991() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0991");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) (byte) 0, 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0992() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0992");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 10, (int) (short) -1);
  }

  @Test
  public void test0993() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0993");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double[] doubleArray15 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    java.lang.String str18 = quarterlyDouble17.toString();
    double[] doubleArray19 = quarterlyDouble17.dArr;
    quarterlyDouble6.dArr = doubleArray19;
    double[] doubleArray21 = quarterlyDouble6.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray21);
    java.lang.String str23 = quarterlyDouble22.toString();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str18,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str23,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test0994() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0994");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.deltaQ((int) (short) -1, (int) (byte) 0);
    double double11 = quarterlyDouble6.getTtm();
    double double12 = quarterlyDouble6.getTtm();
    double[] doubleArray13 = quarterlyDouble6.dArr;
    // The following exception was thrown during execution in test generation
    try {
      double double16 = quarterlyDouble6.deltaQ((int) (byte) 1, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0995() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0995");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getQseqQ();
    double[] doubleArray9 = quarterlyDouble7.dArr;
    double double10 = quarterlyDouble7.getPrevTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1100.0d + "'", double8 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
  }

  @Test
  public void test0996() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0996");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getQseqQ();
    double[] doubleArray14 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    java.lang.String str17 = quarterlyDouble16.toString();
    double[] doubleArray21 = new double[] { 1L, 100, (short) 10 };
    quarterlyDouble16.dArr = doubleArray21;
    quarterlyDouble7.dArr = doubleArray21;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray21);
    double double26 = quarterlyDouble24.get((int) (short) 100);
    double double27 = quarterlyDouble24.get2QTtm();
    double double28 = quarterlyDouble24.getQseqQ();
    double double29 = quarterlyDouble24.getMostRecent();
    double double31 = quarterlyDouble24.get((int) (short) 100);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1100.0d + "'", double8 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str17,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 100.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-9999.9999d) + "'", double26 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + 900.0d + "'", double28 == 900.0d);
    org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
    org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-9999.9999d) + "'", double31 == (-9999.9999d));
  }

  @Test
  public void test0997() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0997");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double9 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.getMostRecent();
    double[] doubleArray11 = quarterlyDouble6.dArr;
    double double12 = quarterlyDouble6.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1100.0d + "'", double12 == 1100.0d);
  }

  @Test
  public void test0998() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0998");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) '4', (int) 'a');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList2);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(manyCompanyDataList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test0999() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0999");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.deltaQ((int) (short) -1, (int) (byte) 0);
    double double11 = quarterlyDouble6.getTtm();
    double double12 = quarterlyDouble6.getTtm();
    double double13 = quarterlyDouble6.getTtm();
    java.lang.String str14 = quarterlyDouble6.toString();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str14,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test1000() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test1000");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray10 = new double[] { 0.0d, 0 };
    quarterlyDouble7.dArr = doubleArray10;
    double double12 = quarterlyDouble7.getPrevTtm();
    double double13 = quarterlyDouble7.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
  }
}
