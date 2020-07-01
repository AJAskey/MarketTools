package net.ajaskey.market.tools.SIP.BigDB.collation;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CollationTests2 {

  public static boolean debug = false;

  @Test
  public void test1001() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1001");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) ' ', (int) (short) 100);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test1002() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1002");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) 0,
        (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1003() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1003");
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
    double double19 = quarterlyDouble7.get2QTtm();
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
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
  }

  @Test
  public void test1004() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1004");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((-1), (-1));
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1005() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1005");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double9 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.getMostRecent();
    double double11 = quarterlyDouble6.getMostRecent();
    java.lang.String str12 = quarterlyDouble6.toString();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str12,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test1006() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1006");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) -1, (int) (short) 10);
  }

  @Test
  public void test1007() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1007");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.deltaQ((int) '#', (int) (short) 100);
    double double11 = quarterlyDouble6.getTtm();
    double double14 = quarterlyDouble6.deltaQ(0, 0);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
  }

  @Test
  public void test1008() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1008");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.get2QTtm();
    double double10 = quarterlyDouble6.get((int) (byte) 100);
    double double13 = quarterlyDouble6.deltaQ(10, 0);
    double double14 = quarterlyDouble6.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
  }

  @Test
  public void test1009() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1009");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 100, (int) (byte) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1010() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1010");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((-1), (int) ' ');
  }

  @Test
  public void test1011() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1011");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.deltaQ((int) (short) -1, (int) (byte) 0);
    double double11 = quarterlyDouble6.get2QTtm();
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
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1100.0d + "'", double12 == 1100.0d);
  }

  @Test
  public void test1012() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1012");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.deltaQ((int) (short) 100, (int) '#');
    double double13 = quarterlyDouble6.get(0);
    double double14 = quarterlyDouble6.getQseqQ();
    double double15 = quarterlyDouble6.getPrevTtm();
    double[] doubleArray16 = quarterlyDouble6.dArr;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1100.0d + "'", double14 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test1013() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1013");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) '4', (int) '#');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1014() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1014");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 1,
        (int) (short) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1016() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1016");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double9 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.getMostRecent();
    double[] doubleArray11 = quarterlyDouble6.dArr;
    double[] doubleArray12 = quarterlyDouble6.dArr;
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
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test1017() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1017");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) (byte) 1, (int) '4');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1018() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1018");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (byte) 10,
          (int) (short) -1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test1019() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1019");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    java.lang.String str6 = companyData1.getTicker();
    java.lang.String str7 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
    java.lang.String str9 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = companyData1.getFdList();
    java.lang.String str11 = companyData1.getTicker();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList8);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList10);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
  }

  @Test
  public void test1020() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1020");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    java.lang.String str6 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList8, (int) (short) 100, (int) (byte) 10);
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
  public void test1021() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1021");
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
    double double18 = quarterlyDouble6.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str20 = quarterlyDouble6.fmtGrowth4Q("");
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
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 40.0d + "'", double18 == 40.0d);
  }

  @Test
  public void test1022() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1022");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.deltaQ((int) (short) 100, (int) '#');
    double double13 = quarterlyDouble6.get(0);
    double double16 = quarterlyDouble6.deltaQ((int) '#', (int) (short) -1);
    double double17 = quarterlyDouble6.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
  }

  @Test
  public void test1023() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1023");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(10, 0);
  }

  @Test
  public void test1024() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1024");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 10,
        (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (byte) 1, 1);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test1025() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1025");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 1, 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1026() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1026");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 100,
        (int) (short) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1027() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1027");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double double10 = quarterlyDouble7.get((int) (byte) -1);
    java.lang.String str11 = quarterlyDouble7.toString();
    double double14 = quarterlyDouble7.deltaQ(1, 0);
    double double16 = quarterlyDouble7.get((-1));
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str11,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9999.9999d) + "'", double16 == (-9999.9999d));
  }

  @Test
  public void test1028() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1028");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray9 = quarterlyDouble8.dArr;
    double double10 = quarterlyDouble8.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str12 = quarterlyDouble8.fmtGrowth4Q("hi!");
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
  }

  @Test
  public void test1029() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1029");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (byte) 0, (int) (byte) 0);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1030() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1030");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) '4', 100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test1031() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1031");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.deltaQ((int) (short) -1, (int) (byte) 0);
    double double11 = quarterlyDouble6.getTtm();
    double double12 = quarterlyDouble6.getTtm();
    double double13 = quarterlyDouble6.getTtm();
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str42 = quarterlyDouble6.fmtGrowth4Q("\t i=0 0.0000\t i=1 0.0000");
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
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
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
  public void test1032() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1032");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 0, (-1));
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    java.lang.Class<?> wildcardClass5 = companyDataList4.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test1033() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1033");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    java.lang.String str9 = quarterlyDouble6.toString();
    double double10 = quarterlyDouble6.getPrevTtm();
    double[] doubleArray16 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray16);
    double double18 = quarterlyDouble17.getTtmAvg();
    double double19 = quarterlyDouble17.getTtmAvg();
    double double20 = quarterlyDouble17.getQseqQ();
    double double21 = quarterlyDouble17.getTtmAvg();
    double double22 = quarterlyDouble17.getTtmAvg();
    double[] doubleArray28 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray28);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray28);
    double double31 = quarterlyDouble30.getQseqQ();
    double[] doubleArray37 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble38 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray37);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray37);
    java.lang.String str40 = quarterlyDouble39.toString();
    double[] doubleArray44 = new double[] { 1L, 100, (short) 10 };
    quarterlyDouble39.dArr = doubleArray44;
    quarterlyDouble30.dArr = doubleArray44;
    quarterlyDouble17.dArr = doubleArray44;
    quarterlyDouble6.dArr = doubleArray44;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str9,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1100.0d + "'", double20 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray28);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1100.0d + "'", double31 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray37);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str40,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray44);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, 100.0, 10.0]");
  }

  @Test
  public void test1034() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1034");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.getTtmAvg();
    double double12 = quarterlyDouble6.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
  }

  @Test
  public void test1035() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1035");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.lang.String str4 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList5);
  }

  @Test
  public void test1036() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1036");
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
    double[] doubleArray38 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray38);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble40 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray38);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray38);
    quarterlyDouble22.dArr = doubleArray38;
    double double45 = quarterlyDouble22.deltaQ((int) '#', (int) (short) -1);
    double[] doubleArray51 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble52 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray51);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble53 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray51);
    double double54 = quarterlyDouble53.getQseqQ();
    double[] doubleArray60 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble61 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray60);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble62 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray60);
    java.lang.String str63 = quarterlyDouble62.toString();
    double[] doubleArray67 = new double[] { 1L, 100, (short) 10 };
    quarterlyDouble62.dArr = doubleArray67;
    quarterlyDouble53.dArr = doubleArray67;
    quarterlyDouble22.dArr = doubleArray67;
    double double72 = quarterlyDouble22.get((int) 'a');
    double[] doubleArray73 = quarterlyDouble22.dArr;
    quarterlyDouble8.dArr = doubleArray73;
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
    org.junit.Assert.assertNotNull(doubleArray38);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray51);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double54 + "' != '" + 1100.0d + "'", double54 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray60);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str63,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray67);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[1.0, 100.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-9999.9999d) + "'", double72 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray73);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[1.0, 100.0, 10.0]");
  }

  @Test
  public void test1037() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1037");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.lang.String str5 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = companyData1.getFdList();
    java.lang.String str10 = companyData1.getTicker();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList6);
    org.junit.Assert.assertNotNull(fieldDataList7);
    org.junit.Assert.assertNotNull(fieldDataList8);
    org.junit.Assert.assertNotNull(fieldDataList9);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
  }

  @Test
  public void test1038() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1038");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double[] doubleArray13 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    double double15 = quarterlyDouble14.getTtmAvg();
    double double16 = quarterlyDouble14.getTtmAvg();
    double double19 = quarterlyDouble14.deltaQ((int) (short) 100, (int) '#');
    double double21 = quarterlyDouble14.get(0);
    double double22 = quarterlyDouble14.getQseqQ();
    double[] doubleArray23 = quarterlyDouble14.dArr;
    double double24 = quarterlyDouble14.getQseqQ();
    double[] doubleArray30 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray30);
    double double32 = quarterlyDouble31.getMostRecent();
    double double35 = quarterlyDouble31.deltaQ((int) (short) -1, (int) (byte) 0);
    double double38 = quarterlyDouble31.deltaQ((int) (short) -1, (int) (byte) 0);
    double[] doubleArray44 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble45 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray44);
    double double46 = quarterlyDouble45.getTtmAvg();
    double double47 = quarterlyDouble45.getTtmAvg();
    double double48 = quarterlyDouble45.getPrevTtm();
    double double49 = quarterlyDouble45.getPrevTtm();
    double double52 = quarterlyDouble45.deltaQ((int) (byte) 10, 0);
    double[] doubleArray58 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble59 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray58);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble60 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray58);
    java.lang.String str61 = quarterlyDouble60.toString();
    double[] doubleArray62 = quarterlyDouble60.dArr;
    quarterlyDouble45.dArr = doubleArray62;
    quarterlyDouble31.dArr = doubleArray62;
    quarterlyDouble14.dArr = doubleArray62;
    quarterlyDouble6.dArr = doubleArray62;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1100.0d + "'", double22 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1100.0d + "'", double24 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray30);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
    org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray44);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
    org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
    org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
    org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
    org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray58);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str61 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str61,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray62);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test1039() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1039");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getTtmAvg();
    java.lang.String str11 = quarterlyDouble6.toString();
    double double12 = quarterlyDouble6.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str11,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
  }

  @Test
  public void test1040() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1040");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.lang.String str5 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData10 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList7, (int) (byte) -1, (int) (byte) 100);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList6);
    org.junit.Assert.assertNotNull(fieldDataList7);
    org.junit.Assert.assertNull(fieldData10);
  }

  @Test
  public void test1041() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1041");
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
    double double14 = quarterlyDouble6.getTtmAvg();
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
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
  }

  @Test
  public void test1042() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1042");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str14 = quarterlyDouble11.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test1043() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1043");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.deltaQ((int) (short) 100, (int) '#');
    double double13 = quarterlyDouble6.get(0);
    double double14 = quarterlyDouble6.getTtmAvg();
    double double16 = quarterlyDouble6.get((int) ' ');
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9999.9999d) + "'", double16 == (-9999.9999d));
  }

  @Test
  public void test1044() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1044");
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
    double double14 = quarterlyDouble8.getTtmAvg();
    double double15 = quarterlyDouble8.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
  }

  @Test
  public void test1045() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1045");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 100,
        (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, 1, (int) (short) 10);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test1046() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1046");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) 100, 10);
    java.lang.Class<?> wildcardClass4 = strList3.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test1047() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1047");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) 'a', (int) 'a');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (byte) 100, (int) (short) 0);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
    org.junit.Assert.assertNotNull(companyDataList7);
  }

  @Test
  public void test1048() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1048");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 100, (int) (short) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1049() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1049");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str28 = quarterlyDouble6.fmtGrowth1Q("\t i=0 0.0000\t i=1 0.0000");
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
  }

  @Test
  public void test1050() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1050");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 100,
        (int) (byte) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1051() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1051");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray7);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str10 = quarterlyDouble8.fmtGrowth1Q("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
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
  public void test1052() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1052");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.get2QTtm();
    double double10 = quarterlyDouble6.get((int) (byte) 100);
    double double11 = quarterlyDouble6.getQseqQ();
    double double12 = quarterlyDouble6.getTtm();
    double double13 = quarterlyDouble6.getQseqQ();
    double double14 = quarterlyDouble6.getTtm();
    double double15 = quarterlyDouble6.getTtm();
    double double17 = quarterlyDouble6.get((int) (byte) 10);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1100.0d + "'", double11 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1100.0d + "'", double13 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9999.9999d) + "'", double17 == (-9999.9999d));
  }

  @Test
  public void test1053() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1053");
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
      java.lang.String str17 = quarterlyDouble8.fmtGrowth4Q("\t i=0 0.0000\t i=1 0.0000");
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
  public void test1054() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1054");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 0,
        (int) (short) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1055() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1055");
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
    double double16 = quarterlyDouble8.getQseqQ();
    java.lang.String str17 = quarterlyDouble8.toString();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1100.0d + "'", double16 == 1100.0d);
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str17,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test1056() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1056");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (byte) 10, 1);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test1057() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1057");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double double10 = quarterlyDouble7.get((int) (byte) -1);
    java.lang.String str11 = quarterlyDouble7.toString();
    double double14 = quarterlyDouble7.deltaQ(1, 0);
    double[] doubleArray15 = quarterlyDouble7.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str11,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test1058() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1058");
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
      java.lang.String str12 = quarterlyDouble7.fmtGrowth4Q("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
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
  public void test1059() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1059");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(1, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList2);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(manyCompanyDataList3);
  }

  @Test
  public void test1060() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1060");
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
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray32);
    double double40 = quarterlyDouble39.getTtm();
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
    org.junit.Assert.assertTrue("'" + double40 + "' != '" + 40.0d + "'", double40 == 40.0d);
  }

  @Test
  public void test1061() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1061");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 1, 0);
  }

  @Test
  public void test1062() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1062");
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
    double[] doubleArray33 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray33);
    double double35 = quarterlyDouble34.getTtmAvg();
    double double36 = quarterlyDouble34.getTtmAvg();
    double double37 = quarterlyDouble34.getQseqQ();
    double double38 = quarterlyDouble34.getTtmAvg();
    double double39 = quarterlyDouble34.getQseqQ();
    double double40 = quarterlyDouble34.getQseqQ();
    double[] doubleArray46 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble47 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray46);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble48 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray46);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble49 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray46);
    quarterlyDouble34.dArr = doubleArray46;
    quarterlyDouble7.dArr = doubleArray46;
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
    org.junit.Assert.assertNotNull(doubleArray33);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
    org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
    org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1100.0d + "'", double37 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
    org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1100.0d + "'", double39 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1100.0d + "'", double40 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray46);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test1063() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1063");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 0, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test1064() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1064");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) 1, (int) ' ');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList2);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(manyCompanyDataList3);
  }

  @Test
  public void test1065() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1065");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double9 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.getQseqQ();
    double double11 = quarterlyDouble6.getTtmAvg();
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
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1100.0d + "'", double10 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
  }

  @Test
  public void test1066() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1066");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) 100,
        (int) (byte) 100);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1067() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1067");
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
    double double29 = quarterlyDouble24.get2QTtm();
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
    org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
  }

  @Test
  public void test1068() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1068");
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
    java.lang.String str53 = quarterlyDouble6.toString();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str55 = quarterlyDouble6.fmtGrowth1Q("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
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
    org.junit.Assert.assertTrue("'" + double52 + "' != '" + 40.0d + "'", double52 == 40.0d);
    org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str53,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test1069() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1069");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) 'a',
        (int) (short) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test1070() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1070");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray10 = new double[] { 0.0d, 0 };
    quarterlyDouble7.dArr = doubleArray10;
    double double12 = quarterlyDouble7.getPrevTtm();
    double double13 = quarterlyDouble7.getMostRecent();
    double[] doubleArray14 = quarterlyDouble7.dArr;
    double double17 = quarterlyDouble7.deltaQ((int) (short) 100, (int) (byte) 1);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
  }

  @Test
  public void test1071() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1071");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double9 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.getQseqQ();
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
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1100.0d + "'", double10 == 1100.0d);
  }

  @Test
  public void test1072() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1072");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double double9 = quarterlyDouble7.get2QTtm();
    double double10 = quarterlyDouble7.getMostRecent();
    double double13 = quarterlyDouble7.deltaQ((-1), (-1));
    // The following exception was thrown during execution in test generation
    try {
      double double14 = quarterlyDouble7.getQoQ();
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
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
  }

  @Test
  public void test1073() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1073");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 10, (int) (byte) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1074() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1074");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 10, 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1075() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1075");
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
    java.lang.String str17 = quarterlyDouble6.toString();
    java.lang.String str18 = quarterlyDouble6.toString();
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
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str17,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str18,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test1076() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1076");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(1, (int) (byte) 10);
  }

  @Test
  public void test1077() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1077");
    double[] doubleArray5 = new double[] { 900.0d, 40.0d, 1, 10L, 10.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getQseqQ();
    double double9 = quarterlyDouble7.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[900.0, 40.0, 1.0, 10.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3900.0d + "'", double8 == 3900.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3900.0d + "'", double9 == 3900.0d);
  }

  @Test
  public void test1078() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1078");
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
    double double15 = quarterlyDouble11.getPrevTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
  }

  @Test
  public void test1079() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1079");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (short) 1,
          (int) (byte) 100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test1080() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1080");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    java.lang.String str9 = quarterlyDouble6.toString();
    double double10 = quarterlyDouble6.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str9,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
  }

  @Test
  public void test1081() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1081");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 10, (-1));
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test1082() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1082");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double double10 = quarterlyDouble7.get((int) (byte) -1);
    double double11 = quarterlyDouble7.getTtmAvg();
    double double12 = quarterlyDouble7.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
  }

  @Test
  public void test1083() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1083");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getQseqQ();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double11 = quarterlyDouble7.get((int) ' ');
    double double12 = quarterlyDouble7.getTtm();
    double double13 = quarterlyDouble7.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1100.0d + "'", double8 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
  }

  @Test
  public void test1084() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1084");
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
    double double53 = quarterlyDouble52.getTtmAvg();
    double[] doubleArray59 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble60 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray59);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble61 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray59);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble62 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray59);
    double[] doubleArray63 = quarterlyDouble62.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble64 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray63);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble65 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray63);
    double[] doubleArray66 = quarterlyDouble65.dArr;
    quarterlyDouble52.dArr = doubleArray66;
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
    org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray59);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray63);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray66);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test1085() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1085");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 0,
        (int) '#');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1086() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1086");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 1,
        (int) 'a');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1087() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1087");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000", (int) (byte) -1, (int) (byte) 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1088() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1088");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double[] doubleArray9 = quarterlyDouble7.dArr;
    double double10 = quarterlyDouble7.getPrevTtm();
    double double13 = quarterlyDouble7.deltaQ(1, (int) (short) -1);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
  }

  @Test
  public void test1089() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1089");
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
    double[] doubleArray21 = null;
    quarterlyDouble6.dArr = doubleArray21;
    double double23 = quarterlyDouble6.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str24 = quarterlyDouble6.toString();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
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
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
  }

  @Test
  public void test1090() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1090");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double10 = quarterlyDouble6.get(1);
    double double11 = quarterlyDouble6.getPrevTtm();
    java.lang.String str12 = quarterlyDouble6.toString();
    double[] doubleArray13 = new double[] {};
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    quarterlyDouble6.dArr = doubleArray13;
    double double17 = quarterlyDouble6.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str12,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
  }

  @Test
  public void test1091() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1091");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double9 = quarterlyDouble8.getPrevTtm();
    double double10 = quarterlyDouble8.get2QTtm();
    java.lang.String str11 = quarterlyDouble8.toString();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str11,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test1092() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1092");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    java.lang.String str6 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = companyData1.getFdList();
    java.lang.String str10 = companyData1.getTicker();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList7);
    org.junit.Assert.assertNotNull(fieldDataList8);
    org.junit.Assert.assertNotNull(fieldDataList9);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
  }

  @Test
  public void test1093() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1093");
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
    double double17 = quarterlyDouble8.get((int) (byte) 1);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
  }

  @Test
  public void test1094() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1094");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.deltaQ((int) (short) 100, (int) '#');
    double double12 = quarterlyDouble6.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1100.0d + "'", double12 == 1100.0d);
  }

  @Test
  public void test1095() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1095");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    java.lang.String str6 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList8, (int) (byte) 0, (int) (byte) -1);
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
  public void test1096() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1096");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) 'a', (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1097() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1097");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str53 = quarterlyDouble6.fmtGrowth4Q("\t i=0 0.0000\t i=1 0.0000");
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
  public void test1098() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1098");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000", (int) (byte) 1, (int) (byte) -1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1099() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1099");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray9 = quarterlyDouble8.dArr;
    double double10 = quarterlyDouble8.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str12 = quarterlyDouble8.fmtGrowth1Q("");
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
  }

  @Test
  public void test1100() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1100");
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
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray39);
    java.lang.String str42 = quarterlyDouble41.toString();
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
    org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str42,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test1101() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1101");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000", (int) '#', (int) (short) 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1102() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1102");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 1, (int) (short) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1103() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1103");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getPrevTtm();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.get2QTtm();
    double double11 = quarterlyDouble6.getPrevTtm();
    double double12 = quarterlyDouble6.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1100.0d + "'", double12 == 1100.0d);
  }

  @Test
  public void test1104() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1104");
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
    double double16 = quarterlyDouble8.deltaQ((int) (short) 1, (int) (short) 1);
    double double17 = quarterlyDouble8.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
  }

  @Test
  public void test1105() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1105");
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
    java.lang.String str41 = quarterlyDouble8.toString();
    double double42 = quarterlyDouble8.get2QTtm();
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
    org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str41,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
  }

  @Test
  public void test1106() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1106");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) (short) 100, (-1));
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1107() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1107");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double double9 = quarterlyDouble7.get2QTtm();
    double double10 = quarterlyDouble7.get2QTtm();
    double double11 = quarterlyDouble7.getPrevTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
  }

  @Test
  public void test1108() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1108");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) '4', (int) (byte) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList2);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test1109() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1109");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) 100,
        (int) '#');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1110() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1110");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double double12 = quarterlyDouble6.deltaQ((int) '4', (int) (byte) 100);
    double double13 = quarterlyDouble6.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
  }

  @Test
  public void test1111() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1111");
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
    double double19 = quarterlyDouble7.getQseqQ();
    double double21 = quarterlyDouble7.get((int) ' ');
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 100.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9999.9999d) + "'", double15 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 900.0d + "'", double19 == 900.0d);
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-9999.9999d) + "'", double21 == (-9999.9999d));
  }

  @Test
  public void test1112() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1112");
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
    double[] doubleArray40 = quarterlyDouble6.dArr;
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
    org.junit.Assert.assertNotNull(doubleArray40);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test1113() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1113");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) -1,
        (int) (short) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1114() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1114");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 10,
        (int) (byte) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1115() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1115");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    java.lang.String str6 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = companyData1.getFdList();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList7);
    org.junit.Assert.assertNotNull(fieldDataList8);
    org.junit.Assert.assertNotNull(fieldDataList9);
    org.junit.Assert.assertNotNull(fieldDataList10);
    org.junit.Assert.assertNotNull(fieldDataList11);
  }

  @Test
  public void test1116() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1116");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    java.lang.String str9 = quarterlyDouble6.toString();
    double double10 = quarterlyDouble6.getMostRecent();
    double double11 = quarterlyDouble6.getTtmAvg();
    double double12 = quarterlyDouble6.getTtmAvg();
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
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str9,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
  }

  @Test
  public void test1117() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1117");
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
    double double16 = quarterlyDouble8.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1100.0d + "'", double16 == 1100.0d);
  }

  @Test
  public void test1118() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1118");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double9 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.getMostRecent();
    double[] doubleArray16 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray16);
    double double18 = quarterlyDouble17.getTtmAvg();
    double double19 = quarterlyDouble17.getTtmAvg();
    double double22 = quarterlyDouble17.deltaQ((int) (short) 100, (int) '#');
    double double24 = quarterlyDouble17.get(0);
    double double25 = quarterlyDouble17.getQseqQ();
    double[] doubleArray26 = quarterlyDouble17.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray26);
    quarterlyDouble6.dArr = doubleArray26;
    double double29 = quarterlyDouble6.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1100.0d + "'", double25 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray26);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1100.0d + "'", double29 == 1100.0d);
  }

  @Test
  public void test1119() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1119");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getPrevTtm();
    double double11 = quarterlyDouble6.getPrevTtm();
    double double12 = quarterlyDouble6.get2QTtm();
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
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
  }

  @Test
  public void test1120() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1120");
    java.util.List<java.lang.String> strList0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
          .getCompanies(strList0, 100, (int) (byte) 10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test1121() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1121");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    java.lang.Class<?> wildcardClass8 = quarterlyDouble6.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertNotNull(wildcardClass8);
  }

  @Test
  public void test1122() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1122");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) 10,
        (int) 'a');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) 'a', 0);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test1123() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1123");
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
    java.lang.String str39 = quarterlyDouble6.toString();
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
    org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str39,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test1124() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1124");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.deltaQ((int) (short) 100, (int) '#');
    double double12 = quarterlyDouble6.getTtm();
    double[] doubleArray18 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    double double20 = quarterlyDouble19.getTtmAvg();
    double double21 = quarterlyDouble19.getTtmAvg();
    double double22 = quarterlyDouble19.getPrevTtm();
    double[] doubleArray28 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray28);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray28);
    java.lang.String str31 = quarterlyDouble30.toString();
    double[] doubleArray32 = quarterlyDouble30.dArr;
    quarterlyDouble19.dArr = doubleArray32;
    double[] doubleArray34 = quarterlyDouble19.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble35 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray34);
    quarterlyDouble6.dArr = doubleArray34;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray28);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str31,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray32);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray34);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test1125() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1125");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((-1), (-1));
  }

  @Test
  public void test1126() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1126");
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
    double[] doubleArray14 = quarterlyDouble8.dArr;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test1127() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1127");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 0, (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1128() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1128");
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
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str12,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1100.0d + "'", double13 == 1100.0d);
  }

  @Test
  public void test1129() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1129");
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
    java.lang.String str12 = companyData1.getTicker();
    java.lang.String str13 = companyData1.getTicker();
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
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
  }

  @Test
  public void test1130() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1130");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 100, (-1));
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
    org.junit.Assert.assertNotNull(companyDataList5);
  }

  @Test
  public void test1131() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1131");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((-1), 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, (int) (byte) -1, (int) (short) 100);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(manyCompanyDataList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test1133() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1133");
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
    double double26 = quarterlyDouble7.deltaQ((int) (short) 100, 1);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1100.0d + "'", double8 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str17,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 100.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
  }

  @Test
  public void test1134() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1134");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double double9 = quarterlyDouble7.get2QTtm();
    double double10 = quarterlyDouble7.get2QTtm();
    double double11 = quarterlyDouble7.getTtm();
    double double12 = quarterlyDouble7.getTtm();
    double double13 = quarterlyDouble7.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1100.0d + "'", double13 == 1100.0d);
  }

  @Test
  public void test1135() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1135");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 1,
        (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1136() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1136");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 10, (int) '4');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1137() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1137");
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
    double double13 = quarterlyDouble8.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1100.0d + "'", double13 == 1100.0d);
  }

  @Test
  public void test1138() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1138");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 1,
        (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (byte) 10, (-1));
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test1139() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1139");
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
    double double27 = quarterlyDouble25.get2QTtm();
    double double28 = quarterlyDouble25.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str30 = quarterlyDouble25.fmtGrowth1Q("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
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
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + 900.0d + "'", double28 == 900.0d);
  }

  @Test
  public void test1140() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1140");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList2, (int) (short) 10, (int) (short) -1);
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNull(fieldData5);
  }

  @Test
  public void test1141() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1141");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) ' ', (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
    org.junit.Assert.assertNotNull(companyDataList5);
  }

  @Test
  public void test1142() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1142");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(10, (int) '4');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1143() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1143");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(1, (int) ' ');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1144() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1144");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 10,
        (int) (short) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1145() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1145");
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
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
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
  }

  @Test
  public void test1146() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1146");
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
    // The following exception was thrown during execution in test generation
    try {
      double double41 = quarterlyDouble40.getQoQ();
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
  }

  @Test
  public void test1147() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1147");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 10, 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1148() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1148");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) -1,
        (int) '4');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1149() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1149");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(fieldDataList3);
  }

  @Test
  public void test1150() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1150");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 100, 1);
    java.lang.Class<?> wildcardClass4 = strList3.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test1151() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1151");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 0, 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1152() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1152");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.get2QTtm();
    java.lang.String str11 = quarterlyDouble6.toString();
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
    quarterlyDouble6.dArr = doubleArray30;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray30);
    double double33 = quarterlyDouble32.getPrevTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
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
    org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
  }

  @Test
  public void test1153() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1153");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.deltaQ((int) (short) -1, (int) (byte) 0);
    double double11 = quarterlyDouble6.get2QTtm();
    double double12 = quarterlyDouble6.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str14 = quarterlyDouble6.fmtGrowth1Q("hi!");
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
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1100.0d + "'", double12 == 1100.0d);
  }

  @Test
  public void test1154() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1154");
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
    double double16 = quarterlyDouble8.deltaQ((int) (short) 1, (int) (short) 1);
    double double18 = quarterlyDouble8.get(0);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
  }

  @Test
  public void test1155() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1155");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(100, (int) '#');
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test1157() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1157");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double double10 = quarterlyDouble6.get2QTtm();
    java.lang.String str11 = quarterlyDouble6.toString();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str11,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test1158() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1158");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(0, (int) (short) -1);
  }

  @Test
  public void test1159() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1159");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t i=0 0.0000\t i=1 0.0000", (int) (byte) 10, (int) (byte) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1160() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1160");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 10, 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) '#', (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList9 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, 0, (int) ' ');
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(companyDataList9);
  }

  @Test
  public void test1161() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1161");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 0,
        (int) ' ');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test1162() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1162");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) '#', 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1163() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1163");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double double12 = quarterlyDouble6.deltaQ((int) '4', (int) (byte) 100);
    double double13 = quarterlyDouble6.getQseqQ();
    java.lang.String str14 = quarterlyDouble6.toString();
    double double15 = quarterlyDouble6.getPrevTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1100.0d + "'", double13 == 1100.0d);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str14,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
  }

  @Test
  public void test1164() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1164");
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
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble55 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray51);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble56 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray51);
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
  }

  @Test
  public void test1165() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1165");
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
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble55 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray51);
    java.lang.String str56 = quarterlyDouble55.toString();
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
    org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000" + "'", str56,
        "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
  }

  @Test
  public void test1166() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1166");
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
        .getFieldData(fieldDataList11, 100, (int) '4');
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
  public void test1167() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1167");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", 1,
        (int) (byte) 100);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1168() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1168");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 100, 100);
  }

  @Test
  public void test1169() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1169");
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
    double double13 = quarterlyDouble8.getTtm();
    java.lang.String str14 = quarterlyDouble8.toString();
    double[] doubleArray20 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray20);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray20);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray20);
    double[] doubleArray29 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray29);
    double double31 = quarterlyDouble30.getTtmAvg();
    double[] doubleArray37 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble38 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray37);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray37);
    quarterlyDouble30.dArr = doubleArray37;
    double double41 = quarterlyDouble30.getPrevTtm();
    double double42 = quarterlyDouble30.getPrevTtm();
    double[] doubleArray48 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble49 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray48);
    double double50 = quarterlyDouble49.getTtmAvg();
    double[] doubleArray56 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble57 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray56);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble58 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray56);
    quarterlyDouble49.dArr = doubleArray56;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble60 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray56);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble61 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray56);
    quarterlyDouble30.dArr = doubleArray56;
    quarterlyDouble23.dArr = doubleArray56;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble64 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray56);
    quarterlyDouble8.dArr = doubleArray56;
    double double66 = quarterlyDouble8.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str10,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str14,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray20);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray29);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray37);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray48);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray56);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
  }

  @Test
  public void test1170() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1170");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 0,
        (int) 'a');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1171() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1171");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double10 = quarterlyDouble6.get((int) (short) 1);
    double double11 = quarterlyDouble6.getPrevTtm();
    double double12 = quarterlyDouble6.getQseqQ();
    java.lang.String str13 = quarterlyDouble6.toString();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1100.0d + "'", double12 == 1100.0d);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str13,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test1172() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1172");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 0,
        (int) 'a');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, 0, 10);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test1173() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1173");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.getTtmAvg();
    double double12 = quarterlyDouble6.getTtmAvg();
    double double13 = quarterlyDouble6.get2QTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
  }

  @Test
  public void test1174() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1174");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.deltaQ((int) (short) 100, (int) '#');
    double double13 = quarterlyDouble6.get(0);
    double double14 = quarterlyDouble6.getTtm();
    double double15 = quarterlyDouble6.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
  }

  @Test
  public void test1175() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1175");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) '#',
        (int) (short) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1176() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1176");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 10,
        (int) ' ');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1177() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1177");
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
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str18,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test1178() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1178");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) '4', (int) '#');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1179() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1179");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 10,
        (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1180() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1180");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double double10 = quarterlyDouble7.get((int) (byte) -1);
    java.lang.String str11 = quarterlyDouble7.toString();
    double double14 = quarterlyDouble7.deltaQ(1, 0);
    double double15 = quarterlyDouble7.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str11,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1100.0d + "'", double15 == 1100.0d);
  }

  @Test
  public void test1181() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1181");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.lang.String str4 = companyData1.getTicker();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str2,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str3,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str4,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test1182() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1182");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getPrevTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
  }

  @Test
  public void test1183() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1183");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000", (int) ' ', (int) (byte) 100);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1184() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1184");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) '#', (int) '#');
  }

  @Test
  public void test1185() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1185");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 100, (int) ' ');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1186() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1186");
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
    double double29 = quarterlyDouble6.getTtm();
    double double30 = quarterlyDouble6.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray22);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    org.junit.Assert.assertTrue("'" + double29 + "' != '" + 40.0d + "'", double29 == 40.0d);
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + 40.0d + "'", double30 == 40.0d);
  }

  @Test
  public void test1187() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1187");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 0, 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1188() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1188");
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
    double double16 = quarterlyDouble7.getTtm();
    double double17 = quarterlyDouble7.getTtmAvg();
    double[] doubleArray18 = null;
    quarterlyDouble7.dArr = doubleArray18;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str11,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
  }

  @Test
  public void test1189() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1189");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double double10 = quarterlyDouble6.getPrevTtm();
    double double11 = quarterlyDouble6.get2QTtm();
    double double12 = quarterlyDouble6.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
  }

  @Test
  public void test1190() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1190");
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
    double double25 = quarterlyDouble24.get2QTtm();
    double double27 = quarterlyDouble24.get((int) (short) 0);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1100.0d + "'", double8 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str17,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 100.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
  }

  @Test
  public void test1191() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1191");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000", (int) (short) 1, 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1192() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1192");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 1, (int) ' ');
  }

  @Test
  public void test1193() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1193");
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
    double double19 = quarterlyDouble6.deltaQ((int) '#', (int) '#');
    // The following exception was thrown during execution in test generation
    try {
      double double20 = quarterlyDouble6.getQoQ();
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
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
  }

  @Test
  public void test1194() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1194");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 10,
        (int) (short) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1195() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1195");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.deltaQ((int) (short) -1, (int) (byte) 0);
    double double11 = quarterlyDouble6.getTtm();
    double double12 = quarterlyDouble6.getTtm();
    double double13 = quarterlyDouble6.getTtm();
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
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
  }

  @Test
  public void test1196() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1196");
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
    java.lang.String str11 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData16 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList13, 0, (int) (byte) -1);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData19 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList13, (int) (byte) -1, (int) (byte) -1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList12);
    org.junit.Assert.assertNotNull(fieldDataList13);
    org.junit.Assert.assertNull(fieldData16);
    org.junit.Assert.assertNull(fieldData19);
  }

  @Test
  public void test1197() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1197");
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
    double[] doubleArray64 = null;
    quarterlyDouble7.dArr = doubleArray64;
    double double68 = quarterlyDouble7.deltaQ(100, (int) '4');
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
    org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
  }

  @Test
  public void test1198() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1198");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    java.lang.String str9 = quarterlyDouble6.toString();
    double double10 = quarterlyDouble6.get2QTtm();
    double double12 = quarterlyDouble6.get((int) (short) 100);
    double double13 = quarterlyDouble6.getTtm();
    java.lang.String str14 = quarterlyDouble6.toString();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str9,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str14,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test1199() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1199");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 0, (-1));
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
  }

  @Test
  public void test1200() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1200");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getTtmAvg();
    java.lang.String str10 = quarterlyDouble6.toString();
    double double11 = quarterlyDouble6.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str10,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1100.0d + "'", double11 == 1100.0d);
  }

  @Test
  public void test1201() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1201");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getPrevTtm();
    double[] doubleArray11 = quarterlyDouble6.dArr;
    java.lang.String str12 = quarterlyDouble6.toString();
    double[] doubleArray18 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    double double20 = quarterlyDouble19.getTtmAvg();
    double double21 = quarterlyDouble19.getTtmAvg();
    java.lang.String str22 = quarterlyDouble19.toString();
    java.lang.String str23 = quarterlyDouble19.toString();
    double[] doubleArray24 = quarterlyDouble19.dArr;
    quarterlyDouble6.dArr = doubleArray24;
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
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str22,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str23,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray24);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test1202() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1202");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.lang.String str5 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = companyData1.getFdList();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList6);
    org.junit.Assert.assertNotNull(fieldDataList7);
    org.junit.Assert.assertNotNull(fieldDataList8);
    org.junit.Assert.assertNotNull(fieldDataList9);
    org.junit.Assert.assertNotNull(fieldDataList10);
  }

  @Test
  public void test1203() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1203");
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
    double double24 = quarterlyDouble6.getPrevTtm();
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
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
  }

  @Test
  public void test1204() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1204");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(10, (int) (byte) 100);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1205() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1205");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 1, (int) ' ');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1206() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1206");
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
    double double16 = quarterlyDouble7.getTtm();
    double double17 = quarterlyDouble7.getTtmAvg();
    java.lang.String str18 = quarterlyDouble7.toString();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str11,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str18,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test1207() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1207");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 1,
        (int) (short) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test1208() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1208");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getQseqQ();
    double double9 = quarterlyDouble7.getMostRecent();
    double double10 = quarterlyDouble7.getTtm();
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
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1100.0d + "'", double8 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 40.0d + "'", double10 == 40.0d);
  }

  @Test
  public void test1209() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1209");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 0, 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1210() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1210");
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
      java.lang.String str13 = quarterlyDouble7.fmtGrowth4Q("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
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
  public void test1211() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1211");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtm();
    double[] doubleArray8 = quarterlyDouble6.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray8);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray8);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    org.junit.Assert.assertNotNull(doubleArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test1212() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1212");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) '#', (int) (byte) 100);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1213() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1213");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
    java.lang.String str2 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.lang.String str5 = companyData1.getTicker();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000" + "'", str2,
        "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000" + "'", str5,
        "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
  }

  @Test
  public void test1214() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1214");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (-1),
        (int) (short) 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (short) 10, (int) (short) 10);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test1215() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1215");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.get2QTtm();
    double double9 = quarterlyDouble6.getQseqQ();
    double[] doubleArray10 = quarterlyDouble6.dArr;
    double double11 = quarterlyDouble6.getQseqQ();
    double[] doubleArray12 = quarterlyDouble6.dArr;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1100.0d + "'", double11 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test1216() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1216");
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
    double[] doubleArray13 = quarterlyDouble11.dArr;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test1217() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1217");
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
    double double65 = quarterlyDouble7.get(1);
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
    org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.0d + "'", double65 == 10.0d);
  }

  @Test
  public void test1218() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1218");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) -1,
        (int) ' ');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1219() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1219");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    java.lang.String str9 = quarterlyDouble6.toString();
    double double10 = quarterlyDouble6.getPrevTtm();
    double double13 = quarterlyDouble6.deltaQ((int) (byte) 1, (int) (byte) 0);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str9,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
  }

  @Test
  public void test1220() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1220");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray10 = new double[] { 0.0d, 0 };
    quarterlyDouble7.dArr = doubleArray10;
    double double12 = quarterlyDouble7.getPrevTtm();
    double double13 = quarterlyDouble7.getMostRecent();
    double double14 = quarterlyDouble7.get2QTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str16 = quarterlyDouble7.fmtGrowth4Q("");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
  }

  @Test
  public void test1221() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1221");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.get2QTtm();
    double double13 = quarterlyDouble6.deltaQ((int) '#', (int) ' ');
    double double15 = quarterlyDouble6.get((int) (short) 100);
    java.lang.String str16 = quarterlyDouble6.toString();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9999.9999d) + "'", double15 == (-9999.9999d));
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str16,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test1222() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1222");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000", (int) 'a', 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1223() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1223");
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
    double double46 = quarterlyDouble40.deltaQ((int) (short) 1, (int) (byte) -1);
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
    org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
  }

  @Test
  public void test1224() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1224");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 1, (int) (short) 100);
    java.lang.Class<?> wildcardClass4 = strList3.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test1225() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1225");
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
    double double15 = quarterlyDouble8.get((int) (byte) 10);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9999.9999d) + "'", double13 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9999.9999d) + "'", double15 == (-9999.9999d));
  }

  @Test
  public void test1226() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1226");
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
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray39);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble42 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray39);
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
  public void test1227() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1227");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 1, 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (short) 0, 100);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test1228() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1228");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.get2QTtm();
    java.lang.String str9 = quarterlyDouble6.toString();
    double[] doubleArray10 = quarterlyDouble6.dArr;
    double double11 = quarterlyDouble6.getQseqQ();
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
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str9,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1100.0d + "'", double11 == 1100.0d);
  }

  @Test
  public void test1229() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1229");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double double10 = quarterlyDouble6.getPrevTtm();
    double double13 = quarterlyDouble6.deltaQ((int) (byte) 10, 0);
    double[] doubleArray14 = quarterlyDouble6.dArr;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test1230() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1230");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) '#', 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
  }

  @Test
  public void test1231() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1231");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 100,
        (int) (short) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1232() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1232");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) -1,
        (int) (short) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1233() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1233");
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
    double double15 = quarterlyDouble6.getQseqQ();
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
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1100.0d + "'", double15 == 1100.0d);
  }

  @Test
  public void test1234() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1234");
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
    double[] doubleArray15 = quarterlyDouble11.dArr;
    java.lang.String str16 = quarterlyDouble11.toString();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str16,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test1235() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1235");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.deltaQ((int) (short) 100, (int) '#');
    double double13 = quarterlyDouble6.get(0);
    double double14 = quarterlyDouble6.getQseqQ();
    double double15 = quarterlyDouble6.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1100.0d + "'", double14 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
  }

  @Test
  public void test1236() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1236");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) ' ', (int) 'a');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1237() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1237");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double double12 = quarterlyDouble6.deltaQ((int) '4', (int) (byte) 100);
    double double15 = quarterlyDouble6.deltaQ((int) '#', 1);
    java.lang.String str16 = quarterlyDouble6.toString();
    double double17 = quarterlyDouble6.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str19 = quarterlyDouble6.fmtGrowth1Q("");
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
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str16,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1100.0d + "'", double17 == 1100.0d);
  }

  @Test
  public void test1238() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1238");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) '#', (int) (short) -1);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1239() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1239");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) 'a', (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test1240() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1240");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) 1, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test1241() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1241");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double10 = quarterlyDouble6.get((int) (short) 1);
    double double11 = quarterlyDouble6.getPrevTtm();
    double double14 = quarterlyDouble6.deltaQ((int) (short) 100, (int) (short) 1);
    java.lang.String str15 = quarterlyDouble6.toString();
    double[] doubleArray16 = quarterlyDouble6.dArr;
    double double17 = quarterlyDouble6.getTtm();
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
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str15,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
  }

  @Test
  public void test1242() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1242");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.deltaQ((int) (short) 100, (int) '#');
    double double13 = quarterlyDouble6.get(0);
    double double16 = quarterlyDouble6.deltaQ((int) '#', (int) (short) 10);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
  }

  @Test
  public void test1243() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1243");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtm();
    double double8 = quarterlyDouble6.getTtm();
    double double9 = quarterlyDouble6.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 40.0d + "'", double9 == 40.0d);
  }

  @Test
  public void test1244() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1244");
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
    java.lang.String str11 = companyData1.getTicker();
    java.lang.String str12 = companyData1.getTicker();
    java.lang.String str13 = companyData1.getTicker();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList7);
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
  }

  @Test
  public void test1245() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1245");
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
    double[] doubleArray19 = quarterlyDouble7.dArr;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 100.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9999.9999d) + "'", double15 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 100.0, 10.0]");
  }

  @Test
  public void test1246() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1246");
    java.util.List<java.lang.String> strList0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
          .getCompanies(strList0, 1, (int) (short) -1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test1247() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1247");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    java.lang.String str9 = quarterlyDouble6.toString();
    double double10 = quarterlyDouble6.getMostRecent();
    double double11 = quarterlyDouble6.getTtmAvg();
    double double12 = quarterlyDouble6.getPrevTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str9,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
  }

  @Test
  public void test1248() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1248");
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
    double double14 = quarterlyDouble8.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1100.0d + "'", double14 == 1100.0d);
  }

  @Test
  public void test1249() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1249");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.get2QTtm();
    java.lang.String str11 = quarterlyDouble6.toString();
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
    quarterlyDouble6.dArr = doubleArray30;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray30);
    double double34 = quarterlyDouble32.get((-1));
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
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
    org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-9999.9999d) + "'", double34 == (-9999.9999d));
  }

  @Test
  public void test1250() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1250");
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
    java.lang.Class<?> wildcardClass28 = quarterlyDouble24.getClass();
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
    org.junit.Assert.assertNotNull(wildcardClass28);
  }

  @Test
  public void test1251() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1251");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) '#', (int) (byte) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList2);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test1252() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1252");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 1,
        (int) '4');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1253() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1253");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.lang.String str3 = companyData1.getTicker();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000" + "'", str3,
        "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
  }

  @Test
  public void test1254() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1254");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) '4', 0);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1255() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1255");
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
    double double15 = quarterlyDouble8.getPrevTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str17 = quarterlyDouble8.fmtGrowth4Q("\t i=0 0.0000\t i=1 0.0000");
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
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
  }

  @Test
  public void test1256() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1256");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) '4', 0);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test1257() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1257");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 10, 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1258() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1258");
    double[] doubleArray5 = new double[] { 900.0d, 40.0d, 1, 10L, 10.0d };
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
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[900.0, 40.0, 1.0, 10.0, 10.0]");
  }

  @Test
  public void test1259() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1259");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000", 10, 100);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1260() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1260");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!",
        (int) (byte) -1, 100);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1261() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1261");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double double9 = quarterlyDouble7.get2QTtm();
    double double10 = quarterlyDouble7.getTtmAvg();
    double double11 = quarterlyDouble7.getTtmAvg();
    java.lang.String str12 = quarterlyDouble7.toString();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str12,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test1263() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1263");
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
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
  }

  @Test
  public void test1264() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1264");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
    java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1,
        fieldDataArray0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (short) 100, (int) (byte) 10);
    org.junit.Assert.assertNotNull(fieldDataArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNull(fieldData5);
  }

  @Test
  public void test1265() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1265");
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
    double double18 = quarterlyDouble16.get(1);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1100.0d + "'", double14 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
  }

  @Test
  public void test1266() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1266");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (byte) 1,
          (int) (short) 10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test1267() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1267");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList0 = null;
    // The following exception was thrown during execution in test generation
    try {
      net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
          .getFieldData(fieldDataList0, (int) (byte) 10, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test1268() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1268");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double double12 = quarterlyDouble6.deltaQ((int) '4', (int) (byte) 100);
    double double13 = quarterlyDouble6.getQseqQ();
    double[] doubleArray19 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    double double21 = quarterlyDouble20.getTtmAvg();
    double double22 = quarterlyDouble20.getTtmAvg();
    double double25 = quarterlyDouble20.deltaQ((int) (short) 100, (int) '#');
    double double27 = quarterlyDouble20.get(0);
    double double28 = quarterlyDouble20.getQseqQ();
    double[] doubleArray29 = quarterlyDouble20.dArr;
    double[] doubleArray30 = quarterlyDouble20.dArr;
    quarterlyDouble6.dArr = doubleArray30;
    double double32 = quarterlyDouble6.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1100.0d + "'", double13 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1100.0d + "'", double28 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray29);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray30);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
  }

  @Test
  public void test1269() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1269");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (-1), (int) (short) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1270() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1270");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (byte) 1, (int) 'a');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, (int) (byte) 10, (int) ' ');
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList5);
  }

  @Test
  public void test1271() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1271");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.getQseqQ();
    double double12 = quarterlyDouble6.getQseqQ();
    double double13 = quarterlyDouble6.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1100.0d + "'", double11 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1100.0d + "'", double12 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1100.0d + "'", double13 == 1100.0d);
  }

  @Test
  public void test1272() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1272");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 100,
        (int) (byte) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1273() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1273");
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
    double double35 = quarterlyDouble34.getMostRecent();
    double double36 = quarterlyDouble34.get2QTtm();
    java.lang.String str37 = quarterlyDouble34.toString();
    double[] doubleArray38 = quarterlyDouble34.dArr;
    quarterlyDouble24.dArr = doubleArray38;
    double[] doubleArray40 = quarterlyDouble24.dArr;
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
    org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
    org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str37,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray38);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray40);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test1274() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1274");
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
    double double21 = quarterlyDouble6.get((int) (short) -1);
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
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-9999.9999d) + "'", double21 == (-9999.9999d));
  }

  @Test
  public void test1275() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1275");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str48 = quarterlyDouble6.fmtGrowth1Q("");
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
    org.junit.Assert.assertNotNull(doubleArray31);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray39);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test1276() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1276");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getPrevTtm();
    double double11 = quarterlyDouble6.getPrevTtm();
    double double12 = quarterlyDouble6.get2QTtm();
    double double13 = quarterlyDouble6.getMostRecent();
    double double14 = quarterlyDouble6.getPrevTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
  }

  @Test
  public void test1277() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1277");
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
    double double27 = quarterlyDouble25.get2QTtm();
    double double28 = quarterlyDouble25.getQseqQ();
    double[] doubleArray29 = quarterlyDouble25.dArr;
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
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + 900.0d + "'", double28 == 900.0d);
    org.junit.Assert.assertNotNull(doubleArray29);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 100.0, 10.0]");
  }

  @Test
  public void test1278() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1278");
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
    double double16 = quarterlyDouble8.deltaQ((int) (short) 1, (int) (short) 1);
    double double17 = quarterlyDouble8.getMostRecent();
    double[] doubleArray23 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray23);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray23);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray23);
    double[] doubleArray27 = quarterlyDouble26.dArr;
    double double29 = quarterlyDouble26.get((-1));
    double[] doubleArray35 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray35);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray35);
    java.lang.String str38 = quarterlyDouble37.toString();
    double double41 = quarterlyDouble37.deltaQ((int) (short) 10, (int) ' ');
    double double42 = quarterlyDouble37.getPrevTtm();
    double[] doubleArray48 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble49 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray48);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble50 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray48);
    java.lang.String str51 = quarterlyDouble50.toString();
    double double53 = quarterlyDouble50.get((int) (byte) -1);
    java.lang.String str54 = quarterlyDouble50.toString();
    double double57 = quarterlyDouble50.deltaQ(1, 0);
    double[] doubleArray58 = quarterlyDouble50.dArr;
    quarterlyDouble37.dArr = doubleArray58;
    quarterlyDouble26.dArr = doubleArray58;
    quarterlyDouble8.dArr = doubleArray58;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray27);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-9999.9999d) + "'", double29 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray35);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str38,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray48);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str51,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-9999.9999d) + "'", double53 == (-9999.9999d));
    org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str54,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray58);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test1279() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1279");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getPrevTtm();
    double double11 = quarterlyDouble6.getTtmAvg();
    double[] doubleArray17 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    java.lang.String str20 = quarterlyDouble19.toString();
    double double21 = quarterlyDouble19.get2QTtm();
    double[] doubleArray27 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray27);
    double double29 = quarterlyDouble28.getTtmAvg();
    double double30 = quarterlyDouble28.getTtmAvg();
    double double31 = quarterlyDouble28.getQseqQ();
    double double32 = quarterlyDouble28.getPrevTtm();
    double[] doubleArray38 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray38);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble40 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray38);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray38);
    double[] doubleArray42 = quarterlyDouble41.dArr;
    double double44 = quarterlyDouble41.get((-1));
    double[] doubleArray50 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble51 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray50);
    double double52 = quarterlyDouble51.getTtmAvg();
    double[] doubleArray58 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble59 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray58);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble60 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray58);
    quarterlyDouble51.dArr = doubleArray58;
    double[] doubleArray67 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble68 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray67);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble69 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray67);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble70 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray67);
    quarterlyDouble51.dArr = doubleArray67;
    quarterlyDouble41.dArr = doubleArray67;
    quarterlyDouble28.dArr = doubleArray67;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble74 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray67);
    quarterlyDouble19.dArr = doubleArray67;
    quarterlyDouble6.dArr = doubleArray67;
    java.lang.Class<?> wildcardClass77 = quarterlyDouble6.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str20,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray27);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
    org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1100.0d + "'", double31 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray38);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray42);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-9999.9999d) + "'", double44 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray50);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray58);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray67);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(wildcardClass77);
  }

  @Test
  public void test1280() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1280");
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
    double[] doubleArray33 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray33);
    double double35 = quarterlyDouble34.getTtmAvg();
    double double36 = quarterlyDouble34.getTtmAvg();
    double double37 = quarterlyDouble34.getPrevTtm();
    double double38 = quarterlyDouble34.getPrevTtm();
    double[] doubleArray39 = quarterlyDouble34.dArr;
    quarterlyDouble24.dArr = doubleArray39;
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
    org.junit.Assert.assertNotNull(doubleArray33);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
    org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
    org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
    org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray39);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test1281() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1281");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double10 = quarterlyDouble8.get((int) (byte) -1);
    double double11 = quarterlyDouble8.get2QTtm();
    double[] doubleArray12 = quarterlyDouble8.dArr;
    double double13 = quarterlyDouble8.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
  }

  @Test
  public void test1282() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1282");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(0, (int) '4');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1283() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1283");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str28 = quarterlyDouble6.fmtGrowth4Q("\t i=0 0.0000\t i=1 0.0000");
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
  }

  @Test
  public void test1284() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1284");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double double11 = quarterlyDouble7.deltaQ((int) (short) 10, (int) ' ');
    double[] doubleArray12 = quarterlyDouble7.dArr;
    double double13 = quarterlyDouble7.get2QTtm();
    double[] doubleArray18 = new double[] { 100, 100.0f, 10.0f, 1 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    quarterlyDouble7.dArr = doubleArray18;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0, 10.0, 1.0]");
  }

  @Test
  public void test1285() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1285");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) 'a', 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1286() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1286");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 1,
        (int) (byte) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1287() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1287");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.deltaQ((int) (short) -1, (int) (byte) 0);
    double double11 = quarterlyDouble6.get2QTtm();
    double double12 = quarterlyDouble6.getQseqQ();
    double double13 = quarterlyDouble6.get2QTtm();
    java.lang.String str14 = quarterlyDouble6.toString();
    double double15 = quarterlyDouble6.getPrevTtm();
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
  }

  @Test
  public void test1288() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1288");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) '4', (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, (int) (byte) 100, (int) (short) -1);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList5);
  }

  @Test
  public void test1289() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1289");
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
    double double13 = quarterlyDouble11.getMostRecent();
    double[] doubleArray14 = quarterlyDouble11.dArr;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1100.0d + "'", double12 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test1290() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1290");
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
    double double14 = quarterlyDouble8.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str13,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1100.0d + "'", double14 == 1100.0d);
  }

  @Test
  public void test1291() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1291");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) 10,
        (int) (short) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1292() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1292");
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
    java.lang.String str13 = quarterlyDouble11.toString();
    double double14 = quarterlyDouble11.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str13,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
  }

  @Test
  public void test1293() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1293");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 1, (int) (short) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1294() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1294");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 0, (int) (short) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1295() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1295");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double10 = quarterlyDouble6.get((int) '#');
    double double11 = quarterlyDouble6.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
  }

  @Test
  public void test1296() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1296");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 0, (int) (short) 100);
  }

  @Test
  public void test1297() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1297");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.get2QTtm();
    double double10 = quarterlyDouble6.get((int) (byte) 100);
    double double11 = quarterlyDouble6.getQseqQ();
    double double12 = quarterlyDouble6.getTtmAvg();
    double double14 = quarterlyDouble6.get((int) 'a');
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1100.0d + "'", double11 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
  }

  @Test
  public void test1298() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1298");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData6 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList3, (int) (byte) 10, (int) (byte) -1);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData9 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList3, (int) (short) 0, 0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData12 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList3, (int) (byte) 0, 100);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData15 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList3, 10, (int) (byte) 1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNull(fieldData6);
    org.junit.Assert.assertNull(fieldData9);
    org.junit.Assert.assertNull(fieldData12);
    org.junit.Assert.assertNull(fieldData15);
  }

  @Test
  public void test1299() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1299");
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
    double double16 = quarterlyDouble8.getQseqQ();
    double double17 = quarterlyDouble8.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1100.0d + "'", double16 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
  }

  @Test
  public void test1300() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1300");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) (byte) 1, (int) (short) 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1301() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1301");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double10 = quarterlyDouble6.get((int) (short) 1);
    double double11 = quarterlyDouble6.getPrevTtm();
    double double14 = quarterlyDouble6.deltaQ((int) (short) 100, (int) (short) 1);
    java.lang.String str15 = quarterlyDouble6.toString();
    double[] doubleArray16 = quarterlyDouble6.dArr;
    double double18 = quarterlyDouble6.get((int) (short) 1);
    double double19 = quarterlyDouble6.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str15,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1100.0d + "'", double19 == 1100.0d);
  }

  @Test
  public void test1302() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1302");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 100, (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test1303() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1303");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) '4', (int) '4');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1304() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1304");
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
    java.lang.String str49 = quarterlyDouble8.toString();
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
    org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str49,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test1305() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1305");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 10, (-1));
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (short) -1, (int) (byte) 1);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
    org.junit.Assert.assertNotNull(companyDataList7);
  }

  @Test
  public void test1306() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1306");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("hi!", 0,
        (int) (byte) 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1307() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1307");
    double[] doubleArray0 = new double[] {};
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray0);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray0);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble3 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray0);
    org.junit.Assert.assertNotNull(doubleArray0);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
  }

  @Test
  public void test1308() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1308");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (byte) 10,
          (int) ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test1309() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1309");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray10 = new double[] { 0.0d, 0 };
    quarterlyDouble7.dArr = doubleArray10;
    double double12 = quarterlyDouble7.getPrevTtm();
    double double13 = quarterlyDouble7.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str15 = quarterlyDouble7.fmtGrowth1Q("\t i=0 0.0000\t i=1 0.0000");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
  }

  @Test
  public void test1310() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1310");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 100, 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1311() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1311");
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
    double double19 = quarterlyDouble18.getPrevTtm();
    double[] doubleArray25 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray25);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray25);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray25);
    double[] doubleArray29 = quarterlyDouble28.dArr;
    double double31 = quarterlyDouble28.get((-1));
    double[] doubleArray37 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble38 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray37);
    double double39 = quarterlyDouble38.getTtmAvg();
    double[] doubleArray45 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble46 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray45);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble47 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray45);
    quarterlyDouble38.dArr = doubleArray45;
    double[] doubleArray54 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble55 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray54);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble56 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray54);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble57 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray54);
    quarterlyDouble38.dArr = doubleArray54;
    quarterlyDouble28.dArr = doubleArray54;
    double[] doubleArray65 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble66 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray65);
    double double67 = quarterlyDouble66.getTtmAvg();
    double double68 = quarterlyDouble66.getTtmAvg();
    double double69 = quarterlyDouble66.getQseqQ();
    double double70 = quarterlyDouble66.getPrevTtm();
    double[] doubleArray71 = quarterlyDouble66.dArr;
    quarterlyDouble28.dArr = doubleArray71;
    quarterlyDouble18.dArr = doubleArray71;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray29);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-9999.9999d) + "'", double31 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray37);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray45);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray54);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray65);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double67 + "' != '" + 10.0d + "'", double67 == 10.0d);
    org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
    org.junit.Assert.assertTrue("'" + double69 + "' != '" + 1100.0d + "'", double69 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray71);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test1312() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1312");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) '#', (int) '4');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1313() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1313");
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
    double double19 = quarterlyDouble6.deltaQ((int) '#', (int) '#');
    double double20 = quarterlyDouble6.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1100.0d + "'", double20 == 1100.0d);
  }

  @Test
  public void test1314() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1314");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 100, (int) (short) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1315() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1315");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) -1,
        (int) (short) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, 10, (int) (byte) 10);
    java.lang.Class<?> wildcardClass7 = strList3.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test1316() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1316");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.deltaQ((int) (short) -1, (int) (byte) 0);
    double double11 = quarterlyDouble6.getTtm();
    double double12 = quarterlyDouble6.getTtm();
    double double13 = quarterlyDouble6.getTtm();
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
    double double43 = quarterlyDouble6.deltaQ((int) (short) -1, (int) (short) 1);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1100.0d + "'", double22 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray28);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str31,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray35);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 100.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
  }

  @Test
  public void test1317() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1317");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 100, 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1318() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1318");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.get2QTtm();
    double double13 = quarterlyDouble6.deltaQ((int) '#', (int) ' ');
    double double14 = quarterlyDouble6.getTtmAvg();
    double double15 = quarterlyDouble6.getTtmAvg();
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
  public void test1319() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1319");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray10 = new double[] { 0.0d, 0 };
    quarterlyDouble7.dArr = doubleArray10;
    double double12 = quarterlyDouble7.getPrevTtm();
    double double13 = quarterlyDouble7.getMostRecent();
    double double14 = quarterlyDouble7.get2QTtm();
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
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
  }

  @Test
  public void test1320() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1320");
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
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray25);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray25);
    java.lang.Class<?> wildcardClass30 = quarterlyDouble29.getClass();
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
    org.junit.Assert.assertNotNull(wildcardClass30);
  }

  @Test
  public void test1321() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1321");
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
    double double16 = quarterlyDouble8.get2QTtm();
    double double17 = quarterlyDouble8.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str19 = quarterlyDouble8.fmtGrowth4Q("\t i=0 0.0000\t i=1 0.0000");
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
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
  }

  @Test
  public void test1322() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1322");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double double9 = quarterlyDouble7.get2QTtm();
    double double10 = quarterlyDouble7.getTtmAvg();
    double double11 = quarterlyDouble7.getTtmAvg();
    double double12 = quarterlyDouble7.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1100.0d + "'", double12 == 1100.0d);
  }

  @Test
  public void test1323() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1323");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double double11 = quarterlyDouble7.deltaQ((int) (short) 10, (int) ' ');
    double double13 = quarterlyDouble7.get((int) (byte) 0);
    double double14 = quarterlyDouble7.getPrevTtm();
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
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
  }

  @Test
  public void test1324() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1324");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getPrevTtm();
    double double11 = quarterlyDouble6.getPrevTtm();
    double double12 = quarterlyDouble6.get2QTtm();
    double double13 = quarterlyDouble6.getTtmAvg();
    double[] doubleArray19 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    double double24 = quarterlyDouble22.get((int) (byte) -1);
    double double25 = quarterlyDouble22.get2QTtm();
    double double26 = quarterlyDouble22.getPrevTtm();
    double[] doubleArray27 = null;
    quarterlyDouble22.dArr = doubleArray27;
    double[] doubleArray34 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble35 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray34);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray34);
    java.lang.String str37 = quarterlyDouble36.toString();
    double[] doubleArray41 = new double[] { 1L, 100, (short) 10 };
    quarterlyDouble36.dArr = doubleArray41;
    quarterlyDouble22.dArr = doubleArray41;
    quarterlyDouble6.dArr = doubleArray41;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-9999.9999d) + "'", double24 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray34);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str37,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray41);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 100.0, 10.0]");
  }

  @Test
  public void test1325() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1325");
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
    double double16 = quarterlyDouble6.getTtm();
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
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
  }

  @Test
  public void test1326() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1326");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 10, (int) (short) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1327() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1327");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    java.lang.String str9 = quarterlyDouble6.toString();
    double double10 = quarterlyDouble6.get2QTtm();
    double double12 = quarterlyDouble6.get((int) (short) 100);
    double double13 = quarterlyDouble6.getTtm();
    double double14 = quarterlyDouble6.getTtm();
    double double16 = quarterlyDouble6.get((int) (byte) 10);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str9,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 40.0d + "'", double14 == 40.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9999.9999d) + "'", double16 == (-9999.9999d));
  }

  @Test
  public void test1328() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1328");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double double12 = quarterlyDouble6.deltaQ((int) '4', (int) (byte) 100);
    double double13 = quarterlyDouble6.getQseqQ();
    double[] doubleArray19 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    java.lang.String str22 = quarterlyDouble21.toString();
    double[] doubleArray23 = quarterlyDouble21.dArr;
    quarterlyDouble6.dArr = doubleArray23;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray23);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1100.0d + "'", double13 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str22,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test1329() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1329");
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
    double[] doubleArray19 = quarterlyDouble18.dArr;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test1330() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1330");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList2, 1, (int) '4');
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList2, (int) (byte) 100, (int) '#');
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList2, (int) (byte) 0, (-1));
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNull(fieldData5);
    org.junit.Assert.assertNull(fieldData8);
    org.junit.Assert.assertNull(fieldData11);
  }

  @Test
  public void test1331() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1331");
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
    java.lang.String str16 = quarterlyDouble6.toString();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str18 = quarterlyDouble6.fmtGrowth4Q("hi!");
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
  public void test1332() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1332");
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
    double double28 = quarterlyDouble24.get((int) (short) -1);
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
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-9999.9999d) + "'", double28 == (-9999.9999d));
  }

  @Test
  public void test1333() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1333");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getQseqQ();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double11 = quarterlyDouble7.get((int) ' ');
    double double12 = quarterlyDouble7.getTtmAvg();
    double double13 = quarterlyDouble7.getTtm();
    double double14 = quarterlyDouble7.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1100.0d + "'", double8 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
  }

  @Test
  public void test1334() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1334");
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
      java.lang.String str13 = quarterlyDouble11.fmtGrowth4Q("hi!");
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
  public void test1335() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1335");
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
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray39);
    java.lang.Class<?> wildcardClass42 = doubleArray39.getClass();
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
    org.junit.Assert.assertNotNull(wildcardClass42);
  }

  @Test
  public void test1336() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1336");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    java.lang.String str9 = quarterlyDouble6.toString();
    double double10 = quarterlyDouble6.getMostRecent();
    double double11 = quarterlyDouble6.getTtmAvg();
    double double12 = quarterlyDouble6.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str9,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1100.0d + "'", double12 == 1100.0d);
  }

  @Test
  public void test1337() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1337");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) 'a', (int) '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test1338() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1338");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) '#', (int) '4');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1339() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1339");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getPrevTtm();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
  }

  @Test
  public void test1340() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1340");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000", (int) (byte) 100, 100);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1341() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1341");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t i=0 0.0000\t i=1 0.0000");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.lang.String str3 = companyData1.getTicker();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\t i=0 0.0000\t i=1 0.0000" + "'", str3, "\t i=0 0.0000\t i=1 0.0000");
  }

  @Test
  public void test1342() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1342");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.getQseqQ();
    double double12 = quarterlyDouble6.getPrevTtm();
    double double13 = quarterlyDouble6.get2QTtm();
    double[] doubleArray14 = quarterlyDouble6.dArr;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1100.0d + "'", double11 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test1343() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1343");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((-1), (int) (byte) -1);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1344() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1344");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double9 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.getMostRecent();
    double[] doubleArray11 = quarterlyDouble6.dArr;
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
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test1345() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1345");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 0,
        (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, 100, (int) (byte) -1);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test1346() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1346");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (byte) 100,
          (int) '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test1347() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1347");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str21 = quarterlyDouble6.fmtGrowth4Q("\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
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
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
  }

  @Test
  public void test1348() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1348");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) 100, 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
  }

  @Test
  public void test1349() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1349");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double9 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.getPrevTtm();
    double double11 = quarterlyDouble6.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
  }

  @Test
  public void test1350() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1350");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 1, (int) (short) 0);
  }

  @Test
  public void test1351() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1351");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 10, (int) (byte) -1);
    java.lang.Class<?> wildcardClass4 = strList3.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test1352() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1352");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) 10,
        (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
  }

  @Test
  public void test1353() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1353");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double10 = quarterlyDouble6.get((int) (short) 1);
    double double11 = quarterlyDouble6.getPrevTtm();
    double double13 = quarterlyDouble6.get((-1));
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9999.9999d) + "'", double13 == (-9999.9999d));
  }

  @Test
  public void test1354() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1354");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getTtmAvg();
    java.lang.String str11 = quarterlyDouble6.toString();
    double double12 = quarterlyDouble6.getPrevTtm();
    double double13 = quarterlyDouble6.getPrevTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str11,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
  }

  @Test
  public void test1355() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1355");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str51 = quarterlyDouble6.fmtGrowth1Q("hi!");
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
    org.junit.Assert.assertNotNull(doubleArray31);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray39);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
  }

  @Test
  public void test1356() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1356");
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
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    double double16 = quarterlyDouble15.getTtm();
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
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
  }

  @Test
  public void test1357() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1357");
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
      java.lang.String str27 = quarterlyDouble6.fmtGrowth4Q("hi!");
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
  public void test1358() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1358");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtm();
    double[] doubleArray8 = quarterlyDouble6.dArr;
    double[] doubleArray14 = new double[] { 900.0d, 40.0d, 1, 10L, 10.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    quarterlyDouble6.dArr = doubleArray14;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    org.junit.Assert.assertNotNull(doubleArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[900.0, 40.0, 1.0, 10.0, 10.0]");
  }

  @Test
  public void test1359() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1359");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double double10 = quarterlyDouble7.get((int) (byte) -1);
    double double11 = quarterlyDouble7.getQseqQ();
    double double12 = quarterlyDouble7.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str14 = quarterlyDouble7.fmtGrowth4Q("hi!");
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
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1100.0d + "'", double11 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.0d + "'", double12 == 40.0d);
  }

  @Test
  public void test1360() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1360");
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
    java.lang.String str13 = quarterlyDouble8.toString();
    double double14 = quarterlyDouble8.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str12,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str13,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
  }

  @Test
  public void test1361() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1361");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 100, (-1));
  }

  @Test
  public void test1362() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1362");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) '4',
        (int) (short) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1363() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1363");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (byte) -1, (int) ' ');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1364() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1364");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      double double9 = quarterlyDouble7.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
  }

  @Test
  public void test1365() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1365");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 1, (-1));
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1366() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1366");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (short) 100, (int) '4');
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test1367() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1367");
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
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    double[] doubleArray21 = quarterlyDouble20.dArr;
    double double22 = quarterlyDouble20.get2QTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
  }

  @Test
  public void test1368() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1368");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.getMostRecent();
    double double14 = quarterlyDouble6.deltaQ(10, (int) 'a');
    double double16 = quarterlyDouble6.get((int) (byte) 10);
    double double17 = quarterlyDouble6.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9999.9999d) + "'", double16 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 40.0d + "'", double17 == 40.0d);
  }

  @Test
  public void test1369() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1369");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) '#', 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (short) -1, (int) (short) 1);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
    org.junit.Assert.assertNotNull(companyDataList7);
  }

  @Test
  public void test1370() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1370");
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
    double[] doubleArray14 = quarterlyDouble8.dArr;
    // The following exception was thrown during execution in test generation
    try {
      double double15 = quarterlyDouble8.getQoQ();
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
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test1371() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1371");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray9 = quarterlyDouble8.dArr;
    java.lang.String str10 = quarterlyDouble8.toString();
    double double11 = quarterlyDouble8.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str10,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 40.0d + "'", double11 == 40.0d);
  }

  @Test
  public void test1372() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1372");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000", 0, 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1373() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1373");
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
    double double18 = quarterlyDouble6.getPrevTtm();
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
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
  }

  @Test
  public void test1374() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1374");
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
    double double21 = quarterlyDouble6.getTtm();
    double double22 = quarterlyDouble6.getMostRecent();
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
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 40.0d + "'", double21 == 40.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
  }

  @Test
  public void test1375() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1375");
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
      double double14 = quarterlyDouble11.deltaQ((int) (short) 0, (int) (short) 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
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
  public void test1376() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1376");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) '4', (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList2);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(manyCompanyDataList3);
  }

  @Test
  public void test1377() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1377");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) -1,
        (int) (short) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1378() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1378");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (-1),
        (int) (short) 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (short) 10, (int) (byte) -1);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test1379() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1379");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.deltaQ((int) '#', (int) (short) 100);
    double double11 = quarterlyDouble6.getPrevTtm();
    java.lang.String str12 = quarterlyDouble6.toString();
    java.lang.String str13 = quarterlyDouble6.toString();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str12,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str13,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test1381() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1381");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.getQseqQ();
    double double14 = quarterlyDouble6.deltaQ((int) '4', (int) '#');
    double[] doubleArray20 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray20);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray20);
    double double23 = quarterlyDouble22.getQseqQ();
    double[] doubleArray29 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray29);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray29);
    java.lang.String str32 = quarterlyDouble31.toString();
    double[] doubleArray36 = new double[] { 1L, 100, (short) 10 };
    quarterlyDouble31.dArr = doubleArray36;
    quarterlyDouble22.dArr = doubleArray36;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray36);
    double double41 = quarterlyDouble39.get((int) (short) 100);
    double[] doubleArray42 = quarterlyDouble39.dArr;
    quarterlyDouble6.dArr = doubleArray42;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble44 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray42);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1100.0d + "'", double11 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray20);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1100.0d + "'", double23 == 1100.0d);
    org.junit.Assert.assertNotNull(doubleArray29);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str32,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray36);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 100.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-9999.9999d) + "'", double41 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray42);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0, 100.0, 10.0]");
  }

  @Test
  public void test1382() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1382");
    double[] doubleArray0 = null;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray0);
    java.lang.String str3 = quarterlyDouble1.fmtGrowth4Q("\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
    org.junit.Assert.assertEquals(
        "'" + str3 + "' != '" + "\t\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str3,
        "\t\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
  }

  @Test
  public void test1383() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1383");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) -1, (int) ' ');
  }

  @Test
  public void test1384() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1384");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (byte) 10, (int) (byte) -1);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1385() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1385");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getPrevTtm();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.get2QTtm();
    double double11 = quarterlyDouble6.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
  }

  @Test
  public void test1386() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1386");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray10 = new double[] { 0.0d, 0 };
    quarterlyDouble7.dArr = doubleArray10;
    double double12 = quarterlyDouble7.getPrevTtm();
    double double13 = quarterlyDouble7.getMostRecent();
    double[] doubleArray14 = quarterlyDouble7.dArr;
    double[] doubleArray20 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray20);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray20);
    java.lang.String str23 = quarterlyDouble22.toString();
    double double26 = quarterlyDouble22.deltaQ((int) (short) 10, (int) ' ');
    double double27 = quarterlyDouble22.getPrevTtm();
    double[] doubleArray33 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray33);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble35 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray33);
    java.lang.String str36 = quarterlyDouble35.toString();
    double double38 = quarterlyDouble35.get((int) (byte) -1);
    java.lang.String str39 = quarterlyDouble35.toString();
    double double42 = quarterlyDouble35.deltaQ(1, 0);
    double[] doubleArray43 = quarterlyDouble35.dArr;
    quarterlyDouble22.dArr = doubleArray43;
    quarterlyDouble7.dArr = doubleArray43;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray20);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str23,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray33);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str36,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-9999.9999d) + "'", double38 == (-9999.9999d));
    org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str39,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray43);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test1387() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1387");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getTtmAvg();
    double double9 = quarterlyDouble7.getTtmAvg();
    double[] doubleArray10 = quarterlyDouble7.dArr;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
  }

  @Test
  public void test1388() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1388");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    java.lang.String str9 = quarterlyDouble6.toString();
    double double10 = quarterlyDouble6.getPrevTtm();
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
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str9,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
  }

  @Test
  public void test1389() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1389");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) 100, 0);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1390() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1390");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.getQseqQ();
    double double12 = quarterlyDouble6.getPrevTtm();
    double double13 = quarterlyDouble6.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1100.0d + "'", double11 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
  }

  @Test
  public void test1391() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1391");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.getQseqQ();
    double double12 = quarterlyDouble6.getPrevTtm();
    double double13 = quarterlyDouble6.get2QTtm();
    double double14 = quarterlyDouble6.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1100.0d + "'", double11 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
  }

  @Test
  public void test1392() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1392");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.String str8 = quarterlyDouble7.toString();
    double[] doubleArray12 = new double[] { 1L, 100, (short) 10 };
    quarterlyDouble7.dArr = doubleArray12;
    double double14 = quarterlyDouble7.getMostRecent();
    double double15 = quarterlyDouble7.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str8,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 100.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
  }

  @Test
  public void test1393() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1393");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.getMostRecent();
    double double12 = quarterlyDouble6.get2QTtm();
    double double13 = quarterlyDouble6.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1100.0d + "'", double13 == 1100.0d);
  }

  @Test
  public void test1394() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1394");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getPrevTtm();
    double double11 = quarterlyDouble6.getPrevTtm();
    double double14 = quarterlyDouble6.deltaQ((int) ' ', (int) (short) -1);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
  }

  @Test
  public void test1395() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1395");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.get2QTtm();
    double double13 = quarterlyDouble6.deltaQ((int) '#', (int) ' ');
    double double14 = quarterlyDouble6.getTtmAvg();
    double double16 = quarterlyDouble6.get(1);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
  }

  @Test
  public void test1396() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1396");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtm();
    double double10 = quarterlyDouble6.get((int) (short) 1);
    double double11 = quarterlyDouble6.getPrevTtm();
    double double12 = quarterlyDouble6.getQseqQ();
    double double13 = quarterlyDouble6.getTtm();
    double double14 = quarterlyDouble6.getMostRecent();
    double[] doubleArray15 = quarterlyDouble6.dArr;
    java.lang.String str16 = quarterlyDouble6.toString();
    java.lang.String str17 = quarterlyDouble6.toString();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1100.0d + "'", double12 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str16,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str17,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test1397() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1397");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 1,
        (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1398() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1398");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000" + "'", str2,
        "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000" + "'", str3,
        "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
    org.junit.Assert.assertNotNull(fieldDataList4);
  }

  @Test
  public void test1400() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1400");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 10, 100);
    java.lang.Class<?> wildcardClass4 = strList3.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test1401() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1401");
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
    double[] doubleArray21 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray21);
    double double23 = quarterlyDouble22.getMostRecent();
    double double24 = quarterlyDouble22.getTtm();
    double double26 = quarterlyDouble22.get((int) (short) 1);
    double double27 = quarterlyDouble22.getPrevTtm();
    double double28 = quarterlyDouble22.getQseqQ();
    double double29 = quarterlyDouble22.getTtm();
    double double30 = quarterlyDouble22.getMostRecent();
    double[] doubleArray31 = quarterlyDouble22.dArr;
    quarterlyDouble6.dArr = doubleArray31;
    java.lang.String str33 = quarterlyDouble6.toString();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1100.0d + "'", double9 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1100.0d + "'", double11 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + 40.0d + "'", double24 == 40.0d);
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1100.0d + "'", double28 == 1100.0d);
    org.junit.Assert.assertTrue("'" + double29 + "' != '" + 40.0d + "'", double29 == 40.0d);
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray31);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str33,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test1402() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1402");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray10 = new double[] { 0.0d, 0 };
    quarterlyDouble7.dArr = doubleArray10;
    java.lang.String str12 = quarterlyDouble7.toString();
    java.lang.Class<?> wildcardClass13 = quarterlyDouble7.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0]");
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t i=0 0.0000\t i=1 0.0000" + "'", str12, "\t i=0 0.0000\t i=1 0.0000");
    org.junit.Assert.assertNotNull(wildcardClass13);
  }

  @Test
  public void test1403() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1403");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray9 = quarterlyDouble8.dArr;
    double double11 = quarterlyDouble8.get((-1));
    java.lang.String str12 = quarterlyDouble8.toString();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
    org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str12,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test1404() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1404");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) ' ', 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test1405() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1405");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtm();
    double double8 = quarterlyDouble6.getTtm();
    java.lang.String str9 = quarterlyDouble6.toString();
    double double12 = quarterlyDouble6.deltaQ(0, (int) (byte) 0);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 40.0d + "'", double7 == 40.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 40.0d + "'", double8 == 40.0d);
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str9,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
  }

  @Test
  public void test1406() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1406");
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
    double double14 = quarterlyDouble8.getPrevTtm();
    double double15 = quarterlyDouble8.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str13,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 40.0d + "'", double15 == 40.0d);
  }

  @Test
  public void test1407() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1407");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.getPrevTtm();
    double double11 = quarterlyDouble6.getPrevTtm();
    double double12 = quarterlyDouble6.get2QTtm();
    double double13 = quarterlyDouble6.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      double double16 = quarterlyDouble6.deltaQ(1, 10);
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
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
  }

  @Test
  public void test1408() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1408");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double9 = quarterlyDouble6.getPrevTtm();
    double double10 = quarterlyDouble6.get2QTtm();
    double double13 = quarterlyDouble6.deltaQ((int) (short) -1, (int) (short) 1);
    double double15 = quarterlyDouble6.get(0);
    java.lang.String str16 = quarterlyDouble6.toString();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000" + "'", str16,
        "\t i=0 -1.0000\t i=1 10.0000\t i=2 -1.0000\t i=3 32.0000\t i=4 -1.0000");
  }

  @Test
  public void test1409() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1409");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) 'a',
        (int) (short) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1410() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1410");
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
    double double16 = quarterlyDouble6.getTtm();
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
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 40.0d + "'", double16 == 40.0d);
  }

  @Test
  public void test1411() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1411");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.lang.String str4 = companyData1.getTicker();
    java.lang.String str5 = companyData1.getTicker();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000" + "'", str4,
        "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000" + "'", str5,
        "\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000");
  }

  @Test
  public void test1412() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1412");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 1,
        (int) (short) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1413() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1413");
    double[] doubleArray5 = new double[] { (short) -1, 10.0d, (byte) -1, ' ', (-1.0d) };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtmAvg();
    double double8 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.deltaQ((int) (short) 100, (int) '#');
    double double13 = quarterlyDouble6.get(0);
    double double16 = quarterlyDouble6.deltaQ((int) '#', (int) (short) -1);
    double double17 = quarterlyDouble6.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, -1.0, 32.0, -1.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
  }

  @Test
  public void test1414() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1414");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.lang.String str5 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData9 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList6, (int) (byte) -1, (int) '#');
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList6);
    org.junit.Assert.assertNull(fieldData9);
  }

  @Test
  public void test1415() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1415");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t\t i=0 1.0000\t i=1 100.0000\t i=2 10.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) '#', (int) ' ');
    org.junit.Assert.assertNull(fieldData3);
  }
}
