package net.ajaskey.market.tools.SIP.BigDB.collation;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CollationTests0 {

  public static boolean debug = false;

  @Test
  public void test00001() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00001");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) (short) -1, (int) (byte) 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00002() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00002");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) '#', (int) (byte) 10);
  }

  @Test
  public void test00003() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00003");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList0 = null;
    // The following exception was thrown during execution in test generation
    try {
      net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
          .getFieldData(fieldDataList0, 100, 1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test00004() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00004");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
    java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1,
        fieldDataArray0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, 0, (int) 'a');
    java.lang.Class<?> wildcardClass6 = fieldDataList1.getClass();
    org.junit.Assert.assertNotNull(fieldDataArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNull(fieldData5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test00005() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00005");
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
  public void test00006() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00006");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
    java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1,
        fieldDataArray0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, 0, (int) 'a');
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass6 = fieldData5.getClass();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(fieldDataArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNull(fieldData5);
  }

  @Test
  public void test00007() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00007");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (short) 0, (int) (byte) 10);
  }

  @Test
  public void test00008() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00008");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.get((int) '4');
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str9 = quarterlyDouble4.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
  }

  @Test
  public void test00009() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00009");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      double double6 = quarterlyDouble4.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
  }

  @Test
  public void test00010() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00010");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile(1, (int) (byte) 100);
  }

  @Test
  public void test00011() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00011");
    long long0 = net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.serialVersionUID;
    org.junit.Assert.assertTrue("'" + long0 + "' != '" + 2600255321596652398L + "'", long0 == 2600255321596652398L);
  }

  @Test
  public void test00012() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00012");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double6 = quarterlyDouble4.get((int) (byte) 1);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str8 = quarterlyDouble4.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
  }

  @Test
  public void test00013() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00013");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) (byte) 1, (int) '4');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00014() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00014");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str8 = quarterlyDouble4.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
  }

  @Test
  public void test00015() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00015");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getCompany("hi!");
    org.junit.Assert.assertNotNull(oneCompanyDataList1);
  }

  @Test
  public void test00016() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00016");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str7 = quarterlyDouble4.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
  }

  @Test
  public void test00017() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00017");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, (int) (short) 0, (int) (byte) 10);
  }

  @Test
  public void test00018() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00018");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, 10, (int) (short) 10);
  }

  @Test
  public void test00019() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00019");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) (byte) 10, 100);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00020() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00020");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, (int) (short) 1, 0);
  }

  @Test
  public void test00021() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00021");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      double double7 = quarterlyDouble4.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
  }

  @Test
  public void test00022() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00022");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, (int) ' ', (int) '4');
  }

  @Test
  public void test00023() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00023");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double6 = quarterlyDouble4.get((int) (byte) 1);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str8 = quarterlyDouble4.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
  }

  @Test
  public void test00024() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00024");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double6 = quarterlyDouble4.get((int) (byte) 1);
    double double7 = quarterlyDouble4.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str9 = quarterlyDouble4.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
  }

  @Test
  public void test00025() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00025");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile(100, (int) ' ');
  }

  @Test
  public void test00026() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00026");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      double double6 = quarterlyDouble4.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
  }

  @Test
  public void test00027() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00027");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.getMostRecent();
    double double8 = quarterlyDouble4.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      double double11 = quarterlyDouble4.deltaQ((-1), 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
  }

  @Test
  public void test00028() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00028");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, (int) (byte) 0, 10);
  }

  @Test
  public void test00030() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00030");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str9 = quarterlyDouble4.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
  }

  @Test
  public void test00031() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00031");
    java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
    java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies((java.util.List<java.lang.String>) strList3, 100, (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList10 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies((java.util.List<java.lang.String>) strList3, 100, (int) (byte) 1);
    java.lang.Class<?> wildcardClass11 = strList3.getClass();
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(companyDataList7);
    org.junit.Assert.assertNotNull(companyDataList10);
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test00032() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00032");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    // The following exception was thrown during execution in test generation
    try {
      double double8 = quarterlyDouble4.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00033() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00033");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) (byte) 10, 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00034() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00034");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (short) 0, (int) 'a');
  }

  @Test
  public void test00035() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00035");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getCompany("");
    org.junit.Assert.assertNotNull(oneCompanyDataList1);
  }

  @Test
  public void test00036() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00036");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, 1, (int) (short) 1);
  }

  @Test
  public void test00037() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00037");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
    java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1,
        fieldDataArray0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (short) -1, (int) (short) 0);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass6 = fieldData5.getClass();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(fieldDataArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNull(fieldData5);
  }

  @Test
  public void test00038() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00038");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str9 = quarterlyDouble4.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
  }

  @Test
  public void test00039() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00039");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.get((int) '4');
    // The following exception was thrown during execution in test generation
    try {
      double double8 = quarterlyDouble4.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
  }

  @Test
  public void test00040() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00040");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, (int) ' ', (int) 'a');
  }

  @Test
  public void test00041() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00041");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) '4', (int) (short) 100);
  }

  @Test
  public void test00042() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00042");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.getMostRecent();
    java.lang.Class<?> wildcardClass8 = quarterlyDouble4.getClass();
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test00043() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00043");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) (byte) -1, (int) '#');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00044() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00044");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.get((int) '4');
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str9 = quarterlyDouble4.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
  }

  @Test
  public void test00045() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00045");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    java.lang.Class<?> wildcardClass7 = quarterlyDouble4.getClass();
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test00046() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00046");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str9 = quarterlyDouble4.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
  }

  @Test
  public void test00047() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00047");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, (int) (short) -1, (int) (short) 1);
  }

  @Test
  public void test00048() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00048");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) '#', 0);
  }

  @Test
  public void test00049() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00049");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile(1, 1);
  }

  @Test
  public void test00050() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00050");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (short) 100, (-1));
  }

  @Test
  public void test00051() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00051");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str8 = quarterlyDouble4.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
  }

  @Test
  public void test00052() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00052");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) (byte) 10, (int) (short) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00053() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00053");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    quarterlyDouble4.dArr = doubleArray10;
    double double13 = quarterlyDouble4.getQseqQ();
    double double14 = quarterlyDouble4.getTtmAvg();
    double[] doubleArray15 = quarterlyDouble4.dArr;
    // The following exception was thrown during execution in test generation
    try {
      double double16 = quarterlyDouble4.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00054() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00054");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double[] doubleArray5 = quarterlyDouble4.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str7 = quarterlyDouble4.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00055() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00055");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) ' ', (int) (byte) 0);
  }

  @Test
  public void test00056() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00056");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str6 = quarterlyDouble4.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00057() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00057");
    java.util.List<java.lang.String> strList0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
          .getCompanies(strList0, (int) (short) -1, (int) '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test00058() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00058");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.get((int) '4');
    double double10 = quarterlyDouble4.deltaQ((int) (short) 1, 0);
    double[] doubleArray14 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    double double16 = quarterlyDouble15.getTtm();
    double double17 = quarterlyDouble15.getQseqQ();
    double[] doubleArray18 = quarterlyDouble15.dArr;
    quarterlyDouble4.dArr = doubleArray18;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str21 = quarterlyDouble4.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 5100.0d + "'", double17 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00059() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00059");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, (int) (short) 1, (int) (short) 0);
  }

  @Test
  public void test00060() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00060");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) ' ', 100);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00061() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00061");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double7 = quarterlyDouble5.get(100);
    // The following exception was thrown during execution in test generation
    try {
      double double10 = quarterlyDouble5.deltaQ((int) (short) 0, (int) (short) 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
  }

  @Test
  public void test00062() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00062");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", 100,
        (int) (short) 100);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00063() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00063");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) (short) 0, (int) '#');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00064() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00064");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.getTtmAvg();
    double double9 = quarterlyDouble4.get((int) ' ');
    double double10 = quarterlyDouble4.getMostRecent();
    double double12 = quarterlyDouble4.get(10);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str14 = quarterlyDouble4.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9999.9999d) + "'", double9 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
  }

  @Test
  public void test00065() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00065");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.get((int) '4');
    double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    double[] doubleArray13 = quarterlyDouble12.dArr;
    double double14 = quarterlyDouble12.getQseqQ();
    double[] doubleArray15 = new double[] {};
    quarterlyDouble12.dArr = doubleArray15;
    quarterlyDouble4.dArr = doubleArray15;
    // The following exception was thrown during execution in test generation
    try {
      double double18 = quarterlyDouble4.getQseqQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5100.0d + "'", double14 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
  }

  @Test
  public void test00066() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00066");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double6 = quarterlyDouble4.get((int) (byte) 1);
    double double7 = quarterlyDouble4.getQseqQ();
    double double8 = quarterlyDouble4.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      double double11 = quarterlyDouble4.deltaQ((int) (short) -1, (int) (short) 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
  }

  @Test
  public void test00067() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00067");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, (-1), (int) (byte) 0);
  }

  @Test
  public void test00068() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00068");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, (int) (byte) 1, 10);
  }

  @Test
  public void test00069() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00069");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str9 = quarterlyDouble4.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00070() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00070");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, 0, 10);
  }

  @Test
  public void test00071() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00071");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double double8 = quarterlyDouble4.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str10 = quarterlyDouble4.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
  }

  @Test
  public void test00072() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00072");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    quarterlyDouble4.dArr = doubleArray11;
    double double14 = quarterlyDouble4.getTtm();
    double[] doubleArray15 = quarterlyDouble4.dArr;
    double double16 = quarterlyDouble4.getTtm();
    java.lang.Class<?> wildcardClass17 = quarterlyDouble4.getClass();
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test00073() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00073");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) (short) 0, (int) (byte) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00074() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00074");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) (byte) 1, (int) (byte) 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00075() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00075");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) (byte) -1, (int) '#');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00076() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00076");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", 1,
        10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00077() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00077");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile(0, (int) (byte) 100);
  }

  @Test
  public void test00078() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00078");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
    java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1,
        fieldDataArray0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (short) -1, (int) (short) 0);
    java.lang.Class<?> wildcardClass6 = fieldDataList1.getClass();
    org.junit.Assert.assertNotNull(fieldDataArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNull(fieldData5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test00079() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00079");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) ' ', 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00080() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00080");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    quarterlyDouble4.dArr = doubleArray11;
    double double14 = quarterlyDouble4.getTtm();
    double[] doubleArray15 = quarterlyDouble4.dArr;
    double double16 = quarterlyDouble4.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str18 = quarterlyDouble4.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5100.0d + "'", double16 == 5100.0d);
  }

  @Test
  public void test00081() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00081");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 0, 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList((java.util.List<java.lang.String>) strList2);
    java.lang.Class<?> wildcardClass8 = manyCompanyDataList7.getClass();
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(manyCompanyDataList7);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test00082() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00082");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", 1,
        (int) (short) 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00083() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00083");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    quarterlyDouble4.dArr = doubleArray11;
    double double14 = quarterlyDouble4.getTtm();
    double[] doubleArray15 = quarterlyDouble4.dArr;
    java.lang.Class<?> wildcardClass16 = quarterlyDouble4.getClass();
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test00084() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00084");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) (byte) -1, (int) (byte) 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00085() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00085");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", 0,
        (int) (byte) 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00086() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00086");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, (int) (byte) -1, (int) (short) 0);
  }

  @Test
  public void test00087() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00087");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, (int) (byte) 1, (int) ' ');
  }

  @Test
  public void test00088() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00088");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (byte) 0, (int) '4');
  }

  @Test
  public void test00089() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00089");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.get((int) '4');
    double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    double[] doubleArray13 = quarterlyDouble12.dArr;
    double double14 = quarterlyDouble12.getQseqQ();
    double[] doubleArray15 = new double[] {};
    quarterlyDouble12.dArr = doubleArray15;
    quarterlyDouble4.dArr = doubleArray15;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    // The following exception was thrown during execution in test generation
    try {
      double double19 = quarterlyDouble18.getQseqQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5100.0d + "'", double14 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
  }

  @Test
  public void test00090() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00090");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) (byte) 100, (int) '4');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00091() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00091");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str8 = quarterlyDouble4.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
  }

  @Test
  public void test00092() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00092");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) ' ', (int) ' ');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00093() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00093");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str7 = quarterlyDouble4.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
  }

  @Test
  public void test00094() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00094");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double[] doubleArray5 = quarterlyDouble4.dArr;
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = new double[] {};
    quarterlyDouble4.dArr = doubleArray7;
    double double9 = quarterlyDouble4.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      double double10 = quarterlyDouble4.getQseqQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
  }

  @Test
  public void test00095() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00095");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.getTtmAvg();
    double double9 = quarterlyDouble4.get((int) ' ');
    double double10 = quarterlyDouble4.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      double double11 = quarterlyDouble4.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9999.9999d) + "'", double9 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
  }

  @Test
  public void test00096() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00096");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, 10, (int) (byte) 10);
  }

  @Test
  public void test00097() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00097");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double7 = quarterlyDouble5.get(10);
    double double8 = quarterlyDouble5.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      double double9 = quarterlyDouble5.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
  }

  @Test
  public void test00098() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00098");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double double8 = quarterlyDouble4.getQseqQ();
    double[] doubleArray12 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray12);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray12);
    quarterlyDouble4.dArr = doubleArray12;
    double[] doubleArray16 = quarterlyDouble4.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str18 = quarterlyDouble4.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00099() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00099");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.getMostRecent();
    double double8 = quarterlyDouble4.getTtmAvg();
    double double9 = quarterlyDouble4.getMostRecent();
    double[] doubleArray13 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    double double15 = quarterlyDouble14.getTtm();
    double double17 = quarterlyDouble14.get((int) '4');
    double[] doubleArray21 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray21);
    double[] doubleArray23 = quarterlyDouble22.dArr;
    double double24 = quarterlyDouble22.getQseqQ();
    double[] doubleArray25 = new double[] {};
    quarterlyDouble22.dArr = doubleArray25;
    quarterlyDouble14.dArr = doubleArray25;
    quarterlyDouble4.dArr = doubleArray25;
    // The following exception was thrown during execution in test generation
    try {
      double double29 = quarterlyDouble4.getQseqQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9999.9999d) + "'", double17 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + 5100.0d + "'", double24 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
  }

  @Test
  public void test00100() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00100");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, 0, 0);
  }

  @Test
  public void test00101() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00101");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double[] doubleArray5 = quarterlyDouble4.dArr;
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = new double[] {};
    quarterlyDouble4.dArr = doubleArray7;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str10 = quarterlyDouble4.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
  }

  @Test
  public void test00102() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00102");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.get((int) '4');
    double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    double[] doubleArray13 = quarterlyDouble12.dArr;
    double double14 = quarterlyDouble12.getQseqQ();
    double[] doubleArray15 = new double[] {};
    quarterlyDouble12.dArr = doubleArray15;
    quarterlyDouble4.dArr = doubleArray15;
    double[] doubleArray18 = quarterlyDouble4.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    java.lang.Class<?> wildcardClass20 = doubleArray18.getClass();
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5100.0d + "'", double14 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
    org.junit.Assert.assertNotNull(wildcardClass20);
  }

  @Test
  public void test00103() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00103");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double[] doubleArray6 = quarterlyDouble5.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double8 = quarterlyDouble7.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      double double9 = quarterlyDouble7.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
  }

  @Test
  public void test00104() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00104");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (byte) -1, (int) '4');
  }

  @Test
  public void test00105() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00105");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, 1, (int) (short) 0);
  }

  @Test
  public void test00106() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00106");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double[] doubleArray6 = quarterlyDouble5.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double8 = quarterlyDouble7.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      double double9 = quarterlyDouble7.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
  }

  @Test
  public void test00107() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00107");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double6 = quarterlyDouble4.get((int) (byte) 1);
    double double7 = quarterlyDouble4.getQseqQ();
    double double8 = quarterlyDouble4.getQseqQ();
    double double9 = quarterlyDouble4.getTtmAvg();
    double double10 = quarterlyDouble4.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str12 = quarterlyDouble4.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
  }

  @Test
  public void test00108() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00108");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double6 = quarterlyDouble4.get((int) (byte) 1);
    double double7 = quarterlyDouble4.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str9 = quarterlyDouble4.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
  }

  @Test
  public void test00109() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00109");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      double double7 = quarterlyDouble4.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
  }

  @Test
  public void test00110() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00110");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    quarterlyDouble4.dArr = doubleArray10;
    double double13 = quarterlyDouble4.getQseqQ();
    double double14 = quarterlyDouble4.getTtmAvg();
    double double15 = quarterlyDouble4.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      double double16 = quarterlyDouble4.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
  }

  @Test
  public void test00111() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00111");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.getTtmAvg();
    double double8 = quarterlyDouble4.getMostRecent();
    double double10 = quarterlyDouble4.get((int) '4');
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str12 = quarterlyDouble4.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
  }

  @Test
  public void test00112() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00112");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) (byte) 10, (int) ' ');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00113() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00113");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", 10,
        1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00114() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00114");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getMostRecent();
    double double7 = quarterlyDouble4.getTtm();
    double double8 = quarterlyDouble4.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str10 = quarterlyDouble4.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
  }

  @Test
  public void test00115() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00115");
    java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
    java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies((java.util.List<java.lang.String>) strList3, 100, (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList10 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies((java.util.List<java.lang.String>) strList3, 100, (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList11 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList((java.util.List<java.lang.String>) strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList12 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList((java.util.List<java.lang.String>) strList3);
    java.lang.Class<?> wildcardClass13 = strList3.getClass();
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(companyDataList7);
    org.junit.Assert.assertNotNull(companyDataList10);
    org.junit.Assert.assertNotNull(manyCompanyDataList11);
    org.junit.Assert.assertNotNull(manyCompanyDataList12);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test00116() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00116");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, 100, (int) (byte) 0);
  }

  @Test
  public void test00117() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00117");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", (-1),
        (int) (byte) -1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00118() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00118");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) (short) -1, (int) (short) 100);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00119() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00119");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) ' ', (int) (byte) -1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00120() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00120");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, (int) (short) 100, (int) (byte) 100);
  }

  @Test
  public void test00121() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00121");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) (short) 10, (int) '4');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00122() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00122");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double7 = quarterlyDouble5.get(10);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str9 = quarterlyDouble5.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
  }

  @Test
  public void test00123() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00123");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", 1, 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00124() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00124");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.lang.String str2 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.lang.Class<?> wildcardClass4 = fieldDataList3.getClass();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test00125() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00125");
    java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
    java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList((java.util.List<java.lang.String>) strList3);
    java.lang.Class<?> wildcardClass6 = strList3.getClass();
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(manyCompanyDataList5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test00126() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00126");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double7 = quarterlyDouble5.get(100);
    double double8 = quarterlyDouble5.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str10 = quarterlyDouble5.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
  }

  @Test
  public void test00127() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00127");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile(0, (int) (byte) -1);
  }

  @Test
  public void test00128() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00128");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double double8 = quarterlyDouble4.getQseqQ();
    double double9 = quarterlyDouble4.getQseqQ();
    double double10 = quarterlyDouble4.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str12 = quarterlyDouble4.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5100.0d + "'", double9 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
  }

  @Test
  public void test00129() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00129");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, (int) (byte) 1, 1);
  }

  @Test
  public void test00130() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00130");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList0 = null;
    // The following exception was thrown during execution in test generation
    try {
      net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
          .getFieldData(fieldDataList0, (-1), (int) (short) -1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test00131() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00131");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary
        .readBinaryFile("hi!");
    java.lang.Class<?> wildcardClass2 = fieldDataList1.getClass();
    org.junit.Assert.assertNotNull(fieldDataList1);
    org.junit.Assert.assertNotNull(wildcardClass2);
  }

  @Test
  public void test00132() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00132");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double[] doubleArray5 = quarterlyDouble4.dArr;
    double double6 = quarterlyDouble4.getTtm();
    java.lang.Class<?> wildcardClass7 = quarterlyDouble4.getClass();
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test00133() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00133");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
    java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1,
        fieldDataArray0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (short) -1, (int) (short) 0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, 1, (int) (short) -1);
    org.junit.Assert.assertNotNull(fieldDataArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNull(fieldData5);
    org.junit.Assert.assertNull(fieldData8);
  }

  @Test
  public void test00134() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00134");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (byte) 1, 0);
  }

  @Test
  public void test00135() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00135");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) ' ', (int) (short) 0);
  }

  @Test
  public void test00136() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00136");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) (short) 1, (int) (short) 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00137() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00137");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double6 = quarterlyDouble4.get((int) (byte) 1);
    double double7 = quarterlyDouble4.getQseqQ();
    double double8 = quarterlyDouble4.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str10 = quarterlyDouble4.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
  }

  @Test
  public void test00138() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00138");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, (int) (short) 10, (int) (short) 0);
  }

  @Test
  public void test00139() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00139");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) (short) 1, 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00140() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00140");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double[] doubleArray5 = quarterlyDouble4.dArr;
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = new double[] {};
    quarterlyDouble4.dArr = doubleArray7;
    // The following exception was thrown during execution in test generation
    try {
      double double9 = quarterlyDouble4.getQseqQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
  }

  @Test
  public void test00141() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00141");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.get((int) '4');
    double double10 = quarterlyDouble4.deltaQ((int) (short) 1, 0);
    double[] doubleArray14 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    double double16 = quarterlyDouble15.getTtm();
    double double17 = quarterlyDouble15.getQseqQ();
    double[] doubleArray18 = quarterlyDouble15.dArr;
    quarterlyDouble4.dArr = doubleArray18;
    double double20 = quarterlyDouble4.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str22 = quarterlyDouble4.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 5100.0d + "'", double17 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
  }

  @Test
  public void test00142() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00142");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    quarterlyDouble4.dArr = doubleArray11;
    double double14 = quarterlyDouble4.getTtm();
    double[] doubleArray15 = quarterlyDouble4.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str18 = quarterlyDouble16.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00143() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00143");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double[] doubleArray5 = quarterlyDouble4.dArr;
    // The following exception was thrown during execution in test generation
    try {
      double double6 = quarterlyDouble4.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00144() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00144");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    quarterlyDouble4.dArr = doubleArray10;
    double double13 = quarterlyDouble4.getQseqQ();
    double double14 = quarterlyDouble4.getTtmAvg();
    double[] doubleArray15 = quarterlyDouble4.dArr;
    double[] doubleArray16 = quarterlyDouble4.dArr;
    // The following exception was thrown during execution in test generation
    try {
      double double17 = quarterlyDouble4.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00145() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00145");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (short) 10, (int) '4');
  }

  @Test
  public void test00146() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00146");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.getTtmAvg();
    double double9 = quarterlyDouble4.get((int) (byte) 100);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str11 = quarterlyDouble4.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9999.9999d) + "'", double9 == (-9999.9999d));
  }

  @Test
  public void test00147() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00147");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double7 = quarterlyDouble5.get(100);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str9 = quarterlyDouble5.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
  }

  @Test
  public void test00148() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00148");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, 10, (int) (short) 100);
  }

  @Test
  public void test00149() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00149");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double7 = quarterlyDouble5.get(10);
    // The following exception was thrown during execution in test generation
    try {
      double double8 = quarterlyDouble5.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
  }

  @Test
  public void test00150() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00150");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.getMostRecent();
    double double8 = quarterlyDouble4.getTtmAvg();
    double double9 = quarterlyDouble4.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str11 = quarterlyDouble4.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
  }

  @Test
  public void test00151() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00151");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray7);
    double double9 = quarterlyDouble8.getQseqQ();
    double double10 = quarterlyDouble8.getTtm();
    double double12 = quarterlyDouble8.get((int) (short) 0);
    double double13 = quarterlyDouble8.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str15 = quarterlyDouble8.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5100.0d + "'", double9 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
  }

  @Test
  public void test00152() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00152");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double7 = quarterlyDouble5.get(100);
    double[] doubleArray8 = quarterlyDouble5.dArr;
    double double11 = quarterlyDouble5.deltaQ((int) (short) 1, (-1));
    double double14 = quarterlyDouble5.deltaQ((int) 'a', 1);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str16 = quarterlyDouble5.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
  }

  @Test
  public void test00153() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00153");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double[] doubleArray6 = quarterlyDouble5.dArr;
    // The following exception was thrown during execution in test generation
    try {
      double double7 = quarterlyDouble5.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00154() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00154");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.lang.Class<?> wildcardClass5 = companyData1.getClass();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test00155() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00155");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double double8 = quarterlyDouble4.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str10 = quarterlyDouble4.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
  }

  @Test
  public void test00156() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00156");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.get((int) '4');
    double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    double[] doubleArray13 = quarterlyDouble12.dArr;
    double double14 = quarterlyDouble12.getQseqQ();
    double[] doubleArray15 = new double[] {};
    quarterlyDouble12.dArr = doubleArray15;
    quarterlyDouble4.dArr = doubleArray15;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str19 = quarterlyDouble4.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5100.0d + "'", double14 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
  }

  @Test
  public void test00157() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00157");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", 10,
        (int) (byte) 100);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00158() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00158");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double6 = quarterlyDouble5.getTtmAvg();
    double double7 = quarterlyDouble5.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str9 = quarterlyDouble5.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
  }

  @Test
  public void test00159() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00159");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) '4', (int) ' ');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00160() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00160");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray7);
    double double9 = quarterlyDouble8.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      double double12 = quarterlyDouble8.deltaQ(0, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
  }

  @Test
  public void test00161() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00161");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile(10, 0);
  }

  @Test
  public void test00162() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00162");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double6 = quarterlyDouble5.getTtmAvg();
    double double7 = quarterlyDouble5.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str9 = quarterlyDouble5.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
  }

  @Test
  public void test00163() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00163");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    quarterlyDouble4.dArr = doubleArray10;
    double double13 = quarterlyDouble4.getQseqQ();
    double double16 = quarterlyDouble4.deltaQ((int) (short) 100, (int) (byte) -1);
    double double19 = quarterlyDouble4.deltaQ((int) (byte) 100, 0);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str21 = quarterlyDouble4.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
  }

  @Test
  public void test00164() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00164");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (short) 10, (int) 'a');
  }

  @Test
  public void test00165() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00165");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (short) 0, (int) (short) 0);
  }

  @Test
  public void test00166() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00166");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) (short) -1, (int) (byte) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00167() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00167");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double6 = quarterlyDouble4.get((int) (byte) 1);
    double double7 = quarterlyDouble4.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str9 = quarterlyDouble4.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
  }

  @Test
  public void test00168() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00168");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.get((int) '4');
    double double10 = quarterlyDouble4.deltaQ((int) (short) 1, 0);
    double double11 = quarterlyDouble4.getMostRecent();
    double double12 = quarterlyDouble4.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      double double13 = quarterlyDouble4.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 5100.0d + "'", double12 == 5100.0d);
  }

  @Test
  public void test00169() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00169");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    java.lang.Class<?> wildcardClass6 = quarterlyDouble4.getClass();
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test00170() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00170");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double double8 = quarterlyDouble4.getQseqQ();
    double double9 = quarterlyDouble4.getTtmAvg();
    double double11 = quarterlyDouble4.get(0);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str13 = quarterlyDouble4.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
  }

  @Test
  public void test00171() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00171");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", 1,
        (int) 'a');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00172() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00172");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double[] doubleArray6 = quarterlyDouble5.dArr;
    double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    double double14 = quarterlyDouble12.get(100);
    double[] doubleArray15 = quarterlyDouble12.dArr;
    quarterlyDouble5.dArr = doubleArray15;
    // The following exception was thrown during execution in test generation
    try {
      double double17 = quarterlyDouble5.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00173() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00173");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, 1, 100);
  }

  @Test
  public void test00174() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00174");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double6 = quarterlyDouble5.getMostRecent();
    double double7 = quarterlyDouble5.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      double double8 = quarterlyDouble5.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
  }

  @Test
  public void test00175() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00175");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) (byte) 100, (int) (short) 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00176() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00176");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) (byte) -1, (int) (byte) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00177() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00177");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double6 = quarterlyDouble4.get((int) (byte) 1);
    double double7 = quarterlyDouble4.getQseqQ();
    double double9 = quarterlyDouble4.get((int) (byte) 1);
    // The following exception was thrown during execution in test generation
    try {
      double double10 = quarterlyDouble4.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
  }

  @Test
  public void test00178() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00178");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    quarterlyDouble4.dArr = doubleArray10;
    double double13 = quarterlyDouble4.getQseqQ();
    double double14 = quarterlyDouble4.getTtmAvg();
    double double17 = quarterlyDouble4.deltaQ((int) (byte) -1, (int) (byte) -1);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str19 = quarterlyDouble4.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
  }

  @Test
  public void test00179() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00179");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.getMostRecent();
    double double8 = quarterlyDouble4.getTtmAvg();
    double double9 = quarterlyDouble4.getMostRecent();
    double double12 = quarterlyDouble4.deltaQ((int) '4', (int) (short) 1);
    java.lang.Class<?> wildcardClass13 = quarterlyDouble4.getClass();
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test00180() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00180");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.get((int) '4');
    double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    double[] doubleArray13 = quarterlyDouble12.dArr;
    double double14 = quarterlyDouble12.getQseqQ();
    double[] doubleArray15 = new double[] {};
    quarterlyDouble12.dArr = doubleArray15;
    quarterlyDouble4.dArr = doubleArray15;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    double[] doubleArray22 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray22);
    double double24 = quarterlyDouble23.getTtm();
    double double26 = quarterlyDouble23.get((int) '4');
    double[] doubleArray30 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray30);
    double[] doubleArray32 = quarterlyDouble31.dArr;
    double double33 = quarterlyDouble31.getQseqQ();
    double[] doubleArray34 = new double[] {};
    quarterlyDouble31.dArr = doubleArray34;
    quarterlyDouble23.dArr = doubleArray34;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray34);
    quarterlyDouble18.dArr = doubleArray34;
    double[] doubleArray39 = quarterlyDouble18.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str41 = quarterlyDouble18.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5100.0d + "'", double14 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
    org.junit.Assert.assertNotNull(doubleArray22);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-9999.9999d) + "'", double26 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray30);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray32);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double33 + "' != '" + 5100.0d + "'", double33 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray34);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
    org.junit.Assert.assertNotNull(doubleArray39);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
  }

  @Test
  public void test00181() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00181");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double6 = quarterlyDouble4.get((int) (byte) 1);
    double double7 = quarterlyDouble4.getQseqQ();
    double double8 = quarterlyDouble4.getQseqQ();
    double double9 = quarterlyDouble4.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str11 = quarterlyDouble4.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5100.0d + "'", double9 == 5100.0d);
  }

  @Test
  public void test00182() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00182");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    quarterlyDouble4.dArr = doubleArray11;
    double double14 = quarterlyDouble4.getTtm();
    double[] doubleArray15 = quarterlyDouble4.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    double double18 = quarterlyDouble16.get((int) (byte) 10);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str20 = quarterlyDouble16.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-9999.9999d) + "'", double18 == (-9999.9999d));
  }

  @Test
  public void test00183() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00183");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (short) 10, (int) '#');
  }

  @Test
  public void test00184() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00184");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (short) 1, (int) '4');
  }

  @Test
  public void test00185() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00185");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", 0,
        (int) '4');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00186() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00186");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", 0,
        (int) (byte) 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00187() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00187");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double[] doubleArray6 = quarterlyDouble5.dArr;
    double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    double double14 = quarterlyDouble12.get(100);
    double[] doubleArray15 = quarterlyDouble12.dArr;
    quarterlyDouble5.dArr = doubleArray15;
    double double17 = quarterlyDouble5.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str19 = quarterlyDouble5.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
  }

  @Test
  public void test00188() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00188");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getMostRecent();
    double double7 = quarterlyDouble4.getTtm();
    double double8 = quarterlyDouble4.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str10 = quarterlyDouble4.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
  }

  @Test
  public void test00189() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00189");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double6 = quarterlyDouble4.get((int) (byte) 1);
    double double7 = quarterlyDouble4.getQseqQ();
    double double9 = quarterlyDouble4.get((int) (byte) 1);
    double double12 = quarterlyDouble4.deltaQ((int) (byte) 1, 0);
    // The following exception was thrown during execution in test generation
    try {
      double double13 = quarterlyDouble4.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
  }

  @Test
  public void test00190() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00190");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    quarterlyDouble4.dArr = doubleArray10;
    double double13 = quarterlyDouble4.getQseqQ();
    double double14 = quarterlyDouble4.getTtmAvg();
    double double15 = quarterlyDouble4.getTtm();
    double[] doubleArray19 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    double double21 = quarterlyDouble20.getTtm();
    double double22 = quarterlyDouble20.getQseqQ();
    double[] doubleArray23 = quarterlyDouble20.dArr;
    quarterlyDouble4.dArr = doubleArray23;
    // The following exception was thrown during execution in test generation
    try {
      double double25 = quarterlyDouble4.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 5100.0d + "'", double22 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00191() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00191");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, 10, (-1));
  }

  @Test
  public void test00192() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00192");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
    java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1,
        fieldDataArray0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (short) -1, (int) (short) 0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) 'a', 1);
    java.lang.Class<?> wildcardClass9 = fieldDataList1.getClass();
    org.junit.Assert.assertNotNull(fieldDataArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNull(fieldData5);
    org.junit.Assert.assertNull(fieldData8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test00193() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00193");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (short) 0, 0);
  }

  @Test
  public void test00194() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00194");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray7);
    double double9 = quarterlyDouble8.getQseqQ();
    double double12 = quarterlyDouble8.deltaQ((int) '#', (-1));
    // The following exception was thrown during execution in test generation
    try {
      double double13 = quarterlyDouble8.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5100.0d + "'", double9 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
  }

  @Test
  public void test00195() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00195");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double[] doubleArray5 = quarterlyDouble4.dArr;
    double[] doubleArray6 = quarterlyDouble4.dArr;
    double double8 = quarterlyDouble4.get((int) (byte) 10);
    // The following exception was thrown during execution in test generation
    try {
      double double11 = quarterlyDouble4.deltaQ((int) (byte) 1, (int) (byte) 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9999.9999d) + "'", double8 == (-9999.9999d));
  }

  @Test
  public void test00196() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00196");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) (byte) 100, (int) (byte) 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00197() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00197");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) 'a', (int) (short) 100);
  }

  @Test
  public void test00198() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00198");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    quarterlyDouble4.dArr = doubleArray11;
    double double14 = quarterlyDouble4.getTtm();
    double double16 = quarterlyDouble4.get((int) (short) 100);
    // The following exception was thrown during execution in test generation
    try {
      double double19 = quarterlyDouble4.deltaQ((int) (short) -1, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9999.9999d) + "'", double16 == (-9999.9999d));
  }

  @Test
  public void test00199() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00199");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.getMostRecent();
    double double8 = quarterlyDouble4.getTtmAvg();
    double double9 = quarterlyDouble4.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str11 = quarterlyDouble4.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5100.0d + "'", double9 == 5100.0d);
  }

  @Test
  public void test00200() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00200");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, (int) (short) 10, (int) (byte) -1);
  }

  @Test
  public void test00201() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00201");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double7 = quarterlyDouble5.get(10);
    double double8 = quarterlyDouble5.getMostRecent();
    double double9 = quarterlyDouble5.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str11 = quarterlyDouble5.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
  }

  @Test
  public void test00202() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00202");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
    java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1,
        fieldDataArray0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (short) -1, (int) (short) 0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) 'a', 1);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (short) 0, 10);
    org.junit.Assert.assertNotNull(fieldDataArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNull(fieldData5);
    org.junit.Assert.assertNull(fieldData8);
    org.junit.Assert.assertNull(fieldData11);
  }

  @Test
  public void test00203() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00203");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double[] doubleArray9 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    double double13 = quarterlyDouble11.get(100);
    double[] doubleArray14 = quarterlyDouble11.dArr;
    quarterlyDouble4.dArr = doubleArray14;
    java.lang.Class<?> wildcardClass16 = quarterlyDouble4.getClass();
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9999.9999d) + "'", double13 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test00204() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00204");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (byte) 10, 100);
  }

  @Test
  public void test00205() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00205");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray7);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray7);
    java.lang.Class<?> wildcardClass10 = quarterlyDouble9.getClass();
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test00206() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00206");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.get((int) '4');
    double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    double[] doubleArray13 = quarterlyDouble12.dArr;
    double double14 = quarterlyDouble12.getQseqQ();
    double[] doubleArray15 = new double[] {};
    quarterlyDouble12.dArr = doubleArray15;
    quarterlyDouble4.dArr = doubleArray15;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    java.lang.Class<?> wildcardClass19 = quarterlyDouble18.getClass();
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5100.0d + "'", double14 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test00207() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00207");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", 0,
        (int) (short) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00208() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00208");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.getTtmAvg();
    double double8 = quarterlyDouble4.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str10 = quarterlyDouble4.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
  }

  @Test
  public void test00209() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00209");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double7 = quarterlyDouble5.get(10);
    double double8 = quarterlyDouble5.getMostRecent();
    double double10 = quarterlyDouble5.get((int) (byte) -1);
    double double11 = quarterlyDouble5.getTtm();
    double double12 = quarterlyDouble5.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str14 = quarterlyDouble5.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
  }

  @Test
  public void test00210() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00210");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    quarterlyDouble4.dArr = doubleArray11;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str15 = quarterlyDouble4.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00211() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00211");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile(1, 100);
  }

  @Test
  public void test00212() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00212");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, 1, 1);
  }

  @Test
  public void test00213() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00213");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 0, 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList((java.util.List<java.lang.String>) strList2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList((java.util.List<java.lang.String>) strList2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList11 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies((java.util.List<java.lang.String>) strList2, 0, (int) (short) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList14 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies((java.util.List<java.lang.String>) strList2, 0, (int) (byte) 1);
    java.lang.Class<?> wildcardClass15 = strList2.getClass();
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(manyCompanyDataList7);
    org.junit.Assert.assertNotNull(manyCompanyDataList8);
    org.junit.Assert.assertNotNull(companyDataList11);
    org.junit.Assert.assertNotNull(companyDataList14);
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test00214() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00214");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    // The following exception was thrown during execution in test generation
    try {
      double double5 = quarterlyDouble4.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00215() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00215");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str9 = quarterlyDouble4.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
  }

  @Test
  public void test00216() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00216");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    quarterlyDouble4.dArr = doubleArray10;
    double double13 = quarterlyDouble4.getQseqQ();
    double double16 = quarterlyDouble4.deltaQ((int) (short) 100, (int) (byte) -1);
    double[] doubleArray20 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray20);
    double double22 = quarterlyDouble21.getTtmAvg();
    double double23 = quarterlyDouble21.getMostRecent();
    double double25 = quarterlyDouble21.get((int) 'a');
    double double27 = quarterlyDouble21.get((int) (byte) -1);
    double[] doubleArray31 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray31);
    double double33 = quarterlyDouble32.getTtm();
    double double34 = quarterlyDouble32.getQseqQ();
    double[] doubleArray35 = quarterlyDouble32.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray35);
    quarterlyDouble21.dArr = doubleArray35;
    quarterlyDouble4.dArr = doubleArray35;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray35);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str41 = quarterlyDouble39.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray20);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 52.0d + "'", double23 == 52.0d);
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-9999.9999d) + "'", double25 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-9999.9999d) + "'", double27 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray31);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    org.junit.Assert.assertTrue("'" + double34 + "' != '" + 5100.0d + "'", double34 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray35);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00217() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00217");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) (byte) -1, (int) '4');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00218() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00218");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double6 = quarterlyDouble4.get((int) (byte) 1);
    double double7 = quarterlyDouble4.getQseqQ();
    double double8 = quarterlyDouble4.getQseqQ();
    double double9 = quarterlyDouble4.getTtmAvg();
    double double10 = quarterlyDouble4.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      double double11 = quarterlyDouble4.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
  }

  @Test
  public void test00219() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00219");
    java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
    java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies((java.util.List<java.lang.String>) strList3, 100, (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList10 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies((java.util.List<java.lang.String>) strList3, 100, (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList11 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList((java.util.List<java.lang.String>) strList3);
    java.lang.Class<?> wildcardClass12 = strList3.getClass();
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(companyDataList7);
    org.junit.Assert.assertNotNull(companyDataList10);
    org.junit.Assert.assertNotNull(manyCompanyDataList11);
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test00220() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00220");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (short) -1, 10);
  }

  @Test
  public void test00222() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00222");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double double8 = quarterlyDouble4.getQseqQ();
    double[] doubleArray12 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray12);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray12);
    quarterlyDouble4.dArr = doubleArray12;
    double[] doubleArray19 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    double[] doubleArray21 = quarterlyDouble20.dArr;
    double[] doubleArray22 = quarterlyDouble20.dArr;
    quarterlyDouble4.dArr = doubleArray22;
    java.lang.Class<?> wildcardClass24 = quarterlyDouble4.getClass();
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray22);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(wildcardClass24);
  }

  @Test
  public void test00223() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00223");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", 0,
        (int) (short) 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00224() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00224");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.get((int) '4');
    double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    double[] doubleArray13 = quarterlyDouble12.dArr;
    double double14 = quarterlyDouble12.getQseqQ();
    double[] doubleArray15 = new double[] {};
    quarterlyDouble12.dArr = doubleArray15;
    quarterlyDouble4.dArr = doubleArray15;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    double double19 = quarterlyDouble18.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      double double20 = quarterlyDouble18.getMostRecent();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5100.0d + "'", double14 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
  }

  @Test
  public void test00225() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00225");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.getMostRecent();
    double double8 = quarterlyDouble4.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str10 = quarterlyDouble4.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
  }

  @Test
  public void test00226() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00226");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, (int) (short) 100, (int) 'a');
  }

  @Test
  public void test00227() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00227");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) '4', 1);
  }

  @Test
  public void test00228() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00228");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double double7 = quarterlyDouble4.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str9 = quarterlyDouble4.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
  }

  @Test
  public void test00229() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00229");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.lang.String str5 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
    java.lang.Class<?> wildcardClass7 = companyData1.getClass();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertNotNull(fieldDataList6);
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test00230() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00230");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double[] doubleArray9 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    double double13 = quarterlyDouble11.get(100);
    double[] doubleArray14 = quarterlyDouble11.dArr;
    quarterlyDouble4.dArr = doubleArray14;
    double double16 = quarterlyDouble4.getQseqQ();
    double[] doubleArray20 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray20);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray20);
    double double24 = quarterlyDouble22.get(100);
    double[] doubleArray25 = quarterlyDouble22.dArr;
    double double28 = quarterlyDouble22.deltaQ((int) '4', (int) (byte) 0);
    double[] doubleArray32 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray32);
    double double34 = quarterlyDouble33.getTtm();
    double double36 = quarterlyDouble33.get((int) '4');
    double[] doubleArray40 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray40);
    double[] doubleArray42 = quarterlyDouble41.dArr;
    double double43 = quarterlyDouble41.getQseqQ();
    double[] doubleArray44 = new double[] {};
    quarterlyDouble41.dArr = doubleArray44;
    quarterlyDouble33.dArr = doubleArray44;
    double[] doubleArray47 = quarterlyDouble33.dArr;
    quarterlyDouble22.dArr = doubleArray47;
    quarterlyDouble4.dArr = doubleArray47;
    // The following exception was thrown during execution in test generation
    try {
      double double50 = quarterlyDouble4.getMostRecent();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9999.9999d) + "'", double13 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5100.0d + "'", double16 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray20);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-9999.9999d) + "'", double24 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray32);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
    org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-9999.9999d) + "'", double36 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray40);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray42);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double43 + "' != '" + 5100.0d + "'", double43 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray44);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[]");
    org.junit.Assert.assertNotNull(doubleArray47);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
  }

  @Test
  public void test00231() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00231");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    quarterlyDouble4.dArr = doubleArray10;
    double double13 = quarterlyDouble4.getQseqQ();
    double double14 = quarterlyDouble4.getTtmAvg();
    double[] doubleArray15 = quarterlyDouble4.dArr;
    double double16 = quarterlyDouble4.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str18 = quarterlyDouble4.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5100.0d + "'", double16 == 5100.0d);
  }

  @Test
  public void test00232() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00232");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile(0, (int) (short) -1);
  }

  @Test
  public void test00233() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00233");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getMostRecent();
    double double7 = quarterlyDouble4.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str9 = quarterlyDouble4.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
  }

  @Test
  public void test00234() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00234");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    quarterlyDouble4.dArr = doubleArray11;
    java.lang.Class<?> wildcardClass14 = quarterlyDouble4.getClass();
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test00235() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00235");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.getMostRecent();
    double double8 = quarterlyDouble4.getTtmAvg();
    double double9 = quarterlyDouble4.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      double double10 = quarterlyDouble4.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5100.0d + "'", double9 == 5100.0d);
  }

  @Test
  public void test00236() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00236");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", 10, 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00237() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00237");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, (int) (byte) 100, 1);
  }

  @Test
  public void test00238() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00238");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    quarterlyDouble4.dArr = doubleArray10;
    double double13 = quarterlyDouble4.getQseqQ();
    double double14 = quarterlyDouble4.getTtmAvg();
    double[] doubleArray15 = quarterlyDouble4.dArr;
    double[] doubleArray16 = quarterlyDouble4.dArr;
    double double17 = quarterlyDouble4.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      double double18 = quarterlyDouble4.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
  }

  @Test
  public void test00239() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00239");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getMostRecent();
    double double8 = quarterlyDouble4.get((int) 'a');
    double double10 = quarterlyDouble4.get((int) (byte) -1);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str12 = quarterlyDouble4.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9999.9999d) + "'", double8 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
  }

  @Test
  public void test00240() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00240");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    quarterlyDouble4.dArr = doubleArray11;
    double double14 = quarterlyDouble4.getTtm();
    double[] doubleArray15 = quarterlyDouble4.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str18 = quarterlyDouble16.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00241() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00241");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, (int) (short) 100, 10);
  }

  @Test
  public void test00242() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00242");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double[] doubleArray5 = quarterlyDouble4.dArr;
    double[] doubleArray6 = quarterlyDouble4.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str8 = quarterlyDouble4.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00243() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00243");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.getTtmAvg();
    double double8 = quarterlyDouble4.getQseqQ();
    double[] doubleArray9 = quarterlyDouble4.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str11 = quarterlyDouble4.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00244() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00244");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, 0, (-1));
  }

  @Test
  public void test00245() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00245");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double6 = quarterlyDouble4.get((int) (byte) 1);
    double double7 = quarterlyDouble4.getQseqQ();
    double double9 = quarterlyDouble4.get((int) (byte) 1);
    double double12 = quarterlyDouble4.deltaQ((int) (byte) 1, 0);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str14 = quarterlyDouble4.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
  }

  @Test
  public void test00246() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00246");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.getTtmAvg();
    double double9 = quarterlyDouble4.get((int) (byte) 100);
    double double12 = quarterlyDouble4.deltaQ(10, (int) ' ');
    // The following exception was thrown during execution in test generation
    try {
      double double15 = quarterlyDouble4.deltaQ(0, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9999.9999d) + "'", double9 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
  }

  @Test
  public void test00247() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00247");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (short) -1, 1);
  }

  @Test
  public void test00248() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00248");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double7 = quarterlyDouble5.get(10);
    double double8 = quarterlyDouble5.getMostRecent();
    double double10 = quarterlyDouble5.get((int) (byte) -1);
    // The following exception was thrown during execution in test generation
    try {
      double double13 = quarterlyDouble5.deltaQ(0, (int) 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
  }

  @Test
  public void test00249() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00249");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((-1), (int) (short) 1);
  }

  @Test
  public void test00250() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00250");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, (int) 'a', 0);
  }

  @Test
  public void test00251() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00251");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (byte) 10, 0);
  }

  @Test
  public void test00252() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00252");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile(100, (int) (short) 1);
  }

  @Test
  public void test00253() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00253");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.getTtmAvg();
    double double8 = quarterlyDouble4.getMostRecent();
    double double10 = quarterlyDouble4.get((int) '4');
    double[] doubleArray14 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    quarterlyDouble4.dArr = doubleArray14;
    // The following exception was thrown during execution in test generation
    try {
      double double17 = quarterlyDouble4.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00254() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00254");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) (short) 1, (int) (short) -1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00255() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00255");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, (int) '#', (int) 'a');
  }

  @Test
  public void test00256() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00256");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.get((int) '4');
    double double10 = quarterlyDouble4.deltaQ(10, (int) (short) 10);
    // The following exception was thrown during execution in test generation
    try {
      double double13 = quarterlyDouble4.deltaQ(0, (int) ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
  }

  @Test
  public void test00257() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00257");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, (int) (byte) 0, (int) (short) 1);
  }

  @Test
  public void test00258() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00258");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double6 = quarterlyDouble4.get((int) (byte) 1);
    double[] doubleArray7 = quarterlyDouble4.dArr;
    // The following exception was thrown during execution in test generation
    try {
      double double8 = quarterlyDouble4.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00259() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00259");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getMostRecent();
    double double7 = quarterlyDouble4.getTtm();
    double double8 = quarterlyDouble4.getMostRecent();
    java.lang.Class<?> wildcardClass9 = quarterlyDouble4.getClass();
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test00260() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00260");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getMostRecent();
    double double7 = quarterlyDouble4.getTtm();
    double double8 = quarterlyDouble4.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      double double9 = quarterlyDouble4.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
  }

  @Test
  public void test00261() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00261");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.get((int) '4');
    double double10 = quarterlyDouble4.deltaQ((int) (short) 1, 0);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str12 = quarterlyDouble4.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
  }

  @Test
  public void test00262() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00262");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    quarterlyDouble4.dArr = doubleArray10;
    double double13 = quarterlyDouble4.getQseqQ();
    double double16 = quarterlyDouble4.deltaQ((int) (short) 100, (int) (byte) -1);
    double[] doubleArray17 = quarterlyDouble4.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str19 = quarterlyDouble4.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00263() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00263");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    quarterlyDouble4.dArr = doubleArray11;
    double double14 = quarterlyDouble4.getTtm();
    double[] doubleArray15 = quarterlyDouble4.dArr;
    // The following exception was thrown during execution in test generation
    try {
      double double16 = quarterlyDouble4.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00264() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00264");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) (short) 100, 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00265() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00265");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double[] doubleArray6 = quarterlyDouble5.dArr;
    double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    double double14 = quarterlyDouble12.get(100);
    double[] doubleArray15 = quarterlyDouble12.dArr;
    quarterlyDouble5.dArr = doubleArray15;
    double double17 = quarterlyDouble5.getTtmAvg();
    double double18 = quarterlyDouble5.getQseqQ();
    double[] doubleArray19 = quarterlyDouble5.dArr;
    java.lang.Class<?> wildcardClass20 = quarterlyDouble5.getClass();
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 5100.0d + "'", double18 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(wildcardClass20);
  }

  @Test
  public void test00266() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00266");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", 1,
        (int) '4');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00267() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00267");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.getMostRecent();
    double double8 = quarterlyDouble4.getTtmAvg();
    double double9 = quarterlyDouble4.getMostRecent();
    double double10 = quarterlyDouble4.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str12 = quarterlyDouble4.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
  }

  @Test
  public void test00268() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00268");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray7);
    double double9 = quarterlyDouble8.getQseqQ();
    double double12 = quarterlyDouble8.deltaQ((int) '#', (-1));
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str14 = quarterlyDouble8.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5100.0d + "'", double9 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
  }

  @Test
  public void test00269() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00269");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    quarterlyDouble4.dArr = doubleArray11;
    double double15 = quarterlyDouble4.get(1);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str17 = quarterlyDouble4.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
  }

  @Test
  public void test00270() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00270");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (short) 0, (int) '4');
  }

  @Test
  public void test00271() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00271");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 0, 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList((java.util.List<java.lang.String>) strList2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList((java.util.List<java.lang.String>) strList2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList11 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies((java.util.List<java.lang.String>) strList2, 0, (int) (short) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList12 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList((java.util.List<java.lang.String>) strList2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList13 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList((java.util.List<java.lang.String>) strList2);
    java.lang.Class<?> wildcardClass14 = manyCompanyDataList13.getClass();
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(manyCompanyDataList7);
    org.junit.Assert.assertNotNull(manyCompanyDataList8);
    org.junit.Assert.assertNotNull(companyDataList11);
    org.junit.Assert.assertNotNull(manyCompanyDataList12);
    org.junit.Assert.assertNotNull(manyCompanyDataList13);
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test00272() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00272");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    quarterlyDouble4.dArr = doubleArray10;
    double double13 = quarterlyDouble4.getQseqQ();
    double double14 = quarterlyDouble4.getTtmAvg();
    double double15 = quarterlyDouble4.getTtm();
    double[] doubleArray19 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    double double21 = quarterlyDouble20.getTtm();
    double double22 = quarterlyDouble20.getQseqQ();
    double[] doubleArray23 = quarterlyDouble20.dArr;
    quarterlyDouble4.dArr = doubleArray23;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str26 = quarterlyDouble4.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 5100.0d + "'", double22 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00273() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00273");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    quarterlyDouble4.dArr = doubleArray10;
    double double13 = quarterlyDouble4.getQseqQ();
    double double16 = quarterlyDouble4.deltaQ((int) (short) 100, (int) (byte) -1);
    double double19 = quarterlyDouble4.deltaQ((int) (byte) 100, 0);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str21 = quarterlyDouble4.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
  }

  @Test
  public void test00274() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00274");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.getMostRecent();
    double double8 = quarterlyDouble4.getTtmAvg();
    double double9 = quarterlyDouble4.getMostRecent();
    double double10 = quarterlyDouble4.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str12 = quarterlyDouble4.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
  }

  @Test
  public void test00275() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00275");
    java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
    java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies((java.util.List<java.lang.String>) strList3, 100, (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList10 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList13 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies((java.util.List<java.lang.String>) strList3, 1, (int) (byte) 1);
    java.lang.Class<?> wildcardClass14 = companyDataList13.getClass();
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(companyDataList7);
    org.junit.Assert.assertNotNull(companyDataList10);
    org.junit.Assert.assertNotNull(companyDataList13);
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test00276() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00276");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile(10, (int) ' ');
  }

  @Test
  public void test00277() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00277");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double[] doubleArray5 = quarterlyDouble4.dArr;
    double[] doubleArray6 = quarterlyDouble4.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str8 = quarterlyDouble4.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00278() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00278");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, (int) '4', (int) (short) -1);
  }

  @Test
  public void test00279() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00279");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double7 = quarterlyDouble5.get(10);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str9 = quarterlyDouble5.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
  }

  @Test
  public void test00280() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00280");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, (int) (short) 10, (int) (short) 1);
  }

  @Test
  public void test00281() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00281");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", 100,
        (int) (byte) 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00282() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00282");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    quarterlyDouble4.dArr = doubleArray10;
    double double13 = quarterlyDouble4.getQseqQ();
    double double16 = quarterlyDouble4.deltaQ((int) (short) 100, (int) (byte) -1);
    double double19 = quarterlyDouble4.deltaQ((int) ' ', 100);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str21 = quarterlyDouble4.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
  }

  @Test
  public void test00283() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00283");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray7);
    double double9 = quarterlyDouble8.getQseqQ();
    double double10 = quarterlyDouble8.getMostRecent();
    double[] doubleArray11 = quarterlyDouble8.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str13 = quarterlyDouble8.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5100.0d + "'", double9 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00284() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00284");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.getTtmAvg();
    double double9 = quarterlyDouble4.get((int) (byte) 100);
    double[] doubleArray10 = quarterlyDouble4.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    // The following exception was thrown during execution in test generation
    try {
      double double12 = quarterlyDouble11.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9999.9999d) + "'", double9 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00285() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00285");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    quarterlyDouble4.dArr = doubleArray11;
    double double14 = quarterlyDouble4.getTtm();
    double[] doubleArray15 = quarterlyDouble4.dArr;
    double[] doubleArray19 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    double double21 = quarterlyDouble20.getTtm();
    double double23 = quarterlyDouble20.get((int) '4');
    double[] doubleArray27 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray27);
    double[] doubleArray29 = quarterlyDouble28.dArr;
    double double30 = quarterlyDouble28.getQseqQ();
    double[] doubleArray31 = new double[] {};
    quarterlyDouble28.dArr = doubleArray31;
    quarterlyDouble20.dArr = doubleArray31;
    double[] doubleArray34 = quarterlyDouble20.dArr;
    quarterlyDouble4.dArr = doubleArray34;
    // The following exception was thrown during execution in test generation
    try {
      double double36 = quarterlyDouble4.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-9999.9999d) + "'", double23 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray27);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray29);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + 5100.0d + "'", double30 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray31);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
    org.junit.Assert.assertNotNull(doubleArray34);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
  }

  @Test
  public void test00286() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00286");
    java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
    java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies((java.util.List<java.lang.String>) strList3, 100, (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList10 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList13 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies((java.util.List<java.lang.String>) strList3, 1, (int) (byte) 1);
    java.lang.Class<?> wildcardClass14 = strList3.getClass();
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(companyDataList7);
    org.junit.Assert.assertNotNull(companyDataList10);
    org.junit.Assert.assertNotNull(companyDataList13);
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test00287() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00287");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile(10, (int) (byte) 10);
  }

  @Test
  public void test00288() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00288");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
    java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1,
        fieldDataArray0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, 0, (int) 'a');
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, 0, (int) (short) 0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (byte) 1, 1);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData14 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (byte) 0, (int) (short) 100);
    org.junit.Assert.assertNotNull(fieldDataArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNull(fieldData5);
    org.junit.Assert.assertNull(fieldData8);
    org.junit.Assert.assertNull(fieldData11);
    org.junit.Assert.assertNull(fieldData14);
  }

  @Test
  public void test00289() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00289");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) '#', (int) '4');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00290() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00290");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    quarterlyDouble4.dArr = doubleArray10;
    double double13 = quarterlyDouble4.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str15 = quarterlyDouble4.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
  }

  @Test
  public void test00291() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00291");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) '#', (int) (byte) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00292() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00292");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) (byte) 1, (int) (short) -1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00293() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00293");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double[] doubleArray9 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    double double13 = quarterlyDouble11.get(100);
    double[] doubleArray14 = quarterlyDouble11.dArr;
    quarterlyDouble4.dArr = doubleArray14;
    double double16 = quarterlyDouble4.getQseqQ();
    double[] doubleArray20 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray20);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray20);
    double double24 = quarterlyDouble22.get(100);
    double[] doubleArray25 = quarterlyDouble22.dArr;
    double double28 = quarterlyDouble22.deltaQ((int) '4', (int) (byte) 0);
    double[] doubleArray32 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray32);
    double double34 = quarterlyDouble33.getTtm();
    double double36 = quarterlyDouble33.get((int) '4');
    double[] doubleArray40 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray40);
    double[] doubleArray42 = quarterlyDouble41.dArr;
    double double43 = quarterlyDouble41.getQseqQ();
    double[] doubleArray44 = new double[] {};
    quarterlyDouble41.dArr = doubleArray44;
    quarterlyDouble33.dArr = doubleArray44;
    double[] doubleArray47 = quarterlyDouble33.dArr;
    quarterlyDouble22.dArr = doubleArray47;
    quarterlyDouble4.dArr = doubleArray47;
    double double50 = quarterlyDouble4.getTtmAvg();
    double double52 = quarterlyDouble4.get((int) (byte) -1);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str54 = quarterlyDouble4.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9999.9999d) + "'", double13 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5100.0d + "'", double16 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray20);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-9999.9999d) + "'", double24 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray32);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
    org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-9999.9999d) + "'", double36 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray40);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray42);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double43 + "' != '" + 5100.0d + "'", double43 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray44);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[]");
    org.junit.Assert.assertNotNull(doubleArray47);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
    org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
    org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-9999.9999d) + "'", double52 == (-9999.9999d));
  }

  @Test
  public void test00294() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00294");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (byte) 100, 100);
  }

  @Test
  public void test00295() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00295");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray7);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.Class<?> wildcardClass10 = quarterlyDouble8.getClass();
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test00296() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00296");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (short) -1, (int) (byte) 0);
  }

  @Test
  public void test00297() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00297");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    quarterlyDouble4.dArr = doubleArray11;
    double double14 = quarterlyDouble4.getTtm();
    double[] doubleArray15 = quarterlyDouble4.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    double double18 = quarterlyDouble16.get((int) (byte) 10);
    double double21 = quarterlyDouble16.deltaQ((int) (short) -1, (int) (short) 1);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str23 = quarterlyDouble16.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-9999.9999d) + "'", double18 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
  }

  @Test
  public void test00298() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00298");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", 1,
        (int) (short) 100);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00299() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00299");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    quarterlyDouble4.dArr = doubleArray10;
    double double13 = quarterlyDouble4.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str15 = quarterlyDouble4.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
  }

  @Test
  public void test00300() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00300");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (byte) 0, (int) (short) -1);
  }

  @Test
  public void test00301() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00301");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.getTtmAvg();
    double double9 = quarterlyDouble4.get((int) (byte) 100);
    double[] doubleArray10 = quarterlyDouble4.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9999.9999d) + "'", double9 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test00302() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00302");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double double8 = quarterlyDouble4.getQseqQ();
    double[] doubleArray12 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray12);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray12);
    quarterlyDouble4.dArr = doubleArray12;
    double[] doubleArray16 = quarterlyDouble4.dArr;
    double[] doubleArray20 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray20);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray20);
    double[] doubleArray23 = quarterlyDouble22.dArr;
    double[] doubleArray27 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray27);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray27);
    double double31 = quarterlyDouble29.get(100);
    double[] doubleArray32 = quarterlyDouble29.dArr;
    quarterlyDouble22.dArr = doubleArray32;
    quarterlyDouble4.dArr = doubleArray32;
    java.lang.Class<?> wildcardClass35 = doubleArray32.getClass();
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray20);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray27);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-9999.9999d) + "'", double31 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray32);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(wildcardClass35);
  }

  @Test
  public void test00303() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00303");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.getTtmAvg();
    double double9 = quarterlyDouble4.get((int) ' ');
    double double10 = quarterlyDouble4.getMostRecent();
    double double12 = quarterlyDouble4.get(10);
    double double15 = quarterlyDouble4.deltaQ(10, (int) (short) -1);
    double double16 = quarterlyDouble4.getMostRecent();
    java.lang.Class<?> wildcardClass17 = quarterlyDouble4.getClass();
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9999.9999d) + "'", double9 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test00304() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00304");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double7 = quarterlyDouble5.get(10);
    double double8 = quarterlyDouble5.getMostRecent();
    double double10 = quarterlyDouble5.get((int) (byte) -1);
    double double11 = quarterlyDouble5.getTtm();
    double double14 = quarterlyDouble5.deltaQ((int) (byte) -1, (int) (byte) 0);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str16 = quarterlyDouble5.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
  }

  @Test
  public void test00305() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00305");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, 0, 1);
  }

  @Test
  public void test00306() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00306");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) (byte) 1, (int) '#');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00307() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00307");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double[] doubleArray9 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    double double13 = quarterlyDouble11.get(100);
    double[] doubleArray14 = quarterlyDouble11.dArr;
    quarterlyDouble4.dArr = doubleArray14;
    double double16 = quarterlyDouble4.getQseqQ();
    double[] doubleArray20 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray20);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray20);
    double double24 = quarterlyDouble22.get(100);
    double[] doubleArray25 = quarterlyDouble22.dArr;
    double double28 = quarterlyDouble22.deltaQ((int) '4', (int) (byte) 0);
    double[] doubleArray32 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray32);
    double double34 = quarterlyDouble33.getTtm();
    double double36 = quarterlyDouble33.get((int) '4');
    double[] doubleArray40 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray40);
    double[] doubleArray42 = quarterlyDouble41.dArr;
    double double43 = quarterlyDouble41.getQseqQ();
    double[] doubleArray44 = new double[] {};
    quarterlyDouble41.dArr = doubleArray44;
    quarterlyDouble33.dArr = doubleArray44;
    double[] doubleArray47 = quarterlyDouble33.dArr;
    quarterlyDouble22.dArr = doubleArray47;
    quarterlyDouble4.dArr = doubleArray47;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble50 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray47);
    // The following exception was thrown during execution in test generation
    try {
      double double51 = quarterlyDouble50.getMostRecent();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9999.9999d) + "'", double13 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5100.0d + "'", double16 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray20);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-9999.9999d) + "'", double24 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray32);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
    org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-9999.9999d) + "'", double36 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray40);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray42);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double43 + "' != '" + 5100.0d + "'", double43 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray44);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[]");
    org.junit.Assert.assertNotNull(doubleArray47);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
  }

  @Test
  public void test00308() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00308");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray7);
    double double9 = quarterlyDouble8.getQseqQ();
    double double10 = quarterlyDouble8.getTtm();
    double double12 = quarterlyDouble8.get((int) (short) 0);
    java.lang.Class<?> wildcardClass13 = quarterlyDouble8.getClass();
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5100.0d + "'", double9 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test00309() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00309");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double6 = quarterlyDouble4.get((int) (byte) 1);
    double double7 = quarterlyDouble4.getQseqQ();
    double double8 = quarterlyDouble4.getQseqQ();
    double double9 = quarterlyDouble4.getTtmAvg();
    double double10 = quarterlyDouble4.getTtm();
    double[] doubleArray11 = quarterlyDouble4.dArr;
    // The following exception was thrown during execution in test generation
    try {
      double double12 = quarterlyDouble4.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00310() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00310");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double7 = quarterlyDouble5.get(10);
    double double8 = quarterlyDouble5.getMostRecent();
    double double9 = quarterlyDouble5.getMostRecent();
    double double10 = quarterlyDouble5.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str12 = quarterlyDouble5.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
  }

  @Test
  public void test00311() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00311");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.getTtmAvg();
    double double8 = quarterlyDouble4.getMostRecent();
    double double10 = quarterlyDouble4.get((int) '4');
    double[] doubleArray14 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    quarterlyDouble4.dArr = doubleArray14;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str19 = quarterlyDouble17.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00312() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00312");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    quarterlyDouble4.dArr = doubleArray10;
    double double13 = quarterlyDouble4.getQseqQ();
    double double14 = quarterlyDouble4.getTtmAvg();
    double double15 = quarterlyDouble4.getTtm();
    double[] doubleArray19 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    double double21 = quarterlyDouble20.getTtm();
    double double22 = quarterlyDouble20.getQseqQ();
    double[] doubleArray23 = quarterlyDouble20.dArr;
    quarterlyDouble4.dArr = doubleArray23;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray23);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str27 = quarterlyDouble25.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 5100.0d + "'", double22 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00313() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00313");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    quarterlyDouble4.dArr = doubleArray11;
    double double14 = quarterlyDouble4.getTtm();
    double[] doubleArray15 = quarterlyDouble4.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    double double18 = quarterlyDouble16.get((int) (byte) 10);
    double double19 = quarterlyDouble16.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str21 = quarterlyDouble16.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-9999.9999d) + "'", double18 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
  }

  @Test
  public void test00314() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00314");
    java.util.List<java.lang.String> strList0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
          .getCompanies(strList0, 1, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test00315() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00315");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) (byte) -1, (int) '4');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00316() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00316");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double6 = quarterlyDouble4.get((int) (byte) 1);
    double double7 = quarterlyDouble4.getQseqQ();
    double[] doubleArray8 = quarterlyDouble4.dArr;
    // The following exception was thrown during execution in test generation
    try {
      double double9 = quarterlyDouble4.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00317() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00317");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (short) 1, (int) ' ');
  }

  @Test
  public void test00318() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00318");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (byte) 10, (-1));
  }

  @Test
  public void test00319() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00319");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) (short) 0, (int) (byte) -1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00320() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00320");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, (int) (byte) 0, (int) (byte) 100);
  }

  @Test
  public void test00321() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00321");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    quarterlyDouble4.dArr = doubleArray11;
    double double15 = quarterlyDouble4.get(1);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str17 = quarterlyDouble4.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
  }

  @Test
  public void test00322() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00322");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) ' ', (int) ' ');
  }

  @Test
  public void test00323() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00323");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double7 = quarterlyDouble5.get(100);
    double double8 = quarterlyDouble5.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str10 = quarterlyDouble5.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
  }

  @Test
  public void test00324() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00324");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double7 = quarterlyDouble5.get(10);
    double double8 = quarterlyDouble5.getMostRecent();
    double double10 = quarterlyDouble5.get((int) (byte) -1);
    double double11 = quarterlyDouble5.getTtm();
    double double12 = quarterlyDouble5.getTtmAvg();
    double double15 = quarterlyDouble5.deltaQ((int) '#', (int) (short) 10);
    // The following exception was thrown during execution in test generation
    try {
      double double18 = quarterlyDouble5.deltaQ((int) (byte) 0, (int) (byte) 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
  }

  @Test
  public void test00325() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00325");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, (int) '4', (int) (short) 1);
  }

  @Test
  public void test00326() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00326");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (byte) 1, (int) 'a');
  }

  @Test
  public void test00327() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00327");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getMostRecent();
    double double8 = quarterlyDouble4.get((int) 'a');
    double double10 = quarterlyDouble4.get((int) (byte) -1);
    double[] doubleArray14 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    double double16 = quarterlyDouble15.getTtm();
    double double17 = quarterlyDouble15.getQseqQ();
    double[] doubleArray18 = quarterlyDouble15.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    quarterlyDouble4.dArr = doubleArray18;
    double double21 = quarterlyDouble4.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str23 = quarterlyDouble4.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9999.9999d) + "'", double8 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 5100.0d + "'", double17 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
  }

  @Test
  public void test00328() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00328");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double double8 = quarterlyDouble4.getQseqQ();
    double double9 = quarterlyDouble4.getQseqQ();
    double double10 = quarterlyDouble4.getTtmAvg();
    java.lang.Class<?> wildcardClass11 = quarterlyDouble4.getClass();
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5100.0d + "'", double9 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test00329() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00329");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double double8 = quarterlyDouble4.getQseqQ();
    double[] doubleArray12 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray12);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray12);
    quarterlyDouble4.dArr = doubleArray12;
    double[] doubleArray19 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    double[] doubleArray21 = quarterlyDouble20.dArr;
    double[] doubleArray22 = quarterlyDouble20.dArr;
    quarterlyDouble4.dArr = doubleArray22;
    double double24 = quarterlyDouble4.getQseqQ();
    double double25 = quarterlyDouble4.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      double double26 = quarterlyDouble4.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray22);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + 5100.0d + "'", double24 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
  }

  @Test
  public void test00330() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00330");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile(1, (int) '#');
  }

  @Test
  public void test00331() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00331");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", 1,
        (int) (short) -1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00332() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00332");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getMostRecent();
    double double8 = quarterlyDouble4.get((int) 'a');
    double double10 = quarterlyDouble4.get((int) (byte) -1);
    double[] doubleArray14 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    double double16 = quarterlyDouble15.getTtm();
    double double17 = quarterlyDouble15.getQseqQ();
    double[] doubleArray18 = quarterlyDouble15.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    quarterlyDouble4.dArr = doubleArray18;
    double double21 = quarterlyDouble4.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      double double22 = quarterlyDouble4.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9999.9999d) + "'", double8 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 5100.0d + "'", double17 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
  }

  @Test
  public void test00333() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00333");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double double8 = quarterlyDouble4.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str10 = quarterlyDouble4.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
  }

  @Test
  public void test00334() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00334");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    quarterlyDouble4.dArr = doubleArray10;
    double double13 = quarterlyDouble4.getQseqQ();
    double double14 = quarterlyDouble4.getTtmAvg();
    double[] doubleArray15 = quarterlyDouble4.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str17 = quarterlyDouble4.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00335() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00335");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (short) 1, (int) (short) 100);
  }

  @Test
  public void test00336() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00336");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.lang.String str2 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.lang.Class<?> wildcardClass4 = companyData1.getClass();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test00337() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00337");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    quarterlyDouble4.dArr = doubleArray11;
    double double14 = quarterlyDouble4.getTtm();
    double[] doubleArray15 = quarterlyDouble4.dArr;
    double double17 = quarterlyDouble4.get(0);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str19 = quarterlyDouble4.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
  }

  @Test
  public void test00338() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00338");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, (int) (byte) 100, (int) (short) 10);
  }

  @Test
  public void test00339() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00339");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (byte) -1, (int) (short) -1);
  }

  @Test
  public void test00340() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00340");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.lang.Class<?> wildcardClass4 = companyData1.getClass();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test00341() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00341");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.getTtmAvg();
    double double9 = quarterlyDouble4.get((int) ' ');
    double double10 = quarterlyDouble4.getMostRecent();
    java.lang.Class<?> wildcardClass11 = quarterlyDouble4.getClass();
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9999.9999d) + "'", double9 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test00342() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00342");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double7 = quarterlyDouble5.get(10);
    double double8 = quarterlyDouble5.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      double double11 = quarterlyDouble5.deltaQ((int) (byte) 0, (int) (short) 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
  }

  @Test
  public void test00343() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00343");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double[] doubleArray6 = quarterlyDouble5.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str9 = quarterlyDouble7.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00344() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00344");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    quarterlyDouble4.dArr = doubleArray11;
    double double14 = quarterlyDouble4.getTtm();
    double[] doubleArray15 = quarterlyDouble4.dArr;
    double double16 = quarterlyDouble4.getQseqQ();
    double double17 = quarterlyDouble4.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str19 = quarterlyDouble4.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5100.0d + "'", double16 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
  }

  @Test
  public void test00345() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00345");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, (-1), 0);
  }

  @Test
  public void test00346() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00346");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, 100, (int) '4');
  }

  @Test
  public void test00347() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00347");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.get((int) '4');
    double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    double[] doubleArray13 = quarterlyDouble12.dArr;
    double double14 = quarterlyDouble12.getQseqQ();
    double[] doubleArray15 = new double[] {};
    quarterlyDouble12.dArr = doubleArray15;
    quarterlyDouble4.dArr = doubleArray15;
    double[] doubleArray18 = quarterlyDouble4.dArr;
    // The following exception was thrown during execution in test generation
    try {
      double double19 = quarterlyDouble4.getMostRecent();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5100.0d + "'", double14 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
  }

  @Test
  public void test00348() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00348");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile(10, 1);
  }

  @Test
  public void test00349() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00349");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    quarterlyDouble4.dArr = doubleArray11;
    double double14 = quarterlyDouble4.getTtm();
    double[] doubleArray15 = quarterlyDouble4.dArr;
    double[] doubleArray19 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    double double21 = quarterlyDouble20.getTtm();
    double double23 = quarterlyDouble20.get((int) '4');
    double[] doubleArray27 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray27);
    double[] doubleArray29 = quarterlyDouble28.dArr;
    double double30 = quarterlyDouble28.getQseqQ();
    double[] doubleArray31 = new double[] {};
    quarterlyDouble28.dArr = doubleArray31;
    quarterlyDouble20.dArr = doubleArray31;
    double[] doubleArray34 = quarterlyDouble20.dArr;
    quarterlyDouble4.dArr = doubleArray34;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray34);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str38 = quarterlyDouble36.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-9999.9999d) + "'", double23 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray27);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray29);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + 5100.0d + "'", double30 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray31);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
    org.junit.Assert.assertNotNull(doubleArray34);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
  }

  @Test
  public void test00350() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00350");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 0, 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList((java.util.List<java.lang.String>) strList2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList((java.util.List<java.lang.String>) strList2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList11 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies((java.util.List<java.lang.String>) strList2, 1, 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList14 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 10, (int) (byte) 10);
    java.lang.Class<?> wildcardClass15 = companyDataList14.getClass();
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(manyCompanyDataList7);
    org.junit.Assert.assertNotNull(manyCompanyDataList8);
    org.junit.Assert.assertNotNull(companyDataList11);
    org.junit.Assert.assertNotNull(companyDataList14);
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test00351() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00351");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double double8 = quarterlyDouble4.getQseqQ();
    double[] doubleArray12 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray12);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray12);
    quarterlyDouble4.dArr = doubleArray12;
    double[] doubleArray19 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    double[] doubleArray21 = quarterlyDouble20.dArr;
    double[] doubleArray22 = quarterlyDouble20.dArr;
    quarterlyDouble4.dArr = doubleArray22;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray22);
    // The following exception was thrown during execution in test generation
    try {
      double double25 = quarterlyDouble24.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray22);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00352() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00352");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", 0,
        (int) (short) 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00353() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00353");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (short) -1, (-1));
  }

  @Test
  public void test00354() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00354");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", 1,
        (int) (byte) 100);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00355() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00355");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, (int) (short) 0, (int) 'a');
  }

  @Test
  public void test00356() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00356");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.get((int) '4');
    double double10 = quarterlyDouble4.deltaQ((int) (short) 1, 0);
    // The following exception was thrown during execution in test generation
    try {
      double double13 = quarterlyDouble4.deltaQ(0, (int) '#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
  }

  @Test
  public void test00357() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00357");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.get((int) '4');
    double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    double[] doubleArray13 = quarterlyDouble12.dArr;
    double double14 = quarterlyDouble12.getQseqQ();
    double[] doubleArray15 = new double[] {};
    quarterlyDouble12.dArr = doubleArray15;
    quarterlyDouble4.dArr = doubleArray15;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    double[] doubleArray22 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray22);
    double double24 = quarterlyDouble23.getTtm();
    double double26 = quarterlyDouble23.get((int) '4');
    double[] doubleArray30 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray30);
    double[] doubleArray32 = quarterlyDouble31.dArr;
    double double33 = quarterlyDouble31.getQseqQ();
    double[] doubleArray34 = new double[] {};
    quarterlyDouble31.dArr = doubleArray34;
    quarterlyDouble23.dArr = doubleArray34;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray34);
    quarterlyDouble18.dArr = doubleArray34;
    double[] doubleArray42 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble43 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray42);
    double[] doubleArray44 = quarterlyDouble43.dArr;
    double[] doubleArray45 = quarterlyDouble43.dArr;
    quarterlyDouble18.dArr = doubleArray45;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble47 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray45);
    // The following exception was thrown during execution in test generation
    try {
      double double48 = quarterlyDouble47.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5100.0d + "'", double14 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
    org.junit.Assert.assertNotNull(doubleArray22);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-9999.9999d) + "'", double26 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray30);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray32);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double33 + "' != '" + 5100.0d + "'", double33 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray34);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
    org.junit.Assert.assertNotNull(doubleArray42);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray44);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray45);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00358() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00358");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (short) 0, (int) (short) -1);
  }

  @Test
  public void test00359() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00359");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    quarterlyDouble4.dArr = doubleArray10;
    double double13 = quarterlyDouble4.getQseqQ();
    double double14 = quarterlyDouble4.getTtmAvg();
    double[] doubleArray15 = quarterlyDouble4.dArr;
    double[] doubleArray16 = quarterlyDouble4.dArr;
    java.lang.Class<?> wildcardClass17 = doubleArray16.getClass();
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test00360() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00360");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, (int) (short) 1, (int) (short) 1);
  }

  @Test
  public void test00361() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00361");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (short) 100, (int) '#');
  }

  @Test
  public void test00362() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00362");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double[] doubleArray5 = quarterlyDouble4.dArr;
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = new double[] {};
    quarterlyDouble4.dArr = doubleArray7;
    double double9 = quarterlyDouble4.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      double double10 = quarterlyDouble4.getMostRecent();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
  }

  @Test
  public void test00363() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00363");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList5, 10, (int) (short) -1);
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertNull(fieldData8);
  }

  @Test
  public void test00364() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00364");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.getTtmAvg();
    double double8 = quarterlyDouble4.getMostRecent();
    double double10 = quarterlyDouble4.get((int) '4');
    double[] doubleArray14 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    quarterlyDouble4.dArr = doubleArray14;
    java.lang.Class<?> wildcardClass17 = doubleArray14.getClass();
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test00365() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00365");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double[] doubleArray5 = quarterlyDouble4.dArr;
    double double6 = quarterlyDouble4.getTtm();
    double double9 = quarterlyDouble4.deltaQ((int) '#', 100);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str11 = quarterlyDouble4.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
  }

  @Test
  public void test00366() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00366");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double double8 = quarterlyDouble4.getQseqQ();
    double double9 = quarterlyDouble4.getTtmAvg();
    double double11 = quarterlyDouble4.get(0);
    double double12 = quarterlyDouble4.getQseqQ();
    double double13 = quarterlyDouble4.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str15 = quarterlyDouble4.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 5100.0d + "'", double12 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
  }

  @Test
  public void test00367() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00367");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) 'a', (int) '4');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00368() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00368");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double double8 = quarterlyDouble4.getQseqQ();
    double double9 = quarterlyDouble4.getQseqQ();
    double double10 = quarterlyDouble4.getQseqQ();
    double[] doubleArray11 = quarterlyDouble4.dArr;
    double double12 = quarterlyDouble4.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      double double15 = quarterlyDouble4.deltaQ((int) (byte) 1, (int) (byte) 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5100.0d + "'", double9 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5100.0d + "'", double10 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
  }

  @Test
  public void test00369() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00369");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double double8 = quarterlyDouble4.getQseqQ();
    double double9 = quarterlyDouble4.getQseqQ();
    double double10 = quarterlyDouble4.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str12 = quarterlyDouble4.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5100.0d + "'", double9 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5100.0d + "'", double10 == 5100.0d);
  }

  @Test
  public void test00370() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00370");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double7 = quarterlyDouble5.get(10);
    double double8 = quarterlyDouble5.getMostRecent();
    double[] doubleArray9 = quarterlyDouble5.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str11 = quarterlyDouble5.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00371() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00371");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.getMostRecent();
    double[] doubleArray8 = quarterlyDouble4.dArr;
    double double10 = quarterlyDouble4.get(100);
    double[] doubleArray11 = quarterlyDouble4.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str13 = quarterlyDouble4.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    org.junit.Assert.assertNotNull(doubleArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00372() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00372");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) 'a', (int) ' ');
  }

  @Test
  public void test00373() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00373");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) (short) 100, (int) (byte) 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00374() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00374");
    java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
    java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies((java.util.List<java.lang.String>) strList3, 100, (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList10 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies((java.util.List<java.lang.String>) strList3, (int) (byte) 10, 100);
    java.lang.Class<?> wildcardClass11 = companyDataList10.getClass();
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(companyDataList7);
    org.junit.Assert.assertNotNull(companyDataList10);
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test00375() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00375");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) 'a', 1);
  }

  @Test
  public void test00376() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00376");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double double8 = quarterlyDouble4.getQseqQ();
    double[] doubleArray12 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray12);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray12);
    quarterlyDouble4.dArr = doubleArray12;
    double[] doubleArray16 = quarterlyDouble4.dArr;
    double[] doubleArray20 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray20);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray20);
    double[] doubleArray23 = quarterlyDouble22.dArr;
    double[] doubleArray27 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray27);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray27);
    double double31 = quarterlyDouble29.get(100);
    double[] doubleArray32 = quarterlyDouble29.dArr;
    quarterlyDouble22.dArr = doubleArray32;
    quarterlyDouble4.dArr = doubleArray32;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble35 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray32);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str37 = quarterlyDouble35.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray20);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray27);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-9999.9999d) + "'", double31 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray32);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00377() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00377");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double[] doubleArray5 = quarterlyDouble4.dArr;
    double double6 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str9 = quarterlyDouble4.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
  }

  @Test
  public void test00378() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00378");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double[] doubleArray6 = quarterlyDouble5.dArr;
    double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    double double14 = quarterlyDouble12.get(100);
    double[] doubleArray15 = quarterlyDouble12.dArr;
    quarterlyDouble5.dArr = doubleArray15;
    double double17 = quarterlyDouble5.getTtmAvg();
    double[] doubleArray18 = quarterlyDouble5.dArr;
    double double19 = quarterlyDouble5.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str21 = quarterlyDouble5.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
  }

  @Test
  public void test00379() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00379");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, (int) '4', 100);
  }

  @Test
  public void test00380() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00380");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) ' ', (int) (byte) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00381() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00381");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.get((int) '4');
    double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    double[] doubleArray13 = quarterlyDouble12.dArr;
    double double14 = quarterlyDouble12.getQseqQ();
    double[] doubleArray15 = new double[] {};
    quarterlyDouble12.dArr = doubleArray15;
    quarterlyDouble4.dArr = doubleArray15;
    double[] doubleArray18 = quarterlyDouble4.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    double[] doubleArray24 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray24);
    double double26 = quarterlyDouble25.getTtm();
    double double27 = quarterlyDouble25.getQseqQ();
    double[] doubleArray31 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray31);
    quarterlyDouble25.dArr = doubleArray31;
    double double34 = quarterlyDouble25.getQseqQ();
    double double37 = quarterlyDouble25.deltaQ((int) (short) 100, (int) (byte) -1);
    double[] doubleArray41 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble42 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray41);
    double double43 = quarterlyDouble42.getTtmAvg();
    double double44 = quarterlyDouble42.getMostRecent();
    double double46 = quarterlyDouble42.get((int) 'a');
    double double48 = quarterlyDouble42.get((int) (byte) -1);
    double[] doubleArray52 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble53 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray52);
    double double54 = quarterlyDouble53.getTtm();
    double double55 = quarterlyDouble53.getQseqQ();
    double[] doubleArray56 = quarterlyDouble53.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble57 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray56);
    quarterlyDouble42.dArr = doubleArray56;
    quarterlyDouble25.dArr = doubleArray56;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble60 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray56);
    quarterlyDouble20.dArr = doubleArray56;
    double[] doubleArray62 = quarterlyDouble20.dArr;
    double double65 = quarterlyDouble20.deltaQ((int) (short) 1, 0);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str67 = quarterlyDouble20.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5100.0d + "'", double14 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
    org.junit.Assert.assertNotNull(doubleArray24);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 5100.0d + "'", double27 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray31);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double34 + "' != '" + 5100.0d + "'", double34 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray41);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
    org.junit.Assert.assertTrue("'" + double44 + "' != '" + 52.0d + "'", double44 == 52.0d);
    org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-9999.9999d) + "'", double46 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-9999.9999d) + "'", double48 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray52);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
    org.junit.Assert.assertTrue("'" + double55 + "' != '" + 5100.0d + "'", double55 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray56);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray62);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
  }

  @Test
  public void test00382() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00382");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double[] doubleArray9 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    double double13 = quarterlyDouble11.get(100);
    double[] doubleArray14 = quarterlyDouble11.dArr;
    quarterlyDouble4.dArr = doubleArray14;
    double double16 = quarterlyDouble4.getQseqQ();
    double[] doubleArray20 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray20);
    double double23 = quarterlyDouble21.get((int) (byte) 1);
    double double24 = quarterlyDouble21.getQseqQ();
    double[] doubleArray25 = quarterlyDouble21.dArr;
    quarterlyDouble4.dArr = doubleArray25;
    // The following exception was thrown during execution in test generation
    try {
      double double27 = quarterlyDouble4.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9999.9999d) + "'", double13 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5100.0d + "'", double16 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray20);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 52.0d + "'", double23 == 52.0d);
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + 5100.0d + "'", double24 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00383() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00383");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) (byte) 100, 100);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00384() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00384");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((-1), (int) (short) 100);
  }

  @Test
  public void test00385() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00385");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (short) 10, 1);
  }

  @Test
  public void test00386() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00386");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (byte) -1, (int) (byte) 0);
  }

  @Test
  public void test00387() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00387");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    quarterlyDouble4.dArr = doubleArray10;
    double double13 = quarterlyDouble4.getQseqQ();
    double double16 = quarterlyDouble4.deltaQ((int) (short) 100, (int) (byte) -1);
    double[] doubleArray20 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray20);
    double double22 = quarterlyDouble21.getTtmAvg();
    double double23 = quarterlyDouble21.getMostRecent();
    double double25 = quarterlyDouble21.get((int) 'a');
    double double27 = quarterlyDouble21.get((int) (byte) -1);
    double[] doubleArray31 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray31);
    double double33 = quarterlyDouble32.getTtm();
    double double34 = quarterlyDouble32.getQseqQ();
    double[] doubleArray35 = quarterlyDouble32.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray35);
    quarterlyDouble21.dArr = doubleArray35;
    quarterlyDouble4.dArr = doubleArray35;
    // The following exception was thrown during execution in test generation
    try {
      double double39 = quarterlyDouble4.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray20);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 52.0d + "'", double23 == 52.0d);
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-9999.9999d) + "'", double25 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-9999.9999d) + "'", double27 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray31);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    org.junit.Assert.assertTrue("'" + double34 + "' != '" + 5100.0d + "'", double34 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray35);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00388() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00388");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray7);
    double double9 = quarterlyDouble8.getTtm();
    double[] doubleArray13 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    double double15 = quarterlyDouble14.getTtm();
    double double17 = quarterlyDouble14.get((int) '4');
    double[] doubleArray21 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray21);
    double[] doubleArray23 = quarterlyDouble22.dArr;
    double double24 = quarterlyDouble22.getQseqQ();
    double[] doubleArray25 = new double[] {};
    quarterlyDouble22.dArr = doubleArray25;
    quarterlyDouble14.dArr = doubleArray25;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray25);
    double[] doubleArray32 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray32);
    double double34 = quarterlyDouble33.getTtm();
    double double36 = quarterlyDouble33.get((int) '4');
    double[] doubleArray40 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray40);
    double[] doubleArray42 = quarterlyDouble41.dArr;
    double double43 = quarterlyDouble41.getQseqQ();
    double[] doubleArray44 = new double[] {};
    quarterlyDouble41.dArr = doubleArray44;
    quarterlyDouble33.dArr = doubleArray44;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble47 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray44);
    quarterlyDouble28.dArr = doubleArray44;
    quarterlyDouble8.dArr = doubleArray44;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str51 = quarterlyDouble8.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9999.9999d) + "'", double17 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + 5100.0d + "'", double24 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
    org.junit.Assert.assertNotNull(doubleArray32);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
    org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-9999.9999d) + "'", double36 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray40);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray42);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double43 + "' != '" + 5100.0d + "'", double43 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray44);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[]");
  }

  @Test
  public void test00389() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00389");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) (byte) 0, 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00390() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00390");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.get((int) '4');
    double double10 = quarterlyDouble4.deltaQ(10, (int) (short) 10);
    // The following exception was thrown during execution in test generation
    try {
      double double11 = quarterlyDouble4.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
  }

  @Test
  public void test00391() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00391");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    quarterlyDouble4.dArr = doubleArray11;
    double double14 = quarterlyDouble4.getTtm();
    double[] doubleArray15 = quarterlyDouble4.dArr;
    double double16 = quarterlyDouble4.getTtm();
    double double19 = quarterlyDouble4.deltaQ(10, (int) (byte) 10);
    // The following exception was thrown during execution in test generation
    try {
      double double20 = quarterlyDouble4.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
  }

  @Test
  public void test00392() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00392");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double7 = quarterlyDouble5.get(10);
    double double8 = quarterlyDouble5.getMostRecent();
    double double10 = quarterlyDouble5.get((int) (byte) -1);
    double double11 = quarterlyDouble5.getTtm();
    double double12 = quarterlyDouble5.getTtmAvg();
    double double15 = quarterlyDouble5.deltaQ((int) '#', (int) (short) 10);
    // The following exception was thrown during execution in test generation
    try {
      double double18 = quarterlyDouble5.deltaQ((-1), (int) (short) 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
  }

  @Test
  public void test00393() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00393");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", 100,
        (int) ' ');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00394() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00394");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double6 = quarterlyDouble4.get((int) (byte) 1);
    double double7 = quarterlyDouble4.getQseqQ();
    double double8 = quarterlyDouble4.getQseqQ();
    double double9 = quarterlyDouble4.getTtmAvg();
    double double10 = quarterlyDouble4.getTtm();
    double[] doubleArray11 = quarterlyDouble4.dArr;
    double double12 = quarterlyDouble4.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str14 = quarterlyDouble4.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
  }

  @Test
  public void test00395() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00395");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray7);
    double double9 = quarterlyDouble8.getQseqQ();
    double[] doubleArray13 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    double[] doubleArray15 = quarterlyDouble14.dArr;
    double[] doubleArray16 = quarterlyDouble14.dArr;
    quarterlyDouble8.dArr = doubleArray16;
    double double20 = quarterlyDouble8.deltaQ(10, (int) (byte) -1);
    // The following exception was thrown during execution in test generation
    try {
      double double23 = quarterlyDouble8.deltaQ(1, (int) '4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5100.0d + "'", double9 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
  }

  @Test
  public void test00396() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00396");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray7);
    double double9 = quarterlyDouble8.getTtm();
    double[] doubleArray13 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    double double15 = quarterlyDouble14.getTtm();
    double double17 = quarterlyDouble14.get((int) '4');
    double[] doubleArray21 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray21);
    double[] doubleArray23 = quarterlyDouble22.dArr;
    double double24 = quarterlyDouble22.getQseqQ();
    double[] doubleArray25 = new double[] {};
    quarterlyDouble22.dArr = doubleArray25;
    quarterlyDouble14.dArr = doubleArray25;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray25);
    double[] doubleArray32 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray32);
    double double34 = quarterlyDouble33.getTtm();
    double double36 = quarterlyDouble33.get((int) '4');
    double[] doubleArray40 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray40);
    double[] doubleArray42 = quarterlyDouble41.dArr;
    double double43 = quarterlyDouble41.getQseqQ();
    double[] doubleArray44 = new double[] {};
    quarterlyDouble41.dArr = doubleArray44;
    quarterlyDouble33.dArr = doubleArray44;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble47 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray44);
    quarterlyDouble28.dArr = doubleArray44;
    quarterlyDouble8.dArr = doubleArray44;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str51 = quarterlyDouble8.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9999.9999d) + "'", double17 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + 5100.0d + "'", double24 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
    org.junit.Assert.assertNotNull(doubleArray32);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
    org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-9999.9999d) + "'", double36 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray40);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray42);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double43 + "' != '" + 5100.0d + "'", double43 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray44);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[]");
  }

  @Test
  public void test00397() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00397");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.lang.String str5 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData10 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList7, (int) (short) 0, (int) (short) 10);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData13 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList7, (int) (short) -1, (int) (short) 10);
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertNotNull(fieldDataList6);
    org.junit.Assert.assertNotNull(fieldDataList7);
    org.junit.Assert.assertNull(fieldData10);
    org.junit.Assert.assertNull(fieldData13);
  }

  @Test
  public void test00398() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00398");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str8 = quarterlyDouble4.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
  }

  @Test
  public void test00399() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00399");
    java.lang.String[] strArray1 = new java.lang.String[] { "" };
    java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
    boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 0, 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList9 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies((java.util.List<java.lang.String>) strList2, (int) (short) 100, (int) ' ');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList10 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList((java.util.List<java.lang.String>) strList2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList11 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList((java.util.List<java.lang.String>) strList2);
    java.lang.Class<?> wildcardClass12 = manyCompanyDataList11.getClass();
    org.junit.Assert.assertNotNull(strArray1);
    org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(companyDataList9);
    org.junit.Assert.assertNotNull(manyCompanyDataList10);
    org.junit.Assert.assertNotNull(manyCompanyDataList11);
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test00400() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00400");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList0 = null;
    // The following exception was thrown during execution in test generation
    try {
      net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
          .getFieldData(fieldDataList0, (int) (short) 0, (int) '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test00401() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00401");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double6 = quarterlyDouble4.get((int) (byte) 1);
    double double7 = quarterlyDouble4.getQseqQ();
    double double9 = quarterlyDouble4.get((int) (byte) 1);
    double double12 = quarterlyDouble4.deltaQ((int) (byte) 1, 0);
    double double13 = quarterlyDouble4.getQseqQ();
    double double16 = quarterlyDouble4.deltaQ((int) (short) 100, 1);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str18 = quarterlyDouble4.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
  }

  @Test
  public void test00402() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00402");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double[] doubleArray5 = quarterlyDouble4.dArr;
    double double6 = quarterlyDouble4.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str8 = quarterlyDouble4.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
  }

  @Test
  public void test00403() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00403");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    quarterlyDouble4.dArr = doubleArray10;
    double double13 = quarterlyDouble4.getQseqQ();
    double double14 = quarterlyDouble4.getTtmAvg();
    double[] doubleArray18 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    double double20 = quarterlyDouble19.getTtm();
    double double21 = quarterlyDouble19.getQseqQ();
    double[] doubleArray25 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray25);
    quarterlyDouble19.dArr = doubleArray25;
    double double28 = quarterlyDouble19.getQseqQ();
    double double29 = quarterlyDouble19.getTtmAvg();
    double double30 = quarterlyDouble19.getTtm();
    double[] doubleArray34 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble35 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray34);
    double double36 = quarterlyDouble35.getTtm();
    double double37 = quarterlyDouble35.getQseqQ();
    double[] doubleArray38 = quarterlyDouble35.dArr;
    quarterlyDouble19.dArr = doubleArray38;
    quarterlyDouble4.dArr = doubleArray38;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray38);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str43 = quarterlyDouble41.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 5100.0d + "'", double21 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + 5100.0d + "'", double28 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray34);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
    org.junit.Assert.assertTrue("'" + double37 + "' != '" + 5100.0d + "'", double37 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray38);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00404() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00404");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double7 = quarterlyDouble5.get(100);
    double[] doubleArray8 = quarterlyDouble5.dArr;
    double double11 = quarterlyDouble5.deltaQ((int) '4', (int) (byte) 0);
    double[] doubleArray15 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    double double17 = quarterlyDouble16.getTtm();
    double double19 = quarterlyDouble16.get((int) '4');
    double[] doubleArray23 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray23);
    double[] doubleArray25 = quarterlyDouble24.dArr;
    double double26 = quarterlyDouble24.getQseqQ();
    double[] doubleArray27 = new double[] {};
    quarterlyDouble24.dArr = doubleArray27;
    quarterlyDouble16.dArr = doubleArray27;
    double[] doubleArray30 = quarterlyDouble16.dArr;
    quarterlyDouble5.dArr = doubleArray30;
    double double32 = quarterlyDouble5.getTtmAvg();
    double double33 = quarterlyDouble5.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      double double34 = quarterlyDouble5.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-9999.9999d) + "'", double19 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + 5100.0d + "'", double26 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray27);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
    org.junit.Assert.assertNotNull(doubleArray30);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
    org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
  }

  @Test
  public void test00405() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00405");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    quarterlyDouble4.dArr = doubleArray10;
    double double13 = quarterlyDouble4.getQseqQ();
    double double16 = quarterlyDouble4.deltaQ((int) (short) 100, (int) (byte) -1);
    double[] doubleArray20 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray20);
    double double22 = quarterlyDouble21.getTtmAvg();
    double double23 = quarterlyDouble21.getMostRecent();
    double double25 = quarterlyDouble21.get((int) 'a');
    double double27 = quarterlyDouble21.get((int) (byte) -1);
    double[] doubleArray31 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray31);
    double double33 = quarterlyDouble32.getTtm();
    double double34 = quarterlyDouble32.getQseqQ();
    double[] doubleArray35 = quarterlyDouble32.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray35);
    quarterlyDouble21.dArr = doubleArray35;
    quarterlyDouble4.dArr = doubleArray35;
    java.lang.Class<?> wildcardClass39 = doubleArray35.getClass();
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray20);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 52.0d + "'", double23 == 52.0d);
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-9999.9999d) + "'", double25 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-9999.9999d) + "'", double27 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray31);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    org.junit.Assert.assertTrue("'" + double34 + "' != '" + 5100.0d + "'", double34 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray35);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(wildcardClass39);
  }

  @Test
  public void test00406() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00406");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.getTtmAvg();
    double double8 = quarterlyDouble4.getMostRecent();
    double double10 = quarterlyDouble4.get((int) '4');
    double double13 = quarterlyDouble4.deltaQ(100, (int) '4');
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str15 = quarterlyDouble4.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
  }

  @Test
  public void test00407() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00407");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, 10, (int) '4');
  }

  @Test
  public void test00408() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00408");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile(0, (int) ' ');
  }

  @Test
  public void test00409() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00409");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (byte) -1, 1);
  }

  @Test
  public void test00410() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00410");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double6 = quarterlyDouble5.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str8 = quarterlyDouble5.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
  }

  @Test
  public void test00411() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00411");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) (short) 10, (int) (short) -1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00412() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00412");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, 10, (int) ' ');
  }

  @Test
  public void test00413() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00413");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double7 = quarterlyDouble5.get(100);
    double double8 = quarterlyDouble5.getTtmAvg();
    double double9 = quarterlyDouble5.getMostRecent();
    double double10 = quarterlyDouble5.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      double double11 = quarterlyDouble5.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
  }

  @Test
  public void test00414() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00414");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    quarterlyDouble4.dArr = doubleArray10;
    double double13 = quarterlyDouble4.getQseqQ();
    double double14 = quarterlyDouble4.getTtmAvg();
    double double15 = quarterlyDouble4.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str17 = quarterlyDouble4.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
  }

  @Test
  public void test00415() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00415");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double6 = quarterlyDouble4.get((int) (byte) 1);
    double double7 = quarterlyDouble4.getQseqQ();
    double[] doubleArray8 = quarterlyDouble4.dArr;
    double double11 = quarterlyDouble4.deltaQ((int) (byte) 100, (int) (byte) 100);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str13 = quarterlyDouble4.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
  }

  @Test
  public void test00416() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00416");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double6 = quarterlyDouble4.get((int) (byte) 1);
    double double7 = quarterlyDouble4.getQseqQ();
    double double9 = quarterlyDouble4.get((int) (byte) 1);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str11 = quarterlyDouble4.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
  }

  @Test
  public void test00417() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00417");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    quarterlyDouble4.dArr = doubleArray10;
    double[] doubleArray16 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray16);
    double double18 = quarterlyDouble17.getTtm();
    double double19 = quarterlyDouble17.getQseqQ();
    double[] doubleArray20 = quarterlyDouble17.dArr;
    double[] doubleArray24 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray24);
    quarterlyDouble17.dArr = doubleArray24;
    double double27 = quarterlyDouble17.getTtm();
    double[] doubleArray28 = quarterlyDouble17.dArr;
    double double29 = quarterlyDouble17.getTtm();
    double[] doubleArray30 = quarterlyDouble17.dArr;
    quarterlyDouble4.dArr = doubleArray30;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str33 = quarterlyDouble4.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 5100.0d + "'", double19 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray20);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray24);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray28);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray30);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00418() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00418");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double6 = quarterlyDouble4.get((int) (byte) 1);
    double double7 = quarterlyDouble4.getQseqQ();
    double double8 = quarterlyDouble4.getQseqQ();
    double double9 = quarterlyDouble4.getTtmAvg();
    double double10 = quarterlyDouble4.getTtm();
    double[] doubleArray11 = quarterlyDouble4.dArr;
    double double13 = quarterlyDouble4.get(10);
    double double14 = quarterlyDouble4.getQseqQ();
    double double17 = quarterlyDouble4.deltaQ(100, (int) (byte) -1);
    // The following exception was thrown during execution in test generation
    try {
      double double20 = quarterlyDouble4.deltaQ((int) (byte) 0, (int) (byte) 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9999.9999d) + "'", double13 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5100.0d + "'", double14 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
  }

  @Test
  public void test00419() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00419");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, 0, (int) '#');
  }

  @Test
  public void test00420() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00420");
    java.util.List<java.lang.String> strList0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
          .getCompanies(strList0, 0, (int) '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test00421() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00421");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) (byte) 100, (int) (byte) 100);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00422() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00422");
    java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
    java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
    boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies((java.util.List<java.lang.String>) strList3, 100, (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList10 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies((java.util.List<java.lang.String>) strList3, 100, (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList13 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies((java.util.List<java.lang.String>) strList3, (int) (short) 10, (int) (short) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList14 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList((java.util.List<java.lang.String>) strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList17 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies((java.util.List<java.lang.String>) strList3, (-1), 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList20 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies((java.util.List<java.lang.String>) strList3, 0, (int) (short) 0);
    org.junit.Assert.assertNotNull(strArray2);
    org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    org.junit.Assert.assertNotNull(companyDataList7);
    org.junit.Assert.assertNotNull(companyDataList10);
    org.junit.Assert.assertNotNull(companyDataList13);
    org.junit.Assert.assertNotNull(manyCompanyDataList14);
    org.junit.Assert.assertNotNull(companyDataList17);
    org.junit.Assert.assertNotNull(companyDataList20);
  }

  @Test
  public void test00423() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00423");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double[] doubleArray9 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    double double13 = quarterlyDouble11.get(100);
    double[] doubleArray14 = quarterlyDouble11.dArr;
    quarterlyDouble4.dArr = doubleArray14;
    double double16 = quarterlyDouble4.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str18 = quarterlyDouble4.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9999.9999d) + "'", double13 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5100.0d + "'", double16 == 5100.0d);
  }

  @Test
  public void test00424() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00424");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double7 = quarterlyDouble5.get(100);
    double[] doubleArray8 = quarterlyDouble5.dArr;
    double double11 = quarterlyDouble5.deltaQ((int) '4', (int) (byte) 0);
    double[] doubleArray15 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    double double17 = quarterlyDouble16.getTtm();
    double double19 = quarterlyDouble16.get((int) '4');
    double[] doubleArray23 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray23);
    double[] doubleArray25 = quarterlyDouble24.dArr;
    double double26 = quarterlyDouble24.getQseqQ();
    double[] doubleArray27 = new double[] {};
    quarterlyDouble24.dArr = doubleArray27;
    quarterlyDouble16.dArr = doubleArray27;
    double[] doubleArray30 = quarterlyDouble16.dArr;
    quarterlyDouble5.dArr = doubleArray30;
    double double32 = quarterlyDouble5.getTtmAvg();
    double double33 = quarterlyDouble5.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      double double34 = quarterlyDouble5.getQseqQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-9999.9999d) + "'", double19 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + 5100.0d + "'", double26 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray27);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
    org.junit.Assert.assertNotNull(doubleArray30);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
    org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
  }

  @Test
  public void test00425() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00425");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double8 = quarterlyDouble5.deltaQ((int) (short) 10, (int) ' ');
    // The following exception was thrown during execution in test generation
    try {
      double double11 = quarterlyDouble5.deltaQ(0, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
  }

  @Test
  public void test00426() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00426");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double[] doubleArray6 = quarterlyDouble5.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double8 = quarterlyDouble7.getMostRecent();
    double double11 = quarterlyDouble7.deltaQ((int) (byte) 100, (int) '4');
    double[] doubleArray12 = quarterlyDouble7.dArr;
    // The following exception was thrown during execution in test generation
    try {
      double double13 = quarterlyDouble7.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00427() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00427");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    quarterlyDouble4.dArr = doubleArray11;
    double double14 = quarterlyDouble4.getTtm();
    double[] doubleArray15 = quarterlyDouble4.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    double double19 = quarterlyDouble17.get((int) (byte) 10);
    double double22 = quarterlyDouble17.deltaQ((int) '#', 100);
    double double23 = quarterlyDouble17.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str25 = quarterlyDouble17.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-9999.9999d) + "'", double19 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
  }

  @Test
  public void test00428() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00428");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) (short) 0, 100);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00429() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00429");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double[] doubleArray9 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    double double13 = quarterlyDouble11.get(100);
    double[] doubleArray14 = quarterlyDouble11.dArr;
    quarterlyDouble4.dArr = doubleArray14;
    double[] doubleArray19 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    double double21 = quarterlyDouble20.getTtm();
    double double22 = quarterlyDouble20.getQseqQ();
    double[] doubleArray23 = quarterlyDouble20.dArr;
    double double24 = quarterlyDouble20.getQseqQ();
    double[] doubleArray28 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray28);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray28);
    quarterlyDouble20.dArr = doubleArray28;
    double[] doubleArray32 = quarterlyDouble20.dArr;
    quarterlyDouble4.dArr = doubleArray32;
    java.lang.Class<?> wildcardClass34 = quarterlyDouble4.getClass();
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9999.9999d) + "'", double13 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 5100.0d + "'", double22 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + 5100.0d + "'", double24 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray28);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray32);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(wildcardClass34);
  }

  @Test
  public void test00431() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00431");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    quarterlyDouble4.dArr = doubleArray11;
    double double14 = quarterlyDouble4.getTtm();
    double[] doubleArray15 = quarterlyDouble4.dArr;
    double[] doubleArray19 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    double double21 = quarterlyDouble20.getTtm();
    double double23 = quarterlyDouble20.get((int) '4');
    double[] doubleArray27 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray27);
    double[] doubleArray29 = quarterlyDouble28.dArr;
    double double30 = quarterlyDouble28.getQseqQ();
    double[] doubleArray31 = new double[] {};
    quarterlyDouble28.dArr = doubleArray31;
    quarterlyDouble20.dArr = doubleArray31;
    double[] doubleArray34 = quarterlyDouble20.dArr;
    quarterlyDouble4.dArr = doubleArray34;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray34);
    // The following exception was thrown during execution in test generation
    try {
      double double37 = quarterlyDouble36.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-9999.9999d) + "'", double23 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray27);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray29);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + 5100.0d + "'", double30 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray31);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
    org.junit.Assert.assertNotNull(doubleArray34);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
  }

  @Test
  public void test00432() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00432");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    quarterlyDouble4.dArr = doubleArray11;
    double double14 = quarterlyDouble4.getTtm();
    double[] doubleArray15 = quarterlyDouble4.dArr;
    double double16 = quarterlyDouble4.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str18 = quarterlyDouble4.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5100.0d + "'", double16 == 5100.0d);
  }

  @Test
  public void test00433() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00433");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.getTtmAvg();
    double double9 = quarterlyDouble4.get((int) ' ');
    double double10 = quarterlyDouble4.getMostRecent();
    double double12 = quarterlyDouble4.get(10);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str14 = quarterlyDouble4.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9999.9999d) + "'", double9 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
  }

  @Test
  public void test00434() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00434");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.get((int) '4');
    double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    double[] doubleArray13 = quarterlyDouble12.dArr;
    double double14 = quarterlyDouble12.getQseqQ();
    double[] doubleArray15 = new double[] {};
    quarterlyDouble12.dArr = doubleArray15;
    quarterlyDouble4.dArr = doubleArray15;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    double[] doubleArray22 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray22);
    double double24 = quarterlyDouble23.getTtm();
    double double26 = quarterlyDouble23.get((int) '4');
    double[] doubleArray30 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray30);
    double[] doubleArray32 = quarterlyDouble31.dArr;
    double double33 = quarterlyDouble31.getQseqQ();
    double[] doubleArray34 = new double[] {};
    quarterlyDouble31.dArr = doubleArray34;
    quarterlyDouble23.dArr = doubleArray34;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray34);
    quarterlyDouble18.dArr = doubleArray34;
    double[] doubleArray42 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble43 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray42);
    double[] doubleArray44 = quarterlyDouble43.dArr;
    double[] doubleArray45 = quarterlyDouble43.dArr;
    quarterlyDouble18.dArr = doubleArray45;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble47 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray45);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str49 = quarterlyDouble47.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5100.0d + "'", double14 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
    org.junit.Assert.assertNotNull(doubleArray22);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-9999.9999d) + "'", double26 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray30);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray32);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double33 + "' != '" + 5100.0d + "'", double33 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray34);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
    org.junit.Assert.assertNotNull(doubleArray42);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray44);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray45);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00435() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00435");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) (short) -1, (int) (byte) -1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00436() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00436");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (short) 1, (int) (byte) 10);
  }

  @Test
  public void test00437() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00437");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) (short) 0, 100);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00438() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00438");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) '#', 100);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00439() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00439");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double double8 = quarterlyDouble4.getQseqQ();
    double[] doubleArray12 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray12);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray12);
    quarterlyDouble4.dArr = doubleArray12;
    double[] doubleArray16 = quarterlyDouble4.dArr;
    double[] doubleArray20 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray20);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray20);
    double[] doubleArray23 = quarterlyDouble22.dArr;
    double[] doubleArray27 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray27);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray27);
    double double31 = quarterlyDouble29.get(100);
    double[] doubleArray32 = quarterlyDouble29.dArr;
    quarterlyDouble22.dArr = doubleArray32;
    quarterlyDouble4.dArr = doubleArray32;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble35 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray32);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray32);
    // The following exception was thrown during execution in test generation
    try {
      double double37 = quarterlyDouble36.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray20);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray27);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-9999.9999d) + "'", double31 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray32);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00440() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00440");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double double8 = quarterlyDouble4.getQseqQ();
    double double9 = quarterlyDouble4.getTtmAvg();
    double double10 = quarterlyDouble4.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      double double11 = quarterlyDouble4.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
  }

  @Test
  public void test00441() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00441");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    quarterlyDouble4.dArr = doubleArray11;
    double double14 = quarterlyDouble4.getTtm();
    double[] doubleArray15 = quarterlyDouble4.dArr;
    double[] doubleArray19 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    double double21 = quarterlyDouble20.getTtm();
    double double23 = quarterlyDouble20.get((int) '4');
    double[] doubleArray27 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray27);
    double[] doubleArray29 = quarterlyDouble28.dArr;
    double double30 = quarterlyDouble28.getQseqQ();
    double[] doubleArray31 = new double[] {};
    quarterlyDouble28.dArr = doubleArray31;
    quarterlyDouble20.dArr = doubleArray31;
    double[] doubleArray34 = quarterlyDouble20.dArr;
    quarterlyDouble4.dArr = doubleArray34;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray34);
    // The following exception was thrown during execution in test generation
    try {
      double double37 = quarterlyDouble36.getMostRecent();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-9999.9999d) + "'", double23 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray27);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray29);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + 5100.0d + "'", double30 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray31);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
    org.junit.Assert.assertNotNull(doubleArray34);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
  }

  @Test
  public void test00442() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00442");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) ' ', (int) 'a');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, (int) (byte) 10, 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, (int) (short) -1, (int) (byte) -1);
    java.lang.Class<?> wildcardClass9 = strList2.getClass();
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList5);
    org.junit.Assert.assertNotNull(companyDataList8);
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test00443() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00443");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, (int) (short) 0, 1);
  }

  @Test
  public void test00444() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00444");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, (int) (byte) 1, (int) '4');
  }

  @Test
  public void test00445() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00445");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) (byte) -1, (-1));
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00446() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00446");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (byte) 1, (int) '4');
  }

  @Test
  public void test00447() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00447");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray7);
    double double9 = quarterlyDouble8.getQseqQ();
    double double10 = quarterlyDouble8.getTtm();
    double double12 = quarterlyDouble8.get((int) (short) 0);
    double double13 = quarterlyDouble8.getQseqQ();
    double double14 = quarterlyDouble8.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str16 = quarterlyDouble8.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5100.0d + "'", double9 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
  }

  @Test
  public void test00448() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00448");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (short) 10, (int) (short) 1);
  }

  @Test
  public void test00449() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00449");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.get((int) '4');
    double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    double[] doubleArray13 = quarterlyDouble12.dArr;
    double double14 = quarterlyDouble12.getQseqQ();
    double[] doubleArray15 = new double[] {};
    quarterlyDouble12.dArr = doubleArray15;
    quarterlyDouble4.dArr = doubleArray15;
    double[] doubleArray18 = quarterlyDouble4.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    double[] doubleArray24 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray24);
    double double26 = quarterlyDouble25.getTtm();
    double double27 = quarterlyDouble25.getQseqQ();
    double[] doubleArray31 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray31);
    quarterlyDouble25.dArr = doubleArray31;
    double double34 = quarterlyDouble25.getQseqQ();
    double double37 = quarterlyDouble25.deltaQ((int) (short) 100, (int) (byte) -1);
    double[] doubleArray41 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble42 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray41);
    double double43 = quarterlyDouble42.getTtmAvg();
    double double44 = quarterlyDouble42.getMostRecent();
    double double46 = quarterlyDouble42.get((int) 'a');
    double double48 = quarterlyDouble42.get((int) (byte) -1);
    double[] doubleArray52 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble53 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray52);
    double double54 = quarterlyDouble53.getTtm();
    double double55 = quarterlyDouble53.getQseqQ();
    double[] doubleArray56 = quarterlyDouble53.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble57 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray56);
    quarterlyDouble42.dArr = doubleArray56;
    quarterlyDouble25.dArr = doubleArray56;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble60 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray56);
    quarterlyDouble20.dArr = doubleArray56;
    double[] doubleArray62 = quarterlyDouble20.dArr;
    double double65 = quarterlyDouble20.deltaQ((int) (short) 1, 0);
    double double68 = quarterlyDouble20.deltaQ(0, 0);
    java.lang.Class<?> wildcardClass69 = quarterlyDouble20.getClass();
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5100.0d + "'", double14 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
    org.junit.Assert.assertNotNull(doubleArray24);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 5100.0d + "'", double27 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray31);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double34 + "' != '" + 5100.0d + "'", double34 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray41);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
    org.junit.Assert.assertTrue("'" + double44 + "' != '" + 52.0d + "'", double44 == 52.0d);
    org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-9999.9999d) + "'", double46 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-9999.9999d) + "'", double48 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray52);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
    org.junit.Assert.assertTrue("'" + double55 + "' != '" + 5100.0d + "'", double55 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray56);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray62);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
    org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
    org.junit.Assert.assertNotNull(wildcardClass69);
  }

  @Test
  public void test00450() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00450");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray7);
    double double9 = quarterlyDouble8.getTtmAvg();
    double double10 = quarterlyDouble8.getTtm();
    double double11 = quarterlyDouble8.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      double double14 = quarterlyDouble8.deltaQ((int) (short) 0, (int) (byte) 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
  }

  @Test
  public void test00451() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00451");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double[] doubleArray5 = quarterlyDouble4.dArr;
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = new double[] {};
    quarterlyDouble4.dArr = doubleArray7;
    double double9 = quarterlyDouble4.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      double double10 = quarterlyDouble4.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
  }

  @Test
  public void test00452() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00452");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) 'a', 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00453() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00453");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.lang.String str5 = companyData1.getTicker();
    java.lang.String str6 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = companyData1.getFdList();
    java.lang.Class<?> wildcardClass10 = companyData1.getClass();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertNotNull(fieldDataList7);
    org.junit.Assert.assertNotNull(fieldDataList8);
    org.junit.Assert.assertNotNull(fieldDataList9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test00454() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00454");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList0 = null;
    // The following exception was thrown during execution in test generation
    try {
      net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
          .getFieldData(fieldDataList0, 0, 100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test00455() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00455");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList2, 10, (int) (short) 0);
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNull(fieldData5);
  }

  @Test
  public void test00456() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00456");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (byte) 0, 0);
  }

  @Test
  public void test00457() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00457");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (byte) 0, (int) (byte) 10);
  }

  @Test
  public void test00458() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00458");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, (int) (byte) 100, (int) (byte) 100);
  }

  @Test
  public void test00459() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00459");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) (byte) 1, (int) (byte) 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00460() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00460");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    quarterlyDouble4.dArr = doubleArray11;
    double double14 = quarterlyDouble4.getTtm();
    double[] doubleArray15 = quarterlyDouble4.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    double double19 = quarterlyDouble17.get((int) (byte) 10);
    double double22 = quarterlyDouble17.deltaQ((int) '#', 100);
    double double23 = quarterlyDouble17.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      double double24 = quarterlyDouble17.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-9999.9999d) + "'", double19 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
  }

  @Test
  public void test00462() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00462");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    quarterlyDouble4.dArr = doubleArray10;
    double double13 = quarterlyDouble4.getQseqQ();
    double double14 = quarterlyDouble4.getTtmAvg();
    double[] doubleArray15 = quarterlyDouble4.dArr;
    java.lang.Class<?> wildcardClass16 = quarterlyDouble4.getClass();
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(wildcardClass16);
  }

  @Test
  public void test00463() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00463");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double double8 = quarterlyDouble4.getQseqQ();
    double[] doubleArray12 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray12);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray12);
    quarterlyDouble4.dArr = doubleArray12;
    double[] doubleArray16 = quarterlyDouble4.dArr;
    double[] doubleArray20 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray20);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray20);
    double[] doubleArray23 = quarterlyDouble22.dArr;
    double[] doubleArray27 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray27);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray27);
    double double31 = quarterlyDouble29.get(100);
    double[] doubleArray32 = quarterlyDouble29.dArr;
    quarterlyDouble22.dArr = doubleArray32;
    quarterlyDouble4.dArr = doubleArray32;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble35 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray32);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray32);
    java.lang.Class<?> wildcardClass37 = quarterlyDouble36.getClass();
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray20);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray27);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-9999.9999d) + "'", double31 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray32);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(wildcardClass37);
  }

  @Test
  public void test00464() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00464");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray7);
    double double9 = quarterlyDouble8.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str11 = quarterlyDouble8.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
  }

  @Test
  public void test00465() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00465");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) ' ', (int) '4');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00466() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00466");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double[] doubleArray6 = quarterlyDouble5.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double8 = quarterlyDouble7.getMostRecent();
    double[] doubleArray12 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray12);
    double double14 = quarterlyDouble13.getTtm();
    double double15 = quarterlyDouble13.getQseqQ();
    double[] doubleArray16 = quarterlyDouble13.dArr;
    double double17 = quarterlyDouble13.getQseqQ();
    double[] doubleArray21 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray21);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray21);
    quarterlyDouble13.dArr = doubleArray21;
    double[] doubleArray25 = quarterlyDouble13.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray25);
    quarterlyDouble7.dArr = doubleArray25;
    double[] doubleArray28 = quarterlyDouble7.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str30 = quarterlyDouble7.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 5100.0d + "'", double15 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 5100.0d + "'", double17 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray28);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00467() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00467");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double[] doubleArray5 = quarterlyDouble4.dArr;
    double[] doubleArray6 = quarterlyDouble4.dArr;
    double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    double double12 = quarterlyDouble11.getTtm();
    double double13 = quarterlyDouble11.getQseqQ();
    double[] doubleArray14 = quarterlyDouble11.dArr;
    double double15 = quarterlyDouble11.getQseqQ();
    double[] doubleArray19 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    quarterlyDouble11.dArr = doubleArray19;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    quarterlyDouble4.dArr = doubleArray19;
    // The following exception was thrown during execution in test generation
    try {
      double double27 = quarterlyDouble4.deltaQ((-1), 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 5100.0d + "'", double15 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00468() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00468");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.get((int) '4');
    double double10 = quarterlyDouble4.deltaQ((int) (short) 1, 0);
    double[] doubleArray14 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    double double16 = quarterlyDouble15.getTtm();
    double double17 = quarterlyDouble15.getQseqQ();
    double[] doubleArray18 = quarterlyDouble15.dArr;
    quarterlyDouble4.dArr = doubleArray18;
    // The following exception was thrown during execution in test generation
    try {
      double double20 = quarterlyDouble4.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 5100.0d + "'", double17 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00469() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00469");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    quarterlyDouble4.dArr = doubleArray10;
    double double13 = quarterlyDouble4.getQseqQ();
    double double14 = quarterlyDouble4.getTtmAvg();
    double double15 = quarterlyDouble4.getTtm();
    double[] doubleArray19 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    double double21 = quarterlyDouble20.getTtm();
    double double22 = quarterlyDouble20.getQseqQ();
    double[] doubleArray23 = quarterlyDouble20.dArr;
    quarterlyDouble4.dArr = doubleArray23;
    double double25 = quarterlyDouble4.getMostRecent();
    java.lang.Class<?> wildcardClass26 = quarterlyDouble4.getClass();
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 5100.0d + "'", double13 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 5100.0d + "'", double22 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + 52.0d + "'", double25 == 52.0d);
    org.junit.Assert.assertNotNull(wildcardClass26);
  }

  @Test
  public void test00470() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00470");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile(100, (int) (short) 0);
  }

  @Test
  public void test00471() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00471");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double[] doubleArray9 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    double double13 = quarterlyDouble11.get(100);
    double[] doubleArray14 = quarterlyDouble11.dArr;
    quarterlyDouble4.dArr = doubleArray14;
    double double16 = quarterlyDouble4.getQseqQ();
    double double17 = quarterlyDouble4.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str19 = quarterlyDouble4.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9999.9999d) + "'", double13 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5100.0d + "'", double16 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
  }

  @Test
  public void test00472() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00472");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double double8 = quarterlyDouble4.getQseqQ();
    double double9 = quarterlyDouble4.getTtm();
    double double12 = quarterlyDouble4.deltaQ((int) (short) 1, (int) (short) -1);
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
  }

  @Test
  public void test00473() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00473");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, (int) ' ', (int) (byte) 0);
  }

  @Test
  public void test00474() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00474");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double6 = quarterlyDouble4.get((int) (byte) 1);
    double double7 = quarterlyDouble4.getQseqQ();
    double[] doubleArray8 = quarterlyDouble4.dArr;
    double double10 = quarterlyDouble4.get(10);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str12 = quarterlyDouble4.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
  }

  @Test
  public void test00475() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00475");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double[] doubleArray6 = quarterlyDouble5.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double8 = quarterlyDouble7.getMostRecent();
    double double11 = quarterlyDouble7.deltaQ((int) (byte) 100, (int) '4');
    // The following exception was thrown during execution in test generation
    try {
      double double12 = quarterlyDouble7.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
  }

  @Test
  public void test00476() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00476");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str8 = quarterlyDouble6.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00477() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00477");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) (byte) 10, 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00478() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00478");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile(0, (int) (short) 10);
  }

  @Test
  public void test00479() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00479");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getMostRecent();
    double double8 = quarterlyDouble4.get((int) 'a');
    double double10 = quarterlyDouble4.get((int) (byte) -1);
    double[] doubleArray14 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    double double16 = quarterlyDouble15.getTtm();
    double double17 = quarterlyDouble15.getQseqQ();
    double[] doubleArray18 = quarterlyDouble15.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    quarterlyDouble4.dArr = doubleArray18;
    double double21 = quarterlyDouble4.getMostRecent();
    double[] doubleArray25 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray25);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray25);
    double double29 = quarterlyDouble27.get(10);
    double double30 = quarterlyDouble27.getMostRecent();
    double[] doubleArray31 = quarterlyDouble27.dArr;
    quarterlyDouble4.dArr = doubleArray31;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray31);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str35 = quarterlyDouble33.fmtGrowth4Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9999.9999d) + "'", double8 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 5100.0d + "'", double17 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-9999.9999d) + "'", double29 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + 52.0d + "'", double30 == 52.0d);
    org.junit.Assert.assertNotNull(doubleArray31);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00480() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00480");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double8 = quarterlyDouble5.deltaQ((int) (short) 10, (int) ' ');
    double double9 = quarterlyDouble5.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      double double10 = quarterlyDouble5.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
  }

  @Test
  public void test00481() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00481");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double double8 = quarterlyDouble4.getQseqQ();
    double double9 = quarterlyDouble4.getTtmAvg();
    double double10 = quarterlyDouble4.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str12 = quarterlyDouble4.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
  }

  @Test
  public void test00482() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00482");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double double8 = quarterlyDouble4.getQseqQ();
    double double9 = quarterlyDouble4.getQseqQ();
    double double10 = quarterlyDouble4.getQseqQ();
    double double11 = quarterlyDouble4.getMostRecent();
    double double13 = quarterlyDouble4.get((int) (short) 0);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str15 = quarterlyDouble4.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5100.0d + "'", double9 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5100.0d + "'", double10 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
  }

  @Test
  public void test00483() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00483");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) (byte) 1, 1);
  }

  @Test
  public void test00484() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00484");
    net.ajaskey.market.tools.SIP.BigDB.dataio.CompanyFileData companyFileData0 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.EstimateFileData estimateFileData1 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.SharesFileData sharesFileData2 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.IncSheetFileData incSheetFileData3 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.BalSheetFileData balSheetFileData4 = null;
    net.ajaskey.market.tools.SIP.BigDB.dataio.CashFileData cashFileData5 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.add(companyFileData0, estimateFileData1, sharesFileData2, incSheetFileData3,
        balSheetFileData4, cashFileData5, (int) (short) 10, 1);
  }

  @Test
  public void test00485() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00485");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.get((int) '4');
    double double10 = quarterlyDouble4.deltaQ(10, (int) (short) 10);
    double double13 = quarterlyDouble4.deltaQ((int) (byte) -1, 0);
    java.lang.Class<?> wildcardClass14 = quarterlyDouble4.getClass();
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test00486() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00486");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double[] doubleArray6 = quarterlyDouble5.dArr;
    double[] doubleArray10 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    double double14 = quarterlyDouble12.get(100);
    double[] doubleArray15 = quarterlyDouble12.dArr;
    quarterlyDouble5.dArr = doubleArray15;
    double double17 = quarterlyDouble5.getTtmAvg();
    double double18 = quarterlyDouble5.getQseqQ();
    double[] doubleArray19 = quarterlyDouble5.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str21 = quarterlyDouble5.fmtGrowth1Q("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 5100.0d + "'", double18 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 52.0, 1.0]");
  }

  @Test
  public void test00487() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00487");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtm();
    double double6 = quarterlyDouble4.getQseqQ();
    double[] doubleArray7 = quarterlyDouble4.dArr;
    double[] doubleArray11 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    quarterlyDouble4.dArr = doubleArray11;
    double double14 = quarterlyDouble4.getTtm();
    double[] doubleArray15 = quarterlyDouble4.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    double double18 = quarterlyDouble16.get((int) (byte) 10);
    // The following exception was thrown during execution in test generation
    try {
      double double19 = quarterlyDouble16.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-9999.9999d) + "'", double18 == (-9999.9999d));
  }

  @Test
  public void test00488() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00488");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double[] doubleArray5 = quarterlyDouble4.dArr;
    double double6 = quarterlyDouble4.getQseqQ();
    double double7 = quarterlyDouble4.getQseqQ();
    java.lang.Class<?> wildcardClass8 = quarterlyDouble4.getClass();
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5100.0d + "'", double6 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test00489() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00489");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double6 = quarterlyDouble4.get((int) (byte) 1);
    double double7 = quarterlyDouble4.getQseqQ();
    double double8 = quarterlyDouble4.getQseqQ();
    double double9 = quarterlyDouble4.getTtmAvg();
    double double10 = quarterlyDouble4.getTtm();
    double[] doubleArray11 = quarterlyDouble4.dArr;
    java.lang.Class<?> wildcardClass12 = doubleArray11.getClass();
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5100.0d + "'", double7 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5100.0d + "'", double8 == 5100.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test00490() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00490");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double[] doubleArray6 = quarterlyDouble5.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double10 = quarterlyDouble7.deltaQ((int) '4', (int) (byte) 100);
    // The following exception was thrown during execution in test generation
    try {
      double double11 = quarterlyDouble7.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
  }

  @Test
  public void test00491() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00491");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.lang.String str4 = companyData1.getTicker();
    java.lang.Class<?> wildcardClass5 = companyData1.getClass();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test00492() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00492");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.lang.String str5 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
    java.lang.Class<?> wildcardClass8 = companyData1.getClass();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertNotNull(fieldDataList6);
    org.junit.Assert.assertNotNull(fieldDataList7);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test00493() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00493");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) ' ', (int) (byte) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00494() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00494");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile(0, (int) '#');
  }

  @Test
  public void test00495() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00495");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double double6 = quarterlyDouble4.getTtm();
    double double7 = quarterlyDouble4.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str9 = quarterlyDouble4.fmtGrowth1Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
  }

  @Test
  public void test00496() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00496");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((int) '#', (int) ' ');
  }

  @Test
  public void test00497() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00497");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) ' ', 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test00498() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00498");
    net.ajaskey.market.tools.SIP.BigDB.collation.FieldDataBinary.writeBinaryFile((-1), (int) (byte) 10);
  }

  @Test
  public void test00499() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00499");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double[] doubleArray5 = quarterlyDouble4.dArr;
    double double6 = quarterlyDouble4.getTtm();
    double double9 = quarterlyDouble4.deltaQ((int) '#', 100);
    double double10 = quarterlyDouble4.getMostRecent();
    java.lang.Class<?> wildcardClass11 = quarterlyDouble4.getClass();
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test00500() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests0.test00500");
    double[] doubleArray3 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray3);
    double double5 = quarterlyDouble4.getTtmAvg();
    double[] doubleArray9 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    double double13 = quarterlyDouble11.get(100);
    double[] doubleArray14 = quarterlyDouble11.dArr;
    quarterlyDouble4.dArr = doubleArray14;
    double double16 = quarterlyDouble4.getQseqQ();
    double[] doubleArray20 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray20);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray20);
    double double24 = quarterlyDouble22.get(100);
    double[] doubleArray25 = quarterlyDouble22.dArr;
    double double28 = quarterlyDouble22.deltaQ((int) '4', (int) (byte) 0);
    double[] doubleArray32 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray32);
    double double34 = quarterlyDouble33.getTtm();
    double double36 = quarterlyDouble33.get((int) '4');
    double[] doubleArray40 = new double[] { 10.0d, '4', (short) 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray40);
    double[] doubleArray42 = quarterlyDouble41.dArr;
    double double43 = quarterlyDouble41.getQseqQ();
    double[] doubleArray44 = new double[] {};
    quarterlyDouble41.dArr = doubleArray44;
    quarterlyDouble33.dArr = doubleArray44;
    double[] doubleArray47 = quarterlyDouble33.dArr;
    quarterlyDouble22.dArr = doubleArray47;
    quarterlyDouble4.dArr = doubleArray47;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble50 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray47);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble51 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray47);
    // The following exception was thrown during execution in test generation
    try {
      double double52 = quarterlyDouble51.getQseqQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray3);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9999.9999d) + "'", double13 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5100.0d + "'", double16 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray20);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-9999.9999d) + "'", double24 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray32);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
    org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-9999.9999d) + "'", double36 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray40);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray42);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, 52.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double43 + "' != '" + 5100.0d + "'", double43 == 5100.0d);
    org.junit.Assert.assertNotNull(doubleArray44);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[]");
    org.junit.Assert.assertNotNull(doubleArray47);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
  }
}
