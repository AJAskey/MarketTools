package net.ajaskey.market.tools.SIP.BigDB.collation;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CollationTests0 {

  public static boolean debug = false;

  @Test
  public void test0001() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0001");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) 'a', (int) (byte) 10);
  }

  @Test
  public void test0002() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0002");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", 0, 100);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0003() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0003");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getCompany("hi!");
    org.junit.Assert.assertNotNull(oneCompanyDataList1);
  }

  @Test
  public void test0004() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0004");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) 'a', (int) (short) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0005() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0005");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getCompany("");
    org.junit.Assert.assertNotNull(oneCompanyDataList1);
  }

  @Test
  public void test0006() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0006");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) 'a', (int) '4');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0007() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0007");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) (byte) 100, (int) '4');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0008() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0008");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) (byte) 10, (int) (short) 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0009() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0009");
    java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies((java.util.List<java.lang.String>) strList2, (int) 'a', (int) (short) 1);
    java.lang.Class<?> wildcardClass7 = companyDataList6.getClass();
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test0010() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0010");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(0, 0);
  }

  @Test
  public void test0011() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0011");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 100, (int) '#');
  }

  @Test
  public void test0012() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0012");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str9 = quarterlyDouble7.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0013() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0013");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str10 = quarterlyDouble7.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test0014() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0014");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getCompany("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(oneCompanyDataList1);
  }

  @Test
  public void test0015() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0015");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double[] doubleArray9 = quarterlyDouble7.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str11 = quarterlyDouble7.fmtGrowth4Q("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
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
  }

  @Test
  public void test0016() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0016");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.deltaQ((int) (short) -1, (int) (byte) 0);
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
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
  }

  @Test
  public void test0017() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0017");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (byte) 100, 100);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0018() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0018");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) '#',
          (int) (byte) 1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0019() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0019");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double double9 = quarterlyDouble7.get2QTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str11 = quarterlyDouble7.fmtGrowth4Q("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
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
  }

  @Test
  public void test0020() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0020");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double[] doubleArray12 = new double[] { 1L, 100, (short) 10 };
    quarterlyDouble7.dArr = doubleArray12;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str15 = quarterlyDouble7.fmtGrowth4Q("");
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
  }

  @Test
  public void test0021() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0021");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) '#', 10);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0022() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0022");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double[] doubleArray12 = new double[] { 1L, 100, (short) 10 };
    quarterlyDouble7.dArr = doubleArray12;
    java.lang.Class<?> wildcardClass14 = quarterlyDouble7.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 100.0, 10.0]");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test0023() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0023");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(0, (int) '#');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0024() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0024");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double double9 = quarterlyDouble7.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
  }

  @Test
  public void test0025() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0025");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      double double8 = quarterlyDouble6.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
  }

  @Test
  public void test0026() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0026");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str10 = quarterlyDouble6.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
  }

  @Test
  public void test0027() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0027");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (byte) 100,
          (int) 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0028() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0028");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 100, (int) (short) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0029() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0029");
    java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
    java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies((java.util.List<java.lang.String>) strList3, 0, (int) ' ');
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(companyDataList7);
  }

  @Test
  public void test0030() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0030");
    java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies((java.util.List<java.lang.String>) strList2, (int) 'a', (int) (short) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList9 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList10 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList((java.util.List<java.lang.String>) strList2);
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(companyDataList9);
    org.junit.Assert.assertNotNull(manyCompanyDataList10);
  }

  @Test
  public void test0031() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0031");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getPrevTtm();
    double[] doubleArray11 = quarterlyDouble6.dArr;
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
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0032() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0032");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (byte) -1, (int) 'a');
    java.lang.Class<?> wildcardClass3 = companySummaryList2.getClass();
    org.junit.Assert.assertNotNull(companySummaryList2);
    org.junit.Assert.assertNotNull(wildcardClass3);
  }

  @Test
  public void test0033() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0033");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtm();
    double double8 = quarterlyDouble6.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str10 = quarterlyDouble6.fmtGrowth1Q("hi!");
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
  public void test0034() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0034");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) 'a', (int) (byte) 100);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0035() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0035");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getMostRecent();
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
  public void test0036() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0036");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (-1), (int) (byte) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0037() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0037");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 0, (int) ' ');
  }

  @Test
  public void test0038() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0038");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (short) 100,
          (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0039() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0039");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) '4',
        (int) (byte) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0040() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0040");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double double12 = quarterlyDouble6.deltaQ((int) '4', (int) (byte) 100);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str14 = quarterlyDouble6.fmtGrowth4Q("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
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
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
  }

  @Test
  public void test0041() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0041");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double double10 = quarterlyDouble7.get((int) (byte) -1);
    java.lang.String str11 = quarterlyDouble7.toString();
    java.lang.Class<?> wildcardClass12 = quarterlyDouble7.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str11,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test0042() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0042");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 10,
        (int) ' ');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0043() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0043");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) '#', 0);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0044() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0044");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str10 = quarterlyDouble7.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1100.0d + "'", double8 == 1100.0d);
  }

  @Test
  public void test0045() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0045");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, 0, (int) (byte) 10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0046() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0046");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 100, (int) '4');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0047() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0047");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) (byte) -1, (int) '#');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0048() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0048");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) '4', (int) (short) -1);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0049() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0049");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double double12 = quarterlyDouble6.deltaQ((int) '4', (int) (byte) 100);
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
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
  }

  @Test
  public void test0050() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0050");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) -1, (-1));
  }

  @Test
  public void test0051() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0051");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 1, (int) (short) -1);
  }

  @Test
  public void test0052() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0052");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (short) 0, 0);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0053() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0053");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (-1), 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0054() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0054");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double[] doubleArray9 = quarterlyDouble7.dArr;
    double double10 = quarterlyDouble7.getPrevTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str12 = quarterlyDouble7.fmtGrowth4Q("hi!");
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
  }

  @Test
  public void test0055() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0055");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.get2QTtm();
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
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
  }

  @Test
  public void test0056() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0056");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    // The following exception was thrown during execution in test generation
    try {
      double double11 = quarterlyDouble7.deltaQ((int) (byte) 0, (int) (short) 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test0057() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0057");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) 'a', (int) '#');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0058() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0058");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) ' ', 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, (int) '4', (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList2);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList5);
    org.junit.Assert.assertNotNull(manyCompanyDataList6);
    org.junit.Assert.assertNotNull(manyCompanyDataList7);
  }

  @Test
  public void test0059() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0059");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double double10 = quarterlyDouble6.get2QTtm();
    // The following exception was thrown during execution in test generation
    try {
      double double11 = quarterlyDouble6.getQoQ();
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
  public void test0060() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0060");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData7 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList4, 0, 0);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNull(fieldData7);
  }

  @Test
  public void test0061() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0061");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str10 = quarterlyDouble8.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0062() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0062");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (short) 0, (int) (short) 1);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0063() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0063");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str9 = quarterlyDouble6.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
  }

  @Test
  public void test0064() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0064");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) ' ',
        (int) (byte) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0065() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0065");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) 10, (int) '4');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0066() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0066");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) ' ',
        (int) (short) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (-1), (int) (short) 10);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test0067() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0067");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (short) 0, (int) '#');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0068() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0068");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) 'a',
        (int) (short) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0069() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0069");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(0, (int) 'a');
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0070() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0070");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 0,
        (int) (short) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (byte) 100, (int) (short) -1);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test0071() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0071");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.deltaQ((int) (short) -1, (int) (byte) 0);
    double double11 = quarterlyDouble6.getTtm();
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
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
  }

  @Test
  public void test0072() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0072");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray9 = quarterlyDouble8.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str11 = quarterlyDouble8.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0073() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0073");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (short) -1,
        (int) (short) 10);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0074() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0074");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getPrevTtm();
    double[] doubleArray11 = quarterlyDouble6.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str13 = quarterlyDouble6.fmtGrowth1Q("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
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
  }

  @Test
  public void test0075() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0075");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 0, (-1));
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0076() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0076");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (byte) 10,
          (int) '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0077() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0077");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, 0, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0078() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0078");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (short) 1,
          (int) (short) 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0079() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0079");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.get2QTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str10 = quarterlyDouble6.fmtGrowth1Q("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
  }

  @Test
  public void test0080() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0080");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str18 = quarterlyDouble6.fmtGrowth4Q("");
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
  }

  @Test
  public void test0081() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0081");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (short) 100, 1);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0082() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0082");
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
      double double14 = quarterlyDouble7.deltaQ((int) (byte) -1, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
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
  public void test0083() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0083");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 10,
        (int) (byte) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0084() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0084");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (-1),
        (int) (short) 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
  }

  @Test
  public void test0085() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0085");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getCompany("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
    org.junit.Assert.assertNotNull(oneCompanyDataList1);
  }

  @Test
  public void test0086() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0086");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 10,
        (-1));
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, 1, (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test0087() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0087");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) ' ', 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, (int) '4', (int) (byte) 0);
    java.lang.Class<?> wildcardClass6 = strList2.getClass();
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test0088() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0088");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double double10 = quarterlyDouble6.getPrevTtm();
    double double11 = quarterlyDouble6.getTtm();
    double double12 = quarterlyDouble6.getMostRecent();
    java.lang.Class<?> wildcardClass13 = quarterlyDouble6.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test0089() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0089");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str10 = quarterlyDouble8.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0090() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0090");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.get2QTtm();
    double double10 = quarterlyDouble6.get((int) (byte) 100);
    java.lang.Class<?> wildcardClass11 = quarterlyDouble6.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test0091() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0091");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 100, (int) (byte) -1);
  }

  @Test
  public void test0092() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0092");
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
      java.lang.String str41 = quarterlyDouble6.fmtGrowth1Q("hi!");
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
  public void test0093() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0093");
    java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies((java.util.List<java.lang.String>) strList2, (int) 'a', (int) (short) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList9 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies((java.util.List<java.lang.String>) strList2, (int) (byte) -1, (int) (byte) -1);
    java.lang.Class<?> wildcardClass10 = companyDataList9.getClass();
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(companyDataList9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0094() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0094");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray9 = quarterlyDouble8.dArr;
    java.lang.Class<?> wildcardClass10 = doubleArray9.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0095() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0095");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, 1, (int) (byte) 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0096() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0096");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double[] doubleArray9 = quarterlyDouble7.dArr;
    // The following exception was thrown during execution in test generation
    try {
      double double12 = quarterlyDouble7.deltaQ((int) (byte) 1, 100);
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
  }

  @Test
  public void test0097() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0097");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(10, (int) (byte) 10);
  }

  @Test
  public void test0098() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0098");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    java.lang.String str6 = companyData1.getTicker();
    java.lang.Class<?> wildcardClass7 = companyData1.getClass();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test0099() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0099");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str11 = quarterlyDouble6.fmtGrowth4Q("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
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
  }

  @Test
  public void test0100() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0100");
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
    java.lang.Class<?> wildcardClass24 = quarterlyDouble7.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1100.0d + "'", double8 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str17,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 100.0, 10.0]");
    org.junit.Assert.assertNotNull(wildcardClass24);
  }

  @Test
  public void test0101() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0101");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) (short) 0, 100);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0102() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0102");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000", (-1), 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0103() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0103");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(0, 10);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0104() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0104");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) (short) 100, (int) (byte) -1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0105() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0105");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) ' ', 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
  }

  @Test
  public void test0106() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0106");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, 10, (int) (byte) 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0107() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0107");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.deltaQ((int) (short) 100, (int) '#');
    double double13 = quarterlyDouble6.get(0);
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
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
  }

  @Test
  public void test0108() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0108");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double10 = quarterlyDouble8.get((int) (byte) -1);
    double double11 = quarterlyDouble8.get2QTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str13 = quarterlyDouble8.fmtGrowth1Q("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
  }

  @Test
  public void test0109() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0109");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (byte) 0, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, (int) (byte) 10, (-1));
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList5);
  }

  @Test
  public void test0110() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0110");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str10 = quarterlyDouble6.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
  }

  @Test
  public void test0111() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0111");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((-1), (int) '4');
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0112() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0112");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) '#', 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (short) 1, 0);
    java.lang.Class<?> wildcardClass7 = strList3.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test0113() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0113");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 1, (int) (byte) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0114() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0114");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) (byte) 0, (int) (short) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0115() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0115");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (short) 1, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0116() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0116");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (byte) 0, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0117() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0117");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double10 = quarterlyDouble6.get((int) (short) 1);
    double double11 = quarterlyDouble6.get2QTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
  }

  @Test
  public void test0118() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0118");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 0, 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0119() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0119");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (byte) 10,
          (int) (byte) 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0120() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0120");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double10 = quarterlyDouble8.get((int) (byte) -1);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str12 = quarterlyDouble8.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
  }

  @Test
  public void test0121() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0121");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) -1,
        (int) '4');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0122() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0122");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) (short) 1, (-1));
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0123() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0123");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000", 1, (int) (byte) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0124() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0124");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 0, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test0125() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0125");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(100, 1);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0126() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0126");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
    java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1,
        fieldDataArray0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) 'a', (int) (short) 100);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (short) -1, (int) (byte) 10);
    org.junit.Assert.assertNotNull(fieldDataArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNull(fieldData5);
    org.junit.Assert.assertNull(fieldData8);
  }

  @Test
  public void test0127() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0127");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 1,
        (int) (short) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0128() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0128");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (byte) 0, 10);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0129() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0129");
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
    double double42 = quarterlyDouble8.get((int) (byte) 10);
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
    org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-9999.9999d) + "'", double42 == (-9999.9999d));
  }

  @Test
  public void test0130() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0130");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (short) 10, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0131() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0131");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.getQseqQ();
    java.lang.Class<?> wildcardClass12 = quarterlyDouble6.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1100.0d + "'", double11 == 1100.0d);
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test0132() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0132");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000", (int) (byte) 100, (int) '4');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0133() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0133");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (short) -1,
          (int) (byte) 100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0134() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0134");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getTtmAvg();
    java.lang.String str10 = quarterlyDouble6.toString();
    // The following exception was thrown during execution in test generation
    try {
      double double11 = quarterlyDouble6.getQoQ();
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
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str10,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test0135() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0135");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) ' ',
          (int) (byte) 1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0136() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0136");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (short) 0, (int) '#');
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0137() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0137");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000", 0, (int) (byte) 100);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0138() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0138");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double double12 = quarterlyDouble6.deltaQ((int) '4', (int) (byte) 100);
    java.lang.Class<?> wildcardClass13 = quarterlyDouble6.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test0139() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0139");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, 0, (int) '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0140() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0140");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double double10 = quarterlyDouble7.get((int) (byte) -1);
    java.lang.String str11 = quarterlyDouble7.toString();
    double double12 = quarterlyDouble7.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str14 = quarterlyDouble7.fmtGrowth1Q("");
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
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1100.0d + "'", double12 == 1100.0d);
  }

  @Test
  public void test0141() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0141");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000", (int) 'a', (int) (byte) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0142() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0142");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 100, (int) (byte) 10);
  }

  @Test
  public void test0143() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0143");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, 0, (int) (byte) 10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0144() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0144");
    java.util.List<java.lang.String> strList0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
          .getCompanies(strList0, (int) '#', (int) (byte) 1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0145() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0145");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (byte) 100, (int) 'a');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0146() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0146");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 0, (int) (short) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0147() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0147");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) -1,
        (int) 'a');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
    org.junit.Assert.assertNotNull(companyDataList5);
  }

  @Test
  public void test0148() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0148");
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
      java.lang.String str13 = quarterlyDouble6.fmtGrowth4Q("");
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
  public void test0149() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0149");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(100, (int) (short) 0);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0150() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0150");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (byte) 0,
          (int) '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0151() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0151");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) 10, 0);
    java.lang.Class<?> wildcardClass4 = strList3.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test0152() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0152");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getPrevTtm();
    // The following exception was thrown during execution in test generation
    try {
      double double11 = quarterlyDouble6.getQoQ();
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
  }

  @Test
  public void test0153() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0153");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (short) 100, (int) (byte) -1);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0154() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0154");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    java.lang.String str6 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
    java.lang.Class<?> wildcardClass8 = companyData1.getClass();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList7);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test0155() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0155");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", 0, 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0156() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0156");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000", (int) (short) 100, 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0157() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0157");
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
    double double15 = quarterlyDouble6.get((int) (short) 0);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1100.0d + "'", double11 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1100.0d + "'", double12 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
  }

  @Test
  public void test0158() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0158");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    java.lang.String str9 = quarterlyDouble6.toString();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str11 = quarterlyDouble6.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
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
  }

  @Test
  public void test0159() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0159");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) ' ', 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, (int) '4', (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList2);
    java.lang.Class<?> wildcardClass7 = manyCompanyDataList6.getClass();
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList5);
    org.junit.Assert.assertNotNull(manyCompanyDataList6);
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test0160() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0160");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 0, 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0161() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0161");
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
    double double13 = quarterlyDouble8.get2QTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
  }

  @Test
  public void test0162() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0162");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (short) 0,
          (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0163() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0163");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 1, 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0164() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0164");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(0, 100);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0165() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0165");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(1, 0);
  }

  @Test
  public void test0166() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0166");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (short) 10,
          (int) '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0168() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0168");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) -1, 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (short) 1, 0);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test0169() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0169");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (byte) 100, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0170() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0170");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(100, 0);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0171() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0171");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) -1,
        (int) 'a');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, 100, (int) (byte) 0);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
    org.junit.Assert.assertNotNull(companyDataList7);
  }

  @Test
  public void test0172() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0172");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getQseqQ();
    double double9 = quarterlyDouble7.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str11 = quarterlyDouble7.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1100.0d + "'", double8 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
  }

  @Test
  public void test0173() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0173");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (byte) 10,
          (int) (byte) 100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0174() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0174");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double[] doubleArray12 = new double[] { 1L, 100, (short) 10 };
    quarterlyDouble7.dArr = doubleArray12;
    double double15 = quarterlyDouble7.get((int) (byte) -1);
    double double18 = quarterlyDouble7.deltaQ((int) '4', (int) (short) -1);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str20 = quarterlyDouble7.fmtGrowth1Q("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
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
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
  }

  @Test
  public void test0175() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0175");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
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
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
  }

  @Test
  public void test0176() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0176");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) 'a', 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList2);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(manyCompanyDataList3);
  }

  @Test
  public void test0177() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0177");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (-1), (int) (byte) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0178() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0178");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.deltaQ((int) (short) -1, (int) (byte) 0);
    double double11 = quarterlyDouble6.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str13 = quarterlyDouble6.fmtGrowth1Q("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
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
  public void test0179() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0179");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (byte) -1,
          (int) 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0180() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0180");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str12 = quarterlyDouble6.fmtGrowth4Q("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
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
  public void test0181() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0181");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) 'a',
        (int) (short) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0182() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0182");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.get2QTtm();
    double double10 = quarterlyDouble6.get((int) (byte) 100);
    double double13 = quarterlyDouble6.deltaQ(10, 0);
    double double14 = quarterlyDouble6.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
  }

  @Test
  public void test0183() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0183");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 100, (-1));
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0184() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0184");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(1, (int) (byte) -1);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0185() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0185");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double double9 = quarterlyDouble7.get2QTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str11 = quarterlyDouble7.fmtGrowth4Q("hi!");
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
  }

  @Test
  public void test0186() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0186");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) -1, 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0187() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0187");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) '4', (int) (short) 10);
  }

  @Test
  public void test0188() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0188");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (short) 10,
          (int) '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0189() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0189");
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
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1100.0d + "'", double11 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1100.0d + "'", double12 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
  }

  @Test
  public void test0190() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0190");
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
    java.lang.Class<?> wildcardClass15 = quarterlyDouble8.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str12,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test0191() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0191");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.deltaQ((int) '#', (int) (short) 100);
    double double11 = quarterlyDouble6.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      double double14 = quarterlyDouble6.deltaQ((int) (byte) -1, (int) (short) 10);
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
  }

  @Test
  public void test0192() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0192");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double9 = quarterlyDouble6.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str11 = quarterlyDouble6.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
  }

  @Test
  public void test0193() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0193");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 1,
        (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (short) 10, (int) (short) 100);
    java.lang.Class<?> wildcardClass8 = companyDataList7.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
    org.junit.Assert.assertNotNull(companyDataList7);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test0194() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0194");
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
      double double40 = quarterlyDouble6.getQoQ();
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
  public void test0195() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0195");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 1, (int) (short) 1);
  }

  @Test
  public void test0196() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0196");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str20 = quarterlyDouble18.fmtGrowth4Q("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
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
  }

  @Test
  public void test0197() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0197");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000", (int) (byte) 0, (int) '#');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0198() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0198");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.getQseqQ();
    double double12 = quarterlyDouble6.getQseqQ();
    java.lang.Class<?> wildcardClass13 = quarterlyDouble6.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1100.0d + "'", double11 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1100.0d + "'", double12 == 1100.0d);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test0199() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0199");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getQseqQ();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double11 = quarterlyDouble7.get((int) ' ');
    double double12 = quarterlyDouble7.getTtmAvg();
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
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1100.0d + "'", double8 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
  }

  @Test
  public void test0200() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0200");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) ' ', 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test0201() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0201");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    java.lang.Class<?> wildcardClass10 = quarterlyDouble6.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0202() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0202");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (short) 10, 1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0203() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0203");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) ' ', (int) 'a');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (byte) -1, 0);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test0204() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0204");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    java.lang.String str9 = quarterlyDouble6.toString();
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
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str9,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test0205() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0205");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(10, (int) ' ');
  }

  @Test
  public void test0206() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0206");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double[] doubleArray12 = new double[] { 1L, 100, (short) 10 };
    quarterlyDouble7.dArr = doubleArray12;
    double double15 = quarterlyDouble7.get((int) (byte) -1);
    double double18 = quarterlyDouble7.deltaQ((int) '4', (int) (short) -1);
    double double20 = quarterlyDouble7.get((int) '#');
    // The following exception was thrown during execution in test generation
    try {
      double double23 = quarterlyDouble7.deltaQ((int) (short) 1, (int) 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
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
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-9999.9999d) + "'", double20 == (-9999.9999d));
  }

  @Test
  public void test0207() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0207");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 1,
        (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
  }

  @Test
  public void test0208() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0208");
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
    double double13 = quarterlyDouble12.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1100.0d + "'", double13 == 1100.0d);
  }

  @Test
  public void test0209() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0209");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) '4', (int) ' ');
    java.lang.Class<?> wildcardClass4 = strList3.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test0210() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0210");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 100, (int) (byte) 1);
  }

  @Test
  public void test0211() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0211");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.deltaQ((int) (short) 100, (int) '#');
    double double13 = quarterlyDouble6.get(0);
    double double14 = quarterlyDouble6.getTtm();
    java.lang.Class<?> wildcardClass15 = quarterlyDouble6.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test0212() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0212");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (-1), 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0213() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0213");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) '4', (int) ' ');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
    org.junit.Assert.assertNotNull(manyCompanyDataList5);
  }

  @Test
  public void test0214() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0214");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.lang.String str5 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData9 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList6, (int) (byte) 10, 10);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList6);
    org.junit.Assert.assertNull(fieldData9);
  }

  @Test
  public void test0215() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0215");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 100, 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0216() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0216");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double9 = quarterlyDouble6.getMostRecent();
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
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
  }

  @Test
  public void test0217() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0217");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 100,
        (int) '4');
    java.lang.Class<?> wildcardClass4 = strList3.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test0218() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0218");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getTtmAvg();
    double double10 = quarterlyDouble6.get2QTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
  }

  @Test
  public void test0219() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0219");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) -1, (int) (byte) 1);
  }

  @Test
  public void test0220() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0220");
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
      java.lang.String str19 = quarterlyDouble8.fmtGrowth1Q("");
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
  public void test0221() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0221");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", 0,
        (int) 'a');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0222() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0222");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (short) 10,
          (int) (byte) 1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0223() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0223");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.lang.String str3 = companyData1.getTicker();
    java.lang.String str4 = companyData1.getTicker();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
  }

  @Test
  public void test0224() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0224");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((-1), 0);
  }

  @Test
  public void test0225() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0225");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) ' ',
          (int) (short) 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0226() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0226");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000", 100, (int) (short) 100);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0227() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0227");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getTtmAvg();
    java.lang.Class<?> wildcardClass10 = quarterlyDouble6.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0228() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0228");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 0, (int) (short) 100);
  }

  @Test
  public void test0229() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0229");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double10 = quarterlyDouble7.deltaQ((int) (byte) 1, (int) (short) 0);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
  }

  @Test
  public void test0230() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0230");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) '#',
        (int) (short) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0231() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0231");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) -1, (int) 'a');
  }

  @Test
  public void test0232() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0232");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(1, (int) 'a');
  }

  @Test
  public void test0233() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0233");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.deltaQ((int) (short) -1, (int) (byte) 0);
    // The following exception was thrown during execution in test generation
    try {
      double double11 = quarterlyDouble6.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
  }

  @Test
  public void test0234() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0234");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double double9 = quarterlyDouble7.get2QTtm();
    double double11 = quarterlyDouble7.get((int) (byte) -1);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
  }

  @Test
  public void test0235() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0235");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) 0, 0);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0236() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0236");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) (short) 0, (int) '#');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0237() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0237");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(1, 100);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0238() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0238");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 0, (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
  }

  @Test
  public void test0239() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0239");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 1, (int) (byte) -1);
  }

  @Test
  public void test0240() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0240");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(1, 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList2);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(manyCompanyDataList3);
  }

  @Test
  public void test0241() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0241");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) 'a', (int) '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0242() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0242");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double[] doubleArray12 = new double[] { 1L, 100, (short) 10 };
    quarterlyDouble7.dArr = doubleArray12;
    double double15 = quarterlyDouble7.get((int) (byte) -1);
    double double18 = quarterlyDouble7.deltaQ((int) '4', (int) (short) -1);
    double double19 = quarterlyDouble7.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 100.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9999.9999d) + "'", double15 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
  }

  @Test
  public void test0243() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0243");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str16 = quarterlyDouble8.fmtGrowth4Q("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
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
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
  }

  @Test
  public void test0244() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0244");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) '#', (-1));
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0245() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0245");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (-1), (int) (byte) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0246() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0246");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(0, (int) (short) -1);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0247() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0247");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData6 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList3, (int) (byte) 10, (int) (byte) -1);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData9 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList3, (int) (short) 0, 0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData12 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList3, 0, 10);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNull(fieldData6);
    org.junit.Assert.assertNull(fieldData9);
    org.junit.Assert.assertNull(fieldData12);
  }

  @Test
  public void test0248() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0248");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double9 = quarterlyDouble8.getPrevTtm();
    double double10 = quarterlyDouble8.getTtm();
    double double11 = quarterlyDouble8.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1100.0d + "'", double11 == 1100.0d);
  }

  @Test
  public void test0249() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0249");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
    java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1,
        fieldDataArray0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) '#', 100);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (short) -1, 0);
    org.junit.Assert.assertNotNull(fieldDataArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNull(fieldData5);
    org.junit.Assert.assertNull(fieldData8);
  }

  @Test
  public void test0250() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0250");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.getQseqQ();
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
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1100.0d + "'", double11 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
  }

  @Test
  public void test0251() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0251");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double[] doubleArray12 = new double[] { 1L, 100, (short) 10 };
    quarterlyDouble7.dArr = doubleArray12;
    double double15 = quarterlyDouble7.get((int) (byte) -1);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str17 = quarterlyDouble7.fmtGrowth1Q("hi!");
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
  }

  @Test
  public void test0252() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0252");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 100,
        (int) (byte) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0253() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0253");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) '4',
        (int) (short) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0254() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0254");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 0,
        (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0255() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0255");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(10, (int) (byte) 0);
  }

  @Test
  public void test0256() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0256");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (byte) 1, (int) (byte) 100);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0257() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0257");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) 'a', 0);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0258() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0258");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (byte) 100, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0259() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0259");
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
      double double14 = quarterlyDouble6.getQoQ();
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
  public void test0260() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0260");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) ' ', (-1));
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0261() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0261");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) -1,
        (int) (byte) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0262() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0262");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double10 = quarterlyDouble6.get((int) (short) 1);
    double double11 = quarterlyDouble6.getPrevTtm();
    java.lang.String str12 = quarterlyDouble6.toString();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str12,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test0263() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0263");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double double10 = quarterlyDouble7.get((int) (byte) -1);
    java.lang.String str11 = quarterlyDouble7.toString();
    double double14 = quarterlyDouble7.deltaQ(1, 0);
    // The following exception was thrown during execution in test generation
    try {
      double double15 = quarterlyDouble7.getQoQ();
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
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
  }

  @Test
  public void test0264() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0264");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) 'a', (-1));
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0265() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0265");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) ' ',
          (int) (short) -1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0266() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0266");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(100, (-1));
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0267() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0267");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(1, (int) (short) 100);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0268() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0268");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    java.lang.String str8 = quarterlyDouble6.toString();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test0269() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0269");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray9 = quarterlyDouble8.dArr;
    java.lang.String str10 = quarterlyDouble8.toString();
    double double12 = quarterlyDouble8.get((int) (short) 1);
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
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str10,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
  }

  @Test
  public void test0270() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0270");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList5);
  }

  @Test
  public void test0271() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0271");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 100, (-1));
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
    org.junit.Assert.assertNotNull(manyCompanyDataList5);
  }

  @Test
  public void test0272() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0272");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) ' ', (int) ' ');
  }

  @Test
  public void test0273() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0273");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getQseqQ();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double11 = quarterlyDouble7.get((int) ' ');
    double double12 = quarterlyDouble7.getTtm();
    double double14 = quarterlyDouble7.get((int) (short) -1);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1100.0d + "'", double8 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
  }

  @Test
  public void test0274() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0274");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getPrevTtm();
    double double11 = quarterlyDouble6.getPrevTtm();
    double double12 = quarterlyDouble6.getMostRecent();
    double double13 = quarterlyDouble6.get2QTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
  }

  @Test
  public void test0275() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0275");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", 1,
        (int) (short) 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0276() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0276");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(0, (int) (short) 10);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0277() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0277");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double9 = quarterlyDouble8.getPrevTtm();
    double double10 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.toString();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str11,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test0278() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0278");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(0, (int) '4');
  }

  @Test
  public void test0279() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0279");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) 'a', (int) '4');
  }

  @Test
  public void test0280() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0280");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 100, (-1));
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test0281() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0281");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) '4', (int) 'a');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, (int) (short) 1, (int) (byte) -1);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList5);
  }

  @Test
  public void test0282() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0282");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 0, (int) 'a');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0283() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0283");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData6 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList3, (int) (byte) 10, (int) (byte) -1);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData9 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList3, (int) (short) 0, 0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData12 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList3, (int) (short) -1, (int) (short) 1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNull(fieldData6);
    org.junit.Assert.assertNull(fieldData9);
    org.junit.Assert.assertNull(fieldData12);
  }

  @Test
  public void test0284() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0284");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double10 = quarterlyDouble8.get((int) (byte) -1);
    double double11 = quarterlyDouble8.get2QTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str13 = quarterlyDouble8.fmtGrowth4Q("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
  }

  @Test
  public void test0285() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0285");
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
    // The following exception was thrown during execution in test generation
    try {
      double double21 = quarterlyDouble6.getQoQ();
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
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
  }

  @Test
  public void test0286() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0286");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) '4', (int) ' ');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    java.lang.Class<?> wildcardClass5 = strList3.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test0287() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0287");
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
    double double41 = quarterlyDouble8.getPrevTtm();
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
    org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
    org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
  }

  @Test
  public void test0288() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0288");
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
    // The following exception was thrown during execution in test generation
    try {
      double double12 = quarterlyDouble11.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0289() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0289");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.get2QTtm();
    java.lang.Class<?> wildcardClass11 = quarterlyDouble6.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test0290() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0290");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) ' ', (int) '#');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0291() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0291");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (byte) 100,
          (int) (short) 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0292() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0292");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double double10 = quarterlyDouble7.get((int) (byte) -1);
    java.lang.String str11 = quarterlyDouble7.toString();
    double double12 = quarterlyDouble7.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str11,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
  }

  @Test
  public void test0293() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0293");
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
    double double13 = quarterlyDouble8.getPrevTtm();
    double double14 = quarterlyDouble8.get2QTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
  }

  @Test
  public void test0294() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0294");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.deltaQ((int) (short) -1, (int) (byte) 0);
    double double11 = quarterlyDouble6.getTtm();
    double double12 = quarterlyDouble6.get2QTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
  }

  @Test
  public void test0295() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0295");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getPrevTtm();
    double[] doubleArray11 = quarterlyDouble6.dArr;
    java.lang.String str12 = quarterlyDouble6.toString();
    double[] doubleArray13 = quarterlyDouble6.dArr;
    java.lang.Class<?> wildcardClass14 = doubleArray13.getClass();
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
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test0296() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0296");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (short) 100,
        (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0297() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0297");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 10, 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    java.lang.Class<?> wildcardClass5 = companyDataList4.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test0298() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0298");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double9 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
  }

  @Test
  public void test0299() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0299");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) -1, (int) (byte) 100);
  }

  @Test
  public void test0300() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0300");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.deltaQ((int) (short) 100, (int) '#');
    double double12 = quarterlyDouble6.getTtm();
    double double13 = quarterlyDouble6.get2QTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
  }

  @Test
  public void test0301() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0301");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double10 = quarterlyDouble6.get((int) (short) 1);
    double double11 = quarterlyDouble6.getPrevTtm();
    double double14 = quarterlyDouble6.deltaQ((int) (short) 100, (int) (short) 1);
    double double15 = quarterlyDouble6.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
  }

  @Test
  public void test0302() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0302");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(0, (int) '4');
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0303() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0303");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) -1,
        (int) (byte) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0304() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0304");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(10, (int) 'a');
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0305() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0305");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) -1, 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0306() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0306");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) -1, (int) '4');
  }

  @Test
  public void test0307() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0307");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, 100, (int) (short) 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0308() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0308");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    java.lang.String str6 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
    java.lang.String str9 = companyData1.getTicker();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList7);
    org.junit.Assert.assertNotNull(fieldDataList8);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
  }

  @Test
  public void test0309() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0309");
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
    double double16 = quarterlyDouble7.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str11,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1100.0d + "'", double16 == 1100.0d);
  }

  @Test
  public void test0310() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0310");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double10 = quarterlyDouble6.get((int) (short) 1);
    double double11 = quarterlyDouble6.getPrevTtm();
    double double12 = quarterlyDouble6.getQseqQ();
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
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1100.0d + "'", double12 == 1100.0d);
  }

  @Test
  public void test0311() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0311");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) -1,
        (int) '#');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0312() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0312");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (short) 1, (int) (byte) 10);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0313() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0313");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (short) 10,
          (int) 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0314() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0314");
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
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray22);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
  }

  @Test
  public void test0315() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0315");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) '#',
        (int) (byte) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0316() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0316");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.getQseqQ();
    double double12 = quarterlyDouble6.getPrevTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str14 = quarterlyDouble6.fmtGrowth4Q("");
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
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
  }

  @Test
  public void test0317() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0317");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str15 = quarterlyDouble8.fmtGrowth1Q("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
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
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
  }

  @Test
  public void test0318() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0318");
    java.util.List<java.lang.String> strList0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
          .getCompanies(strList0, (int) (byte) -1, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0319() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0319");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (short) 100, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0320() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0320");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 100, 0);
  }

  @Test
  public void test0321() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0321");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData6 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList3, (int) (byte) 10, (int) (byte) -1);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData9 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList3, (int) (short) 0, 0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData12 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList3, 0, (int) (short) 100);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNull(fieldData6);
    org.junit.Assert.assertNull(fieldData9);
    org.junit.Assert.assertNull(fieldData12);
  }

  @Test
  public void test0322() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0322");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) -1,
        (int) (byte) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0323() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0323");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) '4',
          (int) (short) 1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0324() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0324");
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
    java.lang.Class<?> wildcardClass18 = fieldDataList5.getClass();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertNull(fieldData8);
    org.junit.Assert.assertNull(fieldData11);
    org.junit.Assert.assertNull(fieldData14);
    org.junit.Assert.assertNull(fieldData17);
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test0325() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0325");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (short) 0,
          (int) '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0326() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0326");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 0,
        (int) (short) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0327() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0327");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList0 = null;
    // The following exception was thrown during execution in test generation
    try {
      net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
          .getFieldData(fieldDataList0, (int) (short) 1, (int) '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0328() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0328");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) -1, (int) '4');
  }

  @Test
  public void test0329() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0329");
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
    double double18 = quarterlyDouble6.get2QTtm();
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
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
  }

  @Test
  public void test0330() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0330");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    java.lang.String str6 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = companyData1.getFdList();
    java.lang.Class<?> wildcardClass10 = companyData1.getClass();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList7);
    org.junit.Assert.assertNotNull(fieldDataList8);
    org.junit.Assert.assertNotNull(fieldDataList9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0331() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0331");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtm();
    double[] doubleArray8 = quarterlyDouble6.dArr;
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
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    org.junit.Assert.assertNotNull(doubleArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0332() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0332");
    double[] doubleArray0 = new double[] {};
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray0);
    java.lang.String str2 = quarterlyDouble1.toString();
    org.junit.Assert.assertNotNull(doubleArray0);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
  }

  @Test
  public void test0333() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0333");
    java.util.List<java.lang.String> strList0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
          .getCompanies(strList0, (int) (short) -1, (int) (short) 1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0334() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0334");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) 'a',
          (int) (byte) 10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0335() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0335");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 0, (int) (short) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0336() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0336");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.deltaQ((int) (short) 100, (int) '#');
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
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
  }

  @Test
  public void test0337() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0337");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) (short) 100, 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0338() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0338");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double double10 = quarterlyDouble6.get2QTtm();
    double double11 = quarterlyDouble6.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1100.0d + "'", double11 == 1100.0d);
  }

  @Test
  public void test0339() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0339");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
    java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1,
        fieldDataArray0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) '#', 100);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (byte) -1, 1);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, 1, 100);
    org.junit.Assert.assertNotNull(fieldDataArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNull(fieldData5);
    org.junit.Assert.assertNull(fieldData8);
    org.junit.Assert.assertNull(fieldData11);
  }

  @Test
  public void test0340() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0340");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 10, 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0342() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0342");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000", (int) (short) 100, (int) (byte) 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0343() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0343");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getPrevTtm();
    double double11 = quarterlyDouble6.getPrevTtm();
    double double12 = quarterlyDouble6.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str14 = quarterlyDouble6.fmtGrowth4Q("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
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
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
  }

  @Test
  public void test0344() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0344");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double10 = quarterlyDouble8.get((int) (byte) -1);
    double double11 = quarterlyDouble8.get2QTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str13 = quarterlyDouble8.fmtGrowth1Q("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
  }

  @Test
  public void test0345() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0345");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    java.lang.String str6 = companyData1.getTicker();
    java.lang.String str7 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = companyData1.getFdList();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList8);
    org.junit.Assert.assertNotNull(fieldDataList9);
    org.junit.Assert.assertNotNull(fieldDataList10);
  }

  @Test
  public void test0346() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0346");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) 1, (int) '4');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0347() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0347");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) ' ',
          (int) (short) 1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0348() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0348");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.get2QTtm();
    double double10 = quarterlyDouble6.get((int) (byte) 100);
    double double13 = quarterlyDouble6.deltaQ(10, 0);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str15 = quarterlyDouble6.fmtGrowth1Q("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
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
  public void test0349() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0349");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) -1,
        (int) 'a');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, 100, (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList10 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, 100, (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList13 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (byte) 0, (int) (short) 100);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(companyDataList7);
    org.junit.Assert.assertNotNull(companyDataList10);
    org.junit.Assert.assertNotNull(companyDataList13);
  }

  @Test
  public void test0350() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0350");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, 0, (int) (byte) -1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0351() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0351");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(10, (int) ' ');
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0352() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0352");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getPrevTtm();
    double double10 = quarterlyDouble6.deltaQ(1, 1);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
  }

  @Test
  public void test0353() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0353");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) 0,
        (int) (short) 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test0354() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0354");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getPrevTtm();
    double double11 = quarterlyDouble6.getPrevTtm();
    double double12 = quarterlyDouble6.getMostRecent();
    double double13 = quarterlyDouble6.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
  }

  @Test
  public void test0355() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0355");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(0, (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0356() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0356");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(10, (int) (byte) 100);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0357() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0357");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) (short) 10, (int) (short) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0358() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0358");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) '#', (-1));
    java.lang.Class<?> wildcardClass4 = strList3.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test0359() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0359");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) -1,
        (int) 'a');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    java.lang.Class<?> wildcardClass5 = manyCompanyDataList4.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test0360() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0360");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) ' ', (int) ' ');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0361() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0361");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.deltaQ((int) (short) -1, (int) (byte) 0);
    double double11 = quarterlyDouble6.getTtm();
    double double12 = quarterlyDouble6.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      double double15 = quarterlyDouble6.deltaQ(0, (int) (byte) 10);
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
  }

  @Test
  public void test0362() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0362");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) ' ', (int) (byte) 1);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0363() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0363");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) 'a', (int) ' ');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0364() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0364");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 0,
        (int) (short) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0365() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0365");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) 'a',
          (int) (byte) -1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0366() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0366");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) (short) 10, 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0367() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0367");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000", (int) ' ', (-1));
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0368() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0368");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) 10, 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0369() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0369");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    java.lang.String str6 = companyData1.getTicker();
    java.lang.String str7 = companyData1.getTicker();
    java.lang.String str8 = companyData1.getTicker();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
  }

  @Test
  public void test0370() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0370");
    double[] doubleArray0 = new double[] {};
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray0);
    // The following exception was thrown during execution in test generation
    try {
      double double2 = quarterlyDouble1.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray0);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
  }

  @Test
  public void test0371() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0371");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) 'a', (int) (short) 10);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0372() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0372");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) ' ', (int) (short) 10);
  }

  @Test
  public void test0373() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0373");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray10 = new double[] { 0.0d, 0 };
    quarterlyDouble7.dArr = doubleArray10;
    double double12 = quarterlyDouble7.getPrevTtm();
    double[] doubleArray18 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    java.lang.String str21 = quarterlyDouble20.toString();
    double[] doubleArray25 = new double[] { 1L, 100, (short) 10 };
    quarterlyDouble20.dArr = doubleArray25;
    quarterlyDouble7.dArr = doubleArray25;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str29 = quarterlyDouble7.fmtGrowth4Q("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str21,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 100.0, 10.0]");
  }

  @Test
  public void test0374() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0374");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) ' ',
        (int) (short) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test0375() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0375");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtm();
    double double8 = quarterlyDouble6.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
  }

  @Test
  public void test0376() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0376");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (byte) 1,
          (int) '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0377() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0377");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) 'a', (int) '4');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0378() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0378");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 0, (int) (short) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0379() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0379");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 10, 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test0380() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0380");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
    java.lang.String str8 = companyData1.getTicker();
    java.lang.Class<?> wildcardClass9 = companyData1.getClass();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertNotNull(fieldDataList6);
    org.junit.Assert.assertNotNull(fieldDataList7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test0381() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0381");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 10,
        (int) (byte) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0382() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0382");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double9 = quarterlyDouble6.getQseqQ();
    double double12 = quarterlyDouble6.deltaQ((int) (byte) 1, 0);
    java.lang.Class<?> wildcardClass13 = quarterlyDouble6.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test0383() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0383");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (short) -1,
          (int) '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0384() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0384");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(100, (int) '#');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0385() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0385");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(1, (int) (byte) 1);
  }

  @Test
  public void test0386() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0386");
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
    java.lang.Class<?> wildcardClass17 = doubleArray16.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test0387() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0387");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.get2QTtm();
    java.lang.String str9 = quarterlyDouble6.toString();
    double double10 = quarterlyDouble6.getPrevTtm();
    // The following exception was thrown during execution in test generation
    try {
      double double11 = quarterlyDouble6.getQoQ();
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
  }

  @Test
  public void test0388() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0388");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 0,
        (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
    org.junit.Assert.assertNotNull(companyDataList5);
  }

  @Test
  public void test0389() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0389");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 1, (int) (byte) 1);
  }

  @Test
  public void test0390() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0390");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 1,
        (int) '4');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0391() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0391");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getQseqQ();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.getQseqQ();
    java.lang.String str11 = quarterlyDouble7.toString();
    double[] doubleArray17 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    double double22 = quarterlyDouble20.get((int) (byte) -1);
    double double23 = quarterlyDouble20.get2QTtm();
    java.lang.String str24 = quarterlyDouble20.toString();
    double double26 = quarterlyDouble20.get((-1));
    double double27 = quarterlyDouble20.getTtmAvg();
    double double29 = quarterlyDouble20.get((int) (short) 1);
    double[] doubleArray30 = quarterlyDouble20.dArr;
    quarterlyDouble7.dArr = doubleArray30;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1100.0d + "'", double8 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1100.0d + "'", double10 == 1100.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str11,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-9999.9999d) + "'", double22 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str24,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-9999.9999d) + "'", double26 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
    org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray30);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0392() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0392");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getTtmAvg();
    double double10 = quarterlyDouble6.getTtmAvg();
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
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
  }

  @Test
  public void test0393() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0393");
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
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
  }

  @Test
  public void test0394() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0394");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (byte) -1, 1);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0395() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0395");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str54 = quarterlyDouble52.fmtGrowth1Q("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
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
  }

  @Test
  public void test0396() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0396");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) (short) -1, 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0397() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0397");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) -1,
        (int) 'a');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) 'a', (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList10 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (-1), (int) (short) 10);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
    org.junit.Assert.assertNotNull(companyDataList7);
    org.junit.Assert.assertNotNull(companyDataList10);
  }

  @Test
  public void test0398() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0398");
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
        .getFieldData(fieldDataList5, (int) (byte) 1, (int) (short) 0);
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
  public void test0399() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0399");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray9 = quarterlyDouble8.dArr;
    double double11 = quarterlyDouble8.get((-1));
    double double12 = quarterlyDouble8.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
  }

  @Test
  public void test0400() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0400");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(10, (int) (short) 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, (int) (short) 10, 1);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList5);
  }

  @Test
  public void test0402() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0402");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 0,
        (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (byte) 10, (int) (short) -1);
    java.lang.Class<?> wildcardClass7 = companyDataList6.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test0403() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0403");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray9 = quarterlyDouble8.dArr;
    java.lang.String str10 = quarterlyDouble8.toString();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str12 = quarterlyDouble8.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str10,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test0404() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0404");
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
      java.lang.String str17 = quarterlyDouble6.fmtGrowth1Q("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
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
  public void test0405() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0405");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 10, (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test0406() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0406");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 100, 0);
    java.lang.Class<?> wildcardClass4 = strList3.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test0407() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0407");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double9 = quarterlyDouble6.getQseqQ();
    double double12 = quarterlyDouble6.deltaQ((int) (byte) 1, 0);
    java.lang.String str13 = quarterlyDouble6.toString();
    double double14 = quarterlyDouble6.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str13,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
  }

  @Test
  public void test0408() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0408");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.getMostRecent();
    double[] doubleArray12 = quarterlyDouble6.dArr;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0409() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0409");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (byte) 1,
          (int) (byte) 10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0410() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0410");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (byte) 10,
          (int) ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0411() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0411");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.get2QTtm();
    java.lang.String str9 = quarterlyDouble6.toString();
    double[] doubleArray10 = quarterlyDouble6.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
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
  public void test0412() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0412");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (short) 1,
        (int) (byte) 100);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0413() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0413");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) '#', (int) (byte) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList2);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(manyCompanyDataList3);
  }

  @Test
  public void test0414() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0414");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) '#', 10);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0415() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0415");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) 1,
        (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (short) 10, (int) (short) 100);
    java.lang.Class<?> wildcardClass7 = companyDataList6.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test0416() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0416");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 1, 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
  }

  @Test
  public void test0417() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0417");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.getQseqQ();
    double double12 = quarterlyDouble6.getPrevTtm();
    java.lang.String str13 = quarterlyDouble6.toString();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1100.0d + "'", double11 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str13,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test0418() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0418");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList5, (int) (byte) 100, 1);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList5, (int) (short) 1, (int) '#');
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertNull(fieldData8);
    org.junit.Assert.assertNull(fieldData11);
  }

  @Test
  public void test0419() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0419");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getQseqQ();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.getQseqQ();
    java.lang.String str11 = quarterlyDouble7.toString();
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
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1100.0d + "'", double10 == 1100.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str11,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test0420() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0420");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) '#', (-1));
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0421() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0421");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double10 = quarterlyDouble6.get(1);
    java.lang.String str11 = quarterlyDouble6.toString();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str11,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test0422() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0422");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) 1, (-1));
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
    org.junit.Assert.assertNotNull(manyCompanyDataList5);
  }

  @Test
  public void test0423() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0423");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (byte) 1, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0425() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0425");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 100, 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0426() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0426");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) 10, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
  }

  @Test
  public void test0427() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0427");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) '4', 0);
  }

  @Test
  public void test0428() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0428");
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
    double double49 = quarterlyDouble6.deltaQ((int) '#', (int) (short) 10);
    java.lang.String str50 = quarterlyDouble6.toString();
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
    org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
    org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str50,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test0429() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0429");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getPrevTtm();
    double double11 = quarterlyDouble6.getPrevTtm();
    double double12 = quarterlyDouble6.getMostRecent();
    double double14 = quarterlyDouble6.get((int) (short) -1);
    double double15 = quarterlyDouble6.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
  }

  @Test
  public void test0430() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0430");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000", (int) (short) -1, (int) (short) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0431() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0431");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 1, 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test0432() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0432");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (-1), (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test0433() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0433");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.deltaQ((int) (short) 100, (int) '#');
    double double13 = quarterlyDouble6.get(0);
    double double14 = quarterlyDouble6.getQseqQ();
    double[] doubleArray15 = quarterlyDouble6.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    double[] doubleArray17 = null;
    quarterlyDouble16.dArr = doubleArray17;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1100.0d + "'", double14 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0434() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0434");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000", 0, (int) (byte) 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0435() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0435");
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
        .getFieldData(fieldDataList5, (int) 'a', (int) '#');
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertNull(fieldData8);
    org.junit.Assert.assertNull(fieldData11);
    org.junit.Assert.assertNull(fieldData14);
    org.junit.Assert.assertNull(fieldData17);
  }

  @Test
  public void test0436() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0436");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double double10 = quarterlyDouble7.get((int) (byte) -1);
    java.lang.String str11 = quarterlyDouble7.toString();
    double double14 = quarterlyDouble7.deltaQ(1, 0);
    double double15 = quarterlyDouble7.getPrevTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str11,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
  }

  @Test
  public void test0437() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0437");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (short) -1,
          (int) (byte) 100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0438() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0438");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray10 = new double[] { 0.0d, 0 };
    quarterlyDouble7.dArr = doubleArray10;
    double double12 = quarterlyDouble7.getPrevTtm();
    double double13 = quarterlyDouble7.getPrevTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
  }

  @Test
  public void test0439() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0439");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList2, 1, (int) '4');
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass6 = fieldData5.getClass();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNull(fieldData5);
  }

  @Test
  public void test0440() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0440");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str11 = quarterlyDouble6.fmtGrowth4Q("hi!");
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
  public void test0441() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0441");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 0,
        (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (byte) 1, (int) ' ');
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
    org.junit.Assert.assertNotNull(companyDataList5);
    org.junit.Assert.assertNotNull(companyDataList8);
  }

  @Test
  public void test0442() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0442");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) ' ', (int) ' ');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0443() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0443");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 10, 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0444() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0444");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double double12 = quarterlyDouble6.deltaQ((int) '4', (int) (byte) 100);
    double double13 = quarterlyDouble6.getQseqQ();
    java.lang.String str14 = quarterlyDouble6.toString();
    java.lang.Class<?> wildcardClass15 = quarterlyDouble6.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1100.0d + "'", double13 == 1100.0d);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str14,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test0445() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0445");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 1,
        (int) (byte) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0446() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0446");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 0, (int) (byte) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0447() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0447");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 10, 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0448() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0448");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(0, (int) (byte) 0);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0449() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0449");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray9 = quarterlyDouble8.dArr;
    java.lang.String str10 = quarterlyDouble8.toString();
    double double12 = quarterlyDouble8.get((int) (short) 1);
    double[] doubleArray13 = quarterlyDouble8.dArr;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str10,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0450() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0450");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double[] doubleArray12 = new double[] { 1L, 100, (short) 10 };
    quarterlyDouble7.dArr = doubleArray12;
    double double15 = quarterlyDouble7.get((int) (byte) -1);
    double double16 = quarterlyDouble7.get2QTtm();
    double double17 = quarterlyDouble7.getTtm();
    double double18 = quarterlyDouble7.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 100.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9999.9999d) + "'", double15 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 900.0d + "'", double18 == 900.0d);
  }

  @Test
  public void test0451() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0451");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000", (int) (short) 10, (int) '#');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0452() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0452");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.deltaQ((int) (short) 100, (int) '#');
    double double13 = quarterlyDouble6.get(0);
    double double14 = quarterlyDouble6.getQseqQ();
    double[] doubleArray15 = quarterlyDouble6.dArr;
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
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1100.0d + "'", double14 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0453() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0453");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", 1,
        (int) (byte) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0454() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0454");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 0, (int) '#');
  }

  @Test
  public void test0455() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0455");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double[] doubleArray9 = quarterlyDouble7.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    double double11 = quarterlyDouble10.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
  }

  @Test
  public void test0456() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0456");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) -1,
        (int) (byte) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0457() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0457");
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
    double double29 = quarterlyDouble6.deltaQ((int) '#', (int) (short) -1);
    double[] doubleArray35 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray35);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray35);
    double double38 = quarterlyDouble37.getQseqQ();
    double[] doubleArray44 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble45 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray44);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble46 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray44);
    java.lang.String str47 = quarterlyDouble46.toString();
    double[] doubleArray51 = new double[] { 1L, 100, (short) 10 };
    quarterlyDouble46.dArr = doubleArray51;
    quarterlyDouble37.dArr = doubleArray51;
    quarterlyDouble6.dArr = doubleArray51;
    double double56 = quarterlyDouble6.get((int) 'a');
    double double57 = quarterlyDouble6.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray22);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray35);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1100.0d + "'", double38 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray44);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str47,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray51);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0, 100.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-9999.9999d) + "'", double56 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double57 + "' != '" + 900.0d + "'", double57 == 900.0d);
  }

  @Test
  public void test0458() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0458");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(100, (int) 'a');
    java.lang.Class<?> wildcardClass3 = companySummaryList2.getClass();
    org.junit.Assert.assertNotNull(companySummaryList2);
    org.junit.Assert.assertNotNull(wildcardClass3);
  }

  @Test
  public void test0459() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0459");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (byte) 10, (-1));
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0460() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0460");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(10, (int) (byte) 1);
    java.lang.Class<?> wildcardClass3 = companySummaryList2.getClass();
    org.junit.Assert.assertNotNull(companySummaryList2);
    org.junit.Assert.assertNotNull(wildcardClass3);
  }

  @Test
  public void test0461() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0461");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (short) 100, (int) (byte) 0);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0462() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0462");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) 'a',
        (int) (short) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0463() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0463");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) '#', (int) (short) 0);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0464() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0464");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (-1),
        (int) (byte) 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0465() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0465");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getPrevTtm();
    double double11 = quarterlyDouble6.getPrevTtm();
    double double12 = quarterlyDouble6.getMostRecent();
    double double14 = quarterlyDouble6.get((int) (short) -1);
    double double15 = quarterlyDouble6.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1100.0d + "'", double15 == 1100.0d);
  }

  @Test
  public void test0466() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0466");
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
    double[] doubleArray15 = quarterlyDouble8.dArr;
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
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0467() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0467");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) -1,
        (int) 'a');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, 100, (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList10 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, 100, (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList11 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(companyDataList7);
    org.junit.Assert.assertNotNull(companyDataList10);
    org.junit.Assert.assertNotNull(manyCompanyDataList11);
  }

  @Test
  public void test0468() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0468");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 1, (int) 'a');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0469() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0469");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) -1, 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
    org.junit.Assert.assertNotNull(manyCompanyDataList5);
  }

  @Test
  public void test0470() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0470");
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
    java.lang.Class<?> wildcardClass17 = quarterlyDouble7.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 100.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9999.9999d) + "'", double15 == (-9999.9999d));
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000" + "'", str16,
        "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test0471() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0471");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) '#', (int) '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0472() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0472");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000", 10, 100);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0473() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0473");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (short) 100, (int) 'a');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0474() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0474");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray10 = new double[] { 0.0d, 0 };
    quarterlyDouble7.dArr = doubleArray10;
    double double12 = quarterlyDouble7.getPrevTtm();
    double[] doubleArray18 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    java.lang.String str21 = quarterlyDouble20.toString();
    double[] doubleArray25 = new double[] { 1L, 100, (short) 10 };
    quarterlyDouble20.dArr = doubleArray25;
    quarterlyDouble7.dArr = doubleArray25;
    double double30 = quarterlyDouble7.deltaQ(100, (int) (short) 100);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str32 = quarterlyDouble7.fmtGrowth1Q("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str21,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 100.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
  }

  @Test
  public void test0475() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0475");
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
    // The following exception was thrown during execution in test generation
    try {
      double double42 = quarterlyDouble6.deltaQ((int) (short) -1, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
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
  }

  @Test
  public void test0476() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0476");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 100,
        (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (short) 10, 100);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test0477() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0477");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000", (int) (byte) 10, 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0478() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0478");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (-1), (int) 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0479() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0479");
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
    double double22 = quarterlyDouble6.getQseqQ();
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
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1100.0d + "'", double22 == 1100.0d);
  }

  @Test
  public void test0480() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0480");
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
    // The following exception was thrown during execution in test generation
    try {
      double double17 = quarterlyDouble6.getQoQ();
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
  }

  @Test
  public void test0481() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0481");
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
    java.lang.String str11 = companyData1.getTicker();
    java.lang.String str12 = companyData1.getTicker();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList9);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
  }

  @Test
  public void test0482() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0482");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) -1,
        (int) (byte) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0483() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0483");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double[] doubleArray13 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    double double15 = quarterlyDouble14.getTtmAvg();
    double[] doubleArray21 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray21);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray21);
    quarterlyDouble14.dArr = doubleArray21;
    double double25 = quarterlyDouble14.getPrevTtm();
    double double26 = quarterlyDouble14.getPrevTtm();
    double[] doubleArray32 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray32);
    double double34 = quarterlyDouble33.getTtmAvg();
    double[] doubleArray40 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray40);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble42 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray40);
    quarterlyDouble33.dArr = doubleArray40;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble44 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray40);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble45 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray40);
    quarterlyDouble14.dArr = doubleArray40;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble47 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray40);
    quarterlyDouble6.dArr = doubleArray40;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray32);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray40);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test0484() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0484");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (short) 100, (int) (byte) 100);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0485() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0485");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) -1,
        (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
  }

  @Test
  public void test0486() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0486");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 0, (int) (short) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0487() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0487");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double[] doubleArray12 = new double[] { 1L, 100, (short) 10 };
    quarterlyDouble7.dArr = doubleArray12;
    double double15 = quarterlyDouble7.get((int) (byte) -1);
    double double16 = quarterlyDouble7.get2QTtm();
    double double17 = quarterlyDouble7.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 100.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9999.9999d) + "'", double15 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
  }

  @Test
  public void test0488() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0488");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 10, (int) (byte) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (byte) 0, (int) '4');
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test0489() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0489");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (-1), (int) (short) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0490() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0490");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) 1, 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0491() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0491");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getPrevTtm();
    double double11 = quarterlyDouble6.getPrevTtm();
    double double13 = quarterlyDouble6.get((int) (short) 0);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str15 = quarterlyDouble6.fmtGrowth1Q("");
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
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
  }

  @Test
  public void test0492() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0492");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) 0, 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0493() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0493");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getQseqQ();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double11 = quarterlyDouble7.get((int) ' ');
    double double12 = quarterlyDouble7.get2QTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1100.0d + "'", double8 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
  }

  @Test
  public void test0494() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0494");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 1, 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0495() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0495");
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
    double double39 = quarterlyDouble6.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str41 = quarterlyDouble6.fmtGrowth4Q("");
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
    org.junit.Assert.assertTrue("'" + double39 + "' != '" + 40.0d + "'", double39 == 40.0d);
  }

  @Test
  public void test0496() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0496");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (byte) -1, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0497() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0497");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getCompany("\t i=0 0.0000\t i=1 0.0000");
    org.junit.Assert.assertNotNull(oneCompanyDataList1);
  }

  @Test
  public void test0498() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0498");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (short) 1, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0499() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0499");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (byte) 10,
          (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0500() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0500");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 1,
        (int) (short) 100);
    org.junit.Assert.assertNotNull(strList3);
  }
}
