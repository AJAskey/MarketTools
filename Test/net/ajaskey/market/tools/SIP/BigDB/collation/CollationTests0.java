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
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", 0, 100);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0002() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0002");
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
  public void test0003() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0003");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (byte) 10,
          (int) 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0004() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0004");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) (short) -1, (int) (short) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0005() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0005");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 10,
        (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) 'a', (int) (short) 0);
    java.lang.Class<?> wildcardClass7 = strList3.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test0006() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0006");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) ' ', (int) (byte) 1);
  }

  @Test
  public void test0007() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0007");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 10,
        (int) '#');
    java.lang.Class<?> wildcardClass4 = strList3.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test0008() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0008");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getCompany("hi!");
    org.junit.Assert.assertNotNull(oneCompanyDataList1);
  }

  @Test
  public void test0009() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0009");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) '#', 1);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0010() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0010");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 100, (int) ' ');
  }

  @Test
  public void test0011() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0011");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) 1, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, (int) (short) 1, 0);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList5);
  }

  @Test
  public void test0012() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0012");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, 0, (int) (byte) 1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0013() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0013");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) -1, (int) (byte) 1);
  }

  @Test
  public void test0014() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0014");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (short) 0,
          (int) (byte) 10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0015() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0015");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 1, (-1));
  }

  @Test
  public void test0016() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0016");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) (byte) 0, (int) (short) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0017() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0017");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (byte) 100,
          (int) (short) -1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0018() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0018");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (byte) -1, (int) ' ');
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0019() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0019");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 10,
        (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) 'a', (int) (short) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList9 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, 100, (int) 'a');
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(companyDataList9);
  }

  @Test
  public void test0020() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0020");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getCompany("");
    org.junit.Assert.assertNotNull(oneCompanyDataList1);
  }

  @Test
  public void test0021() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0021");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.lang.String str4 = companyData1.getTicker();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
  }

  @Test
  public void test0022() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0022");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(1, (int) '4');
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0023() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0023");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) '4', (int) '4');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0024() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0024");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (-1),
        (int) '#');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0025() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0025");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) 0, (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList2);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(manyCompanyDataList3);
  }

  @Test
  public void test0026() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0026");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str9 = quarterlyDouble7.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0027() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0027");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 1, (int) (short) 100);
  }

  @Test
  public void test0028() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0028");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      double double11 = quarterlyDouble7.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
  }

  @Test
  public void test0029() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0029");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (byte) 0,
          (int) ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0030() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0030");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
    java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1,
        fieldDataArray0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) 'a', (int) (short) 10);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (-1), (int) 'a');
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (byte) 1, 0);
    org.junit.Assert.assertNotNull(fieldDataArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNull(fieldData5);
    org.junit.Assert.assertNull(fieldData8);
    org.junit.Assert.assertNull(fieldData11);
  }

  @Test
  public void test0031() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0031");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (byte) 100,
          100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0032() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0032");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 10,
        (int) (byte) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0033() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0033");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double9 = quarterlyDouble8.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      double double10 = quarterlyDouble8.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
  }

  @Test
  public void test0034() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0034");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", 1,
        (int) (short) 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0035() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0035");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) (short) -1, (int) (byte) 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0036() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0036");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str8 = quarterlyDouble6.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0037() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0037");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str8 = quarterlyDouble6.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
  }

  @Test
  public void test0038() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0038");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
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
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3600.0d + "'", double8 == 3600.0d);
  }

  @Test
  public void test0039() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0039");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) 100,
        (int) (byte) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0040() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0040");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 0,
        (int) 'a');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) '#', (int) (short) 10);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
    org.junit.Assert.assertNotNull(companyDataList7);
  }

  @Test
  public void test0041() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0041");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str12 = quarterlyDouble7.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
  }

  @Test
  public void test0042() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0042");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 1, 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0043() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0043");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 10,
        (int) (short) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0044() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0044");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 100, (int) ' ');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0045() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0045");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (short) 10,
          (int) (byte) -1);
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
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) 'a', (-1));
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
  }

  @Test
  public void test0047() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0047");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, 0, 1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0048() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0048");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (short) 10,
          (int) (short) 1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0049() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0049");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", 100,
        (int) (byte) 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0050() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0050");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) -1,
        (int) (short) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0051() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0051");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      double double9 = quarterlyDouble7.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3600.0d + "'", double8 == 3600.0d);
  }

  @Test
  public void test0052() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0052");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 10,
        (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (short) 1, (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList9 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
    org.junit.Assert.assertNotNull(manyCompanyDataList5);
    org.junit.Assert.assertNotNull(companyDataList8);
    org.junit.Assert.assertNotNull(manyCompanyDataList9);
  }

  @Test
  public void test0053() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0053");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) 10, (int) (byte) -1);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0054() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0054");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.getQseqQ();
    double[] doubleArray12 = new double[] { (byte) 100 };
    quarterlyDouble7.dArr = doubleArray12;
    // The following exception was thrown during execution in test generation
    try {
      double double14 = quarterlyDouble7.getQseqQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0]");
  }

  @Test
  public void test0055() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0055");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, 1, (int) 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0056() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0056");
    java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" };
    java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
    boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList((java.util.List<java.lang.String>) strList4);
    org.junit.Assert.assertNotNull(strArray3);
    org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    org.junit.Assert.assertNotNull(manyCompanyDataList6);
  }

  @Test
  public void test0057() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0057");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    // The following exception was thrown during execution in test generation
    try {
      double double9 = quarterlyDouble8.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0058() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0058");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.lang.Class<?> wildcardClass3 = companyData1.getClass();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(wildcardClass3);
  }

  @Test
  public void test0059() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0059");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (byte) 100,
          (int) '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0060() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0060");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) 1, (int) (byte) 1);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0061() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0061");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(0, (int) (byte) 1);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0062() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0062");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
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
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
  }

  @Test
  public void test0063() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0063");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) 'a', (int) ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0064() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0064");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double9 = quarterlyDouble8.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
  }

  @Test
  public void test0065() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0065");
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
  public void test0066() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0066");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 1, (int) '#');
  }

  @Test
  public void test0067() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0067");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 10,
        (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
    org.junit.Assert.assertNotNull(manyCompanyDataList5);
    org.junit.Assert.assertNotNull(manyCompanyDataList6);
  }

  @Test
  public void test0068() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0068");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 10, 0);
  }

  @Test
  public void test0069() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0069");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((-1), (int) (byte) -1);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0070() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0070");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double double9 = quarterlyDouble6.get(0);
    // The following exception was thrown during execution in test generation
    try {
      double double10 = quarterlyDouble6.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
  }

  @Test
  public void test0071() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0071");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray8 = quarterlyDouble7.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str10 = quarterlyDouble7.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0072() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0072");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str8 = quarterlyDouble6.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0073() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0073");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getCompany("\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(oneCompanyDataList1);
  }

  @Test
  public void test0074() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0074");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) (short) 10, (int) 'a');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0075() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0075");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (short) 10, 100);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0076() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0076");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (short) 0, (int) 'a');
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0077() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0077");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double[] doubleArray17 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    quarterlyDouble7.dArr = doubleArray17;
    // The following exception was thrown during execution in test generation
    try {
      double double24 = quarterlyDouble7.deltaQ((int) (byte) -1, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0078() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0078");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) 1,
        (int) '#');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0079() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0079");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getCompany("\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(oneCompanyDataList1);
  }

  @Test
  public void test0080() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0080");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) 'a', (int) (byte) 100);
  }

  @Test
  public void test0081() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0081");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 0, 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0082() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0082");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)", (int) (byte) 100,
        (int) (short) 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0083() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0083");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) '#', (int) (short) 100);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0084() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0084");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double9 = quarterlyDouble7.get(0);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
  }

  @Test
  public void test0085() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0085");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 1, 0);
  }

  @Test
  public void test0086() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0086");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) 'a', (int) (byte) -1);
  }

  @Test
  public void test0087() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0087");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 0,
        (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0088() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0088");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (short) 1, (int) (short) 1);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0089() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0089");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.deltaQ((int) '4', (int) ' ');
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str13 = quarterlyDouble7
          .fmtGrowth1Q("\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3600.0d + "'", double8 == 3600.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
  }

  @Test
  public void test0090() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0090");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 0,
        (int) 'a');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0091() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0091");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str8 = quarterlyDouble6.fmtGrowth1Q(
          "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0092() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0092");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 0, (int) (short) 10);
  }

  @Test
  public void test0093() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0093");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) 0,
        (int) '#');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0094() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0094");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getQseqQ();
    double double9 = quarterlyDouble7.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str11 = quarterlyDouble7.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-200.0d) + "'", double8 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
  }

  @Test
  public void test0095() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0095");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(100, 1);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0096() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0096");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) '4', (int) (short) 10);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0097() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0097");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test0098() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0098");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 10, (int) '#');
  }

  @Test
  public void test0099() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0099");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double[] doubleArray17 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    quarterlyDouble7.dArr = doubleArray17;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str23 = quarterlyDouble7.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0100() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0100");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 10, (int) 'a');
  }

  @Test
  public void test0101() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0101");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    java.lang.Class<?> wildcardClass9 = quarterlyDouble7.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test0102() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0102");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray7);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str10 = quarterlyDouble8.fmtGrowth4Q("\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0103() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0103");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) '4',
          (int) (short) 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0104() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0104");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.getQseqQ();
    double[] doubleArray12 = new double[] { (byte) 100 };
    quarterlyDouble7.dArr = doubleArray12;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str15 = quarterlyDouble7.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0]");
  }

  @Test
  public void test0105() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0105");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str9 = quarterlyDouble7
          .fmtGrowth1Q("\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
  }

  @Test
  public void test0106() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0106");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 10, 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0107() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0107");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.deltaQ((int) '4', (int) ' ');
    // The following exception was thrown during execution in test generation
    try {
      double double14 = quarterlyDouble7.deltaQ(0, (int) (byte) 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3600.0d + "'", double8 == 3600.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
  }

  @Test
  public void test0108() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0108");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double double10 = quarterlyDouble6.deltaQ(10, (int) (short) 1);
    double double12 = quarterlyDouble6.get((int) (byte) 10);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str14 = quarterlyDouble6.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
  }

  @Test
  public void test0109() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0109");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(0, 1);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0110() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0110");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (byte) -1, 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, 0, (int) (short) -1);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList5);
  }

  @Test
  public void test0111() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0111");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, 0, (int) (byte) 1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0112() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0112");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 0, (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0113() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0113");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (byte) 100, (int) ' ');
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0114() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0114");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) 'a', (int) '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0115() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0115");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (short) 0,
          (int) (short) 10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0116() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0116");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    // The following exception was thrown during execution in test generation
    try {
      double double8 = quarterlyDouble6.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
  }

  @Test
  public void test0117() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0117");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
    java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1,
        fieldDataArray0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) 'a', (int) (short) 10);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (byte) -1, (int) (short) -1);
    org.junit.Assert.assertNotNull(fieldDataArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNull(fieldData5);
    org.junit.Assert.assertNull(fieldData8);
  }

  @Test
  public void test0118() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0118");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) (byte) 1, (int) (short) 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0119() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0119");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double[] doubleArray17 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    quarterlyDouble7.dArr = doubleArray17;
    double double22 = quarterlyDouble7.getQseqQ();
    double[] doubleArray23 = quarterlyDouble7.dArr;
    // The following exception was thrown during execution in test generation
    try {
      double double24 = quarterlyDouble7.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-200.0d) + "'", double22 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0120() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0120");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (short) 100,
          (int) (byte) -1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0121() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0121");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    double double14 = quarterlyDouble8.deltaQ(0, (int) (short) 0);
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
  }

  @Test
  public void test0122() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0122");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) -1, (-1));
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0123() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0123");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (-1), (int) (byte) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0124() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0124");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(10, (int) (byte) -1);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0125() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0125");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 1,
        (int) 'a');
    java.lang.Class<?> wildcardClass4 = strList3.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test0126() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0126");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str8 = quarterlyDouble6.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0127() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0127");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        (int) (short) 10, 100);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0128() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0128");
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
  public void test0129() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0129");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray7);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str10 = quarterlyDouble8
          .fmtGrowth1Q("\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0130() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0130");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double[] doubleArray17 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    quarterlyDouble7.dArr = doubleArray17;
    double double22 = quarterlyDouble7.getQseqQ();
    double[] doubleArray23 = quarterlyDouble7.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str25 = quarterlyDouble7.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-200.0d) + "'", double22 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0131() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0131");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) '4', 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0132() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0132");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) 100,
        (int) (byte) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0133() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0133");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (byte) -1, (int) (short) 0);
    java.lang.Class<?> wildcardClass3 = companySummaryList2.getClass();
    org.junit.Assert.assertNotNull(companySummaryList2);
    org.junit.Assert.assertNotNull(wildcardClass3);
  }

  @Test
  public void test0134() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0134");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 0, (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (short) 100, (int) (short) 10);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test0135() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0135");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) '#', (int) (byte) 100);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0136() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0136");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, 0, (int) '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0137() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0137");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) '4', 1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0138() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0138");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(1, 1);
  }

  @Test
  public void test0139() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0139");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 1, (int) (byte) 10);
  }

  @Test
  public void test0140() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0140");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) '#', 10);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0141() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0141");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)", 1, (int) (byte) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0142() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0142");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (byte) 10, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0143() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0143");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) -1, (int) '4');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0144() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0144");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) 100,
        (int) (short) -1);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0145() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0145");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double9 = quarterlyDouble8.getTtmAvg();
    double double10 = quarterlyDouble8.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      double double11 = quarterlyDouble8.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
  }

  @Test
  public void test0146() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0146");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) '#',
          (int) (short) 1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0147() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0147");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 100,
        (int) 'a');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0148() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0148");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(0, (int) (byte) 0);
  }

  @Test
  public void test0149() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0149");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) ' ', (-1));
  }

  @Test
  public void test0150() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0150");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double[] doubleArray17 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    quarterlyDouble7.dArr = doubleArray17;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    // The following exception was thrown during execution in test generation
    try {
      double double23 = quarterlyDouble22.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0151() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0151");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double[] doubleArray9 = quarterlyDouble7.dArr;
    double double11 = quarterlyDouble7.get((int) '#');
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str13 = quarterlyDouble7.fmtGrowth1Q("\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
  }

  @Test
  public void test0152() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0152");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 10, (int) '4');
    java.lang.Class<?> wildcardClass4 = strList3.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test0153() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0153");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 1, (int) ' ');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0154() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0154");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (short) 10, (int) ' ');
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0155() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0155");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) 'a',
        (int) (short) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0156() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0156");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (byte) -1, (int) (short) 1);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0157() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0157");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 0, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (byte) -1, (int) '4');
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test0158() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0158");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray8 = quarterlyDouble7.dArr;
    double double9 = quarterlyDouble7.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      double double12 = quarterlyDouble7.deltaQ(0, (int) (byte) 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-200.0d) + "'", double9 == (-200.0d));
  }

  @Test
  public void test0159() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0159");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double[] doubleArray17 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    quarterlyDouble7.dArr = doubleArray17;
    double[] doubleArray22 = quarterlyDouble7.dArr;
    double[] doubleArray23 = quarterlyDouble7.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray23);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str26 = quarterlyDouble24
          .fmtGrowth4Q("\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray22);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0160() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0160");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) ' ', (int) (short) 100);
  }

  @Test
  public void test0161() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0161");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        (int) (short) 100, 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0162() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0162");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (byte) -1, (-1));
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0163() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0163");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(100, (-1));
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0164() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0164");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 0, (int) (short) 10);
  }

  @Test
  public void test0165() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0165");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 10,
        (int) (short) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0166() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0166");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (short) 10, (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList3);
  }

  @Test
  public void test0167() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0167");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double double8 = quarterlyDouble6.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-200.0d) + "'", double8 == (-200.0d));
  }

  @Test
  public void test0168() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0168");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double[] doubleArray17 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    quarterlyDouble7.dArr = doubleArray17;
    double[] doubleArray22 = quarterlyDouble7.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str24 = quarterlyDouble7
          .fmtGrowth4Q("\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray22);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0169() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0169");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    double[] doubleArray15 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    quarterlyDouble8.dArr = doubleArray15;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str21 = quarterlyDouble19.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0170() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0170");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) ' ',
          (int) (byte) 10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0171() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0171");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) '#', 0);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0172() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0172");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (byte) 100,
        (int) (short) 100);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0173() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0173");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str8 = quarterlyDouble6.fmtGrowth1Q("\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
  }

  @Test
  public void test0174() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0174");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getQseqQ();
    double[] doubleArray8 = quarterlyDouble6.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray8);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str11 = quarterlyDouble9
          .fmtGrowth1Q("\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3600.0d + "'", double7 == 3600.0d);
    org.junit.Assert.assertNotNull(doubleArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[97.0, 35.0, -1.0, 0.0, 0.0]");
  }

  @Test
  public void test0175() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0175");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    java.lang.Class<?> wildcardClass8 = doubleArray7.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test0176() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0176");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (short) 10, 0);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0177() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0177");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    double[] doubleArray12 = quarterlyDouble8.dArr;
    java.lang.Class<?> wildcardClass13 = quarterlyDouble8.getClass();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test0178() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0178");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (-1),
          (int) (byte) -1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0179() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0179");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)", (-1), (int) '#');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0180() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0180");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) ' ',
          (int) (byte) 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0181() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0181");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) 0, (int) (short) 1);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0182() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0182");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(0, 1);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0183() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0183");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) 0,
        (int) (short) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0184() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0184");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) -1,
        (int) (byte) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0185() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0185");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (short) 10, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0186() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0186");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) ' ', 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0187() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0187");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 100,
        (int) ' ');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (byte) 10, (int) (short) 0);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
    org.junit.Assert.assertNotNull(companyDataList7);
  }

  @Test
  public void test0188() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0188");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    double[] doubleArray15 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    quarterlyDouble8.dArr = doubleArray15;
    double double21 = quarterlyDouble8.deltaQ((int) '4', (int) (short) 10);
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
  }

  @Test
  public void test0189() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0189");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)", (int) '#', 100);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0190() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0190");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(10, (int) (byte) -1);
  }

  @Test
  public void test0191() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0191");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(1, (int) ' ');
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0192() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0192");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 10,
        (int) ' ');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (short) -1, (-1));
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test0193() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0193");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (byte) 1, 10);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0194() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0194");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 10,
        (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) 'a', (int) (short) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList10 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) '#', 10);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(companyDataList7);
    org.junit.Assert.assertNotNull(companyDataList10);
  }

  @Test
  public void test0195() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0195");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double[] doubleArray17 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    quarterlyDouble7.dArr = doubleArray17;
    double[] doubleArray22 = quarterlyDouble7.dArr;
    double[] doubleArray28 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray28);
    double[] doubleArray30 = quarterlyDouble29.dArr;
    double[] doubleArray31 = quarterlyDouble29.dArr;
    quarterlyDouble7.dArr = doubleArray31;
    double double33 = quarterlyDouble7.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray22);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray28);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray30);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray31);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-200.0d) + "'", double33 == (-200.0d));
  }

  @Test
  public void test0196() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0196");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 10,
        (int) ' ');
    java.lang.Class<?> wildcardClass4 = strList3.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test0197() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0197");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double double10 = quarterlyDouble6.deltaQ(10, (int) (short) 1);
    double double12 = quarterlyDouble6.get((int) (byte) 10);
    double double14 = quarterlyDouble6.get((int) (byte) -1);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str16 = quarterlyDouble6.fmtGrowth1Q("\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
  }

  @Test
  public void test0198() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0198");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double double10 = quarterlyDouble6.deltaQ(10, (int) (short) 1);
    double double12 = quarterlyDouble6.get((int) (byte) 10);
    double double14 = quarterlyDouble6.get((int) (byte) -1);
    double double15 = quarterlyDouble6.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2.75d + "'", double15 == 2.75d);
  }

  @Test
  public void test0199() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0199");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    java.lang.String str2 = companyData1.getTicker();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str2,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test0200() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0200");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (short) 1,
          (int) (short) 10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0201() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0201");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) '#', (int) '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0202() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0202");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        (int) (byte) 0, 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0203() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0203");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 10,
        (int) (byte) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0204() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0204");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double9 = quarterlyDouble8.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str11 = quarterlyDouble8.fmtGrowth4Q(
          "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-200.0d) + "'", double9 == (-200.0d));
  }

  @Test
  public void test0205() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0205");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, 10, (int) (short) 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0206() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0206");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) 'a',
          (int) (byte) 1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0207() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0207");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getCompany(
            "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(oneCompanyDataList1);
  }

  @Test
  public void test0209() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0209");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double9 = quarterlyDouble8.getTtmAvg();
    double double10 = quarterlyDouble8.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str12 = quarterlyDouble8.fmtGrowth4Q("\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 11.0d + "'", double10 == 11.0d);
  }

  @Test
  public void test0210() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0210");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    double[] doubleArray15 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    quarterlyDouble8.dArr = doubleArray15;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str20 = quarterlyDouble8.fmtGrowth1Q("\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0211() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0211");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 100, (-1));
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    java.lang.Class<?> wildcardClass5 = manyCompanyDataList4.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test0212() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0212");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
    java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1,
        fieldDataArray0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, 100, (int) (byte) -1);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (short) 0, (int) (byte) 100);
    org.junit.Assert.assertNotNull(fieldDataArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNull(fieldData5);
    org.junit.Assert.assertNull(fieldData8);
  }

  @Test
  public void test0213() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0213");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(100, 0);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0214() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0214");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double double9 = quarterlyDouble6.get(0);
    double[] doubleArray16 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray16);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray16);
    quarterlyDouble6.dArr = doubleArray16;
    double double20 = quarterlyDouble6.getTtmAvg();
    double[] doubleArray21 = quarterlyDouble6.dArr;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 3.0d + "'", double20 == 3.0d);
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
  }

  @Test
  public void test0215() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0215");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double10 = quarterlyDouble7.deltaQ((int) (byte) 1, (int) (byte) 0);
    java.lang.String str12 = quarterlyDouble7
        .fmtGrowth1Q("\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
        + "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str12,
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test0216() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0216");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (short) 10, (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList2);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(manyCompanyDataList3);
  }

  @Test
  public void test0217() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0217");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 1, 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test0218() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0218");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (byte) -1,
          (int) '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0219() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0219");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getQseqQ();
    double[] doubleArray8 = quarterlyDouble6.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray8);
    // The following exception was thrown during execution in test generation
    try {
      double double10 = quarterlyDouble9.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3600.0d + "'", double7 == 3600.0d);
    org.junit.Assert.assertNotNull(doubleArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[97.0, 35.0, -1.0, 0.0, 0.0]");
  }

  @Test
  public void test0220() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0220");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) ' ', 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0221() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0221");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    double[] doubleArray15 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    quarterlyDouble8.dArr = doubleArray15;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str20 = quarterlyDouble8.fmtGrowth4Q("\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0222() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0222");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double[] doubleArray9 = quarterlyDouble7.dArr;
    double double11 = quarterlyDouble7.get((int) '#');
    double double13 = quarterlyDouble7.get((int) (short) 100);
    // The following exception was thrown during execution in test generation
    try {
      double double14 = quarterlyDouble7.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9999.9999d) + "'", double13 == (-9999.9999d));
  }

  @Test
  public void test0223() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0223");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) 1,
        (int) (byte) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0224() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0224");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str11 = quarterlyDouble9.fmtGrowth1Q("\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0225() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0225");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtmAvg();
    java.lang.Class<?> wildcardClass9 = quarterlyDouble6.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.75d + "'", double8 == 2.75d);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test0226() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0226");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) 1, (int) (byte) -1);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0227() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0227");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)", (int) (byte) 100,
        0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0228() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0228");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double[] doubleArray17 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    quarterlyDouble7.dArr = doubleArray17;
    double double22 = quarterlyDouble7.getQseqQ();
    double[] doubleArray23 = quarterlyDouble7.dArr;
    double double24 = quarterlyDouble7.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-200.0d) + "'", double22 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
  }

  @Test
  public void test0229() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0229");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) '4',
        (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, 1, 0);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test0230() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0230");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
    java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1,
        fieldDataArray0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) 'a', (int) (short) 10);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (-1), (int) 'a');
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, 1, (int) (byte) 100);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass12 = fieldData11.getClass();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(fieldDataArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNull(fieldData5);
    org.junit.Assert.assertNull(fieldData8);
    org.junit.Assert.assertNull(fieldData11);
  }

  @Test
  public void test0231() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0231");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray7);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str10 = quarterlyDouble8
          .fmtGrowth4Q("\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0232() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0232");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.lang.String str4 = companyData1.getTicker();
    java.lang.String str5 = companyData1.getTicker();
    java.lang.String str6 = companyData1.getTicker();
    java.lang.String str7 = companyData1.getTicker();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
  }

  @Test
  public void test0233() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0233");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (short) -1,
          (int) (short) -1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0234() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0234");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(100, (int) '4');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0235() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0235");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 10, (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
  }

  @Test
  public void test0236() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0236");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(10, (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList3);
  }

  @Test
  public void test0237() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0237");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 10,
        (int) ' ');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
    org.junit.Assert.assertNotNull(manyCompanyDataList5);
  }

  @Test
  public void test0238() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0238");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) ' ', (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, (int) (byte) -1, 10);
    java.lang.Class<?> wildcardClass6 = companyDataList5.getClass();
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test0239() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0239");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) ' ', (int) 'a');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0240() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0240");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)", (int) (short) -1, (int) (short) 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0241() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0241");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, 1, (int) (byte) 100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0242() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0242");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.lang.Class<?> wildcardClass4 = fieldDataList3.getClass();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test0243() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0243");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) '4',
        (int) (short) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
    org.junit.Assert.assertNotNull(manyCompanyDataList5);
  }

  @Test
  public void test0244() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0244");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray7);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str10 = quarterlyDouble8.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0245() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0245");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double double12 = quarterlyDouble7.getQseqQ();
    double[] doubleArray18 = new double[] { 0L, 10.0f, 97.0d, 1.0d, 1.0f };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    quarterlyDouble7.dArr = doubleArray18;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str24 = quarterlyDouble22.fmtGrowth4Q("\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-200.0d) + "'", double12 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 10.0, 97.0, 1.0, 1.0]");
  }

  @Test
  public void test0246() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0246");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 10, 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0247() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0247");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) 10, 100);
    java.lang.Class<?> wildcardClass4 = strList3.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test0248() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0248");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(10, (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList2);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(manyCompanyDataList3);
  }

  @Test
  public void test0249() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0249");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (byte) 0, (int) (short) -1);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0250() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0250");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
    java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1,
        fieldDataArray0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (short) 10, (int) '4');
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) ' ', (int) '#');
    org.junit.Assert.assertNotNull(fieldDataArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNull(fieldData5);
    org.junit.Assert.assertNull(fieldData8);
  }

  @Test
  public void test0251() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0251");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    double double13 = quarterlyDouble8.get((int) (short) -1);
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9999.9999d) + "'", double13 == (-9999.9999d));
  }

  @Test
  public void test0252() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0252");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(0, (int) (short) -1);
  }

  @Test
  public void test0253() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0253");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(1, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList2);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(manyCompanyDataList3);
  }

  @Test
  public void test0254() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0254");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 0, (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, 10, (int) 'a');
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test0255() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0255");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) -1,
        (int) ' ');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (byte) 10, (int) '4');
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test0256() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0256");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 0, (int) ' ');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0257() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0257");
    double[] doubleArray5 = new double[] { 0L, 10.0f, 97.0d, 1.0d, 1.0f };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    // The following exception was thrown during execution in test generation
    try {
      double double7 = quarterlyDouble6.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 10.0, 97.0, 1.0, 1.0]");
  }

  @Test
  public void test0258() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0258");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(1, (int) (short) -1);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0259() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0259");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 100, (int) (short) 1);
  }

  @Test
  public void test0260() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0260");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData7 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList4, (int) (byte) 1, (int) (byte) 100);
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNull(fieldData7);
  }

  @Test
  public void test0261() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0261");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) ' ', (int) (byte) 1);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0262() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0262");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (-1), 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (short) -1, 100);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test0263() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0263");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) '#', 1);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0264() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0264");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (byte) 1, 10);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0265() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0265");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) '#', (-1));
  }

  @Test
  public void test0266() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0266");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (-1),
          (int) (short) 100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0267() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0267");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) -1, (int) ' ');
  }

  @Test
  public void test0268() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0268");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((-1), (int) (byte) 1);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0269() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0269");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double double9 = quarterlyDouble6.get(0);
    double double11 = quarterlyDouble6.get((int) (byte) 10);
    double double12 = quarterlyDouble6.getTtm();
    double double13 = quarterlyDouble6.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 34.0d + "'", double12 == 34.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
  }

  @Test
  public void test0270() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0270");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getCompany("\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(oneCompanyDataList1);
  }

  @Test
  public void test0271() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0271");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double[] doubleArray17 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    quarterlyDouble7.dArr = doubleArray17;
    double[] doubleArray22 = quarterlyDouble7.dArr;
    double[] doubleArray28 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray28);
    double[] doubleArray30 = quarterlyDouble29.dArr;
    double[] doubleArray31 = quarterlyDouble29.dArr;
    quarterlyDouble7.dArr = doubleArray31;
    double double33 = quarterlyDouble7.getMostRecent();
    double double35 = quarterlyDouble7.get((int) (byte) 1);
    // The following exception was thrown during execution in test generation
    try {
      double double36 = quarterlyDouble7.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray22);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray28);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray30);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray31);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
  }

  @Test
  public void test0272() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0272");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 100, 1);
    java.lang.Class<?> wildcardClass4 = strList3.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test0273() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0273");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double9 = quarterlyDouble6.get((int) (byte) 100);
    // The following exception was thrown during execution in test generation
    try {
      double double12 = quarterlyDouble6.deltaQ((int) (short) 0, (int) (byte) 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9999.9999d) + "'", double9 == (-9999.9999d));
  }

  @Test
  public void test0274() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0274");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str10 = quarterlyDouble7.fmtGrowth4Q(
          "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3600.0d + "'", double8 == 3600.0d);
  }

  @Test
  public void test0275() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0275");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) '4', 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (-1), (int) (short) 0);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test0276() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0276");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (short) -1, 100);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0277() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0277");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str10 = quarterlyDouble7.fmtGrowth4Q(
          "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-200.0d) + "'", double8 == (-200.0d));
  }

  @Test
  public void test0278() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0278");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((-1), (int) (byte) 100);
  }

  @Test
  public void test0279() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0279");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 0, (int) (byte) 1);
  }

  @Test
  public void test0280() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0280");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) 10, (int) 'a');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0281() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0281");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) '#',
        (int) (short) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0282() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0282");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(1, 0);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0283() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0283");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) ' ', (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, (int) (byte) 10, (int) ' ');
    java.lang.Class<?> wildcardClass6 = companyDataList5.getClass();
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test0284() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0284");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    java.lang.String str9 = quarterlyDouble7.fmtGrowth1Q("");
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double double14 = quarterlyDouble7.deltaQ((int) (short) 0, 0);
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str9,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 900.0d + "'", double10 == 900.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.0d + "'", double11 == 3.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
  }

  @Test
  public void test0285() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0285");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) '4', (int) '#');
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0286() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0286");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double[] doubleArray14 = new double[] { '4', (-1), 100.0d, 3.0d, (byte) 1, 100.0f };
    quarterlyDouble7.dArr = doubleArray14;
    double[] doubleArray16 = quarterlyDouble7.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray16);
    java.lang.Class<?> wildcardClass18 = quarterlyDouble17.getClass();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertNotNull(wildcardClass18);
  }

  @Test
  public void test0287() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0287");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 0, (-1));
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0288() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0288");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (short) 1,
          (int) (byte) 100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0289() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0289");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData6 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList3, 0, (int) (byte) 100);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData9 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList3, 1, 10);
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNull(fieldData6);
    org.junit.Assert.assertNull(fieldData9);
  }

  @Test
  public void test0290() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0290");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray8 = quarterlyDouble7.dArr;
    // The following exception was thrown during execution in test generation
    try {
      double double9 = quarterlyDouble7.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0291() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0291");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) '4', 1);
  }

  @Test
  public void test0292() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0292");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.lang.Class<?> wildcardClass4 = fieldDataList3.getClass();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test0293() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0293");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (short) 100, (int) (short) 10);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0294() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0294");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str10 = quarterlyDouble7.fmtGrowth1Q("\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.75d + "'", double8 == 2.75d);
  }

  @Test
  public void test0295() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0295");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    java.lang.String str9 = quarterlyDouble7.fmtGrowth1Q("");
    double double10 = quarterlyDouble7.getQseqQ();
    double double13 = quarterlyDouble7.deltaQ((int) 'a', 100);
    double double14 = quarterlyDouble7.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str9,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 900.0d + "'", double10 == 900.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
  }

  @Test
  public void test0296() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0296");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 100,
        (int) ' ');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test0297() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0297");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    java.lang.String str9 = quarterlyDouble7.fmtGrowth4Q("\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    java.lang.Class<?> wildcardClass10 = quarterlyDouble7.getClass();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals(
        "'" + str9 + "' != '"
            + "\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'",
        str9, "\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0298() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0298");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double8 = quarterlyDouble7.getTtmAvg();
    double double9 = quarterlyDouble7.getQoQ();
    double double10 = quarterlyDouble7.getTtmAvg();
    double double12 = quarterlyDouble7.get(0);
    java.lang.String str14 = quarterlyDouble7
        .fmtGrowth4Q("\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    double[] doubleArray20 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray20);
    double double22 = quarterlyDouble21.getQseqQ();
    double[] doubleArray23 = quarterlyDouble21.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray23);
    quarterlyDouble7.dArr = doubleArray23;
    double double26 = quarterlyDouble7.getTtmAvg();
    double double27 = quarterlyDouble7.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.0d + "'", double8 == 3.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-90.0d) + "'", double9 == (-90.0d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
        + "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str14,
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray20);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 3600.0d + "'", double22 == 3600.0d);
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + 8.5d + "'", double26 == 8.5d);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 35.0d + "'", double27 == 35.0d);
  }

  @Test
  public void test0299() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0299");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double[] doubleArray17 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    quarterlyDouble7.dArr = doubleArray17;
    double[] doubleArray22 = quarterlyDouble7.dArr;
    double[] doubleArray28 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray28);
    double[] doubleArray30 = quarterlyDouble29.dArr;
    double[] doubleArray31 = quarterlyDouble29.dArr;
    quarterlyDouble7.dArr = doubleArray31;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray31);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str35 = quarterlyDouble33.fmtGrowth4Q(
          "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray22);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray28);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray30);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray31);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0300() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0300");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double[] doubleArray17 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    quarterlyDouble7.dArr = doubleArray17;
    double double22 = quarterlyDouble7.getQseqQ();
    double[] doubleArray23 = quarterlyDouble7.dArr;
    double double25 = quarterlyDouble7.get((int) (byte) 10);
    double double27 = quarterlyDouble7.get((int) (short) 0);
    double double28 = quarterlyDouble7.getMostRecent();
    double[] doubleArray34 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble35 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray34);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray34);
    double double37 = quarterlyDouble36.getMostRecent();
    double double38 = quarterlyDouble36.getTtmAvg();
    double double39 = quarterlyDouble36.getQseqQ();
    double double40 = quarterlyDouble36.getTtmAvg();
    double double41 = quarterlyDouble36.getQseqQ();
    double[] doubleArray42 = quarterlyDouble36.dArr;
    quarterlyDouble7.dArr = doubleArray42;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-200.0d) + "'", double22 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-9999.9999d) + "'", double25 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0d) + "'", double28 == (-1.0d));
    org.junit.Assert.assertNotNull(doubleArray34);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1.0d) + "'", double37 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double38 + "' != '" + 2.75d + "'", double38 == 2.75d);
    org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-200.0d) + "'", double39 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double40 + "' != '" + 2.75d + "'", double40 == 2.75d);
    org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-200.0d) + "'", double41 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray42);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0301() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0301");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray7);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray7);
    double double10 = quarterlyDouble9.getMostRecent();
    double double13 = quarterlyDouble9.deltaQ((-1), (int) (short) -1);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
  }

  @Test
  public void test0302() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0302");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    // The following exception was thrown during execution in test generation
    try {
      double double10 = quarterlyDouble6.deltaQ((int) (byte) -1, (int) (byte) 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0303() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0303");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) '4', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
    org.junit.Assert.assertNotNull(companyDataList5);
  }

  @Test
  public void test0304() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0304");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        (int) (short) 0, (int) (short) 100);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0305() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0305");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double9 = quarterlyDouble6.get((int) (byte) 100);
    java.lang.Class<?> wildcardClass10 = quarterlyDouble6.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9999.9999d) + "'", double9 == (-9999.9999d));
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0306() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0306");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) '4', (int) '4');
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0307() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0307");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) '#', (int) ' ');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, (int) 'a', 100);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList5);
  }

  @Test
  public void test0308() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0308");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        (int) (short) 1, (int) (byte) -1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0309() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0309");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)", (int) (short) 1, 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0310() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0310");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) -1,
        (int) (byte) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0311() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0311");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(0, (int) (byte) 1);
  }

  @Test
  public void test0312() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0312");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 10, (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (byte) 100, 100);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test0313() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0313");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double[] doubleArray17 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    quarterlyDouble7.dArr = doubleArray17;
    double double22 = quarterlyDouble7.getQseqQ();
    double[] doubleArray23 = quarterlyDouble7.dArr;
    double double25 = quarterlyDouble7.get((int) (byte) 10);
    // The following exception was thrown during execution in test generation
    try {
      double double26 = quarterlyDouble7.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-200.0d) + "'", double22 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-9999.9999d) + "'", double25 == (-9999.9999d));
  }

  @Test
  public void test0314() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0314");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.get(1);
    double double11 = quarterlyDouble7.getMostRecent();
    double double14 = quarterlyDouble7.deltaQ(10, (int) (byte) 100);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.75d + "'", double8 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
  }

  @Test
  public void test0315() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0315");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 100,
        (int) (byte) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0316() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0316");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double[] doubleArray17 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    quarterlyDouble7.dArr = doubleArray17;
    double[] doubleArray22 = quarterlyDouble7.dArr;
    double[] doubleArray28 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray28);
    double[] doubleArray30 = quarterlyDouble29.dArr;
    double[] doubleArray31 = quarterlyDouble29.dArr;
    quarterlyDouble7.dArr = doubleArray31;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str34 = quarterlyDouble7.fmtGrowth4Q(
          "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray22);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray28);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray30);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray31);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0317() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0317");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double[] doubleArray17 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    quarterlyDouble7.dArr = doubleArray17;
    double double22 = quarterlyDouble7.getQseqQ();
    double[] doubleArray23 = quarterlyDouble7.dArr;
    double double24 = quarterlyDouble7.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str26 = quarterlyDouble7.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-200.0d) + "'", double22 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + 2.75d + "'", double24 == 2.75d);
  }

  @Test
  public void test0318() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0318");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 1,
        (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0319() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0319");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, 100, (int) ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0320() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0320");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str10 = quarterlyDouble8.fmtGrowth4Q(
          "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0321() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0321");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (short) 10,
          (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0322() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0322");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) '4',
        (int) (byte) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0323() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0323");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList2, (int) '4', (int) (short) 10);
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
  public void test0324() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0324");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double[] doubleArray17 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    quarterlyDouble7.dArr = doubleArray17;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    double double24 = quarterlyDouble22.get((int) (byte) 10);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str26 = quarterlyDouble22.fmtGrowth4Q(
          "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-9999.9999d) + "'", double24 == (-9999.9999d));
  }

  @Test
  public void test0325() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0325");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        (int) (byte) 100, (int) '4');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0326() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0326");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 0,
        (int) (byte) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0327() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0327");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 0, (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0328() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0328");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) '4', 1);
    java.lang.Class<?> wildcardClass4 = strList3.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test0329() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0329");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str8 = quarterlyDouble6.fmtGrowth4Q(
          "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0330() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0330");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.get(1);
    double double11 = quarterlyDouble7.getMostRecent();
    double double12 = quarterlyDouble7.getTtmAvg();
    double double13 = quarterlyDouble7.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.75d + "'", double8 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.75d + "'", double12 == 2.75d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
  }

  @Test
  public void test0331() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0331");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    java.lang.String str9 = quarterlyDouble7.fmtGrowth1Q("");
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double[] doubleArray12 = quarterlyDouble7.dArr;
    double double13 = quarterlyDouble7.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str9,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 900.0d + "'", double10 == 900.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.0d + "'", double11 == 3.0d);
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.0d + "'", double13 == 3.0d);
  }

  @Test
  public void test0332() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0332");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
    java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1,
        fieldDataArray0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) 'a', (int) (short) 10);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (-1), (int) 'a');
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (short) 0, 0);
    org.junit.Assert.assertNotNull(fieldDataArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNull(fieldData5);
    org.junit.Assert.assertNull(fieldData8);
    org.junit.Assert.assertNull(fieldData11);
  }

  @Test
  public void test0333() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0333");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    org.junit.Assert.assertNotNull(fieldDataList2);
  }

  @Test
  public void test0334() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0334");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 0, (int) 'a');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0335() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0335");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double10 = quarterlyDouble7.deltaQ((int) (byte) 1, (int) (byte) 0);
    double[] doubleArray16 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray16);
    double[] doubleArray18 = quarterlyDouble17.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    quarterlyDouble7.dArr = doubleArray18;
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[97.0, 35.0, -1.0, 0.0, 0.0]");
  }

  @Test
  public void test0336() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0336");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double[] doubleArray14 = new double[] { '4', (-1), 100.0d, 3.0d, (byte) 1, 100.0f };
    quarterlyDouble7.dArr = doubleArray14;
    double[] doubleArray16 = quarterlyDouble7.dArr;
    java.lang.String str18 = quarterlyDouble7.fmtGrowth1Q("hi!");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)" + "'", str18,
        "\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)");
  }

  @Test
  public void test0337() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0337");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double12 = quarterlyDouble7.deltaQ(10, (int) ' ');
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
  }

  @Test
  public void test0338() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0338");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) ' ',
        (int) (short) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0339() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0339");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)", (int) 'a',
        (int) (short) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0340() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0340");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)", (int) (byte) -1,
        (int) (short) -1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0341() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0341");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) (byte) 0, 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0342() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0342");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double[] doubleArray17 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    quarterlyDouble7.dArr = doubleArray17;
    double[] doubleArray22 = quarterlyDouble7.dArr;
    double[] doubleArray28 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray28);
    double[] doubleArray30 = quarterlyDouble29.dArr;
    double[] doubleArray31 = quarterlyDouble29.dArr;
    quarterlyDouble7.dArr = doubleArray31;
    double double33 = quarterlyDouble7.getMostRecent();
    double double34 = quarterlyDouble7.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      double double35 = quarterlyDouble7.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray22);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray28);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray30);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray31);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-200.0d) + "'", double34 == (-200.0d));
  }

  @Test
  public void test0343() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0343");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) -1,
        (int) (short) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0344() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0344");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 10, (int) '#');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0345() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0345");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((-1), (int) (short) 10);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0346() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0346");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) ' ', 10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0347() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0347");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((-1), (int) (short) 1);
  }

  @Test
  public void test0348() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0348");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) ' ', (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, 1, (int) '#');
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test0349() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0349");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)", (int) (byte) -1, (int) (byte) 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0350() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0350");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(fieldDataList3);
  }

  @Test
  public void test0351() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0351");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 10,
        (int) (short) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test0352() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0352");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray10 = quarterlyDouble9.dArr;
    double double11 = quarterlyDouble9.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-200.0d) + "'", double11 == (-200.0d));
  }

  @Test
  public void test0353() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0353");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    double[] doubleArray15 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    quarterlyDouble8.dArr = doubleArray15;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str20 = quarterlyDouble8.fmtGrowth1Q("\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0354() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0354");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (byte) -1, (int) (short) -1);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0355() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0355");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double[] doubleArray17 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    quarterlyDouble7.dArr = doubleArray17;
    double double22 = quarterlyDouble7.getQseqQ();
    double double23 = quarterlyDouble7.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-200.0d) + "'", double22 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2.75d + "'", double23 == 2.75d);
  }

  @Test
  public void test0356() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0356");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 100, (int) (byte) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0357() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0357");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double double12 = quarterlyDouble7.getQseqQ();
    double[] doubleArray18 = new double[] { 0L, 10.0f, 97.0d, 1.0d, 1.0f };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    quarterlyDouble7.dArr = doubleArray18;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    // The following exception was thrown during execution in test generation
    try {
      double double23 = quarterlyDouble22.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-200.0d) + "'", double12 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 10.0, 97.0, 1.0, 1.0]");
  }

  @Test
  public void test0358() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0358");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) -1,
        (int) 'a');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) '#', (int) (byte) -1);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
    org.junit.Assert.assertNotNull(companyDataList7);
  }

  @Test
  public void test0359() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0359");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 1, (int) 'a');
  }

  @Test
  public void test0360() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0360");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) ' ', (int) 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0361() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0361");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test0362() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0362");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.lang.String str4 = companyData1.getTicker();
    java.lang.String str5 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData9 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList6, 1, 0);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList6);
    org.junit.Assert.assertNull(fieldData9);
  }

  @Test
  public void test0363() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0363");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double8 = quarterlyDouble7.getTtmAvg();
    double double9 = quarterlyDouble7.getQoQ();
    double double10 = quarterlyDouble7.getTtmAvg();
    double double12 = quarterlyDouble7.get(0);
    java.lang.String str14 = quarterlyDouble7
        .fmtGrowth4Q("\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    double[] doubleArray20 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray20);
    double double22 = quarterlyDouble21.getQseqQ();
    double[] doubleArray23 = quarterlyDouble21.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray23);
    quarterlyDouble7.dArr = doubleArray23;
    double double27 = quarterlyDouble7.get(100);
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.0d + "'", double8 == 3.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-90.0d) + "'", double9 == (-90.0d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
        + "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str14,
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray20);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 3600.0d + "'", double22 == 3600.0d);
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-9999.9999d) + "'", double27 == (-9999.9999d));
  }

  @Test
  public void test0364() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0364");
    java.util.List<java.lang.String> strList0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
          .getCompanies(strList0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0365() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0365");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getCompany(
            "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(oneCompanyDataList1);
  }

  @Test
  public void test0366() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0366");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      double double8 = quarterlyDouble6.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 11.0d + "'", double7 == 11.0d);
  }

  @Test
  public void test0367() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0367");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 0,
        (int) (byte) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0368() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0368");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 1,
        (int) 'a');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
  }

  @Test
  public void test0369() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0369");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getQseqQ();
    double[] doubleArray8 = quarterlyDouble6.dArr;
    double[] doubleArray14 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    double[] doubleArray16 = quarterlyDouble15.dArr;
    double[] doubleArray17 = quarterlyDouble15.dArr;
    quarterlyDouble6.dArr = doubleArray17;
    // The following exception was thrown during execution in test generation
    try {
      double double21 = quarterlyDouble6.deltaQ((int) (byte) 0, (int) (short) 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3600.0d + "'", double7 == 3600.0d);
    org.junit.Assert.assertNotNull(doubleArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0370() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0370");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", 0,
        (int) (short) 100);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0371() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0371");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getQseqQ();
    double[] doubleArray8 = quarterlyDouble6.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str10 = quarterlyDouble6.fmtGrowth1Q(
          "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3600.0d + "'", double7 == 3600.0d);
    org.junit.Assert.assertNotNull(doubleArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[97.0, 35.0, -1.0, 0.0, 0.0]");
  }

  @Test
  public void test0372() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0372");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (short) 1,
          (int) (short) 10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0373() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0373");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    double double12 = quarterlyDouble8.getMostRecent();
    double double14 = quarterlyDouble8.get(0);
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
  }

  @Test
  public void test0374() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0374");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) ' ', (-1));
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0375() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0375");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(10, 10);
  }

  @Test
  public void test0376() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0376");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getCompany("\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
    org.junit.Assert.assertNotNull(oneCompanyDataList1);
  }

  @Test
  public void test0377() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0377");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double[] doubleArray9 = quarterlyDouble7.dArr;
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str13 = quarterlyDouble7.fmtGrowth1Q("\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
  }

  @Test
  public void test0378() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0378");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) '4', 100);
  }

  @Test
  public void test0379() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0379");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
    java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1,
        fieldDataArray0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, 100, (int) (byte) -1);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (short) -1, (int) (byte) 100);
    org.junit.Assert.assertNotNull(fieldDataArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNull(fieldData5);
    org.junit.Assert.assertNull(fieldData8);
  }

  @Test
  public void test0380() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0380");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double[] doubleArray17 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    quarterlyDouble7.dArr = doubleArray17;
    // The following exception was thrown during execution in test generation
    try {
      double double24 = quarterlyDouble7.deltaQ((int) (byte) -1, (int) 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0381() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0381");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (-1), (int) (byte) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0382() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0382");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 1,
        (int) '4');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0383() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0383");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(10, 0);
  }

  @Test
  public void test0384() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0384");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    double double12 = quarterlyDouble8.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      double double15 = quarterlyDouble8.deltaQ((int) (short) 0, (int) (short) 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
  }

  @Test
  public void test0385() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0385");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) '#', (int) 'a');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0386() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0386");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double double9 = quarterlyDouble6.get(0);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str11 = quarterlyDouble6.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
  }

  @Test
  public void test0387() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0387");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double9 = quarterlyDouble8.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q(
          "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-200.0d) + "'", double9 == (-200.0d));
  }

  @Test
  public void test0388() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0388");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) 0, 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0389() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0389");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) 'a',
        (int) (short) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0390() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0390");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double[] doubleArray17 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    quarterlyDouble7.dArr = doubleArray17;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str26 = quarterlyDouble24.fmtGrowth1Q(
          "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0391() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0391");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double double9 = quarterlyDouble6.get(0);
    double double11 = quarterlyDouble6.get((int) (byte) 10);
    double[] doubleArray12 = quarterlyDouble6.dArr;
    java.lang.Class<?> wildcardClass13 = quarterlyDouble6.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test0392() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0392");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 0, (int) (short) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0393() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0393");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 0, 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0394() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0394");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double[] doubleArray17 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    quarterlyDouble7.dArr = doubleArray17;
    double[] doubleArray22 = quarterlyDouble7.dArr;
    double[] doubleArray23 = quarterlyDouble7.dArr;
    // The following exception was thrown during execution in test generation
    try {
      double double24 = quarterlyDouble7.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray22);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0395() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0395");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 0, (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, 1, (-1));
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList9 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (byte) 100, 0);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(companyDataList9);
  }

  @Test
  public void test0396() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0396");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 0, 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0397() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0397");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(1, (int) (byte) 100);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0398() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0398");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double[] doubleArray17 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    quarterlyDouble7.dArr = doubleArray17;
    double double22 = quarterlyDouble7.getQseqQ();
    double[] doubleArray23 = quarterlyDouble7.dArr;
    double double24 = quarterlyDouble7.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str26 = quarterlyDouble7.fmtGrowth4Q(
          "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-200.0d) + "'", double22 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + 2.75d + "'", double24 == 2.75d);
  }

  @Test
  public void test0399() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0399");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 10, (int) (byte) 10);
  }

  @Test
  public void test0400() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0400");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (short) 10, (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, (int) ' ', (int) (short) -1);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList5);
  }

  @Test
  public void test0401() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0401");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.75d + "'", double8 == 2.75d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 11.0d + "'", double9 == 11.0d);
  }

  @Test
  public void test0402() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0402");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getCompany(
            "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(oneCompanyDataList1);
  }

  @Test
  public void test0403() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0403");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
    java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1,
        fieldDataArray0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) 'a', (int) (short) 10);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, 100, 0);
    org.junit.Assert.assertNotNull(fieldDataArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNull(fieldData5);
    org.junit.Assert.assertNull(fieldData8);
  }

  @Test
  public void test0404() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0404");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(10, (int) (short) 0);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0405() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0405");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) '4',
        (int) (short) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0406() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0406");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) -1, 10);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0407() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0407");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) 'a', 10);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0408() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0408");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double[] doubleArray9 = quarterlyDouble7.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str11 = quarterlyDouble7.fmtGrowth1Q(
          "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0409() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0409");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double double9 = quarterlyDouble6.get(0);
    double[] doubleArray16 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray16);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray16);
    quarterlyDouble6.dArr = doubleArray16;
    double double20 = quarterlyDouble6.getTtm();
    double double21 = quarterlyDouble6.getMostRecent();
    java.lang.String str23 = quarterlyDouble6
        .fmtGrowth1Q("\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 12.0d + "'", double20 == 12.0d);
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    org.junit.Assert.assertEquals("'" + str23 + "' != '"
        + "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str23,
        "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test0410() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0410");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList2, (int) (short) 10, (int) (byte) 100);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList2, 1, (int) (byte) 100);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList2, 10, (int) (short) 0);
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNull(fieldData5);
    org.junit.Assert.assertNull(fieldData8);
    org.junit.Assert.assertNull(fieldData11);
  }

  @Test
  public void test0411() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0411");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double double9 = quarterlyDouble6.get(0);
    double[] doubleArray16 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray16);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray16);
    quarterlyDouble6.dArr = doubleArray16;
    double double20 = quarterlyDouble6.getTtm();
    double double23 = quarterlyDouble6.deltaQ((int) (byte) 10, (int) (short) -1);
    double double24 = quarterlyDouble6.getMostRecent();
    java.lang.String str26 = quarterlyDouble6.fmtGrowth4Q("");
    java.lang.String str28 = quarterlyDouble6.fmtGrowth1Q(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    double[] doubleArray29 = quarterlyDouble6.dArr;
    java.lang.Class<?> wildcardClass30 = quarterlyDouble6.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 12.0d + "'", double20 == 12.0d);
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
    org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str26,
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str28 + "' != '"
        + "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str28,
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray29);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertNotNull(wildcardClass30);
  }

  @Test
  public void test0412() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0412");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(0, (int) (short) 0);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0413() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0413");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(0, (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0414() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0414");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(10, (int) (short) 100);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0415() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0415");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) -1,
        (int) (short) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0416() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0416");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray8 = quarterlyDouble7.dArr;
    double double9 = quarterlyDouble7.getQseqQ();
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      double double12 = quarterlyDouble7.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-200.0d) + "'", double9 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-200.0d) + "'", double11 == (-200.0d));
  }

  @Test
  public void test0417() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0417");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.lang.String str2 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList5);
  }

  @Test
  public void test0418() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0418");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) (byte) 0, (int) 'a');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0419() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0419");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) '#', 10);
  }

  @Test
  public void test0420() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0420");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    java.lang.String str9 = quarterlyDouble7.fmtGrowth1Q("");
    double double10 = quarterlyDouble7.getQseqQ();
    double double12 = quarterlyDouble7.get((int) (byte) 10);
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str9,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 900.0d + "'", double10 == 900.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
  }

  @Test
  public void test0421() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0421");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        (int) ' ', (int) 'a');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0422() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0422");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList2, (-1), (int) ' ');
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNull(fieldData5);
  }

  @Test
  public void test0423() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0423");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (byte) 10, 0);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0424() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0424");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(100, (int) 'a');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0425() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0425");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (byte) 0, (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, 10, (int) (byte) 100);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList5);
  }

  @Test
  public void test0426() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0426");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(10, 10);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0427() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0427");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 100, 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0428() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0428");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(100, (int) '4');
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0429() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0429");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    java.lang.String str13 = quarterlyDouble8.fmtGrowth4Q("");
    double double14 = quarterlyDouble8.getTtm();
    double double15 = quarterlyDouble8.getTtm();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str13,
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 12.0d + "'", double14 == 12.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 12.0d + "'", double15 == 12.0d);
  }

  @Test
  public void test0430() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0430");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) 100,
        (-1));
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0431() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0431");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    java.lang.String str10 = quarterlyDouble8
        .fmtGrowth4Q("\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    java.lang.String str12 = quarterlyDouble8.fmtGrowth1Q(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
        + "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str10,
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
        + "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str12,
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test0432() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0432");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 0, 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0433() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0433");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) ' ',
          (int) (short) 100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0434() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0434");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(0, (int) (byte) 100);
  }

  @Test
  public void test0435() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0435");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(100, 10);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0436() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0436");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 10, (int) (short) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0437() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0437");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double9 = quarterlyDouble8.getTtmAvg();
    double double10 = quarterlyDouble8.getQseqQ();
    double double11 = quarterlyDouble8.getQseqQ();
    double[] doubleArray12 = quarterlyDouble8.dArr;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-200.0d) + "'", double11 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0438() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0438");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 10,
        (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) 'a', (int) (short) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList9 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) 'a', (int) ' ');
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(companyDataList9);
  }

  @Test
  public void test0439() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0439");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) 'a', (int) '4');
  }

  @Test
  public void test0440() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0440");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double double12 = quarterlyDouble7.getQseqQ();
    double[] doubleArray18 = new double[] { 0L, 10.0f, 97.0d, 1.0d, 1.0f };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    quarterlyDouble7.dArr = doubleArray18;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str24 = quarterlyDouble22
          .fmtGrowth1Q("\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-200.0d) + "'", double12 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 10.0, 97.0, 1.0, 1.0]");
  }

  @Test
  public void test0441() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0441");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double10 = quarterlyDouble7.deltaQ((int) (byte) -1, (int) (short) 0);
    double double11 = quarterlyDouble7.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
  }

  @Test
  public void test0442() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0442");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double[] doubleArray8 = quarterlyDouble6.dArr;
    double double9 = quarterlyDouble6.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str11 = quarterlyDouble6.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 11.0d + "'", double9 == 11.0d);
  }

  @Test
  public void test0443() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0443");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double[] doubleArray14 = new double[] { '4', (-1), 100.0d, 3.0d, (byte) 1, 100.0f };
    quarterlyDouble7.dArr = doubleArray14;
    double[] doubleArray16 = quarterlyDouble7.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray16);
    double double18 = quarterlyDouble17.getTtm();
    java.lang.String str20 = quarterlyDouble17.fmtGrowth4Q("");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 103.0d + "'", double18 == 103.0d);
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\t                  :        103.00 M (Seq= -101.00% : QoQ= -101.00%)" + "'", str20,
        "\t                  :        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
  }

  @Test
  public void test0444() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0444");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 1,
        (int) (byte) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0445() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0445");
    double[] doubleArray5 = new double[] { 0L, 10.0f, 97.0d, 1.0d, 1.0f };
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
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 10.0, 97.0, 1.0, 1.0]");
  }

  @Test
  public void test0446() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0446");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (byte) 10, (-1));
    java.lang.Class<?> wildcardClass3 = strList2.getClass();
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(wildcardClass3);
  }

  @Test
  public void test0447() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0447");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (short) 0, (int) '#');
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0448() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0448");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (short) 10,
          (int) (byte) 1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0449() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0449");
    double[] doubleArray5 = new double[] { 0L, 10.0f, 97.0d, 1.0d, 1.0f };
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
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 10.0, 97.0, 1.0, 1.0]");
  }

  @Test
  public void test0450() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0450");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    java.lang.String str9 = quarterlyDouble7.fmtGrowth1Q("");
    double double10 = quarterlyDouble7.getQoQ();
    // The following exception was thrown during execution in test generation
    try {
      double double13 = quarterlyDouble7.deltaQ(0, (int) (byte) 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str9,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-90.0d) + "'", double10 == (-90.0d));
  }

  @Test
  public void test0451() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0451");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(1, (int) 'a');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList3);
  }

  @Test
  public void test0452() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0452");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double double10 = quarterlyDouble6.deltaQ(10, (int) (short) 1);
    double double12 = quarterlyDouble6.get((int) (byte) 10);
    double[] doubleArray13 = quarterlyDouble6.dArr;
    double double15 = quarterlyDouble6.get((int) (byte) 100);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9999.9999d) + "'", double15 == (-9999.9999d));
  }

  @Test
  public void test0453() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0453");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) ' ', (int) (byte) 100);
  }

  @Test
  public void test0454() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0454");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray12 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray12);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray12);
    double double15 = quarterlyDouble14.getMostRecent();
    double double16 = quarterlyDouble14.getTtmAvg();
    double double17 = quarterlyDouble14.getQseqQ();
    double double18 = quarterlyDouble14.getTtmAvg();
    double[] doubleArray24 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray24);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray24);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray24);
    quarterlyDouble14.dArr = doubleArray24;
    double[] doubleArray29 = quarterlyDouble14.dArr;
    quarterlyDouble6.dArr = doubleArray29;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray29);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.75d + "'", double16 == 2.75d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-200.0d) + "'", double17 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 2.75d + "'", double18 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray24);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray29);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0455() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0455");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    java.lang.String str9 = quarterlyDouble7.fmtGrowth1Q("");
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    java.lang.String str13 = quarterlyDouble7.fmtGrowth1Q("\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str9,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 900.0d + "'", double10 == 900.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.0d + "'", double11 == 3.0d);
    org.junit.Assert.assertEquals(
        "'" + str13 + "' != '"
            + "\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'",
        str13, "\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test0456() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0456");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (byte) 10, 0);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0457() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0457");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.get(1);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str12 = quarterlyDouble7.fmtGrowth1Q("\t                  :        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.75d + "'", double8 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
  }

  @Test
  public void test0458() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0458");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getQseqQ();
    double[] doubleArray8 = quarterlyDouble6.dArr;
    double[] doubleArray14 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    double[] doubleArray16 = quarterlyDouble15.dArr;
    double[] doubleArray17 = quarterlyDouble15.dArr;
    quarterlyDouble6.dArr = doubleArray17;
    double double19 = quarterlyDouble6.getTtm();
    double double20 = quarterlyDouble6.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3600.0d + "'", double7 == 3600.0d);
    org.junit.Assert.assertNotNull(doubleArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 11.0d + "'", double19 == 11.0d);
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 11.0d + "'", double20 == 11.0d);
  }

  @Test
  public void test0459() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0459");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 10,
        (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
  }

  @Test
  public void test0460() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0460");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray12 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray12);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray12);
    double double15 = quarterlyDouble14.getMostRecent();
    double double16 = quarterlyDouble14.getTtmAvg();
    double double17 = quarterlyDouble14.getQseqQ();
    double double18 = quarterlyDouble14.getTtmAvg();
    double[] doubleArray24 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray24);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray24);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray24);
    quarterlyDouble14.dArr = doubleArray24;
    double[] doubleArray29 = quarterlyDouble14.dArr;
    quarterlyDouble6.dArr = doubleArray29;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str32 = quarterlyDouble6.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.75d + "'", double16 == 2.75d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-200.0d) + "'", double17 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 2.75d + "'", double18 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray24);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray29);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0461() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0461");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double9 = quarterlyDouble8.getTtmAvg();
    double double10 = quarterlyDouble8.getQseqQ();
    double double11 = quarterlyDouble8.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str13 = quarterlyDouble8.fmtGrowth4Q("\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-200.0d) + "'", double11 == (-200.0d));
  }

  @Test
  public void test0462() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0462");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getCompany("\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)");
    org.junit.Assert.assertNotNull(oneCompanyDataList1);
  }

  @Test
  public void test0463() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0463");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) '#',
          (int) (short) -1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0464() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0464");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(10, 100);
  }

  @Test
  public void test0465() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0465");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) -1, 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0466() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0466");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 100,
        (int) 'a');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0467() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0467");
    double[] doubleArray5 = new double[] { 0L, 10.0f, 97.0d, 1.0d, 1.0f };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray13 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    double double15 = quarterlyDouble14.getQseqQ();
    double[] doubleArray16 = quarterlyDouble14.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray16);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray16);
    quarterlyDouble7.dArr = doubleArray16;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 10.0, 97.0, 1.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3600.0d + "'", double15 == 3600.0d);
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[97.0, 35.0, -1.0, 0.0, 0.0]");
  }

  @Test
  public void test0468() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0468");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)");
  }

  @Test
  public void test0469() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0469");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double double9 = quarterlyDouble6.get(0);
    double[] doubleArray16 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray16);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray16);
    quarterlyDouble6.dArr = doubleArray16;
    double double20 = quarterlyDouble6.getTtm();
    double double23 = quarterlyDouble6.deltaQ((int) (byte) 10, (int) (short) -1);
    double double24 = quarterlyDouble6.getMostRecent();
    java.lang.String str26 = quarterlyDouble6.fmtGrowth4Q("");
    java.lang.String str28 = quarterlyDouble6.fmtGrowth1Q(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    double[] doubleArray29 = quarterlyDouble6.dArr;
    double double30 = quarterlyDouble6.getTtm();
    double double32 = quarterlyDouble6.get((int) (byte) 10);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 12.0d + "'", double20 == 12.0d);
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
    org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str26,
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str28 + "' != '"
        + "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str28,
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray29);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + 12.0d + "'", double30 == 12.0d);
    org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-9999.9999d) + "'", double32 == (-9999.9999d));
  }

  @Test
  public void test0470() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0470");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) '#', 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0471() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0471");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (short) 0, 1);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0472() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0472");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double11 = quarterlyDouble8.deltaQ((int) (short) 10, (int) (short) 0);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
  }

  @Test
  public void test0473() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0473");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    java.lang.String str9 = quarterlyDouble7.fmtGrowth1Q("");
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double[] doubleArray12 = quarterlyDouble7.dArr;
    double double13 = quarterlyDouble7.getTtm();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str9,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 900.0d + "'", double10 == 900.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.0d + "'", double11 == 3.0d);
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 12.0d + "'", double13 == 12.0d);
  }

  @Test
  public void test0474() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0474");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getTtm();
    double[] doubleArray15 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    double double18 = quarterlyDouble17.getTtm();
    double[] doubleArray24 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray24);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray24);
    quarterlyDouble17.dArr = doubleArray24;
    quarterlyDouble7.dArr = doubleArray24;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray24);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str31 = quarterlyDouble29.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 11.0d + "'", double8 == 11.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 12.0d + "'", double18 == 12.0d);
    org.junit.Assert.assertNotNull(doubleArray24);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0475() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0475");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    java.lang.String str2 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData6 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList3, (int) (byte) 10, (int) (byte) 0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData9 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList3, (-1), (int) (short) 1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
        + "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str2,
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNull(fieldData6);
    org.junit.Assert.assertNull(fieldData9);
  }

  @Test
  public void test0476() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0476");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) -1, 10);
  }

  @Test
  public void test0477() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0477");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 0, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test0478() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0478");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) '4',
          (int) (short) 1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0479() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0479");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((-1), (int) (short) 0);
  }

  @Test
  public void test0480() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0480");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (-1), (int) ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0481() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0481");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) '4',
        (int) (short) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    java.lang.Class<?> wildcardClass5 = strList3.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test0482() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0482");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) '4', (int) '#');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0483() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0483");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double[] doubleArray17 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    quarterlyDouble7.dArr = doubleArray17;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    java.lang.Class<?> wildcardClass23 = quarterlyDouble22.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test0484() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0484");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (short) -1,
          (int) ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0485() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0485");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 0,
        (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
    org.junit.Assert.assertNotNull(companyDataList5);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test0486() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0486");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) 'a', 100);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0487() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0487");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 10, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (byte) 10, (int) (byte) -1);
    java.lang.Class<?> wildcardClass7 = companyDataList6.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test0488() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0488");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double double9 = quarterlyDouble6.get(0);
    double double11 = quarterlyDouble6.get((int) (byte) 10);
    double[] doubleArray12 = quarterlyDouble6.dArr;
    double double13 = quarterlyDouble6.getMostRecent();
    double double16 = quarterlyDouble6.deltaQ((int) (byte) 0, (int) (short) 0);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
  }

  @Test
  public void test0489() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0489");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(0, 100);
  }

  @Test
  public void test0490() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0490");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (byte) 10, (-1));
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList3);
  }

  @Test
  public void test0491() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0491");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
    java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1,
        fieldDataArray0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) 'a', (int) (short) 10);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (byte) 100, (int) (byte) 100);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, 100, (int) (byte) -1);
    org.junit.Assert.assertNotNull(fieldDataArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNull(fieldData5);
    org.junit.Assert.assertNull(fieldData8);
    org.junit.Assert.assertNull(fieldData11);
  }

  @Test
  public void test0492() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0492");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double9 = quarterlyDouble6.get((int) (byte) 100);
    double double10 = quarterlyDouble6.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9999.9999d) + "'", double9 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
  }

  @Test
  public void test0493() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0493");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test0494() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0494");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) 100, (int) ' ');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0495() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0495");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) -1,
        (int) (byte) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0496() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0496");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 100, 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0497() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0497");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 10,
        (int) (byte) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0498() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0498");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)", (int) (short) 1,
        0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0499() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0499");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList0 = null;
    // The following exception was thrown during execution in test generation
    try {
      net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
          .getFieldData(fieldDataList0, 0, (int) (short) 100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0500() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test0500");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(1, (int) (short) 100);
  }
}
