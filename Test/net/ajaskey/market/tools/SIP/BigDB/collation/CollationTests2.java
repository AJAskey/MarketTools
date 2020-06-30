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
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) '4',
          (int) (byte) 1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test1002() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1002");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        0, 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1003() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1003");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 100, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (byte) 10, 0);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test1004() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1004");
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
    double double29 = quarterlyDouble7.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str31 = quarterlyDouble7
          .fmtGrowth1Q("\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
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
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0d) + "'", double28 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-200.0d) + "'", double29 == (-200.0d));
  }

  @Test
  public void test1005() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1005");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) -1,
        (int) (byte) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1006() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1006");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) ' ', (int) (byte) 10);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test1007() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1007");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 1, 1);
  }

  @Test
  public void test1008() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1008");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double8 = quarterlyDouble7.getQoQ();
    double double9 = quarterlyDouble7.getQoQ();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-90.0d) + "'", double8 == (-90.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-90.0d) + "'", double9 == (-90.0d));
  }

  @Test
  public void test1009() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1009");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double double10 = quarterlyDouble6.deltaQ(10, (int) (short) 1);
    double[] doubleArray17 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    double[] doubleArray25 = new double[] { '4', (-1), 100.0d, 3.0d, (byte) 1, 100.0f };
    quarterlyDouble18.dArr = doubleArray25;
    double[] doubleArray27 = quarterlyDouble18.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray27);
    quarterlyDouble6.dArr = doubleArray27;
    java.lang.String str31 = quarterlyDouble6.fmtGrowth1Q("");
    double double32 = quarterlyDouble6.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray27);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)" + "'", str31,
        "\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)");
    org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-101.0d) + "'", double32 == (-101.0d));
  }

  @Test
  public void test1010() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1010");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 0,
        (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1011() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1011");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double8 = quarterlyDouble7.getTtmAvg();
    double double9 = quarterlyDouble7.getQoQ();
    double[] doubleArray15 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    double[] doubleArray17 = quarterlyDouble16.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    double double20 = quarterlyDouble19.getMostRecent();
    double double23 = quarterlyDouble19.deltaQ((-1), (int) (short) -1);
    double[] doubleArray29 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray29);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray29);
    double double32 = quarterlyDouble31.getMostRecent();
    double double33 = quarterlyDouble31.getTtmAvg();
    double double34 = quarterlyDouble31.getQseqQ();
    double double35 = quarterlyDouble31.getTtmAvg();
    double double36 = quarterlyDouble31.getQseqQ();
    double[] doubleArray42 = new double[] { 0L, 10.0f, 97.0d, 1.0d, 1.0f };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble43 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray42);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble44 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray42);
    quarterlyDouble31.dArr = doubleArray42;
    quarterlyDouble19.dArr = doubleArray42;
    quarterlyDouble7.dArr = doubleArray42;
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.0d + "'", double8 == 3.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-90.0d) + "'", double9 == (-90.0d));
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray29);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double33 + "' != '" + 2.75d + "'", double33 == 2.75d);
    org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-200.0d) + "'", double34 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + 2.75d + "'", double35 == 2.75d);
    org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-200.0d) + "'", double36 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray42);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 10.0, 97.0, 1.0, 1.0]");
  }

  @Test
  public void test1012() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1012");
    java.util.List<java.lang.String> strList0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
          .getCompanies(strList0, (int) (byte) -1, (int) (short) 1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test1013() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1013");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        (int) '#', (int) (byte) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1014() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1014");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    java.lang.String str13 = quarterlyDouble8.fmtGrowth4Q("");
    double double14 = quarterlyDouble8.getTtm();
    double double15 = quarterlyDouble8.getQseqQ();
    double double16 = quarterlyDouble8.getQoQ();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str13,
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 12.0d + "'", double14 == 12.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 900.0d + "'", double15 == 900.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-90.0d) + "'", double16 == (-90.0d));
  }

  @Test
  public void test1015() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1015");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)", (int) (short) 100,
        0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1016() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1016");
    java.lang.String[] strArray20 = new java.lang.String[] {
        "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        "", "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        "\t\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)",
        "hi!", "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)", "hi!",
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        "\t\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        "\t\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)",
        "\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        "\t\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)",
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        "\t\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        "\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" };
    java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
    boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList23 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList((java.util.List<java.lang.String>) strList21);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList24 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList((java.util.List<java.lang.String>) strList21);
    org.junit.Assert.assertNotNull(strArray20);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertNotNull(manyCompanyDataList23);
    org.junit.Assert.assertNotNull(manyCompanyDataList24);
  }

  @Test
  public void test1017() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1017");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) -1,
        (int) (short) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1018() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1018");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) '#', (int) 'a');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    java.lang.Class<?> wildcardClass5 = companyDataList4.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test1019() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1019");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    java.lang.String str9 = quarterlyDouble7.fmtGrowth1Q("");
    double double10 = quarterlyDouble7.getQseqQ();
    double double13 = quarterlyDouble7.deltaQ((int) 'a', 100);
    double double14 = quarterlyDouble7.getTtm();
    double double17 = quarterlyDouble7.deltaQ((int) (byte) 10, 0);
    double double18 = quarterlyDouble7.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str9,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 900.0d + "'", double10 == 900.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 12.0d + "'", double14 == 12.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
  }

  @Test
  public void test1020() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1020");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 100,
        (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1021() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1021");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    java.lang.String str13 = quarterlyDouble8.fmtGrowth4Q("");
    double double14 = quarterlyDouble8.getTtm();
    double double16 = quarterlyDouble8.get(10);
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str13,
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 12.0d + "'", double14 == 12.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9999.9999d) + "'", double16 == (-9999.9999d));
  }

  @Test
  public void test1022() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1022");
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
    double double16 = quarterlyDouble7.deltaQ((int) (byte) 100, 1);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.75d + "'", double8 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.75d + "'", double12 == 2.75d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
  }

  @Test
  public void test1023() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1023");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    java.lang.String str2 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData6 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList3, (int) '4', (int) (byte) 10);
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
        + "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str2,
        "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNull(fieldData6);
  }

  @Test
  public void test1024() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1024");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double double8 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.get((int) (short) 10);
    double double11 = quarterlyDouble6.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-200.0d) + "'", double8 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 11.0d + "'", double11 == 11.0d);
  }

  @Test
  public void test1025() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1025");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.lang.String str2 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.lang.String str4 = companyData1.getTicker();
    java.lang.String str5 = companyData1.getTicker();
    java.lang.String str6 = companyData1.getTicker();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
  }

  @Test
  public void test1026() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1026");
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
    double[] doubleArray22 = quarterlyDouble6.dArr;
    double double25 = quarterlyDouble6.deltaQ((int) (short) -1, (int) (byte) -1);
    double double26 = quarterlyDouble6.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 12.0d + "'", double20 == 12.0d);
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray22);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
  }

  @Test
  public void test1027() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1027");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 100, (int) (short) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1028() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1028");
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
    double double21 = quarterlyDouble19.get((int) ' ');
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str23 = quarterlyDouble19.fmtGrowth4Q(
          "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
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
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-9999.9999d) + "'", double21 == (-9999.9999d));
  }

  @Test
  public void test1029() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1029");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double[] doubleArray14 = new double[] { '4', (-1), 100.0d, 3.0d, (byte) 1, 100.0f };
    quarterlyDouble7.dArr = doubleArray14;
    double[] doubleArray16 = quarterlyDouble7.dArr;
    double double17 = quarterlyDouble7.getQoQ();
    double double18 = quarterlyDouble7.getTtm();
    java.lang.String str20 = quarterlyDouble7
        .fmtGrowth1Q("\t\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-101.0d) + "'", double17 == (-101.0d));
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 103.0d + "'", double18 == 103.0d);
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
        + "\t\t\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         -1.00 M (Seq= -101.00% : QoQ= -101.00%)"
        + "'", str20,
        "\t\t\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         -1.00 M (Seq= -101.00% : QoQ= -101.00%)");
  }

  @Test
  public void test1030() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1030");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList2, (int) (short) 10, (int) (byte) 100);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList2, 1, (int) (byte) 100);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList2, 0, 0);
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNull(fieldData5);
    org.junit.Assert.assertNull(fieldData8);
    org.junit.Assert.assertNull(fieldData11);
  }

  @Test
  public void test1031() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1031");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(1, (int) ' ');
  }

  @Test
  public void test1032() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1032");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double10 = quarterlyDouble7.deltaQ((-1), 1);
    double[] doubleArray11 = quarterlyDouble7.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    double[] doubleArray18 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    double[] doubleArray20 = quarterlyDouble19.dArr;
    double double22 = quarterlyDouble19.get(0);
    double[] doubleArray29 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray29);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray29);
    quarterlyDouble19.dArr = doubleArray29;
    double double33 = quarterlyDouble19.getTtm();
    double double34 = quarterlyDouble19.getMostRecent();
    double[] doubleArray35 = quarterlyDouble19.dArr;
    quarterlyDouble12.dArr = doubleArray35;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray20);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 97.0d + "'", double22 == 97.0d);
    org.junit.Assert.assertNotNull(doubleArray29);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double33 + "' != '" + 12.0d + "'", double33 == 12.0d);
    org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray35);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
  }

  @Test
  public void test1033() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1033");
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
    double double25 = quarterlyDouble24.getQseqQ();
    double double26 = quarterlyDouble24.getQseqQ();
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
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-200.0d) + "'", double25 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-200.0d) + "'", double26 == (-200.0d));
  }

  @Test
  public void test1034() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1034");
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
    double double23 = quarterlyDouble7.get((int) '4');
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-9999.9999d) + "'", double23 == (-9999.9999d));
  }

  @Test
  public void test1035() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1035");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str25 = quarterlyDouble7.fmtGrowth4Q("\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
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
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2.75d + "'", double23 == 2.75d);
  }

  @Test
  public void test1036() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1036");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 0,
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
  public void test1037() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1037");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) 10,
        (int) (byte) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1038() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1038");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)", 0, (int) (short) 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1039() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1039");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(100, (int) (short) 0);
  }

  @Test
  public void test1040() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1040");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData6 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList3, 0, (int) (short) 1);
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNull(fieldData6);
  }

  @Test
  public void test1041() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1041");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList2, (int) (short) 10, (int) (byte) 100);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList2, (int) (byte) 1, (int) (byte) -1);
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNull(fieldData5);
    org.junit.Assert.assertNull(fieldData8);
  }

  @Test
  public void test1042() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1042");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) 1, (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList2);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(manyCompanyDataList3);
  }

  @Test
  public void test1043() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1043");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    java.lang.String str13 = quarterlyDouble8.fmtGrowth4Q("");
    double double14 = quarterlyDouble8.getTtm();
    double[] doubleArray15 = quarterlyDouble8.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    double[] doubleArray17 = quarterlyDouble16.dArr;
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str13,
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 12.0d + "'", double14 == 12.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
  }

  @Test
  public void test1044() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1044");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (byte) 0, (int) (byte) -1);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1045() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1045");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double[] doubleArray9 = quarterlyDouble7.dArr;
    double double11 = quarterlyDouble7.get((int) '#');
    double[] doubleArray12 = quarterlyDouble7.dArr;
    double[] doubleArray13 = quarterlyDouble7.dArr;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test1046() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1046");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    double double12 = quarterlyDouble8.getMostRecent();
    double double14 = quarterlyDouble8.get((int) (byte) 10);
    double double15 = quarterlyDouble8.getQseqQ();
    java.lang.String str17 = quarterlyDouble8
        .fmtGrowth1Q("\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 900.0d + "'", double15 == 900.0d);
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
        + "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str17,
        "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test1047() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1047");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) -1,
        (int) '#');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1048() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1048");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) -1,
        (int) (byte) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1049() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1049");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) -1, (int) (short) 0);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1050() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1050");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) 'a', 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1051() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1051");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (byte) 100,
          (int) (short) 100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test1052() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1052");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 100, (int) (short) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1053() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1053");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) -1, 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1054() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1054");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    java.lang.String str13 = quarterlyDouble8.fmtGrowth4Q("");
    double double14 = quarterlyDouble8.getTtm();
    double[] doubleArray15 = quarterlyDouble8.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    java.lang.String str18 = quarterlyDouble16.fmtGrowth1Q(
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    double[] doubleArray19 = quarterlyDouble16.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    java.lang.String str22 = quarterlyDouble20.fmtGrowth4Q("\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)");
    double double23 = quarterlyDouble20.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str13,
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 12.0d + "'", double14 == 12.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
        + "\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str18,
        "\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '"
            + "\t\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'",
        str22, "\t\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 900.0d + "'", double23 == 900.0d);
  }

  @Test
  public void test1055() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1055");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 1, (int) (short) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1056() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1056");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double double10 = quarterlyDouble6.deltaQ(10, (int) (short) 1);
    double double11 = quarterlyDouble6.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
  }

  @Test
  public void test1057() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1057");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (byte) 0, 1);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1058() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1058");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray8 = quarterlyDouble7.dArr;
    double double9 = quarterlyDouble7.getQseqQ();
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getQseqQ();
    double double13 = quarterlyDouble7.get(0);
    double double14 = quarterlyDouble7.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-200.0d) + "'", double9 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-200.0d) + "'", double11 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-200.0d) + "'", double14 == (-200.0d));
  }

  @Test
  public void test1059() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1059");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double[] doubleArray9 = quarterlyDouble7.dArr;
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtm();
    double[] doubleArray12 = quarterlyDouble7.dArr;
    double double13 = quarterlyDouble7.getTtmAvg();
    double double14 = quarterlyDouble7.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 11.0d + "'", double11 == 11.0d);
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 2.75d + "'", double13 == 2.75d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
  }

  @Test
  public void test1060() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1060");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    double[] doubleArray12 = quarterlyDouble8.dArr;
    double double13 = quarterlyDouble8.getQseqQ();
    double double14 = quarterlyDouble8.getTtmAvg();
    double[] doubleArray15 = quarterlyDouble8.dArr;
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 900.0d + "'", double13 == 900.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
  }

  @Test
  public void test1061() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1061");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNotNull(fieldDataList4);
  }

  @Test
  public void test1062() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1062");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) 100,
        (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test1063() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1063");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) '4', 10);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test1064() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1064");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) -1,
        (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
    org.junit.Assert.assertNotNull(manyCompanyDataList5);
  }

  @Test
  public void test1065() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1065");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 1, (int) 'a');
  }

  @Test
  public void test1066() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1066");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((-1), (int) 'a');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1067() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1067");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) ' ', 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1068() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1068");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t                  :        103.00 M (Seq= -101.00% : QoQ= -101.00%)", (int) (short) -1, 100);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1069() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1069");
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
    double double24 = quarterlyDouble7.deltaQ(100, (int) (byte) 0);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str26 = quarterlyDouble7.fmtGrowth4Q("\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
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
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
  }

  @Test
  public void test1070() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1070");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray8 = quarterlyDouble7.dArr;
    double double9 = quarterlyDouble7.getQseqQ();
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getQseqQ();
    double double12 = quarterlyDouble7.getTtm();
    double double13 = quarterlyDouble7.getTtmAvg();
    double double16 = quarterlyDouble7.deltaQ(1, (int) (byte) 0);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-200.0d) + "'", double9 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-200.0d) + "'", double11 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 11.0d + "'", double12 == 11.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 2.75d + "'", double13 == 2.75d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
  }

  @Test
  public void test1071() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1071");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) '4', 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1072() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1072");
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
    double[] doubleArray19 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    double double22 = quarterlyDouble21.getMostRecent();
    double double23 = quarterlyDouble21.getTtmAvg();
    double double24 = quarterlyDouble21.getQseqQ();
    double double25 = quarterlyDouble21.getTtmAvg();
    double double26 = quarterlyDouble21.getQseqQ();
    double[] doubleArray32 = new double[] { 0L, 10.0f, 97.0d, 1.0d, 1.0f };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray32);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray32);
    quarterlyDouble21.dArr = doubleArray32;
    quarterlyDouble9.dArr = doubleArray32;
    double double37 = quarterlyDouble9.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2.75d + "'", double23 == 2.75d);
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-200.0d) + "'", double24 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2.75d + "'", double25 == 2.75d);
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-200.0d) + "'", double26 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray32);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 10.0, 97.0, 1.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-89.69072164948454d) + "'", double37 == (-89.69072164948454d));
  }

  @Test
  public void test1073() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1073");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    java.lang.String str13 = quarterlyDouble8.fmtGrowth4Q("");
    double double14 = quarterlyDouble8.getTtm();
    double[] doubleArray15 = quarterlyDouble8.dArr;
    double[] doubleArray21 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray21);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray21);
    quarterlyDouble8.dArr = doubleArray21;
    double double25 = quarterlyDouble8.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str13,
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 12.0d + "'", double14 == 12.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + 35.0d + "'", double25 == 35.0d);
  }

  @Test
  public void test1074() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1074");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 100,
        (int) ' ');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, 0, (int) (byte) 100);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test1075() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1075");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        10, (int) (short) 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1076() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1076");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         -1.00 M (Seq= -101.00% : QoQ= -101.00%)",
        (int) 'a', (int) ' ');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1077() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1077");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double10 = quarterlyDouble7.deltaQ((int) (byte) 1, (int) (byte) 0);
    java.lang.String str12 = quarterlyDouble7
        .fmtGrowth1Q("\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    double double13 = quarterlyDouble7.getQseqQ();
    java.lang.String str15 = quarterlyDouble7.fmtGrowth4Q(
        "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    java.lang.String str17 = quarterlyDouble7.fmtGrowth4Q(
        "\t\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
        + "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str12,
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 900.0d + "'", double13 == 900.0d);
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
        + "\t\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str15,
        "\t\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
        + "\t\t\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str17,
        "\t\t\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test1078() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1078");
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
    double double28 = quarterlyDouble7.getMostRecent();
    double double30 = quarterlyDouble7.get(0);
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
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + 35.0d + "'", double28 == 35.0d);
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + 97.0d + "'", double30 == 97.0d);
  }

  @Test
  public void test1079() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1079");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 10,
        (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) 'a', (int) (short) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList9 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, 100, (int) 'a');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList12 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (short) 0, 100);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(companyDataList9);
    org.junit.Assert.assertNotNull(companyDataList12);
  }

  @Test
  public void test1080() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1080");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(100, (int) (short) -1);
  }

  @Test
  public void test1081() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1081");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 0,
        (int) (byte) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1082() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1082");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 10,
        (int) '#');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1083() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1083");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList2, (int) (short) 100, (int) (short) 100);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList2, (int) (short) 1, (int) '#');
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNull(fieldData5);
    org.junit.Assert.assertNull(fieldData8);
  }

  @Test
  public void test1084() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1084");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    java.lang.String str9 = quarterlyDouble7.fmtGrowth1Q("");
    double double10 = quarterlyDouble7.getQseqQ();
    double double13 = quarterlyDouble7.deltaQ((int) 'a', 100);
    double double14 = quarterlyDouble7.getTtm();
    double double15 = quarterlyDouble7.getMostRecent();
    double double16 = quarterlyDouble7.getMostRecent();
    double double17 = quarterlyDouble7.getTtm();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str9,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 900.0d + "'", double10 == 900.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 12.0d + "'", double14 == 12.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 12.0d + "'", double17 == 12.0d);
  }

  @Test
  public void test1085() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1085");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 10, (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (byte) 100, 100);
    java.lang.Class<?> wildcardClass7 = strList3.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test1086() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1086");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) '#',
        (int) (byte) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1087() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1087");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    java.lang.String str9 = quarterlyDouble7.fmtGrowth1Q("");
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double double12 = quarterlyDouble7.getMostRecent();
    double double13 = quarterlyDouble7.getMostRecent();
    double double14 = quarterlyDouble7.getQoQ();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str9,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 900.0d + "'", double10 == 900.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.0d + "'", double11 == 3.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-90.0d) + "'", double14 == (-90.0d));
  }

  @Test
  public void test1088() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1088");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double[] doubleArray14 = new double[] { '4', (-1), 100.0d, 3.0d, (byte) 1, 100.0f };
    quarterlyDouble7.dArr = doubleArray14;
    double[] doubleArray16 = quarterlyDouble7.dArr;
    double double17 = quarterlyDouble7.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
  }

  @Test
  public void test1089() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1089");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray7);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray7);
    double double10 = quarterlyDouble9.getMostRecent();
    double double12 = quarterlyDouble9.get(0);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
  }

  @Test
  public void test1090() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1090");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) (short) -1, (-1));
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1091() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1091");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 0, (int) (byte) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1092() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1092");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double[] doubleArray8 = quarterlyDouble6.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray8);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test1093() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1093");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 0, (int) (short) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1094() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1094");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(1, (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, (int) (short) 10, 0);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList5);
  }

  @Test
  public void test1095() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1095");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 0, (int) (byte) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) ' ', (int) (byte) 0);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
    org.junit.Assert.assertNotNull(companyDataList7);
  }

  @Test
  public void test1096() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1096");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.lang.String str4 = companyData1.getTicker();
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
        + "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str2,
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str3 + "' != '"
        + "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str3,
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str4 + "' != '"
        + "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str4,
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test1097() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1097");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double8 = quarterlyDouble7.getTtm();
    java.lang.String str10 = quarterlyDouble7.fmtGrowth4Q("");
    double double11 = quarterlyDouble7.getTtmAvg();
    double double12 = quarterlyDouble7.getTtmAvg();
    double double13 = quarterlyDouble7.getQoQ();
    double double14 = quarterlyDouble7.getQseqQ();
    java.lang.String str16 = quarterlyDouble7.fmtGrowth1Q(
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 12.0d + "'", double8 == 12.0d);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str10,
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.0d + "'", double11 == 3.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.0d + "'", double12 == 3.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-90.0d) + "'", double13 == (-90.0d));
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 900.0d + "'", double14 == 900.0d);
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
        + "\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str16,
        "\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test1098() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1098");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) -1, (int) 'a');
  }

  @Test
  public void test1099() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1099");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.lang.String str3 = companyData1.getTicker();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertEquals(
        "'" + str3 + "' != '"
            + "\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'",
        str3, "\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test1100() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1100");
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
    double double14 = quarterlyDouble8.get((int) ' ');
    // The following exception was thrown during execution in test generation
    try {
      double double17 = quarterlyDouble8.deltaQ((int) (short) -1, (int) '4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-200.0d) + "'", double11 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
  }

  @Test
  public void test1101() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1101");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 100, (int) (short) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1102() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1102");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 10,
        (int) ' ');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1103() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1103");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    double[] doubleArray17 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    double[] doubleArray19 = quarterlyDouble18.dArr;
    double double22 = quarterlyDouble18.deltaQ(10, (int) (short) 1);
    double double24 = quarterlyDouble18.get((int) (byte) 10);
    double[] doubleArray25 = quarterlyDouble18.dArr;
    quarterlyDouble8.dArr = doubleArray25;
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-9999.9999d) + "'", double24 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test1104() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1104");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double10 = quarterlyDouble7.deltaQ((-1), 1);
    double double11 = quarterlyDouble7.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
  }

  @Test
  public void test1105() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1105");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) 0,
        (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
  }

  @Test
  public void test1106() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1106");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getMostRecent();
    double double10 = quarterlyDouble8.getTtmAvg();
    double double11 = quarterlyDouble8.getQoQ();
    java.lang.String str13 = quarterlyDouble8.fmtGrowth1Q("");
    double double14 = quarterlyDouble8.getMostRecent();
    double double17 = quarterlyDouble8.deltaQ((int) (byte) 10, (int) '#');
    double[] doubleArray24 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray24);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray24);
    double double27 = quarterlyDouble26.getTtm();
    java.lang.String str29 = quarterlyDouble26.fmtGrowth1Q("hi!");
    java.lang.String str31 = quarterlyDouble26.fmtGrowth4Q("");
    double double32 = quarterlyDouble26.getQoQ();
    double[] doubleArray38 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray38);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble40 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray38);
    double[] doubleArray41 = quarterlyDouble40.dArr;
    quarterlyDouble26.dArr = doubleArray41;
    quarterlyDouble8.dArr = doubleArray41;
    double double44 = quarterlyDouble8.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-90.0d) + "'", double11 == (-90.0d));
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str13,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray24);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 12.0d + "'", double27 == 12.0d);
    org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str29,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str31,
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-90.0d) + "'", double32 == (-90.0d));
    org.junit.Assert.assertNotNull(doubleArray38);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray41);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-200.0d) + "'", double44 == (-200.0d));
  }

  @Test
  public void test1107() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1107");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray15 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    double[] doubleArray17 = quarterlyDouble16.dArr;
    quarterlyDouble9.dArr = doubleArray17;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    double double20 = quarterlyDouble19.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.75d + "'", double20 == 2.75d);
  }

  @Test
  public void test1108() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1108");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(1, 10);
  }

  @Test
  public void test1109() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1109");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 10,
        (int) (short) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1110() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1110");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 10,
        (int) (short) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1111() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1111");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    java.lang.String str13 = quarterlyDouble8.fmtGrowth4Q("");
    double double16 = quarterlyDouble8.deltaQ((-1), (int) (byte) 1);
    java.lang.String str18 = quarterlyDouble8.fmtGrowth4Q(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str13,
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
        + "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str18,
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test1112() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1112");
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
    double double32 = quarterlyDouble31.getQseqQ();
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
    org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-200.0d) + "'", double32 == (-200.0d));
  }

  @Test
  public void test1113() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1113");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) 0, (int) '#');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1114() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1114");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 100,
        (int) (short) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1115() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1115");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 100,
        (int) (byte) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1116() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1116");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double double10 = quarterlyDouble6.deltaQ(10, (int) (short) 1);
    double double11 = quarterlyDouble6.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      double double12 = quarterlyDouble6.getQoQ();
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
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
  }

  @Test
  public void test1117() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1117");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    double double10 = quarterlyDouble8.getQseqQ();
    double[] doubleArray16 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray16);
    double double18 = quarterlyDouble17.getMostRecent();
    double double21 = quarterlyDouble17.deltaQ((int) (short) 10, 0);
    double double22 = quarterlyDouble17.getQseqQ();
    double[] doubleArray23 = quarterlyDouble17.dArr;
    quarterlyDouble8.dArr = doubleArray23;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray23);
    double double26 = quarterlyDouble25.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 900.0d + "'", double10 == 900.0d);
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-200.0d) + "'", double22 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-200.0d) + "'", double26 == (-200.0d));
  }

  @Test
  public void test1118() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1118");
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
      double double14 = quarterlyDouble7.deltaQ(0, (int) '#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
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
  public void test1119() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1119");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) '#', 0);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1120() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1120");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double[] doubleArray15 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    double[] doubleArray17 = quarterlyDouble16.dArr;
    double double20 = quarterlyDouble16.deltaQ(10, (int) (short) 1);
    double[] doubleArray27 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray27);
    double[] doubleArray35 = new double[] { '4', (-1), 100.0d, 3.0d, (byte) 1, 100.0f };
    quarterlyDouble28.dArr = doubleArray35;
    double[] doubleArray37 = quarterlyDouble28.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble38 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray37);
    quarterlyDouble16.dArr = doubleArray37;
    java.lang.String str41 = quarterlyDouble16
        .fmtGrowth4Q("\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    double double42 = quarterlyDouble16.getQoQ();
    double[] doubleArray48 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble49 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray48);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble50 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray48);
    double double51 = quarterlyDouble50.getMostRecent();
    double double52 = quarterlyDouble50.getTtmAvg();
    double double53 = quarterlyDouble50.getQseqQ();
    double double54 = quarterlyDouble50.getTtmAvg();
    double[] doubleArray60 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble61 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray60);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble62 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray60);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble63 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray60);
    quarterlyDouble50.dArr = doubleArray60;
    double[] doubleArray65 = quarterlyDouble50.dArr;
    double[] doubleArray71 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble72 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray71);
    double[] doubleArray73 = quarterlyDouble72.dArr;
    double[] doubleArray74 = quarterlyDouble72.dArr;
    quarterlyDouble50.dArr = doubleArray74;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble76 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray74);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble77 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray74);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble78 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray74);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble79 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray74);
    quarterlyDouble16.dArr = doubleArray74;
    quarterlyDouble9.dArr = doubleArray74;
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray27);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray35);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray37);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str41 + "' != '"
        + "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)"
        + "'", str41,
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
    org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-101.0d) + "'", double42 == (-101.0d));
    org.junit.Assert.assertNotNull(doubleArray48);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-1.0d) + "'", double51 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double52 + "' != '" + 2.75d + "'", double52 == 2.75d);
    org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-200.0d) + "'", double53 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double54 + "' != '" + 2.75d + "'", double54 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray60);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray65);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray71);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray73);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray74);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test1121() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1121");
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
    double double28 = quarterlyDouble7.deltaQ((int) (byte) 1, 1);
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
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
  }

  @Test
  public void test1122() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1122");
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
    double double29 = quarterlyDouble7.getQseqQ();
    double double30 = quarterlyDouble7.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str32 = quarterlyDouble7
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
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-200.0d) + "'", double22 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-9999.9999d) + "'", double25 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0d) + "'", double28 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-200.0d) + "'", double29 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + 2.75d + "'", double30 == 2.75d);
  }

  @Test
  public void test1123() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1123");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    java.lang.String str9 = quarterlyDouble7.fmtGrowth1Q("");
    double double10 = quarterlyDouble7.getQseqQ();
    double double13 = quarterlyDouble7.deltaQ((int) 'a', 100);
    double double14 = quarterlyDouble7.getMostRecent();
    double double16 = quarterlyDouble7.get((int) (short) 10);
    java.lang.Class<?> wildcardClass17 = quarterlyDouble7.getClass();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str9,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 900.0d + "'", double10 == 900.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9999.9999d) + "'", double16 == (-9999.9999d));
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test1124() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1124");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    java.lang.String str13 = quarterlyDouble8.fmtGrowth4Q("");
    double double14 = quarterlyDouble8.getTtm();
    java.lang.String str16 = quarterlyDouble8.fmtGrowth1Q(
        "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    double double18 = quarterlyDouble8.get((int) 'a');
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str13,
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 12.0d + "'", double14 == 12.0d);
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
        + "\t\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str16,
        "\t\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-9999.9999d) + "'", double18 == (-9999.9999d));
  }

  @Test
  public void test1125() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1125");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray7);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray7);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray7);
    double double11 = quarterlyDouble10.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 34.0d + "'", double11 == 34.0d);
  }

  @Test
  public void test1126() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1126");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)");
    java.lang.String str2 = companyData1.getTicker();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)" + "'", str2,
        "\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)");
  }

  @Test
  public void test1127() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1127");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) 0,
        (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
    org.junit.Assert.assertNotNull(manyCompanyDataList5);
  }

  @Test
  public void test1128() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1128");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    java.lang.String str9 = quarterlyDouble7.fmtGrowth1Q("");
    double double10 = quarterlyDouble7.getQseqQ();
    double double13 = quarterlyDouble7.deltaQ((int) 'a', 100);
    double double14 = quarterlyDouble7.getTtm();
    double double15 = quarterlyDouble7.getMostRecent();
    java.lang.String str17 = quarterlyDouble7.fmtGrowth1Q(
        "\t\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str9,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 900.0d + "'", double10 == 900.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 12.0d + "'", double14 == 12.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
        + "\t\t\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str17,
        "\t\t\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test1129() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1129");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) 100,
        (int) (short) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test1130() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1130");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    double double14 = quarterlyDouble8.deltaQ((int) (short) 10, (int) (short) 100);
    double double15 = quarterlyDouble8.getTtm();
    double double16 = quarterlyDouble8.getQseqQ();
    double[] doubleArray22 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray22);
    double[] doubleArray24 = quarterlyDouble23.dArr;
    double double26 = quarterlyDouble23.get(0);
    double double28 = quarterlyDouble23.get((int) (byte) 10);
    double[] doubleArray29 = quarterlyDouble23.dArr;
    double double30 = quarterlyDouble23.getMostRecent();
    double[] doubleArray31 = quarterlyDouble23.dArr;
    quarterlyDouble8.dArr = doubleArray31;
    double double35 = quarterlyDouble8.deltaQ((int) (byte) 100, (int) (short) 10);
    // The following exception was thrown during execution in test generation
    try {
      double double36 = quarterlyDouble8.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 12.0d + "'", double15 == 12.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 900.0d + "'", double16 == 900.0d);
    org.junit.Assert.assertNotNull(doubleArray22);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray24);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + 97.0d + "'", double26 == 97.0d);
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-9999.9999d) + "'", double28 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray29);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + 35.0d + "'", double30 == 35.0d);
    org.junit.Assert.assertNotNull(doubleArray31);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
  }

  @Test
  public void test1131() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1131");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    java.lang.String str13 = quarterlyDouble8.fmtGrowth4Q("");
    double double14 = quarterlyDouble8.getTtm();
    double[] doubleArray15 = quarterlyDouble8.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    java.lang.String str18 = quarterlyDouble16.fmtGrowth1Q(
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    double[] doubleArray24 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray24);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray24);
    double double27 = quarterlyDouble26.getMostRecent();
    double double28 = quarterlyDouble26.getTtmAvg();
    double double29 = quarterlyDouble26.getQseqQ();
    double double30 = quarterlyDouble26.getTtmAvg();
    double[] doubleArray36 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray36);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble38 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray36);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray36);
    quarterlyDouble26.dArr = doubleArray36;
    double[] doubleArray41 = quarterlyDouble26.dArr;
    double[] doubleArray47 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble48 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray47);
    double[] doubleArray49 = quarterlyDouble48.dArr;
    double[] doubleArray50 = quarterlyDouble48.dArr;
    quarterlyDouble26.dArr = doubleArray50;
    quarterlyDouble16.dArr = doubleArray50;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble53 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray50);
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str13,
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 12.0d + "'", double14 == 12.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
        + "\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str18,
        "\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray24);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + 2.75d + "'", double28 == 2.75d);
    org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-200.0d) + "'", double29 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + 2.75d + "'", double30 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray36);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray41);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray47);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray49);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray50);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test1132() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1132");
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
    double double27 = quarterlyDouble6.getTtm();
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
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 12.0d + "'", double27 == 12.0d);
  }

  @Test
  public void test1133() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1133");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNotNull(fieldDataList4);
  }

  @Test
  public void test1134() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1134");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double[] doubleArray9 = quarterlyDouble7.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str11 = quarterlyDouble7
          .fmtGrowth1Q("\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
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
  public void test1135() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1135");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    double double12 = quarterlyDouble8.getMostRecent();
    double double14 = quarterlyDouble8.get((int) (byte) 10);
    double double15 = quarterlyDouble8.getQseqQ();
    double double16 = quarterlyDouble8.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 900.0d + "'", double15 == 900.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
  }

  @Test
  public void test1136() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1136");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    double[] doubleArray12 = quarterlyDouble8.dArr;
    double[] doubleArray18 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    double double20 = quarterlyDouble19.getMostRecent();
    double double23 = quarterlyDouble19.deltaQ((int) (short) 10, 0);
    double double24 = quarterlyDouble19.getQseqQ();
    double[] doubleArray25 = quarterlyDouble19.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray25);
    quarterlyDouble8.dArr = doubleArray25;
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-200.0d) + "'", double24 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test1137() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1137");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    java.lang.String str13 = quarterlyDouble8.fmtGrowth4Q("");
    double double14 = quarterlyDouble8.getTtm();
    double[] doubleArray15 = quarterlyDouble8.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    java.lang.Class<?> wildcardClass17 = quarterlyDouble16.getClass();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str13,
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 12.0d + "'", double14 == 12.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertNotNull(wildcardClass17);
  }

  @Test
  public void test1138() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1138");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 10,
        (int) ' ');
    java.lang.Class<?> wildcardClass4 = strList3.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test1139() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1139");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 0, 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1140() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1140");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double[] doubleArray12 = quarterlyDouble7.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray12);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test1141() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1141");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((-1), (-1));
  }

  @Test
  public void test1142() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1142");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    java.lang.String str9 = quarterlyDouble7.fmtGrowth1Q("");
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double[] doubleArray12 = quarterlyDouble7.dArr;
    java.lang.String str14 = quarterlyDouble7.fmtGrowth1Q(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    double[] doubleArray15 = quarterlyDouble7.dArr;
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str9,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 900.0d + "'", double10 == 900.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.0d + "'", double11 == 3.0d);
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
        + "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str14,
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
  }

  @Test
  public void test1143() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1143");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double8 = quarterlyDouble7.getTtmAvg();
    double double9 = quarterlyDouble7.getQoQ();
    double double10 = quarterlyDouble7.getTtmAvg();
    java.lang.String str12 = quarterlyDouble7.fmtGrowth1Q(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    double[] doubleArray13 = quarterlyDouble7.dArr;
    java.lang.String str15 = quarterlyDouble7
        .fmtGrowth4Q("\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    double double17 = quarterlyDouble7.get((int) (byte) 0);
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.0d + "'", double8 == 3.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-90.0d) + "'", double9 == (-90.0d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
        + "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str12,
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str15 + "' != '"
        + "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str15,
        "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
  }

  @Test
  public void test1144() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1144");
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
    java.lang.Class<?> wildcardClass23 = quarterlyDouble7.getClass();
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
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test1145() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1145");
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
    double[] doubleArray13 = quarterlyDouble7.dArr;
    double double14 = quarterlyDouble7.getQseqQ();
    double double15 = quarterlyDouble7.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-200.0d) + "'", double12 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-200.0d) + "'", double14 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
  }

  @Test
  public void test1146() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1146");
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
    double double24 = quarterlyDouble6.getQseqQ();
    double[] doubleArray31 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray31);
    double[] doubleArray39 = new double[] { '4', (-1), 100.0d, 3.0d, (byte) 1, 100.0f };
    quarterlyDouble32.dArr = doubleArray39;
    double[] doubleArray41 = quarterlyDouble32.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble42 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray41);
    double[] doubleArray48 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble49 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray48);
    double[] doubleArray50 = quarterlyDouble49.dArr;
    double[] doubleArray51 = quarterlyDouble49.dArr;
    quarterlyDouble42.dArr = doubleArray51;
    quarterlyDouble6.dArr = doubleArray51;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 12.0d + "'", double20 == 12.0d);
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + 900.0d + "'", double24 == 900.0d);
    org.junit.Assert.assertNotNull(doubleArray31);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray39);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray41);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray48);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray50);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray51);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test1147() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1147");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double10 = quarterlyDouble7.get((int) (byte) 1);
    double double11 = quarterlyDouble7.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
  }

  @Test
  public void test1148() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1148");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(1, (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, (int) (short) 0, (int) (short) 100);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList5);
  }

  @Test
  public void test1149() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1149");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double8 = quarterlyDouble7.getTtmAvg();
    double double9 = quarterlyDouble7.getQoQ();
    double double10 = quarterlyDouble7.getMostRecent();
    double double12 = quarterlyDouble7.get((int) (byte) 0);
    // The following exception was thrown during execution in test generation
    try {
      double double15 = quarterlyDouble7.deltaQ((-1), (int) '4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.0d + "'", double8 == 3.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-90.0d) + "'", double9 == (-90.0d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
  }

  @Test
  public void test1150() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1150");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    java.lang.String str13 = quarterlyDouble8.fmtGrowth4Q("");
    double double14 = quarterlyDouble8.getTtm();
    double[] doubleArray15 = quarterlyDouble8.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    java.lang.String str18 = quarterlyDouble16.fmtGrowth1Q(
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    java.lang.String str20 = quarterlyDouble16
        .fmtGrowth4Q("\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    double double21 = quarterlyDouble16.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str13,
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 12.0d + "'", double14 == 12.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
        + "\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str18,
        "\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str20 + "' != '"
        + "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str20,
        "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 3.0d + "'", double21 == 3.0d);
  }

  @Test
  public void test1151() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1151");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList2, (int) (short) 10, (int) (byte) 100);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList2, 10, 0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList2, (int) (short) 1, (int) (byte) 10);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData14 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList2, (int) (short) 100, (int) (byte) 100);
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNull(fieldData5);
    org.junit.Assert.assertNull(fieldData8);
    org.junit.Assert.assertNull(fieldData11);
    org.junit.Assert.assertNull(fieldData14);
  }

  @Test
  public void test1152() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1152");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getQseqQ();
    double double9 = quarterlyDouble7.getTtm();
    double double10 = quarterlyDouble7.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-200.0d) + "'", double8 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 11.0d + "'", double9 == 11.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.75d + "'", double10 == 2.75d);
  }

  @Test
  public void test1153() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1153");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    java.lang.String str9 = quarterlyDouble7.fmtGrowth1Q("");
    double double10 = quarterlyDouble7.getQseqQ();
    double double13 = quarterlyDouble7.deltaQ((int) 'a', 100);
    double double14 = quarterlyDouble7.getMostRecent();
    double double16 = quarterlyDouble7.get((int) (short) 10);
    double double18 = quarterlyDouble7.get((-1));
    double double21 = quarterlyDouble7.deltaQ((int) ' ', (int) (byte) 0);
    double double22 = quarterlyDouble7.getQoQ();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str9,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 900.0d + "'", double10 == 900.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9999.9999d) + "'", double16 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-9999.9999d) + "'", double18 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-90.0d) + "'", double22 == (-90.0d));
  }

  @Test
  public void test1154() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1154");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double double9 = quarterlyDouble6.get(0);
    double double11 = quarterlyDouble6.get((int) (byte) 10);
    double[] doubleArray12 = quarterlyDouble6.dArr;
    double double13 = quarterlyDouble6.getMostRecent();
    double[] doubleArray14 = quarterlyDouble6.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[97.0, 35.0, -1.0, 0.0, 0.0]");
  }

  @Test
  public void test1155() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1155");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        (int) (byte) 1, (int) '4');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1156() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1156");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) -1, 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1157() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1157");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (-1), 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (short) -1, 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList9 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (short) 0, (int) (short) 0);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(companyDataList9);
  }

  @Test
  public void test1158() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1158");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    java.lang.String str9 = quarterlyDouble7.fmtGrowth1Q("");
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double[] doubleArray12 = quarterlyDouble7.dArr;
    java.lang.String str14 = quarterlyDouble7.fmtGrowth1Q(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    double double15 = quarterlyDouble7.getTtm();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str9,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 900.0d + "'", double10 == 900.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.0d + "'", double11 == 3.0d);
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
        + "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str14,
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 12.0d + "'", double15 == 12.0d);
  }

  @Test
  public void test1159() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1159");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 0,
        (int) (short) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1160() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1160");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 100, (int) (short) 0);
  }

  @Test
  public void test1161() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1161");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        (int) (byte) 10, (int) 'a');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1162() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1162");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        (int) (short) 0, (int) (byte) -1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1163() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1163");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) -1, (int) (byte) 10);
  }

  @Test
  public void test1164() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1164");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double[] doubleArray14 = new double[] { '4', (-1), 100.0d, 3.0d, (byte) 1, 100.0f };
    quarterlyDouble7.dArr = doubleArray14;
    double[] doubleArray16 = quarterlyDouble7.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray16);
    double[] doubleArray23 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray23);
    double[] doubleArray25 = quarterlyDouble24.dArr;
    double[] doubleArray26 = quarterlyDouble24.dArr;
    quarterlyDouble17.dArr = doubleArray26;
    double[] doubleArray34 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble35 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray34);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray34);
    double double37 = quarterlyDouble36.getTtm();
    java.lang.String str39 = quarterlyDouble36.fmtGrowth1Q("hi!");
    double double40 = quarterlyDouble36.getMostRecent();
    double double42 = quarterlyDouble36.get((int) (byte) 10);
    double[] doubleArray48 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble49 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray48);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble50 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray48);
    double double51 = quarterlyDouble50.getMostRecent();
    double double52 = quarterlyDouble50.getTtmAvg();
    double double53 = quarterlyDouble50.getQseqQ();
    double double54 = quarterlyDouble50.getTtmAvg();
    double double55 = quarterlyDouble50.getQseqQ();
    double[] doubleArray61 = new double[] { 0L, 10.0f, 97.0d, 1.0d, 1.0f };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble62 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray61);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble63 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray61);
    quarterlyDouble50.dArr = doubleArray61;
    quarterlyDouble36.dArr = doubleArray61;
    quarterlyDouble17.dArr = doubleArray61;
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray26);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray34);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double37 + "' != '" + 12.0d + "'", double37 == 12.0d);
    org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str39,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
    org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-9999.9999d) + "'", double42 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray48);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-1.0d) + "'", double51 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double52 + "' != '" + 2.75d + "'", double52 == 2.75d);
    org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-200.0d) + "'", double53 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double54 + "' != '" + 2.75d + "'", double54 == 2.75d);
    org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-200.0d) + "'", double55 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray61);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[0.0, 10.0, 97.0, 1.0, 1.0]");
  }

  @Test
  public void test1165() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1165");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    java.lang.String str9 = quarterlyDouble7.fmtGrowth1Q("");
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double[] doubleArray12 = quarterlyDouble7.dArr;
    java.lang.String str14 = quarterlyDouble7.fmtGrowth1Q(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    // The following exception was thrown during execution in test generation
    try {
      double double17 = quarterlyDouble7.deltaQ((int) (byte) 0, (int) '4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str9,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 900.0d + "'", double10 == 900.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.0d + "'", double11 == 3.0d);
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
        + "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str14,
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test1166() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1166");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(1, 10);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1167() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1167");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 10,
        (int) (short) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1168() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1168");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) 'a', (-1));
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1169() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1169");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(1, 0);
  }

  @Test
  public void test1170() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1170");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str10 = quarterlyDouble8.fmtGrowth1Q(
          "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test1171() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1171");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.lang.String str2 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData6 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList3, (int) (byte) 1, (int) (byte) 100);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData9 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList3, (int) (byte) 10, (int) (byte) 10);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData12 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList3, (int) (short) 1, (int) (short) 10);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNull(fieldData6);
    org.junit.Assert.assertNull(fieldData9);
    org.junit.Assert.assertNull(fieldData12);
  }

  @Test
  public void test1172() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1172");
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
    double double31 = quarterlyDouble29.get((int) '4');
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 11.0d + "'", double8 == 11.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 12.0d + "'", double18 == 12.0d);
    org.junit.Assert.assertNotNull(doubleArray24);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-9999.9999d) + "'", double31 == (-9999.9999d));
  }

  @Test
  public void test1173() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1173");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) '4', (int) (short) 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, (int) 'a', (int) (byte) 0);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList5);
  }

  @Test
  public void test1174() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1174");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 10,
        (int) (short) 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (short) 10, 1);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test1175() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1175");
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
    double double29 = quarterlyDouble7.deltaQ((int) (byte) -1, (int) (short) 1);
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
    org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
  }

  @Test
  public void test1176() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1176");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    java.lang.String str9 = quarterlyDouble7.fmtGrowth1Q("");
    double double10 = quarterlyDouble7.getQseqQ();
    double double13 = quarterlyDouble7.deltaQ((int) 'a', 100);
    double double14 = quarterlyDouble7.getTtm();
    double double15 = quarterlyDouble7.getQoQ();
    java.lang.String str17 = quarterlyDouble7.fmtGrowth4Q(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str9,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 900.0d + "'", double10 == 900.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 12.0d + "'", double14 == 12.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-90.0d) + "'", double15 == (-90.0d));
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
        + "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str17,
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test1177() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1177");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getQseqQ();
    double[] doubleArray8 = quarterlyDouble6.dArr;
    double double10 = quarterlyDouble6.get(10);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str12 = quarterlyDouble6
          .fmtGrowth1Q("\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
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
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
  }

  @Test
  public void test1178() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1178");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double8 = quarterlyDouble7.getTtm();
    java.lang.String str10 = quarterlyDouble7.fmtGrowth4Q("");
    double double11 = quarterlyDouble7.getTtmAvg();
    double double12 = quarterlyDouble7.getTtmAvg();
    double double13 = quarterlyDouble7.getTtm();
    double double14 = quarterlyDouble7.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 12.0d + "'", double8 == 12.0d);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str10,
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.0d + "'", double11 == 3.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.0d + "'", double12 == 3.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 12.0d + "'", double13 == 12.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 900.0d + "'", double14 == 900.0d);
  }

  @Test
  public void test1179() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1179");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) -1, (int) 'a');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, (int) (byte) 100, (int) (short) 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, (int) (short) 10, 1);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList5);
    org.junit.Assert.assertNotNull(companyDataList8);
  }

  @Test
  public void test1180() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1180");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        (int) ' ', (int) (short) -1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1181() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1181");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double[] doubleArray9 = quarterlyDouble7.dArr;
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtm();
    double double13 = quarterlyDouble7.get(0);
    double double14 = quarterlyDouble7.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 11.0d + "'", double11 == 11.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
  }

  @Test
  public void test1182() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1182");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(100, (int) ' ');
  }

  @Test
  public void test1183() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1183");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) 0,
        (int) (byte) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1184() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1184");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) '4', (int) (short) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, (int) (short) -1, (int) (byte) 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, 0, (int) (short) 100);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList5);
    org.junit.Assert.assertNotNull(companyDataList8);
  }

  @Test
  public void test1185() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1185");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 100,
        (int) (short) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1186() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1186");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.lang.String str3 = companyData1.getTicker();
    java.lang.String str4 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
    java.lang.String str7 = companyData1.getTicker();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertNotNull(fieldDataList6);
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
  }

  @Test
  public void test1187() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1187");
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
    double double14 = quarterlyDouble8.get((int) ' ');
    double double16 = quarterlyDouble8.get((int) '#');
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-200.0d) + "'", double11 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9999.9999d) + "'", double16 == (-9999.9999d));
  }

  @Test
  public void test1188() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1188");
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
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray23);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str27 = quarterlyDouble25.fmtGrowth4Q("hi!");
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
  public void test1189() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1189");
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
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList12 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, 0, (int) '#');
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
    org.junit.Assert.assertNotNull(manyCompanyDataList5);
    org.junit.Assert.assertNotNull(companyDataList8);
    org.junit.Assert.assertNotNull(manyCompanyDataList9);
    org.junit.Assert.assertNotNull(companyDataList12);
  }

  @Test
  public void test1190() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1190");
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
    double[] doubleArray18 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    double[] doubleArray20 = quarterlyDouble19.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray20);
    quarterlyDouble8.dArr = doubleArray20;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-200.0d) + "'", double11 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray20);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[97.0, 35.0, -1.0, 0.0, 0.0]");
  }

  @Test
  public void test1191() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1191");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t\t\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test1192() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1192");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.deltaQ((int) (short) 10, 0);
    double double12 = quarterlyDouble6.get(0);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
  }

  @Test
  public void test1193() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1193");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)", (int) (short) -1,
        0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1194() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1194");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double8 = quarterlyDouble7.getTtm();
    java.lang.String str10 = quarterlyDouble7.fmtGrowth4Q("");
    double double11 = quarterlyDouble7.getTtmAvg();
    double double12 = quarterlyDouble7.getQoQ();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 12.0d + "'", double8 == 12.0d);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str10,
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.0d + "'", double11 == 3.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-90.0d) + "'", double12 == (-90.0d));
  }

  @Test
  public void test1195() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1195");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    java.lang.String str2 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
        + "\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str2,
        "\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(fieldDataList3);
  }

  @Test
  public void test1196() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1196");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double[] doubleArray14 = new double[] { '4', (-1), 100.0d, 3.0d, (byte) 1, 100.0f };
    quarterlyDouble7.dArr = doubleArray14;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
  }

  @Test
  public void test1197() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1197");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 100,
        (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (byte) 1, 0);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test1198() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1198");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double8 = quarterlyDouble7.getQoQ();
    double[] doubleArray9 = null;
    quarterlyDouble7.dArr = doubleArray9;
    java.lang.Class<?> wildcardClass11 = quarterlyDouble7.getClass();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-90.0d) + "'", double8 == (-90.0d));
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test1199() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1199");
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
    double[] doubleArray22 = quarterlyDouble6.dArr;
    double[] doubleArray23 = quarterlyDouble6.dArr;
    double double24 = quarterlyDouble6.getTtm();
    java.lang.String str26 = quarterlyDouble6.fmtGrowth4Q("");
    double[] doubleArray27 = quarterlyDouble6.dArr;
    double[] doubleArray34 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble35 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray34);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray34);
    double double37 = quarterlyDouble36.getTtm();
    java.lang.String str39 = quarterlyDouble36.fmtGrowth1Q("hi!");
    java.lang.String str41 = quarterlyDouble36.fmtGrowth4Q("");
    double double42 = quarterlyDouble36.getTtm();
    double[] doubleArray43 = quarterlyDouble36.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble44 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray43);
    java.lang.String str46 = quarterlyDouble44.fmtGrowth1Q(
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    double[] doubleArray47 = quarterlyDouble44.dArr;
    quarterlyDouble6.dArr = doubleArray47;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 12.0d + "'", double20 == 12.0d);
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray22);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + 12.0d + "'", double24 == 12.0d);
    org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str26,
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray27);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray34);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double37 + "' != '" + 12.0d + "'", double37 == 12.0d);
    org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str39,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str41,
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double42 + "' != '" + 12.0d + "'", double42 == 12.0d);
    org.junit.Assert.assertNotNull(doubleArray43);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str46 + "' != '"
        + "\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str46,
        "\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray47);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
  }

  @Test
  public void test1200() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1200");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (short) 100, (int) 'a');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1201() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1201");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, 1, (int) (short) 10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test1202() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1202");
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
    double double23 = quarterlyDouble7.getQseqQ();
    double double25 = quarterlyDouble7.get(0);
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
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-200.0d) + "'", double23 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
  }

  @Test
  public void test1203() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1203");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double8 = quarterlyDouble7.getTtmAvg();
    double double9 = quarterlyDouble7.getQoQ();
    double double10 = quarterlyDouble7.getTtmAvg();
    java.lang.String str12 = quarterlyDouble7.fmtGrowth4Q(
        "\t\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    double double13 = quarterlyDouble7.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.0d + "'", double8 == 3.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-90.0d) + "'", double9 == (-90.0d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
        + "\t\t\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str12,
        "\t\t\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 900.0d + "'", double13 == 900.0d);
  }

  @Test
  public void test1204() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1204");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double9 = quarterlyDouble7.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      double double10 = quarterlyDouble7.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-200.0d) + "'", double9 == (-200.0d));
  }

  @Test
  public void test1205() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1205");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double8 = quarterlyDouble7.getTtm();
    double double10 = quarterlyDouble7.get((int) (short) -1);
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 12.0d + "'", double8 == 12.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
  }

  @Test
  public void test1206() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1206");
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
    double double28 = quarterlyDouble7.deltaQ(10, (int) ' ');
    double double29 = quarterlyDouble7.getMostRecent();
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
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    org.junit.Assert.assertTrue("'" + double29 + "' != '" + 35.0d + "'", double29 == 35.0d);
  }

  @Test
  public void test1207() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1207");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 100, (int) '4');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1208() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1208");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        10, (int) '#');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1209() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1209");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtm();
    double double9 = quarterlyDouble6.get((int) (byte) -1);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 11.0d + "'", double7 == 11.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9999.9999d) + "'", double9 == (-9999.9999d));
  }

  @Test
  public void test1210() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1210");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) 100,
        (int) (short) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1211() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1211");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) 'a', (int) ' ');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1212() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1212");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double8 = quarterlyDouble7.getTtm();
    java.lang.String str10 = quarterlyDouble7.fmtGrowth4Q("");
    double double11 = quarterlyDouble7.getTtmAvg();
    double double12 = quarterlyDouble7.getTtmAvg();
    double double13 = quarterlyDouble7.getQoQ();
    double double14 = quarterlyDouble7.getQseqQ();
    double double15 = quarterlyDouble7.getQoQ();
    double double17 = quarterlyDouble7.get((int) 'a');
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 12.0d + "'", double8 == 12.0d);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str10,
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.0d + "'", double11 == 3.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.0d + "'", double12 == 3.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-90.0d) + "'", double13 == (-90.0d));
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 900.0d + "'", double14 == 900.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-90.0d) + "'", double15 == (-90.0d));
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9999.9999d) + "'", double17 == (-9999.9999d));
  }

  @Test
  public void test1213() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1213");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    java.lang.String str13 = quarterlyDouble8.fmtGrowth4Q("");
    double double14 = quarterlyDouble8.getTtm();
    double[] doubleArray15 = quarterlyDouble8.dArr;
    double[] doubleArray21 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray21);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray21);
    quarterlyDouble8.dArr = doubleArray21;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str26 = quarterlyDouble8
          .fmtGrowth1Q("\t\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str13,
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 12.0d + "'", double14 == 12.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[97.0, 35.0, -1.0, 0.0, 0.0]");
  }

  @Test
  public void test1214() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1214");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (byte) 10, (int) '#');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1215() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1215");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double8 = quarterlyDouble7.getTtmAvg();
    double double9 = quarterlyDouble7.getQoQ();
    double double10 = quarterlyDouble7.getMostRecent();
    double double11 = quarterlyDouble7.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.0d + "'", double8 == 3.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-90.0d) + "'", double9 == (-90.0d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.0d + "'", double11 == 3.0d);
  }

  @Test
  public void test1216() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1216");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (short) 0, (int) ' ');
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test1217() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1217");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 100,
        (int) '4');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1218() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1218");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) 'a', (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList2);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(manyCompanyDataList3);
  }

  @Test
  public void test1219() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1219");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double[] doubleArray9 = quarterlyDouble7.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray9);
    double[] doubleArray11 = quarterlyDouble10.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str13 = quarterlyDouble10.fmtGrowth1Q(
          "\t\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
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
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test1220() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1220");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(10, 1);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test1221() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1221");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 100,
        (int) ' ');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (short) 100, 0);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test1222() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1222");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData6 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList3, 0, (int) (byte) 100);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData9 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList3, 1, 10);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData12 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList3, (int) (byte) 10, 0);
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNull(fieldData6);
    org.junit.Assert.assertNull(fieldData9);
    org.junit.Assert.assertNull(fieldData12);
  }

  @Test
  public void test1223() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1223");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test1224() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1224");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
  }

  @Test
  public void test1225() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1225");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (byte) 0, (int) (short) 10);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1226() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1226");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(1, (int) 'a');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1227() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1227");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double[] doubleArray8 = null;
    quarterlyDouble6.dArr = doubleArray8;
    // The following exception was thrown during execution in test generation
    try {
      double double10 = quarterlyDouble6.getMostRecent();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
  }

  @Test
  public void test1228() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1228");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 100, (int) (byte) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1229() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1229");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray8 = quarterlyDouble7.dArr;
    double double11 = quarterlyDouble7.deltaQ(1, 0);
    double[] doubleArray18 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    double double21 = quarterlyDouble20.getTtm();
    java.lang.String str23 = quarterlyDouble20.fmtGrowth1Q("hi!");
    java.lang.String str25 = quarterlyDouble20.fmtGrowth4Q("");
    double double26 = quarterlyDouble20.getQoQ();
    double[] doubleArray32 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray32);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray32);
    double[] doubleArray35 = quarterlyDouble34.dArr;
    quarterlyDouble20.dArr = doubleArray35;
    quarterlyDouble7.dArr = doubleArray35;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 12.0d + "'", double21 == 12.0d);
    org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str23,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str25,
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-90.0d) + "'", double26 == (-90.0d));
    org.junit.Assert.assertNotNull(doubleArray32);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray35);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test1230() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1230");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double9 = quarterlyDouble6.get((int) (byte) 100);
    double[] doubleArray15 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    double double18 = quarterlyDouble17.getMostRecent();
    double double19 = quarterlyDouble17.getTtmAvg();
    double double20 = quarterlyDouble17.getQseqQ();
    double double21 = quarterlyDouble17.getTtmAvg();
    double double22 = quarterlyDouble17.getQseqQ();
    double[] doubleArray28 = new double[] { 0L, 10.0f, 97.0d, 1.0d, 1.0f };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray28);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray28);
    quarterlyDouble17.dArr = doubleArray28;
    quarterlyDouble6.dArr = doubleArray28;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9999.9999d) + "'", double9 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 2.75d + "'", double19 == 2.75d);
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-200.0d) + "'", double20 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2.75d + "'", double21 == 2.75d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-200.0d) + "'", double22 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray28);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 10.0, 97.0, 1.0, 1.0]");
  }

  @Test
  public void test1231() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1231");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (-1), 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (short) 1, (int) (short) 0);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test1232() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1232");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (-1), (int) '#');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1233() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1233");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList0 = null;
    // The following exception was thrown during execution in test generation
    try {
      net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
          .getFieldData(fieldDataList0, (int) (byte) -1, (int) (short) -1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test1234() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1234");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getCompany(
            "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(oneCompanyDataList1);
  }

  @Test
  public void test1235() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1235");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t                  :        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData6 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList3, (int) (byte) 0, (int) (byte) 10);
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNull(fieldData6);
  }

  @Test
  public void test1236() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1236");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) -1, 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1237() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1237");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    java.lang.String str2 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
        + "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str2,
        "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNotNull(fieldDataList4);
  }

  @Test
  public void test1238() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1238");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((-1), 100);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1239() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1239");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (short) 1, 10);
    java.lang.Class<?> wildcardClass3 = strList2.getClass();
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(wildcardClass3);
  }

  @Test
  public void test1240() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1240");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double double10 = quarterlyDouble6.deltaQ(10, (int) (short) 1);
    double double12 = quarterlyDouble6.get((int) (byte) 10);
    double[] doubleArray13 = quarterlyDouble6.dArr;
    double double15 = quarterlyDouble6.get((int) (byte) 100);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str17 = quarterlyDouble6.fmtGrowth1Q(
          "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
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
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9999.9999d) + "'", double15 == (-9999.9999d));
  }

  @Test
  public void test1241() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1241");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.deltaQ((int) (short) 10, 0);
    double double11 = quarterlyDouble6.getQseqQ();
    double[] doubleArray12 = quarterlyDouble6.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray12);
    double[] doubleArray19 = new double[] { 0L, 10.0f, 97.0d, 1.0d, 1.0f };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    quarterlyDouble13.dArr = doubleArray19;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-200.0d) + "'", double11 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 10.0, 97.0, 1.0, 1.0]");
  }

  @Test
  public void test1242() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1242");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double double10 = quarterlyDouble6.deltaQ(10, (int) (short) 1);
    double[] doubleArray17 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    double[] doubleArray25 = new double[] { '4', (-1), 100.0d, 3.0d, (byte) 1, 100.0f };
    quarterlyDouble18.dArr = doubleArray25;
    double[] doubleArray27 = quarterlyDouble18.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray27);
    quarterlyDouble6.dArr = doubleArray27;
    java.lang.String str31 = quarterlyDouble6
        .fmtGrowth4Q("\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    double double32 = quarterlyDouble6.getQoQ();
    double double33 = quarterlyDouble6.getQoQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray27);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str31 + "' != '"
        + "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)"
        + "'", str31,
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
    org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-101.0d) + "'", double32 == (-101.0d));
    org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-101.0d) + "'", double33 == (-101.0d));
  }

  @Test
  public void test1243() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1243");
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
  public void test1244() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1244");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.lang.String str4 = companyData1.getTicker();
    java.lang.String str5 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertNotNull(fieldDataList6);
  }

  @Test
  public void test1245() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1245");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData7 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList4, (int) (byte) 1, (int) (byte) 100);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData10 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList4, (int) (byte) 100, (int) '#');
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNull(fieldData7);
    org.junit.Assert.assertNull(fieldData10);
  }

  @Test
  public void test1246() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1246");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str2,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str3,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test1247() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1247");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 10, 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1248() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1248");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test1249() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1249");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    java.lang.String str9 = quarterlyDouble7.fmtGrowth1Q("");
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double[] doubleArray12 = quarterlyDouble7.dArr;
    java.lang.String str14 = quarterlyDouble7.fmtGrowth1Q(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    java.lang.String str16 = quarterlyDouble7.fmtGrowth4Q("\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str9,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 900.0d + "'", double10 == 900.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.0d + "'", double11 == 3.0d);
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str14 + "' != '"
        + "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str14,
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '"
            + "\t\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'",
        str16, "\t\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test1250() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1250");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double[] doubleArray9 = quarterlyDouble7.dArr;
    double double11 = quarterlyDouble7.get((int) '#');
    double[] doubleArray12 = quarterlyDouble7.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray12);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str15 = quarterlyDouble13
          .fmtGrowth4Q("\t\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
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
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test1251() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1251");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    java.lang.String str9 = quarterlyDouble7.fmtGrowth1Q("");
    double double10 = quarterlyDouble7.getQseqQ();
    double double13 = quarterlyDouble7.deltaQ((int) 'a', 100);
    double double14 = quarterlyDouble7.getTtm();
    double double17 = quarterlyDouble7.deltaQ((int) (byte) 10, 0);
    double double18 = quarterlyDouble7.getTtmAvg();
    double double19 = quarterlyDouble7.getQoQ();
    double double20 = quarterlyDouble7.getTtm();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str9,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 900.0d + "'", double10 == 900.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 12.0d + "'", double14 == 12.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.0d + "'", double18 == 3.0d);
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-90.0d) + "'", double19 == (-90.0d));
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 12.0d + "'", double20 == 12.0d);
  }

  @Test
  public void test1252() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1252");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.get(1);
    double double11 = quarterlyDouble7.getMostRecent();
    double double12 = quarterlyDouble7.getTtmAvg();
    double double13 = quarterlyDouble7.getQseqQ();
    double double14 = quarterlyDouble7.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.75d + "'", double8 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.75d + "'", double12 == 2.75d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-200.0d) + "'", double13 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
  }

  @Test
  public void test1253() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1253");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 10,
        (int) (short) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1254() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1254");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    org.junit.Assert.assertNotNull(fieldDataList2);
  }

  @Test
  public void test1255() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1255");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double8 = quarterlyDouble7.getTtmAvg();
    double double9 = quarterlyDouble7.getQoQ();
    double double10 = quarterlyDouble7.getMostRecent();
    double double12 = quarterlyDouble7.get((int) (byte) 0);
    // The following exception was thrown during execution in test generation
    try {
      double double15 = quarterlyDouble7.deltaQ(0, (int) '#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.0d + "'", double8 == 3.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-90.0d) + "'", double9 == (-90.0d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
  }

  @Test
  public void test1256() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1256");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 0, (int) '#');
  }

  @Test
  public void test1257() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1257");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str24 = quarterlyDouble7.fmtGrowth4Q(
          "\t\t\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[97.0, 35.0, -1.0, 0.0, 0.0]");
  }

  @Test
  public void test1258() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1258");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 100,
        (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1259() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1259");
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
    double double29 = quarterlyDouble7.getQseqQ();
    double double30 = quarterlyDouble7.getTtmAvg();
    double double31 = quarterlyDouble7.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str33 = quarterlyDouble7.fmtGrowth4Q(
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
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-200.0d) + "'", double22 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-9999.9999d) + "'", double25 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0d) + "'", double28 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-200.0d) + "'", double29 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + 2.75d + "'", double30 == 2.75d);
    org.junit.Assert.assertTrue("'" + double31 + "' != '" + 2.75d + "'", double31 == 2.75d);
  }

  @Test
  public void test1260() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1260");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    double double14 = quarterlyDouble8.deltaQ((int) (short) 10, (int) (short) 100);
    double[] doubleArray15 = quarterlyDouble8.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
  }

  @Test
  public void test1261() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1261");
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
    double double32 = quarterlyDouble31.getTtm();
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
    org.junit.Assert.assertTrue("'" + double32 + "' != '" + 11.0d + "'", double32 == 11.0d);
  }

  @Test
  public void test1262() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1262");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData7 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList4, 0, 100);
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNull(fieldData7);
  }

  @Test
  public void test1263() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1263");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) 1, 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1264() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1264");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) ' ', 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1265() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1265");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double[] doubleArray9 = quarterlyDouble7.dArr;
    double double10 = quarterlyDouble7.getQseqQ();
    double[] doubleArray11 = quarterlyDouble7.dArr;
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
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test1266() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1266");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (byte) 100, 10);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test1267() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1267");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double9 = quarterlyDouble8.getTtmAvg();
    double double10 = quarterlyDouble8.getMostRecent();
    java.lang.Class<?> wildcardClass11 = quarterlyDouble8.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test1268() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1268");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, 100, (int) 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test1269() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1269");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) -1,
        (int) (byte) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1270() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1270");
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
    double double14 = quarterlyDouble9.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str16 = quarterlyDouble9.fmtGrowth4Q(
          "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 34.0d + "'", double14 == 34.0d);
  }

  @Test
  public void test1271() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1271");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double[] doubleArray14 = new double[] { '4', (-1), 100.0d, 3.0d, (byte) 1, 100.0f };
    quarterlyDouble7.dArr = doubleArray14;
    double[] doubleArray16 = quarterlyDouble7.dArr;
    double double17 = quarterlyDouble7.getQoQ();
    double double18 = quarterlyDouble7.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-101.0d) + "'", double17 == (-101.0d));
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-101.0d) + "'", double18 == (-101.0d));
  }

  @Test
  public void test1272() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1272");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 1, 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1273() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1273");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double10 = quarterlyDouble7.deltaQ((-1), 1);
    double[] doubleArray11 = quarterlyDouble7.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray11);
    double double14 = quarterlyDouble13.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3600.0d + "'", double14 == 3600.0d);
  }

  @Test
  public void test1274() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1274");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) -1, 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1275() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1275");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(1, (int) (byte) 0);
  }

  @Test
  public void test1276() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1276");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double11 = quarterlyDouble8.deltaQ(10, (int) (short) 0);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str13 = quarterlyDouble8.fmtGrowth4Q(
          "\t\t\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         -1.00 M (Seq= -101.00% : QoQ= -101.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
  }

  @Test
  public void test1277() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1277");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) ' ', (int) 'a');
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test1278() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1278");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 1, (int) (short) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1279() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1279");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    double double14 = quarterlyDouble8.deltaQ((int) (short) 10, (int) (short) 100);
    double[] doubleArray15 = quarterlyDouble8.dArr;
    java.lang.String str17 = quarterlyDouble8.fmtGrowth4Q("\t                  :        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '"
            + "\t\t                  :        103.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'",
        str17, "\t\t                  :        103.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test1280() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1280");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    org.junit.Assert.assertNotNull(fieldDataList2);
  }

  @Test
  public void test1281() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1281");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 10,
        (int) '#');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1282() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1282");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.lang.String str4 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList5, (int) '4', 10);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList5, (int) (short) 100, (int) (byte) 1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertNull(fieldData8);
    org.junit.Assert.assertNull(fieldData11);
  }

  @Test
  public void test1283() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1283");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t                  :        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.lang.String str3 = companyData1.getTicker();
    java.lang.String str4 = companyData1.getTicker();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\t                  :        103.00 M (Seq= -101.00% : QoQ= -101.00%)" + "'", str3,
        "\t                  :        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t                  :        103.00 M (Seq= -101.00% : QoQ= -101.00%)" + "'", str4,
        "\t                  :        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
  }

  @Test
  public void test1284() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1284");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\thi!               :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)", 1, (int) '#');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1285() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1285");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(0, (int) '#');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1286() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1286");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\thi!               :         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)", 100, (int) 'a');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1287() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1287");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 0, (int) 'a');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (byte) 100, (int) '4');
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test1288() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1288");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double8 = quarterlyDouble7.getTtmAvg();
    double double9 = quarterlyDouble7.getQoQ();
    double double10 = quarterlyDouble7.getTtmAvg();
    java.lang.String str12 = quarterlyDouble7.fmtGrowth1Q(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    double double13 = quarterlyDouble7.getQoQ();
    double double14 = quarterlyDouble7.getQoQ();
    double[] doubleArray20 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray20);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray20);
    double double23 = quarterlyDouble22.getMostRecent();
    double double24 = quarterlyDouble22.getTtmAvg();
    double double25 = quarterlyDouble22.getQseqQ();
    double double26 = quarterlyDouble22.getTtmAvg();
    double double27 = quarterlyDouble22.getQseqQ();
    double[] doubleArray33 = new double[] { 0L, 10.0f, 97.0d, 1.0d, 1.0f };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray33);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble35 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray33);
    quarterlyDouble22.dArr = doubleArray33;
    quarterlyDouble7.dArr = doubleArray33;
    double double38 = quarterlyDouble7.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.0d + "'", double8 == 3.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-90.0d) + "'", double9 == (-90.0d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
        + "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str12,
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-90.0d) + "'", double13 == (-90.0d));
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-90.0d) + "'", double14 == (-90.0d));
    org.junit.Assert.assertNotNull(doubleArray20);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + 2.75d + "'", double24 == 2.75d);
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-200.0d) + "'", double25 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + 2.75d + "'", double26 == 2.75d);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-200.0d) + "'", double27 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray33);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 10.0, 97.0, 1.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double38 + "' != '" + 27.25d + "'", double38 == 27.25d);
  }

  @Test
  public void test1289() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1289");
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
  public void test1290() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1290");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) '4', (int) 'a');
  }

  @Test
  public void test1291() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1291");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
    java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1,
        fieldDataArray0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) 'a', (int) (short) 10);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (byte) 10, (int) (short) 100);
    org.junit.Assert.assertNotNull(fieldDataArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNull(fieldData5);
    org.junit.Assert.assertNull(fieldData8);
  }

  @Test
  public void test1292() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1292");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.deltaQ((int) '4', (int) ' ');
    double double12 = quarterlyDouble7.getMostRecent();
    double double13 = quarterlyDouble7.getTtmAvg();
    double double15 = quarterlyDouble7.get((int) (byte) 0);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3600.0d + "'", double8 == 3600.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.5d + "'", double13 == 8.5d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
  }

  @Test
  public void test1293() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1293");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double[] doubleArray14 = new double[] { '4', (-1), 100.0d, 3.0d, (byte) 1, 100.0f };
    quarterlyDouble7.dArr = doubleArray14;
    double[] doubleArray16 = quarterlyDouble7.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray16);
    double double18 = quarterlyDouble17.getTtm();
    double double19 = quarterlyDouble17.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 103.0d + "'", double18 == 103.0d);
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 25.75d + "'", double19 == 25.75d);
  }

  @Test
  public void test1294() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1294");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 1, 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test1295() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1295");
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
    double double29 = quarterlyDouble7.getQseqQ();
    double double30 = quarterlyDouble7.getTtm();
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
    org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-200.0d) + "'", double29 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + 11.0d + "'", double30 == 11.0d);
  }

  @Test
  public void test1296() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1296");
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
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray23);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray23);
    double double28 = quarterlyDouble27.getQseqQ();
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
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + 3600.0d + "'", double28 == 3600.0d);
  }

  @Test
  public void test1297() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1297");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.lang.String str5 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData9 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList6, 1, (int) (short) 1);
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertNotNull(fieldDataList6);
    org.junit.Assert.assertNull(fieldData9);
  }

  @Test
  public void test1298() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1298");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double double9 = quarterlyDouble6.get(0);
    double double10 = quarterlyDouble6.getMostRecent();
    double double11 = quarterlyDouble6.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3600.0d + "'", double11 == 3600.0d);
  }

  @Test
  public void test1299() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1299");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    java.lang.String str2 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
        + "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str2,
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(fieldDataList3);
  }

  @Test
  public void test1300() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1300");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) 'a',
        (int) (short) 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test1301() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1301");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double double10 = quarterlyDouble6.deltaQ(10, (int) (short) 1);
    double[] doubleArray17 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    double[] doubleArray25 = new double[] { '4', (-1), 100.0d, 3.0d, (byte) 1, 100.0f };
    quarterlyDouble18.dArr = doubleArray25;
    double[] doubleArray27 = quarterlyDouble18.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray27);
    quarterlyDouble6.dArr = doubleArray27;
    java.lang.String str31 = quarterlyDouble6
        .fmtGrowth4Q("\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    double double32 = quarterlyDouble6.getQoQ();
    double[] doubleArray38 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray38);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble40 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray38);
    double double41 = quarterlyDouble40.getMostRecent();
    double double42 = quarterlyDouble40.getTtmAvg();
    double double43 = quarterlyDouble40.getQseqQ();
    double double44 = quarterlyDouble40.getTtmAvg();
    double[] doubleArray50 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble51 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray50);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble52 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray50);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble53 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray50);
    quarterlyDouble40.dArr = doubleArray50;
    double[] doubleArray55 = quarterlyDouble40.dArr;
    double[] doubleArray61 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble62 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray61);
    double[] doubleArray63 = quarterlyDouble62.dArr;
    double[] doubleArray64 = quarterlyDouble62.dArr;
    quarterlyDouble40.dArr = doubleArray64;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble66 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray64);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble67 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray64);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble68 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray64);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble69 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray64);
    quarterlyDouble6.dArr = doubleArray64;
    java.lang.Class<?> wildcardClass71 = quarterlyDouble6.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray27);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str31 + "' != '"
        + "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)"
        + "'", str31,
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
    org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-101.0d) + "'", double32 == (-101.0d));
    org.junit.Assert.assertNotNull(doubleArray38);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-1.0d) + "'", double41 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double42 + "' != '" + 2.75d + "'", double42 == 2.75d);
    org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-200.0d) + "'", double43 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double44 + "' != '" + 2.75d + "'", double44 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray50);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray55);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray61);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray63);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray64);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(wildcardClass71);
  }

  @Test
  public void test1302() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1302");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) '#', (int) ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test1303() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1303");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    double double14 = quarterlyDouble8.deltaQ((int) (short) 10, (int) (short) 100);
    double double15 = quarterlyDouble8.getTtm();
    double double16 = quarterlyDouble8.getTtmAvg();
    double[] doubleArray22 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray22);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray22);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray22);
    quarterlyDouble8.dArr = doubleArray22;
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 12.0d + "'", double15 == 12.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.0d + "'", double16 == 3.0d);
    org.junit.Assert.assertNotNull(doubleArray22);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test1304() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1304");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double double9 = quarterlyDouble6.get(0);
    double double11 = quarterlyDouble6.get((int) (byte) 10);
    double[] doubleArray12 = quarterlyDouble6.dArr;
    double double13 = quarterlyDouble6.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str15 = quarterlyDouble6.fmtGrowth1Q(
          "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
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
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.5d + "'", double13 == 8.5d);
  }

  @Test
  public void test1305() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1305");
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
    double double13 = quarterlyDouble7.getMostRecent();
    double double14 = quarterlyDouble7.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-200.0d) + "'", double12 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
  }

  @Test
  public void test1306() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1306");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (byte) -1, (int) 'a');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1307() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1307");
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
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.75d + "'", double8 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.75d + "'", double12 == 2.75d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
  }

  @Test
  public void test1308() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1308");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 10,
        (int) (byte) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1309() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1309");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    java.lang.String str9 = quarterlyDouble7.fmtGrowth1Q("");
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double double12 = quarterlyDouble7.getMostRecent();
    double double13 = quarterlyDouble7.getQoQ();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str9,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 900.0d + "'", double10 == 900.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.0d + "'", double11 == 3.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-90.0d) + "'", double13 == (-90.0d));
  }

  @Test
  public void test1310() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1310");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) 0, (int) (short) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList2);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(manyCompanyDataList3);
  }

  @Test
  public void test1311() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1311");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    java.lang.Class<?> wildcardClass9 = quarterlyDouble8.getClass();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test1312() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1312");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 10, (int) (byte) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1313() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1313");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(fieldDataList3);
  }

  @Test
  public void test1314() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1314");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 100, 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1315() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1315");
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
    double double23 = quarterlyDouble7.getQseqQ();
    double double24 = quarterlyDouble7.getTtm();
    double[] doubleArray30 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray30);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray30);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray30);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray30);
    quarterlyDouble7.dArr = doubleArray30;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray30);
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
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-200.0d) + "'", double23 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + 11.0d + "'", double24 == 11.0d);
    org.junit.Assert.assertNotNull(doubleArray30);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test1316() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1316");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 0, (int) (short) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1317() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1317");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    double double14 = quarterlyDouble8.deltaQ((int) (short) 10, (int) (short) 100);
    double double15 = quarterlyDouble8.getTtm();
    double double16 = quarterlyDouble8.getQseqQ();
    double[] doubleArray22 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray22);
    double[] doubleArray24 = quarterlyDouble23.dArr;
    double double26 = quarterlyDouble23.get(0);
    double double28 = quarterlyDouble23.get((int) (byte) 10);
    double[] doubleArray29 = quarterlyDouble23.dArr;
    double double30 = quarterlyDouble23.getMostRecent();
    double[] doubleArray31 = quarterlyDouble23.dArr;
    quarterlyDouble8.dArr = doubleArray31;
    double double35 = quarterlyDouble8.deltaQ((int) (byte) 100, (int) (short) 10);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str37 = quarterlyDouble8.fmtGrowth4Q(
          "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 12.0d + "'", double15 == 12.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 900.0d + "'", double16 == 900.0d);
    org.junit.Assert.assertNotNull(doubleArray22);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray24);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + 97.0d + "'", double26 == 97.0d);
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-9999.9999d) + "'", double28 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray29);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + 35.0d + "'", double30 == 35.0d);
    org.junit.Assert.assertNotNull(doubleArray31);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
  }

  @Test
  public void test1318() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1318");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) '4',
        (int) (byte) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (byte) 0, (int) (byte) -1);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test1319() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1319");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
    java.lang.String str2 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData7 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList4, 0, (int) (short) -1);
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
        + "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)"
        + "'", str2,
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNull(fieldData7);
  }

  @Test
  public void test1320() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1320");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    double double12 = quarterlyDouble8.getMostRecent();
    double double13 = quarterlyDouble8.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
  }

  @Test
  public void test1321() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1321");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double8 = quarterlyDouble7.getQoQ();
    java.lang.String str10 = quarterlyDouble7
        .fmtGrowth1Q("\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-90.0d) + "'", double8 == (-90.0d));
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
        + "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str10,
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test1322() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1322");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) 0,
        (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
    org.junit.Assert.assertNotNull(manyCompanyDataList5);
  }

  @Test
  public void test1323() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1323");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
    java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1,
        fieldDataArray0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) 'a', (int) (short) 10);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (-1), (int) 'a');
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (short) -1, (int) (byte) 1);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData14 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (short) 1, (int) (byte) 0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData17 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (byte) 0, (int) (byte) 1);
    org.junit.Assert.assertNotNull(fieldDataArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNull(fieldData5);
    org.junit.Assert.assertNull(fieldData8);
    org.junit.Assert.assertNull(fieldData11);
    org.junit.Assert.assertNull(fieldData14);
    org.junit.Assert.assertNull(fieldData17);
  }

  @Test
  public void test1324() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1324");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray7);
    double double11 = quarterlyDouble8.deltaQ((int) (byte) 100, (int) (byte) 1);
    double[] doubleArray18 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    double[] doubleArray26 = new double[] { '4', (-1), 100.0d, 3.0d, (byte) 1, 100.0f };
    quarterlyDouble19.dArr = doubleArray26;
    double[] doubleArray28 = quarterlyDouble19.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray28);
    double[] doubleArray35 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray35);
    double[] doubleArray37 = quarterlyDouble36.dArr;
    double[] doubleArray38 = quarterlyDouble36.dArr;
    quarterlyDouble29.dArr = doubleArray38;
    quarterlyDouble8.dArr = doubleArray38;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray38);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray26);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray28);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray35);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray37);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray38);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test1325() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1325");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getMostRecent();
    double double10 = quarterlyDouble8.getQoQ();
    double double11 = quarterlyDouble8.getTtmAvg();
    java.lang.String str13 = quarterlyDouble8.fmtGrowth4Q(
        "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    double[] doubleArray19 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    double double21 = quarterlyDouble20.getMostRecent();
    double double24 = quarterlyDouble20.deltaQ((int) (short) 10, 0);
    double double25 = quarterlyDouble20.getQseqQ();
    double[] doubleArray26 = quarterlyDouble20.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray26);
    quarterlyDouble8.dArr = doubleArray26;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str30 = quarterlyDouble8
          .fmtGrowth1Q("\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-90.0d) + "'", double10 == (-90.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.0d + "'", double11 == 3.0d);
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
        + "\t\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str13,
        "\t\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-200.0d) + "'", double25 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray26);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test1326() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1326");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.get(1);
    double double11 = quarterlyDouble7.getMostRecent();
    double double14 = quarterlyDouble7.deltaQ(10, (int) (byte) 100);
    double double16 = quarterlyDouble7.get((int) (short) 1);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.75d + "'", double8 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
  }

  @Test
  public void test1327() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1327");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 0,
        (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1328() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1328");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getMostRecent();
    double double10 = quarterlyDouble8.getTtmAvg();
    double double11 = quarterlyDouble8.getQseqQ();
    double[] doubleArray12 = quarterlyDouble8.dArr;
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 900.0d + "'", double11 == 900.0d);
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
  }

  @Test
  public void test1329() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1329");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    double[] doubleArray12 = quarterlyDouble8.dArr;
    double double14 = quarterlyDouble8.get((int) '#');
    double double15 = quarterlyDouble8.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
  }

  @Test
  public void test1330() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1330");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) -1,
        (int) 'a');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1331() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1331");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList0 = null;
    // The following exception was thrown during execution in test generation
    try {
      net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
          .getFieldData(fieldDataList0, (int) (byte) -1, (int) (byte) 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test1332() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1332");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertNotNull(fieldDataList6);
  }

  @Test
  public void test1333() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1333");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double double9 = quarterlyDouble6.get(0);
    double double11 = quarterlyDouble6.get((int) (byte) 10);
    double double12 = quarterlyDouble6.getTtm();
    double[] doubleArray18 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    double double21 = quarterlyDouble20.getMostRecent();
    double double22 = quarterlyDouble20.getTtmAvg();
    double double23 = quarterlyDouble20.getQseqQ();
    double double24 = quarterlyDouble20.getTtmAvg();
    double[] doubleArray25 = quarterlyDouble20.dArr;
    quarterlyDouble6.dArr = doubleArray25;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray25);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray25);
    double double29 = quarterlyDouble28.getQseqQ();
    double[] doubleArray36 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray36);
    double double38 = quarterlyDouble37.getTtmAvg();
    double double39 = quarterlyDouble37.getQoQ();
    double double40 = quarterlyDouble37.getTtmAvg();
    java.lang.String str42 = quarterlyDouble37.fmtGrowth1Q(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    double double43 = quarterlyDouble37.getQoQ();
    double double44 = quarterlyDouble37.getQoQ();
    double[] doubleArray50 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble51 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray50);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble52 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray50);
    double double53 = quarterlyDouble52.getMostRecent();
    double double54 = quarterlyDouble52.getTtmAvg();
    double double55 = quarterlyDouble52.getQseqQ();
    double double56 = quarterlyDouble52.getTtmAvg();
    double double57 = quarterlyDouble52.getQseqQ();
    double[] doubleArray63 = new double[] { 0L, 10.0f, 97.0d, 1.0d, 1.0f };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble64 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray63);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble65 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray63);
    quarterlyDouble52.dArr = doubleArray63;
    quarterlyDouble37.dArr = doubleArray63;
    quarterlyDouble28.dArr = doubleArray63;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 34.0d + "'", double12 == 34.0d);
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.75d + "'", double22 == 2.75d);
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-200.0d) + "'", double23 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + 2.75d + "'", double24 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-200.0d) + "'", double29 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray36);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double38 + "' != '" + 3.0d + "'", double38 == 3.0d);
    org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-90.0d) + "'", double39 == (-90.0d));
    org.junit.Assert.assertTrue("'" + double40 + "' != '" + 3.0d + "'", double40 == 3.0d);
    org.junit.Assert.assertEquals("'" + str42 + "' != '"
        + "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str42,
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-90.0d) + "'", double43 == (-90.0d));
    org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-90.0d) + "'", double44 == (-90.0d));
    org.junit.Assert.assertNotNull(doubleArray50);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double54 + "' != '" + 2.75d + "'", double54 == 2.75d);
    org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-200.0d) + "'", double55 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double56 + "' != '" + 2.75d + "'", double56 == 2.75d);
    org.junit.Assert.assertTrue("'" + double57 + "' != '" + (-200.0d) + "'", double57 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray63);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[0.0, 10.0, 97.0, 1.0, 1.0]");
  }

  @Test
  public void test1334() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1334");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.lang.String str5 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertNotNull(fieldDataList6);
    org.junit.Assert.assertNotNull(fieldDataList7);
  }

  @Test
  public void test1335() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1335");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (-1), (int) '4');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1336() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1336");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    java.lang.String str9 = quarterlyDouble7.fmtGrowth1Q("");
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    java.lang.String str13 = quarterlyDouble7.fmtGrowth1Q("\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)");
    double double14 = quarterlyDouble7.getQoQ();
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
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-90.0d) + "'", double14 == (-90.0d));
  }

  @Test
  public void test1337() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1337");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)", (-1), (int) ' ');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1338() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1338");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double double8 = quarterlyDouble6.getTtmAvg();
    double double11 = quarterlyDouble6.deltaQ((int) (byte) 10, (int) (short) 100);
    double[] doubleArray17 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    double double19 = quarterlyDouble18.getQseqQ();
    double[] doubleArray20 = quarterlyDouble18.dArr;
    double double22 = quarterlyDouble18.get(10);
    double[] doubleArray23 = quarterlyDouble18.dArr;
    quarterlyDouble6.dArr = doubleArray23;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.5d + "'", double8 == 8.5d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 3600.0d + "'", double19 == 3600.0d);
    org.junit.Assert.assertNotNull(doubleArray20);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-9999.9999d) + "'", double22 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[97.0, 35.0, -1.0, 0.0, 0.0]");
  }

  @Test
  public void test1339() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1339");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) '4', 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1340() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1340");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double double10 = quarterlyDouble6.deltaQ(10, (int) (short) 1);
    double[] doubleArray17 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    double[] doubleArray25 = new double[] { '4', (-1), 100.0d, 3.0d, (byte) 1, 100.0f };
    quarterlyDouble18.dArr = doubleArray25;
    double[] doubleArray27 = quarterlyDouble18.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray27);
    quarterlyDouble6.dArr = doubleArray27;
    java.lang.String str31 = quarterlyDouble6.fmtGrowth1Q("");
    double double33 = quarterlyDouble6.get(0);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray27);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)" + "'", str31,
        "\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)");
    org.junit.Assert.assertTrue("'" + double33 + "' != '" + 52.0d + "'", double33 == 52.0d);
  }

  @Test
  public void test1341() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1341");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 10,
        (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) 'a', (int) (short) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList9 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) 'a', (int) ' ');
    java.lang.Class<?> wildcardClass10 = companyDataList9.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(companyDataList9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test1342() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1342");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 100,
        (int) (short) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (short) -1, (int) '#');
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test1343() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1343");
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
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData14 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) ' ', (int) '#');
    org.junit.Assert.assertNotNull(fieldDataArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNull(fieldData5);
    org.junit.Assert.assertNull(fieldData8);
    org.junit.Assert.assertNull(fieldData11);
    org.junit.Assert.assertNull(fieldData14);
  }

  @Test
  public void test1344() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1344");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double9 = quarterlyDouble8.getQseqQ();
    double double10 = quarterlyDouble8.getTtm();
    double double12 = quarterlyDouble8.get((int) (short) 100);
    double double14 = quarterlyDouble8.get((int) (short) -1);
    java.lang.Class<?> wildcardClass15 = quarterlyDouble8.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-200.0d) + "'", double9 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 11.0d + "'", double10 == 11.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test1345() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1345");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) '4', (int) (byte) 1);
  }

  @Test
  public void test1346() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1346");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 0,
        (int) ' ');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1347() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1347");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(10, (int) (short) 1);
  }

  @Test
  public void test1348() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1348");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.deltaQ((int) (short) 10, 0);
    double double11 = quarterlyDouble6.getQseqQ();
    double[] doubleArray12 = quarterlyDouble6.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray12);
    double[] doubleArray19 = new double[] { 0L, 10.0f, 97.0d, 1.0d, 1.0f };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    quarterlyDouble13.dArr = doubleArray19;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str23 = quarterlyDouble13.fmtGrowth1Q(
          "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-200.0d) + "'", double11 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 10.0, 97.0, 1.0, 1.0]");
  }

  @Test
  public void test1349() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1349");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 1, 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1350() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1350");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 100, (int) 'a');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1351() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1351");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double9 = quarterlyDouble7.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
  }

  @Test
  public void test1352() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1352");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) 'a', (int) (short) 0);
  }

  @Test
  public void test1353() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1353");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getQseqQ();
    double[] doubleArray8 = quarterlyDouble6.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray8);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray8);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray8);
    java.lang.Class<?> wildcardClass12 = quarterlyDouble11.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3600.0d + "'", double7 == 3600.0d);
    org.junit.Assert.assertNotNull(doubleArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(wildcardClass12);
  }

  @Test
  public void test1354() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1354");
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
    double double13 = quarterlyDouble8.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-200.0d) + "'", double11 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-200.0d) + "'", double13 == (-200.0d));
  }

  @Test
  public void test1355() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1355");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double8 = quarterlyDouble7.getTtm();
    java.lang.String str10 = quarterlyDouble7.fmtGrowth4Q("");
    double double11 = quarterlyDouble7.getTtmAvg();
    double double12 = quarterlyDouble7.getTtmAvg();
    double double13 = quarterlyDouble7.getQoQ();
    double double14 = quarterlyDouble7.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      double double17 = quarterlyDouble7.deltaQ((int) (short) -1, (int) (byte) 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 12.0d + "'", double8 == 12.0d);
    org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str10,
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.0d + "'", double11 == 3.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.0d + "'", double12 == 3.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-90.0d) + "'", double13 == (-90.0d));
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 900.0d + "'", double14 == 900.0d);
  }

  @Test
  public void test1356() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1356");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getCompany(
            "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    java.lang.Class<?> wildcardClass2 = oneCompanyDataList1.getClass();
    org.junit.Assert.assertNotNull(oneCompanyDataList1);
    org.junit.Assert.assertNotNull(wildcardClass2);
  }

  @Test
  public void test1357() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1357");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 100, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, 1, (int) '4');
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test1358() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1358");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getQseqQ();
    double double9 = quarterlyDouble7.getTtm();
    double double12 = quarterlyDouble7.deltaQ(1, (int) (byte) 1);
    double double13 = quarterlyDouble7.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-200.0d) + "'", double8 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 11.0d + "'", double9 == 11.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
  }

  @Test
  public void test1359() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1359");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    double[] doubleArray12 = quarterlyDouble8.dArr;
    double double13 = quarterlyDouble8.getQseqQ();
    double double14 = quarterlyDouble8.getTtmAvg();
    double double15 = quarterlyDouble8.getQoQ();
    double[] doubleArray21 = new double[] { 0L, 10.0f, 97.0d, 1.0d, 1.0f };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray21);
    quarterlyDouble8.dArr = doubleArray21;
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 900.0d + "'", double13 == 900.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-90.0d) + "'", double15 == (-90.0d));
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 10.0, 97.0, 1.0, 1.0]");
  }

  @Test
  public void test1360() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1360");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    double double13 = quarterlyDouble8.get((int) (short) -1);
    double double14 = quarterlyDouble8.getQoQ();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9999.9999d) + "'", double13 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-90.0d) + "'", double14 == (-90.0d));
  }

  @Test
  public void test1361() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1361");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 100,
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
  public void test1362() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1362");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double[] doubleArray14 = new double[] { '4', (-1), 100.0d, 3.0d, (byte) 1, 100.0f };
    quarterlyDouble7.dArr = doubleArray14;
    double[] doubleArray16 = quarterlyDouble7.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray16);
    java.lang.String str19 = quarterlyDouble17.fmtGrowth4Q("\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)");
    double[] doubleArray20 = quarterlyDouble17.dArr;
    double[] doubleArray21 = quarterlyDouble17.dArr;
    double double23 = quarterlyDouble17.get(100);
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertEquals(
        "'" + str19 + "' != '"
            + "\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)" + "'",
        str19, "\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
    org.junit.Assert.assertNotNull(doubleArray20);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-9999.9999d) + "'", double23 == (-9999.9999d));
  }

  @Test
  public void test1363() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1363");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    java.lang.String str13 = quarterlyDouble8.fmtGrowth4Q("");
    double double14 = quarterlyDouble8.getTtm();
    double[] doubleArray15 = quarterlyDouble8.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    java.lang.String str18 = quarterlyDouble16.fmtGrowth1Q(
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    double[] doubleArray19 = quarterlyDouble16.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    java.lang.String str22 = quarterlyDouble20.fmtGrowth4Q("\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)");
    double double23 = quarterlyDouble20.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str13,
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 12.0d + "'", double14 == 12.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
        + "\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str18,
        "\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals(
        "'" + str22 + "' != '"
            + "\t\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'",
        str22, "\t\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
  }

  @Test
  public void test1364() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1364");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getCompany(
            "\t\t\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(oneCompanyDataList1);
  }

  @Test
  public void test1365() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1365");
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
    java.lang.Class<?> wildcardClass21 = quarterlyDouble6.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 3.0d + "'", double20 == 3.0d);
    org.junit.Assert.assertNotNull(wildcardClass21);
  }

  @Test
  public void test1366() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1366");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (byte) 10, 0);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1367() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1367");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(10, (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, (int) '#', (int) (short) 0);
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
  public void test1368() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1368");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((-1), (int) (byte) 1);
  }

  @Test
  public void test1370() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1370");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) ' ', 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) '#', (int) '4');
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test1371() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1371");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    java.lang.String str9 = quarterlyDouble7.fmtGrowth1Q("");
    double double10 = quarterlyDouble7.getQoQ();
    double double11 = quarterlyDouble7.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str9,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-90.0d) + "'", double10 == (-90.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 900.0d + "'", double11 == 900.0d);
  }

  @Test
  public void test1372() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1372");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) 1,
        (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, 1, (int) (byte) 100);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test1373() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1373");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.lang.String str3 = companyData1.getTicker();
    java.lang.String str4 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    java.lang.String str6 = companyData1.getTicker();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
  }

  @Test
  public void test1374() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1374");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, 100, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test1375() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1375");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double11 = quarterlyDouble8.deltaQ(10, (int) (short) 0);
    double double12 = quarterlyDouble8.getMostRecent();
    double[] doubleArray18 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    double double20 = quarterlyDouble19.getMostRecent();
    double double23 = quarterlyDouble19.deltaQ((int) (short) 10, 0);
    double double24 = quarterlyDouble19.getQseqQ();
    double[] doubleArray25 = quarterlyDouble19.dArr;
    quarterlyDouble8.dArr = doubleArray25;
    double double27 = quarterlyDouble8.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-200.0d) + "'", double24 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 2.75d + "'", double27 == 2.75d);
  }

  @Test
  public void test1376() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1376");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    java.lang.String str9 = quarterlyDouble7.fmtGrowth4Q(
        "\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    double[] doubleArray10 = quarterlyDouble7.dArr;
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '"
        + "\t\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str9,
        "\t\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
  }

  @Test
  public void test1377() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1377");
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
  public void test1378() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1378");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    double[] doubleArray12 = quarterlyDouble8.dArr;
    double double14 = quarterlyDouble8.get((int) '#');
    double[] doubleArray15 = quarterlyDouble8.dArr;
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
  }

  @Test
  public void test1379() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1379");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    java.lang.String str2 = companyData1.getTicker();
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
        + "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str2,
        "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test1380() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1380");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 0, (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, 10, (int) 'a');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(companyDataList7);
  }

  @Test
  public void test1381() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1381");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.lang.String str5 = companyData1.getTicker();
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
        + "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str2,
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str3 + "' != '"
        + "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str3,
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertEquals("'" + str5 + "' != '"
        + "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str5,
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test1382() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1382");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    java.lang.String str13 = quarterlyDouble8.fmtGrowth4Q("");
    double double14 = quarterlyDouble8.getTtm();
    double[] doubleArray15 = quarterlyDouble8.dArr;
    double[] doubleArray21 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray21);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray21);
    quarterlyDouble8.dArr = doubleArray21;
    double double27 = quarterlyDouble8.deltaQ(0, (-1));
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str13,
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 12.0d + "'", double14 == 12.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
  }

  @Test
  public void test1383() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1383");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    java.lang.String str13 = quarterlyDouble8.fmtGrowth4Q("");
    double double14 = quarterlyDouble8.getQoQ();
    double double15 = quarterlyDouble8.getQseqQ();
    double double16 = quarterlyDouble8.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str13,
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-90.0d) + "'", double14 == (-90.0d));
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 900.0d + "'", double15 == 900.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 900.0d + "'", double16 == 900.0d);
  }

  @Test
  public void test1384() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1384");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(0, 0);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1385() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1385");
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
    double[] doubleArray19 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    double double22 = quarterlyDouble21.getMostRecent();
    double double23 = quarterlyDouble21.getTtmAvg();
    double double24 = quarterlyDouble21.getQseqQ();
    double double25 = quarterlyDouble21.getTtmAvg();
    double double26 = quarterlyDouble21.getQseqQ();
    double[] doubleArray32 = new double[] { 0L, 10.0f, 97.0d, 1.0d, 1.0f };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray32);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray32);
    quarterlyDouble21.dArr = doubleArray32;
    quarterlyDouble9.dArr = doubleArray32;
    double double39 = quarterlyDouble9.deltaQ((int) (short) -1, (int) (short) 1);
    double[] doubleArray46 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble47 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray46);
    double double48 = quarterlyDouble47.getTtm();
    java.lang.String str50 = quarterlyDouble47.fmtGrowth1Q("");
    double double52 = quarterlyDouble47.get(10);
    double[] doubleArray58 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble59 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray58);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble60 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray58);
    double double61 = quarterlyDouble60.getMostRecent();
    double double62 = quarterlyDouble60.getTtmAvg();
    double double63 = quarterlyDouble60.getQseqQ();
    double double64 = quarterlyDouble60.getTtmAvg();
    double[] doubleArray70 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble71 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray70);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble72 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray70);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble73 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray70);
    quarterlyDouble60.dArr = doubleArray70;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble75 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray70);
    quarterlyDouble47.dArr = doubleArray70;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble77 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray70);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble78 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray70);
    quarterlyDouble9.dArr = doubleArray70;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2.75d + "'", double23 == 2.75d);
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-200.0d) + "'", double24 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2.75d + "'", double25 == 2.75d);
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-200.0d) + "'", double26 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray32);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 10.0, 97.0, 1.0, 1.0]");
    org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray46);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double48 + "' != '" + 12.0d + "'", double48 == 12.0d);
    org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str50,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-9999.9999d) + "'", double52 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray58);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-1.0d) + "'", double61 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double62 + "' != '" + 2.75d + "'", double62 == 2.75d);
    org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-200.0d) + "'", double63 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double64 + "' != '" + 2.75d + "'", double64 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray70);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test1386() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1386");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 100, 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1387() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1387");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(0, (int) (byte) -1);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test1388() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1388");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) 'a', (int) (short) 10);
  }

  @Test
  public void test1389() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1389");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(100, (int) (short) 10);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1390() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1390");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t\thi!               :         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test1391() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1391");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) 0, 100);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1392() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1392");
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
    double double22 = quarterlyDouble8.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
  }

  @Test
  public void test1393() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1393");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        (int) (short) -1, (int) 'a');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1394() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1394");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double double10 = quarterlyDouble6.deltaQ(10, (int) (short) 1);
    double double11 = quarterlyDouble6.getTtmAvg();
    double double12 = quarterlyDouble6.getQseqQ();
    double double13 = quarterlyDouble6.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str15 = quarterlyDouble6.fmtGrowth4Q(
          "\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
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
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-200.0d) + "'", double12 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-200.0d) + "'", double13 == (-200.0d));
  }

  @Test
  public void test1395() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1395");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double8 = quarterlyDouble7.getTtmAvg();
    double double9 = quarterlyDouble7.getQoQ();
    double double11 = quarterlyDouble7.get((int) 'a');
    double double12 = quarterlyDouble7.getTtm();
    double double13 = quarterlyDouble7.getTtm();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.0d + "'", double8 == 3.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-90.0d) + "'", double9 == (-90.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 12.0d + "'", double12 == 12.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 12.0d + "'", double13 == 12.0d);
  }

  @Test
  public void test1396() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1396");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)", (int) (short) 10,
        (int) (byte) 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1397() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1397");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 1, (-1));
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
    org.junit.Assert.assertNotNull(companyDataList5);
  }

  @Test
  public void test1398() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1398");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(100, (int) (byte) 100);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test1399() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1399");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getMostRecent();
    double double10 = quarterlyDouble8.getQoQ();
    double double11 = quarterlyDouble8.getTtmAvg();
    java.lang.String str13 = quarterlyDouble8.fmtGrowth4Q(
        "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    double[] doubleArray19 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    double double21 = quarterlyDouble20.getMostRecent();
    double double24 = quarterlyDouble20.deltaQ((int) (short) 10, 0);
    double double25 = quarterlyDouble20.getQseqQ();
    double[] doubleArray26 = quarterlyDouble20.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray26);
    quarterlyDouble8.dArr = doubleArray26;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str30 = quarterlyDouble8.fmtGrowth1Q("\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-90.0d) + "'", double10 == (-90.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.0d + "'", double11 == 3.0d);
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
        + "\t\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str13,
        "\t\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-200.0d) + "'", double25 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray26);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test1400() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1400");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 1, 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1401() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1401");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double[] doubleArray9 = quarterlyDouble7.dArr;
    double double10 = quarterlyDouble7.getQseqQ();
    double[] doubleArray11 = quarterlyDouble7.dArr;
    double double12 = quarterlyDouble7.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-200.0d) + "'", double12 == (-200.0d));
  }

  @Test
  public void test1402() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1402");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    java.lang.String str13 = quarterlyDouble8.fmtGrowth4Q("");
    double double14 = quarterlyDouble8.getQoQ();
    double[] doubleArray20 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray20);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray20);
    double[] doubleArray23 = quarterlyDouble22.dArr;
    quarterlyDouble8.dArr = doubleArray23;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str26 = quarterlyDouble8.fmtGrowth1Q(
          "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str13,
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-90.0d) + "'", double14 == (-90.0d));
    org.junit.Assert.assertNotNull(doubleArray20);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test1403() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1403");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (byte) 100,
          (int) ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test1404() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1404");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    java.lang.String str13 = quarterlyDouble8.fmtGrowth4Q("");
    double double14 = quarterlyDouble8.getTtm();
    java.lang.String str16 = quarterlyDouble8.fmtGrowth4Q("\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)");
    java.lang.String str18 = quarterlyDouble8.fmtGrowth4Q(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
    java.lang.String str20 = quarterlyDouble8.fmtGrowth4Q("\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str13,
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 12.0d + "'", double14 == 12.0d);
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '"
            + "\t\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'",
        str16, "\t\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
        + "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str18,
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals(
        "'" + str20 + "' != '"
            + "\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'",
        str20, "\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test1405() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1405");
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
    double double29 = quarterlyDouble7.getQseqQ();
    double double30 = quarterlyDouble7.getQseqQ();
    double double33 = quarterlyDouble7.deltaQ(10, 10);
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
    org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-200.0d) + "'", double29 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-200.0d) + "'", double30 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
  }

  @Test
  public void test1406() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1406");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 0, 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test1407() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1407");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 1,
        (int) (byte) 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, 0, (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test1408() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1408");
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
    double[] doubleArray13 = quarterlyDouble7.dArr;
    double double14 = quarterlyDouble7.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str16 = quarterlyDouble7.fmtGrowth4Q("");
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
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-200.0d) + "'", double14 == (-200.0d));
  }

  @Test
  public void test1409() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1409");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) 'a', (int) 'a');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1410() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1410");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) '#', (int) (short) 100);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1411() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1411");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double9 = quarterlyDouble8.getTtmAvg();
    double double10 = quarterlyDouble8.getTtm();
    double double11 = quarterlyDouble8.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str13 = quarterlyDouble8.fmtGrowth1Q(
          "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 11.0d + "'", double10 == 11.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 11.0d + "'", double11 == 11.0d);
  }

  @Test
  public void test1412() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1412");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.lang.String str3 = companyData1.getTicker();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '"
        + "\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str3,
        "\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test1414() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1414");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    double double10 = quarterlyDouble8.getQseqQ();
    double[] doubleArray16 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray16);
    double double18 = quarterlyDouble17.getMostRecent();
    double double21 = quarterlyDouble17.deltaQ((int) (short) 10, 0);
    double double22 = quarterlyDouble17.getQseqQ();
    double[] doubleArray23 = quarterlyDouble17.dArr;
    quarterlyDouble8.dArr = doubleArray23;
    double double25 = quarterlyDouble8.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 900.0d + "'", double10 == 900.0d);
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-200.0d) + "'", double22 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-200.0d) + "'", double25 == (-200.0d));
  }

  @Test
  public void test1415() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1415");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (short) 100, 100);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test1416() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1416");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (-1), (int) '#');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1417() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1417");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList2, (int) '4', 100);
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNull(fieldData5);
  }

  @Test
  public void test1418() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1418");
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
    double[] doubleArray29 = quarterlyDouble7.dArr;
    double[] doubleArray30 = quarterlyDouble7.dArr;
    double[] doubleArray37 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble38 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray37);
    java.lang.String str40 = quarterlyDouble38.fmtGrowth1Q("");
    double double41 = quarterlyDouble38.getQseqQ();
    double double42 = quarterlyDouble38.getTtmAvg();
    double[] doubleArray48 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble49 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray48);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble50 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray48);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble51 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray48);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble52 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray48);
    quarterlyDouble38.dArr = doubleArray48;
    quarterlyDouble7.dArr = doubleArray48;
    // The following exception was thrown during execution in test generation
    try {
      double double55 = quarterlyDouble7.getQoQ();
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
    org.junit.Assert.assertNotNull(doubleArray29);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray30);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray37);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str40,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double41 + "' != '" + 900.0d + "'", double41 == 900.0d);
    org.junit.Assert.assertTrue("'" + double42 + "' != '" + 3.0d + "'", double42 == 3.0d);
    org.junit.Assert.assertNotNull(doubleArray48);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test1419() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1419");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)",
        (int) (byte) 100, (int) 'a');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1420() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1420");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double8 = quarterlyDouble7.getTtm();
    double[] doubleArray9 = quarterlyDouble7.dArr;
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 12.0d + "'", double8 == 12.0d);
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
  }

  @Test
  public void test1421() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1421");
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
    double double24 = quarterlyDouble7.getTtm();
    double[] doubleArray30 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray30);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray30);
    double double33 = quarterlyDouble32.getMostRecent();
    double[] doubleArray34 = quarterlyDouble32.dArr;
    double double35 = quarterlyDouble32.getQseqQ();
    double[] doubleArray36 = quarterlyDouble32.dArr;
    quarterlyDouble7.dArr = doubleArray36;
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
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + 11.0d + "'", double24 == 11.0d);
    org.junit.Assert.assertNotNull(doubleArray30);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
    org.junit.Assert.assertNotNull(doubleArray34);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-200.0d) + "'", double35 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray36);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test1422() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1422");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (byte) 10, (int) (short) -1);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1423() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1423");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double[] doubleArray9 = quarterlyDouble7.dArr;
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtm();
    double double12 = quarterlyDouble7.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 11.0d + "'", double11 == 11.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 11.0d + "'", double12 == 11.0d);
  }

  @Test
  public void test1424() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1424");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (-1), (int) (short) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1425() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1425");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test1426() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1426");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      double double9 = quarterlyDouble6.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.75d + "'", double8 == 2.75d);
  }

  @Test
  public void test1427() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1427");
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
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray10);
    double double12 = quarterlyDouble11.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      double double13 = quarterlyDouble11.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
  }

  @Test
  public void test1428() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1428");
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
    double[] doubleArray29 = quarterlyDouble7.dArr;
    double double30 = quarterlyDouble7.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 11.0d + "'", double8 == 11.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 12.0d + "'", double18 == 12.0d);
    org.junit.Assert.assertNotNull(doubleArray24);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray29);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + 2.75d + "'", double30 == 2.75d);
  }

  @Test
  public void test1429() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1429");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 0, (int) (short) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1430() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1430");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double10 = quarterlyDouble7.get((int) (byte) 1);
    double double11 = quarterlyDouble7.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
  }

  @Test
  public void test1431() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1431");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 1,
        (int) (short) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1432() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1432");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) '4', (int) (short) 100);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1433() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1433");
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
  public void test1434() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1434");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test1435() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1435");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\thi!               :         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)", (-1),
        (int) (short) -1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1436() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1436");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(10, (int) (short) 0);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1437() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1437");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 10,
        (-1));
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1438() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1438");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double8 = quarterlyDouble7.getTtmAvg();
    double double9 = quarterlyDouble7.getQoQ();
    double double10 = quarterlyDouble7.getTtmAvg();
    double double13 = quarterlyDouble7.deltaQ((int) (byte) 0, 0);
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.0d + "'", double8 == 3.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-90.0d) + "'", double9 == (-90.0d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
  }

  @Test
  public void test1439() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1439");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    java.lang.String str13 = quarterlyDouble8.fmtGrowth4Q("");
    double double14 = quarterlyDouble8.getTtm();
    double[] doubleArray15 = quarterlyDouble8.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    java.lang.String str18 = quarterlyDouble16.fmtGrowth1Q(
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    double[] doubleArray24 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray24);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray24);
    double double27 = quarterlyDouble26.getMostRecent();
    double double28 = quarterlyDouble26.getTtmAvg();
    double double29 = quarterlyDouble26.getQseqQ();
    double double30 = quarterlyDouble26.getTtmAvg();
    double[] doubleArray36 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray36);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble38 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray36);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray36);
    quarterlyDouble26.dArr = doubleArray36;
    double[] doubleArray41 = quarterlyDouble26.dArr;
    double[] doubleArray47 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble48 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray47);
    double[] doubleArray49 = quarterlyDouble48.dArr;
    double[] doubleArray50 = quarterlyDouble48.dArr;
    quarterlyDouble26.dArr = doubleArray50;
    quarterlyDouble16.dArr = doubleArray50;
    double double54 = quarterlyDouble16.get((int) ' ');
    double double55 = quarterlyDouble16.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str13,
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 12.0d + "'", double14 == 12.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
        + "\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str18,
        "\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray24);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + 2.75d + "'", double28 == 2.75d);
    org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-200.0d) + "'", double29 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + 2.75d + "'", double30 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray36);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray41);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray47);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray49);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray50);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double54 + "' != '" + (-9999.9999d) + "'", double54 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-200.0d) + "'", double55 == (-200.0d));
  }

  @Test
  public void test1440() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1440");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 100, 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1441() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1441");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 1, (int) ' ');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test1442() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1442");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 0, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
    org.junit.Assert.assertNotNull(companyDataList5);
  }

  @Test
  public void test1443() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1443");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double[] doubleArray14 = new double[] { '4', (-1), 100.0d, 3.0d, (byte) 1, 100.0f };
    quarterlyDouble7.dArr = doubleArray14;
    double[] doubleArray16 = quarterlyDouble7.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray16);
    double[] doubleArray18 = quarterlyDouble17.dArr;
    double double21 = quarterlyDouble17.deltaQ((-1), (int) (byte) -1);
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
  }

  @Test
  public void test1444() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1444");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double[] doubleArray14 = new double[] { '4', (-1), 100.0d, 3.0d, (byte) 1, 100.0f };
    quarterlyDouble7.dArr = doubleArray14;
    double[] doubleArray16 = quarterlyDouble7.dArr;
    java.lang.String str18 = quarterlyDouble7.fmtGrowth1Q("hi!");
    double double19 = quarterlyDouble7.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)" + "'", str18,
        "\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)");
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-101.0d) + "'", double19 == (-101.0d));
  }

  @Test
  public void test1445() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1445");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) 'a',
        (int) (byte) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1446() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1446");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double8 = quarterlyDouble7.getTtmAvg();
    double double9 = quarterlyDouble7.getQoQ();
    double[] doubleArray15 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    quarterlyDouble7.dArr = doubleArray15;
    double double21 = quarterlyDouble7.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.0d + "'", double8 == 3.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-90.0d) + "'", double9 == (-90.0d));
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2.75d + "'", double21 == 2.75d);
  }

  @Test
  public void test1447() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1447");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    java.lang.String str13 = quarterlyDouble8.fmtGrowth4Q("");
    double double14 = quarterlyDouble8.getTtm();
    java.lang.String str16 = quarterlyDouble8.fmtGrowth4Q("\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)");
    double double17 = quarterlyDouble8.getQoQ();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str13,
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 12.0d + "'", double14 == 12.0d);
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '"
            + "\t\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'",
        str16, "\t\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-90.0d) + "'", double17 == (-90.0d));
  }

  @Test
  public void test1448() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1448");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray8 = quarterlyDouble7.dArr;
    double double9 = quarterlyDouble7.getQseqQ();
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtm();
    double double12 = quarterlyDouble7.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-200.0d) + "'", double9 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 11.0d + "'", double11 == 11.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.75d + "'", double12 == 2.75d);
  }

  @Test
  public void test1449() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1449");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(1, (int) (byte) 100);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1450() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1450");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double double9 = quarterlyDouble6.get(0);
    double double11 = quarterlyDouble6.get((int) (byte) 10);
    double double12 = quarterlyDouble6.getTtm();
    double double15 = quarterlyDouble6.deltaQ((-1), 1);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str17 = quarterlyDouble6.fmtGrowth4Q(
          "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
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
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 34.0d + "'", double12 == 34.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
  }

  @Test
  public void test1451() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1451");
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
    double double30 = quarterlyDouble29.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 11.0d + "'", double8 == 11.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 12.0d + "'", double18 == 12.0d);
    org.junit.Assert.assertNotNull(doubleArray24);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-200.0d) + "'", double30 == (-200.0d));
  }

  @Test
  public void test1452() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1452");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(0, (int) (short) -1);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test1453() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1453");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getCompany(
            "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(oneCompanyDataList1);
  }

  @Test
  public void test1454() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1454");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    java.lang.String str13 = quarterlyDouble8.fmtGrowth4Q("");
    double double14 = quarterlyDouble8.getTtm();
    java.lang.String str16 = quarterlyDouble8.fmtGrowth4Q("\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)");
    double double17 = quarterlyDouble8.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str13,
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 12.0d + "'", double14 == 12.0d);
    org.junit.Assert.assertEquals(
        "'" + str16 + "' != '"
            + "\t\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'",
        str16, "\t\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 3.0d + "'", double17 == 3.0d);
  }

  @Test
  public void test1455() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1455");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 0, 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1456() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1456");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    java.lang.String str10 = quarterlyDouble8
        .fmtGrowth4Q("\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    java.lang.String str12 = quarterlyDouble8.fmtGrowth1Q(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    double double13 = quarterlyDouble8.getTtmAvg();
    double double14 = quarterlyDouble8.getQseqQ();
    double[] doubleArray21 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray21);
    double[] doubleArray29 = new double[] { '4', (-1), 100.0d, 3.0d, (byte) 1, 100.0f };
    quarterlyDouble22.dArr = doubleArray29;
    double[] doubleArray31 = quarterlyDouble22.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray31);
    double[] doubleArray38 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray38);
    double[] doubleArray40 = quarterlyDouble39.dArr;
    double[] doubleArray41 = quarterlyDouble39.dArr;
    quarterlyDouble32.dArr = doubleArray41;
    quarterlyDouble8.dArr = doubleArray41;
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
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.0d + "'", double13 == 3.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 900.0d + "'", double14 == 900.0d);
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray29);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray31);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray38);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray40);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray41);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test1457() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1457");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 0, (-1));
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test1458() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1458");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 0, 0);
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
  public void test1459() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1459");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) ' ',
        (int) (byte) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1460() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1460");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.deltaQ((int) (short) 10, 0);
    double double11 = quarterlyDouble6.getQseqQ();
    double double12 = quarterlyDouble6.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      double double13 = quarterlyDouble6.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-200.0d) + "'", double11 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 11.0d + "'", double12 == 11.0d);
  }

  @Test
  public void test1461() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1461");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) '4',
        (int) (byte) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1462() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1462");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double11 = quarterlyDouble8.deltaQ(10, (int) (short) 0);
    double[] doubleArray12 = quarterlyDouble8.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray12);
    // The following exception was thrown during execution in test generation
    try {
      double double14 = quarterlyDouble13.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test1463() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1463");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        1, (int) (byte) 100);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1464() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1464");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 0,
        (int) (byte) 1);
    java.lang.Class<?> wildcardClass4 = strList3.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test1465() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1465");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    java.lang.String str13 = quarterlyDouble8.fmtGrowth4Q("");
    double double14 = quarterlyDouble8.getTtm();
    double[] doubleArray15 = quarterlyDouble8.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray15);
    double double19 = quarterlyDouble17.get((int) (short) 100);
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str13,
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 12.0d + "'", double14 == 12.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-9999.9999d) + "'", double19 == (-9999.9999d));
  }

  @Test
  public void test1466() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1466");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.lang.String str4 = companyData1.getTicker();
    java.lang.String str5 = companyData1.getTicker();
    java.lang.String str6 = companyData1.getTicker();
    java.lang.String str7 = companyData1.getTicker();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
  }

  @Test
  public void test1467() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1467");
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
    double double30 = quarterlyDouble7.get((int) '4');
    double double31 = quarterlyDouble7.getMostRecent();
    double double32 = quarterlyDouble7.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 11.0d + "'", double8 == 11.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 12.0d + "'", double18 == 12.0d);
    org.junit.Assert.assertNotNull(doubleArray24);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-9999.9999d) + "'", double30 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double32 + "' != '" + 11.0d + "'", double32 == 11.0d);
  }

  @Test
  public void test1468() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1468");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getQseqQ();
    double[] doubleArray14 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    double double17 = quarterlyDouble16.getTtm();
    double[] doubleArray24 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray24);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray24);
    double double27 = quarterlyDouble26.getTtm();
    double[] doubleArray33 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray33);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble35 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray33);
    quarterlyDouble26.dArr = doubleArray33;
    quarterlyDouble16.dArr = doubleArray33;
    double double39 = quarterlyDouble16.get((int) '4');
    double[] doubleArray40 = quarterlyDouble16.dArr;
    quarterlyDouble7.dArr = doubleArray40;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3600.0d + "'", double8 == 3600.0d);
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 11.0d + "'", double17 == 11.0d);
    org.junit.Assert.assertNotNull(doubleArray24);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 12.0d + "'", double27 == 12.0d);
    org.junit.Assert.assertNotNull(doubleArray33);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-9999.9999d) + "'", double39 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray40);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test1469() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1469");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 1, 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test1470() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1470");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 100, (int) (short) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test1471() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1471");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getTtm();
    double double8 = quarterlyDouble6.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 11.0d + "'", double7 == 11.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-200.0d) + "'", double8 == (-200.0d));
  }

  @Test
  public void test1472() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1472");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) 1,
        (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test1473() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1473");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t\t\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test1474() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1474");
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
    double double34 = quarterlyDouble33.getTtm();
    double double36 = quarterlyDouble33.get((-1));
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
    org.junit.Assert.assertTrue("'" + double34 + "' != '" + 11.0d + "'", double34 == 11.0d);
    org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-9999.9999d) + "'", double36 == (-9999.9999d));
  }

  @Test
  public void test1475() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1475");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    java.lang.String str9 = quarterlyDouble7.fmtGrowth1Q("");
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double[] doubleArray12 = quarterlyDouble7.dArr;
    double[] doubleArray19 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    double double21 = quarterlyDouble20.getTtmAvg();
    double double22 = quarterlyDouble20.getQoQ();
    double double23 = quarterlyDouble20.getTtmAvg();
    java.lang.String str25 = quarterlyDouble20.fmtGrowth1Q(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    double double26 = quarterlyDouble20.getQoQ();
    double double27 = quarterlyDouble20.getQoQ();
    double[] doubleArray33 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray33);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble35 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray33);
    double double36 = quarterlyDouble35.getMostRecent();
    double double37 = quarterlyDouble35.getTtmAvg();
    double double38 = quarterlyDouble35.getQseqQ();
    double double39 = quarterlyDouble35.getTtmAvg();
    double double40 = quarterlyDouble35.getQseqQ();
    double[] doubleArray46 = new double[] { 0L, 10.0f, 97.0d, 1.0d, 1.0f };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble47 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray46);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble48 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray46);
    quarterlyDouble35.dArr = doubleArray46;
    quarterlyDouble20.dArr = doubleArray46;
    quarterlyDouble7.dArr = doubleArray46;
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str9,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 900.0d + "'", double10 == 900.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.0d + "'", double11 == 3.0d);
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 3.0d + "'", double21 == 3.0d);
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-90.0d) + "'", double22 == (-90.0d));
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 3.0d + "'", double23 == 3.0d);
    org.junit.Assert.assertEquals("'" + str25 + "' != '"
        + "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str25,
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-90.0d) + "'", double26 == (-90.0d));
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-90.0d) + "'", double27 == (-90.0d));
    org.junit.Assert.assertNotNull(doubleArray33);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-1.0d) + "'", double36 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double37 + "' != '" + 2.75d + "'", double37 == 2.75d);
    org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-200.0d) + "'", double38 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double39 + "' != '" + 2.75d + "'", double39 == 2.75d);
    org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-200.0d) + "'", double40 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray46);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 10.0, 97.0, 1.0, 1.0]");
  }

  @Test
  public void test1476() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1476");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 1, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
  }

  @Test
  public void test1478() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1478");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str27 = quarterlyDouble7.fmtGrowth1Q(
          "\t\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
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
  }

  @Test
  public void test1479() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1479");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double double10 = quarterlyDouble6.deltaQ(10, (int) (short) 1);
    double double12 = quarterlyDouble6.get((int) (byte) 10);
    double double15 = quarterlyDouble6.deltaQ((int) (short) 1, 0);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
  }

  @Test
  public void test1480() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1480");
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
    java.lang.String str22 = quarterlyDouble17.fmtGrowth4Q(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 103.0d + "'", double18 == 103.0d);
    org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\t                  :        103.00 M (Seq= -101.00% : QoQ= -101.00%)" + "'", str20,
        "\t                  :        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
    org.junit.Assert.assertEquals("'" + str22 + "' != '"
        + "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)"
        + "'", str22,
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
  }

  @Test
  public void test1481() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1481");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) 'a', 10);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test1482() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1482");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 1, (int) (byte) 100);
  }

  @Test
  public void test1483() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1483");
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
    double double29 = quarterlyDouble7.getQseqQ();
    double double30 = quarterlyDouble7.getTtmAvg();
    double double31 = quarterlyDouble7.getTtmAvg();
    java.lang.Class<?> wildcardClass32 = quarterlyDouble7.getClass();
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
    org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-200.0d) + "'", double29 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + 2.75d + "'", double30 == 2.75d);
    org.junit.Assert.assertTrue("'" + double31 + "' != '" + 2.75d + "'", double31 == 2.75d);
    org.junit.Assert.assertNotNull(wildcardClass32);
  }

  @Test
  public void test1484() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1484");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double double9 = quarterlyDouble6.get(0);
    double double11 = quarterlyDouble6.get((int) (byte) 10);
    double double12 = quarterlyDouble6.getTtm();
    double double13 = quarterlyDouble6.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 34.0d + "'", double12 == 34.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.5d + "'", double13 == 8.5d);
  }

  @Test
  public void test1485() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1485");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.lang.String str4 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList5, (int) '#', (int) (byte) 10);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList5, (int) (short) 1, 0);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertNull(fieldData8);
    org.junit.Assert.assertNull(fieldData11);
  }

  @Test
  public void test1486() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1486");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.lang.String str4 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertEquals("'" + str4 + "' != '"
        + "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str4,
        "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(fieldDataList5);
  }

  @Test
  public void test1487() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1487");
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
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray31);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble35 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray31);
    double double36 = quarterlyDouble35.getTtmAvg();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str38 = quarterlyDouble35.fmtGrowth4Q("hi!");
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
    org.junit.Assert.assertTrue("'" + double36 + "' != '" + 2.75d + "'", double36 == 2.75d);
  }

  @Test
  public void test1488() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests2.test1488");
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
    double[] doubleArray29 = quarterlyDouble7.dArr;
    double[] doubleArray30 = quarterlyDouble7.dArr;
    // The following exception was thrown during execution in test generation
    try {
      double double33 = quarterlyDouble7.deltaQ((-1), (int) (short) 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
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
    org.junit.Assert.assertNotNull(doubleArray29);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray30);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }
}
