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
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(100, (int) (byte) 100);
  }

  @Test
  public void test0502() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0502");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double9 = quarterlyDouble7.get(1);
    double double10 = quarterlyDouble7.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 34.0d + "'", double10 == 34.0d);
  }

  @Test
  public void test0503() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0503");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double[] doubleArray8 = quarterlyDouble6.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str10 = quarterlyDouble6.fmtGrowth4Q("\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)");
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
  }

  @Test
  public void test0504() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0504");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    java.lang.String str13 = quarterlyDouble8.fmtGrowth4Q("");
    double double16 = quarterlyDouble8.deltaQ((-1), (int) (byte) 1);
    double[] doubleArray22 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray22);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray22);
    quarterlyDouble8.dArr = doubleArray22;
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str13,
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray22);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[97.0, 35.0, -1.0, 0.0, 0.0]");
  }

  @Test
  public void test0505() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0505");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double8 = quarterlyDouble7.getTtmAvg();
    double double9 = quarterlyDouble7.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.0d + "'", double8 == 3.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.0d + "'", double9 == 3.0d);
  }

  @Test
  public void test0506() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0506");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getCompany(
            "\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(oneCompanyDataList1);
  }

  @Test
  public void test0507() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0507");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double11 = quarterlyDouble8.deltaQ(10, (int) (short) 0);
    double double13 = quarterlyDouble8.get(10);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9999.9999d) + "'", double13 == (-9999.9999d));
  }

  @Test
  public void test0508() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0508");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 100, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test0509() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0509");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (short) 0, (int) '4');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0510() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0510");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) '4', (int) (short) -1);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0511() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0511");
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
    double[] doubleArray32 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray32);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray32);
    double double35 = quarterlyDouble34.getMostRecent();
    double double36 = quarterlyDouble34.getTtmAvg();
    double double37 = quarterlyDouble34.getQseqQ();
    double double38 = quarterlyDouble34.getTtmAvg();
    double[] doubleArray44 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble45 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray44);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble46 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray44);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble47 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray44);
    quarterlyDouble34.dArr = doubleArray44;
    double[] doubleArray49 = quarterlyDouble34.dArr;
    double[] doubleArray50 = quarterlyDouble34.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble51 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray50);
    quarterlyDouble6.dArr = doubleArray50;
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
    org.junit.Assert.assertNotNull(doubleArray32);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double36 + "' != '" + 2.75d + "'", double36 == 2.75d);
    org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-200.0d) + "'", double37 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double38 + "' != '" + 2.75d + "'", double38 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray44);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray49);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray50);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0512() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0512");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    java.lang.String str9 = quarterlyDouble7.fmtGrowth1Q("");
    double double10 = quarterlyDouble7.getQseqQ();
    double double13 = quarterlyDouble7.deltaQ((int) 'a', 100);
    double double14 = quarterlyDouble7.getMostRecent();
    double double15 = quarterlyDouble7.getTtm();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str9,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 900.0d + "'", double10 == 900.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 12.0d + "'", double15 == 12.0d);
  }

  @Test
  public void test0513() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0513");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (-1), 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0514() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0514");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 1, (int) 'a');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0515() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0515");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        (int) (short) 1, (int) (short) 100);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0516() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0516");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getCompany("\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)");
    org.junit.Assert.assertNotNull(oneCompanyDataList1);
  }

  @Test
  public void test0517() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0517");
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
      double double22 = quarterlyDouble19.deltaQ(0, (int) (short) 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
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
  public void test0518() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0518");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (byte) 0, (int) (short) 0);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0519() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0519");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(0, (int) ' ');
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0520() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0520");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double10 = quarterlyDouble7.deltaQ((int) (byte) 1, (int) (byte) 0);
    java.lang.String str12 = quarterlyDouble7
        .fmtGrowth1Q("\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    double double13 = quarterlyDouble7.getMostRecent();
    double double14 = quarterlyDouble7.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
        + "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str12,
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
  }

  @Test
  public void test0521() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0521");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 0, (int) (short) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0522() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0522");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(10, (int) (byte) 0);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0523() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0523");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 100, 100);
  }

  @Test
  public void test0524() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0524");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 0, (int) (byte) 1);
  }

  @Test
  public void test0525() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0525");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double8 = quarterlyDouble7.getTtmAvg();
    double double9 = quarterlyDouble7.getQoQ();
    double double10 = quarterlyDouble7.getTtmAvg();
    double double12 = quarterlyDouble7.get(0);
    java.lang.String str14 = quarterlyDouble7
        .fmtGrowth4Q("\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    double[] doubleArray15 = quarterlyDouble7.dArr;
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
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
  }

  @Test
  public void test0526() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0526");
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
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-200.0d) + "'", double12 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0527() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0527");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
    java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1,
        fieldDataArray0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) 'a', (int) (short) 10);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (-1), (int) 'a');
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (byte) 100, 1);
    org.junit.Assert.assertNotNull(fieldDataArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNull(fieldData5);
    org.junit.Assert.assertNull(fieldData8);
    org.junit.Assert.assertNull(fieldData11);
  }

  @Test
  public void test0528() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0528");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double10 = quarterlyDouble7.deltaQ((int) (byte) 1, (int) (byte) 0);
    double double11 = quarterlyDouble7.getQoQ();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-90.0d) + "'", double11 == (-90.0d));
  }

  @Test
  public void test0529() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0529");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
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
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0530() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0530");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str23 = quarterlyDouble8
          .fmtGrowth4Q("\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
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
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
  }

  @Test
  public void test0531() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0531");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    double double10 = quarterlyDouble8.getQseqQ();
    double double11 = quarterlyDouble8.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 900.0d + "'", double10 == 900.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 900.0d + "'", double11 == 900.0d);
  }

  @Test
  public void test0532() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0532");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) -1, 0);
  }

  @Test
  public void test0533() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0533");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        0, 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0534() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0534");
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
    // The following exception was thrown during execution in test generation
    try {
      double double16 = quarterlyDouble9.deltaQ((int) (byte) 0, (int) (byte) 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
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
  }

  @Test
  public void test0535() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0535");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 1,
        (int) '#');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0536() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0536");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) -1,
        (int) (byte) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0537() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0537");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 0,
        (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0538() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0538");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getCompany(
            "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(oneCompanyDataList1);
  }

  @Test
  public void test0539() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0539");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (short) -1, (int) '4');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0540() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0540");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double double8 = quarterlyDouble6.getQseqQ();
    java.lang.Class<?> wildcardClass9 = quarterlyDouble6.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-200.0d) + "'", double8 == (-200.0d));
    org.junit.Assert.assertNotNull(wildcardClass9);
  }

  @Test
  public void test0541() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0541");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(10, (-1));
  }

  @Test
  public void test0542() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0542");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double10 = quarterlyDouble7.deltaQ((int) (byte) 1, (int) (byte) 0);
    java.lang.String str12 = quarterlyDouble7
        .fmtGrowth1Q("\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    double double13 = quarterlyDouble7.getMostRecent();
    double[] doubleArray19 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    double double22 = quarterlyDouble21.getMostRecent();
    double double23 = quarterlyDouble21.getTtmAvg();
    double double24 = quarterlyDouble21.getQseqQ();
    double double25 = quarterlyDouble21.getTtmAvg();
    double[] doubleArray31 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray31);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray31);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray31);
    quarterlyDouble21.dArr = doubleArray31;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray31);
    quarterlyDouble7.dArr = doubleArray31;
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
        + "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str12,
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2.75d + "'", double23 == 2.75d);
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-200.0d) + "'", double24 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + 2.75d + "'", double25 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray31);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0543() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0543");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getMostRecent();
    double double10 = quarterlyDouble8.getTtmAvg();
    double double11 = quarterlyDouble8.getQoQ();
    java.lang.String str13 = quarterlyDouble8.fmtGrowth1Q("");
    java.lang.String str15 = quarterlyDouble8.fmtGrowth1Q("\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-90.0d) + "'", double11 == (-90.0d));
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str13,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '"
            + "\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'",
        str15, "\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test0544() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0544");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) -1,
        (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (byte) -1, (int) (byte) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(companyDataList7);
  }

  @Test
  public void test0545() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0545");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(10, (int) (byte) 100);
  }

  @Test
  public void test0546() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0546");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)", (int) '#', (int) (byte) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0547() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0547");
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
  public void test0548() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0548");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double[] doubleArray14 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    double[] doubleArray16 = quarterlyDouble15.dArr;
    double double18 = quarterlyDouble15.get(0);
    double double20 = quarterlyDouble15.get((int) (byte) 10);
    double double21 = quarterlyDouble15.getTtm();
    double[] doubleArray27 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray27);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray27);
    double double30 = quarterlyDouble29.getMostRecent();
    double double31 = quarterlyDouble29.getTtmAvg();
    double double32 = quarterlyDouble29.getQseqQ();
    double double33 = quarterlyDouble29.getTtmAvg();
    double[] doubleArray34 = quarterlyDouble29.dArr;
    quarterlyDouble15.dArr = doubleArray34;
    quarterlyDouble7.dArr = doubleArray34;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str38 = quarterlyDouble7.fmtGrowth4Q(
          "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-9999.9999d) + "'", double20 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 34.0d + "'", double21 == 34.0d);
    org.junit.Assert.assertNotNull(doubleArray27);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double31 + "' != '" + 2.75d + "'", double31 == 2.75d);
    org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-200.0d) + "'", double32 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double33 + "' != '" + 2.75d + "'", double33 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray34);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0549() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0549");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
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
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
  }

  @Test
  public void test0550() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0550");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    java.lang.String str9 = quarterlyDouble7.fmtGrowth1Q("");
    double double10 = quarterlyDouble7.getQoQ();
    double double13 = quarterlyDouble7.deltaQ((int) ' ', (int) (short) 10);
    double double16 = quarterlyDouble7.deltaQ((int) (short) 10, (int) (short) 100);
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str9,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-90.0d) + "'", double10 == (-90.0d));
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
  }

  @Test
  public void test0551() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0551");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 0, (int) '#');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0552() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0552");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double8 = quarterlyDouble6.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-200.0d) + "'", double8 == (-200.0d));
  }

  @Test
  public void test0553() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0553");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) (byte) 0, (int) '#');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0554() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0554");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) -1, 0);
  }

  @Test
  public void test0555() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0555");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.deltaQ((int) (short) 10, 0);
    double double11 = quarterlyDouble6.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str13 = quarterlyDouble6.fmtGrowth1Q("\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)");
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
  }

  @Test
  public void test0556() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0556");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) ' ',
        (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0557() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0557");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (-1), (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) '4', (int) (short) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList9 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, 10, (int) (short) -1);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(companyDataList9);
  }

  @Test
  public void test0558() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0558");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getMostRecent();
    double double10 = quarterlyDouble8.getTtmAvg();
    java.lang.String str12 = quarterlyDouble8
        .fmtGrowth1Q("\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
        + "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str12,
        "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test0559() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0559");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)", (int) ' ', (int) (short) 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0560() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0560");
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
  public void test0561() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0561");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.lang.String str4 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    java.lang.String str6 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList7);
  }

  @Test
  public void test0562() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0562");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) -1,
        (int) '#');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0563() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0563");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 10,
        (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, 100, 0);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test0564() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0564");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.lang.String str2 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    java.lang.Class<?> wildcardClass6 = fieldDataList5.getClass();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test0565() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0565");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) -1,
        (int) 'a');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0566() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0566");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) (short) 1, (int) (byte) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0567() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0567");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", 1,
        (int) 'a');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0568() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0568");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str8 = quarterlyDouble6
          .fmtGrowth4Q("\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
  }

  @Test
  public void test0569() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0569");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList0 = null;
    // The following exception was thrown during execution in test generation
    try {
      net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
          .getFieldData(fieldDataList0, (int) (byte) 100, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0570() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0570");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (byte) -1, (int) (short) 100);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0571() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0571");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) ' ', 0);
  }

  @Test
  public void test0572() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0572");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 0, (int) (short) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0573() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0573");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 0, (int) (short) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0574() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0574");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 100, (int) (byte) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0575() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0575");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, 10, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0576() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0576");
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
    double double16 = quarterlyDouble8.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str13,
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-90.0d) + "'", double14 == (-90.0d));
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 900.0d + "'", double15 == 900.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.0d + "'", double16 == 3.0d);
  }

  @Test
  public void test0577() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0577");
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
  public void test0578() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0578");
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
    double double44 = quarterlyDouble7.getQseqQ();
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
    org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-200.0d) + "'", double44 == (-200.0d));
  }

  @Test
  public void test0579() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0579");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(10, 0);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0580() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0580");
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
      double double14 = quarterlyDouble7.deltaQ((int) (short) 0, (int) 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
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
  public void test0581() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0581");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) '#', (int) '#');
  }

  @Test
  public void test0582() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0582");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((-1), 100);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0583() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0583");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(100, (int) (byte) 10);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0584() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0584");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    java.lang.String str9 = quarterlyDouble7.fmtGrowth1Q("");
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double double14 = quarterlyDouble7.deltaQ((int) (short) 0, 0);
    java.lang.Class<?> wildcardClass15 = quarterlyDouble7.getClass();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str9,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 900.0d + "'", double10 == 900.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.0d + "'", double11 == 3.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertNotNull(wildcardClass15);
  }

  @Test
  public void test0585() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0585");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) -1, 100);
  }

  @Test
  public void test0586() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0586");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 100,
        (int) (byte) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0587() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0587");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) '#', 100);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0588() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0588");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    java.lang.String str9 = quarterlyDouble7.fmtGrowth1Q("");
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtmAvg();
    double[] doubleArray12 = quarterlyDouble7.dArr;
    java.lang.String str14 = quarterlyDouble7.fmtGrowth1Q(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    java.lang.String str16 = quarterlyDouble7
        .fmtGrowth4Q("\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
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
    org.junit.Assert.assertEquals("'" + str16 + "' != '"
        + "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str16,
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test0589() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0589");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) -1,
        (int) '4');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0590() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0590");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 100, 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0591() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0591");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) 1,
        (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
  }

  @Test
  public void test0592() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0592");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.lang.String str5 = companyData1.getTicker();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
  }

  @Test
  public void test0593() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0593");
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
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray12);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0]");
  }

  @Test
  public void test0594() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0594");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getCompany("\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(oneCompanyDataList1);
  }

  @Test
  public void test0595() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0595");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) 100,
        (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0596() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0596");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 100, 100);
  }

  @Test
  public void test0597() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0597");
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
      double double27 = quarterlyDouble24.deltaQ((int) (byte) 1, (int) (byte) 100);
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
  public void test0598() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0598");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 100, 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0599() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0599");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) '#', (int) ' ');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0600() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0600");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) ' ',
        (int) (short) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0601() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0601");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) '#', (int) (short) 0);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0602() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0602");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)", (int) (short) 100, 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0603() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0603");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) ' ', 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) '4', 100);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test0604() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0604");
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
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData14 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (-1), 1);
    org.junit.Assert.assertNotNull(fieldDataArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNull(fieldData5);
    org.junit.Assert.assertNull(fieldData8);
    org.junit.Assert.assertNull(fieldData11);
    org.junit.Assert.assertNull(fieldData14);
  }

  @Test
  public void test0605() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0605");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 0, 10);
  }

  @Test
  public void test0606() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0606");
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
      java.lang.String str24 = quarterlyDouble7.fmtGrowth1Q(
          "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
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
  public void test0607() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0607");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) 10,
        (int) (short) 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, 100, (int) (short) -1);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test0608() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0608");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) -1, (int) (short) 100);
  }

  @Test
  public void test0609() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0609");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray8 = quarterlyDouble7.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str10 = quarterlyDouble7.fmtGrowth4Q(
          "\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
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
  public void test0610() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0610");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 10,
        (int) (short) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
  }

  @Test
  public void test0611() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0611");
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
    // The following exception was thrown during execution in test generation
    try {
      double double26 = quarterlyDouble6.deltaQ(0, (int) '4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 12.0d + "'", double20 == 12.0d);
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
  }

  @Test
  public void test0612() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0612");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    double double12 = quarterlyDouble8.getMostRecent();
    double double13 = quarterlyDouble8.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.0d + "'", double13 == 3.0d);
  }

  @Test
  public void test0613() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0613");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)", (int) (byte) 0, (int) 'a');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0614() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0614");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    java.lang.String str13 = quarterlyDouble8.fmtGrowth4Q("");
    double double16 = quarterlyDouble8.deltaQ((-1), (int) (byte) 1);
    double double18 = quarterlyDouble8.get((int) (byte) -1);
    double double20 = quarterlyDouble8.get((int) (short) 0);
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str13,
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-9999.9999d) + "'", double18 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
  }

  @Test
  public void test0615() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0615");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (byte) 0, (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, 10, (int) (byte) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList2);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList5);
    org.junit.Assert.assertNotNull(manyCompanyDataList6);
  }

  @Test
  public void test0616() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0616");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    java.lang.String str2 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData6 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList3, (int) (byte) 10, (int) (byte) 0);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Class<?> wildcardClass7 = fieldData6.getClass();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
        + "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str2,
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNull(fieldData6);
  }

  @Test
  public void test0617() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0617");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (short) 100, (int) (short) 0);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0618() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0618");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (byte) 1,
          (int) '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0619() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0619");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double9 = quarterlyDouble8.getTtmAvg();
    double double10 = quarterlyDouble8.getTtm();
    double double11 = quarterlyDouble8.getTtmAvg();
    double[] doubleArray12 = quarterlyDouble8.dArr;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 11.0d + "'", double10 == 11.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0620() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0620");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      double double11 = quarterlyDouble7.deltaQ((int) (short) 0, (int) (byte) 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 11.0d + "'", double8 == 11.0d);
  }

  @Test
  public void test0621() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0621");
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
    double double23 = quarterlyDouble6.get(10);
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
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-9999.9999d) + "'", double23 == (-9999.9999d));
  }

  @Test
  public void test0622() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0622");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 0, (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, 1, (-1));
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList9 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (byte) 100, 0);
    java.lang.Class<?> wildcardClass10 = strList3.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(companyDataList9);
    org.junit.Assert.assertNotNull(wildcardClass10);
  }

  @Test
  public void test0623() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0623");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str9 = quarterlyDouble7.fmtGrowth4Q(
          "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
  }

  @Test
  public void test0624() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0624");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
    java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1,
        fieldDataArray0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (short) 10, (int) '4');
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) 'a', (int) (short) 1);
    org.junit.Assert.assertNotNull(fieldDataArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNull(fieldData5);
    org.junit.Assert.assertNull(fieldData8);
  }

  @Test
  public void test0625() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0625");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 10, 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0626() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0626");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.lang.String str3 = companyData1.getTicker();
    java.lang.String str4 = companyData1.getTicker();
    java.lang.String str5 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertNotNull(fieldDataList6);
  }

  @Test
  public void test0627() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0627");
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
    double double26 = quarterlyDouble7.deltaQ((int) (short) 100, (int) (byte) 10);
    // The following exception was thrown during execution in test generation
    try {
      double double27 = quarterlyDouble7.getQoQ();
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
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
  }

  @Test
  public void test0628() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0628");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    java.lang.String str9 = quarterlyDouble7.fmtGrowth1Q("");
    double double10 = quarterlyDouble7.getQseqQ();
    double double13 = quarterlyDouble7.deltaQ((int) 'a', 100);
    double double16 = quarterlyDouble7.deltaQ((int) (byte) 1, 1);
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str9,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 900.0d + "'", double10 == 900.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
  }

  @Test
  public void test0629() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0629");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 0, 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (byte) 1, 0);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test0630() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0630");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray8 = quarterlyDouble7.dArr;
    double double9 = quarterlyDouble7.getQseqQ();
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
    org.junit.Assert.assertNotNull(doubleArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-200.0d) + "'", double9 == (-200.0d));
  }

  @Test
  public void test0631() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0631");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(100, 0);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0632() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0632");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) 0, (int) '4');
    java.lang.Class<?> wildcardClass3 = strList2.getClass();
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(wildcardClass3);
  }

  @Test
  public void test0633() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0633");
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
    double double28 = quarterlyDouble7.getTtmAvg();
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
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + 2.75d + "'", double28 == 2.75d);
  }

  @Test
  public void test0634() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0634");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (short) 0,
          (int) (short) 1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0635() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0635");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (byte) 10, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0636() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0636");
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
    double double22 = quarterlyDouble19.deltaQ(10, (int) '#');
    // The following exception was thrown during execution in test generation
    try {
      double double23 = quarterlyDouble19.getQoQ();
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
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
  }

  @Test
  public void test0637() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0637");
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
    double double21 = quarterlyDouble16.getTtm();
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
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 12.0d + "'", double21 == 12.0d);
  }

  @Test
  public void test0638() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0638");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str14 = quarterlyDouble8.fmtGrowth4Q("\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-200.0d) + "'", double9 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 11.0d + "'", double10 == 11.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
  }

  @Test
  public void test0639() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0639");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray7);
    double[] doubleArray9 = quarterlyDouble8.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str11 = quarterlyDouble8
          .fmtGrowth1Q("\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[97.0, 35.0, -1.0, 0.0, 0.0]");
  }

  @Test
  public void test0640() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0640");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 100, (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0641() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0641");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 10, (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test0642() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0642");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) -1,
        (int) 'a');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
  }

  @Test
  public void test0643() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0643");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray7);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray7);
    double double10 = quarterlyDouble9.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      double double11 = quarterlyDouble9.getQoQ();
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
  }

  @Test
  public void test0644() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0644");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (-1), 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
  }

  @Test
  public void test0645() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0645");
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
    double double15 = quarterlyDouble9.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 34.0d + "'", double14 == 34.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 8.5d + "'", double15 == 8.5d);
  }

  @Test
  public void test0646() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0646");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) 10, 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) '4', (int) (short) 100);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test0647() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0647");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 1, 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0648() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0648");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    java.lang.String str9 = quarterlyDouble7.fmtGrowth1Q("");
    double double10 = quarterlyDouble7.getTtmAvg();
    double double11 = quarterlyDouble7.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str9,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
  }

  @Test
  public void test0649() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0649");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (short) 100,
        (int) (byte) -1);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0650() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0650");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)", (int) 'a', 100);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0651() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0651");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) -1,
        (int) (byte) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0652() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0652");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 1,
        (int) (short) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0653() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0653");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) '4', (int) ' ');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0654() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0654");
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
    double double32 = quarterlyDouble29.deltaQ((int) (byte) 100, (int) (byte) 10);
    double double35 = quarterlyDouble29.deltaQ((int) '4', (int) 'a');
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 11.0d + "'", double8 == 11.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 12.0d + "'", double18 == 12.0d);
    org.junit.Assert.assertNotNull(doubleArray24);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
  }

  @Test
  public void test0655() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0655");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getCompany(
            "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(oneCompanyDataList1);
  }

  @Test
  public void test0656() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0656");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 10,
        (int) (short) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, 0, 1);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
    org.junit.Assert.assertNotNull(companyDataList7);
  }

  @Test
  public void test0657() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0657");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 0,
        (int) (byte) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0658() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0658");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 1, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
  }

  @Test
  public void test0659() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0659");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 0, (-1));
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
  }

  @Test
  public void test0660() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0660");
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
    // The following exception was thrown during execution in test generation
    try {
      double double14 = quarterlyDouble9.deltaQ((int) (short) -1, (int) '#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-200.0d) + "'", double11 == (-200.0d));
  }

  @Test
  public void test0661() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0661");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) -1,
        (int) 'a');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) 'a', (int) '4');
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
    org.junit.Assert.assertNotNull(companyDataList7);
  }

  @Test
  public void test0662() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0662");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (byte) 0, (int) (byte) -1);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0663() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0663");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) -1,
        (int) ' ');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0664() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0664");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str8 = quarterlyDouble6.fmtGrowth1Q(
          "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
  }

  @Test
  public void test0665() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0665");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test0666() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0666");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) 1, (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0667() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0667");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList4);
  }

  @Test
  public void test0668() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0668");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)", (int) ' ', 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0669() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0669");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getCompany(
            "\t\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(oneCompanyDataList1);
  }

  @Test
  public void test0670() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0670");
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
    // The following exception was thrown during execution in test generation
    try {
      double double29 = quarterlyDouble7.getQoQ();
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
  public void test0671() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0671");
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
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData14 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, 1, (int) (short) 100);
    org.junit.Assert.assertNotNull(fieldDataArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNull(fieldData5);
    org.junit.Assert.assertNull(fieldData8);
    org.junit.Assert.assertNull(fieldData11);
    org.junit.Assert.assertNull(fieldData14);
  }

  @Test
  public void test0672() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0672");
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
    double double34 = quarterlyDouble7.get((int) (short) 1);
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
    org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1.0d) + "'", double34 == (-1.0d));
  }

  @Test
  public void test0673() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0673");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\thi!               :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)", (int) ' ', (int) '#');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0674() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0674");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (byte) 1, (-1));
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0675() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0675");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 1, 0);
  }

  @Test
  public void test0676() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0676");
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
    double double20 = quarterlyDouble6.getMostRecent();
    double double21 = quarterlyDouble6.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 3.0d + "'", double21 == 3.0d);
  }

  @Test
  public void test0677() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0677");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) 0,
        (int) (short) -1);
    java.lang.Class<?> wildcardClass4 = strList3.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test0678() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0678");
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
      java.lang.String str13 = quarterlyDouble8.fmtGrowth1Q("\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
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
  public void test0679() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0679");
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
    double double25 = quarterlyDouble7.getTtm();
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
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + 109.0d + "'", double25 == 109.0d);
  }

  @Test
  public void test0680() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0680");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double[] doubleArray9 = quarterlyDouble7.dArr;
    double double11 = quarterlyDouble7.get((int) '#');
    double double13 = quarterlyDouble7.get((int) (short) 100);
    double double14 = quarterlyDouble7.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertNotNull(doubleArray9);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9999.9999d) + "'", double13 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-200.0d) + "'", double14 == (-200.0d));
  }

  @Test
  public void test0681() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0681");
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
    double double39 = quarterlyDouble9.deltaQ((int) '4', (int) '#');
    double double40 = quarterlyDouble9.getQseqQ();
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
    org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-89.69072164948454d) + "'", double40 == (-89.69072164948454d));
  }

  @Test
  public void test0683() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0683");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) '4',
        (int) (short) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0684() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0684");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 10, (int) (short) 0);
  }

  @Test
  public void test0685() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0685");
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
    double double32 = quarterlyDouble6.deltaQ((int) 'a', (int) (short) 100);
    double double33 = quarterlyDouble6.getTtm();
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
    org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    org.junit.Assert.assertTrue("'" + double33 + "' != '" + 12.0d + "'", double33 == 12.0d);
  }

  @Test
  public void test0686() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0686");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) ' ', (int) ' ');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (byte) 10, (int) (short) 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList9 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) '4', 1);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(companyDataList9);
  }

  @Test
  public void test0687() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0687");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
    java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1,
        fieldDataArray0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) 'a', (int) (short) 10);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (byte) 100, (int) (byte) 100);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, 10, (int) (byte) 0);
    org.junit.Assert.assertNotNull(fieldDataArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNull(fieldData5);
    org.junit.Assert.assertNull(fieldData8);
    org.junit.Assert.assertNull(fieldData11);
  }

  @Test
  public void test0688() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0688");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(0, (int) (short) 1);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0689() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0689");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(1, (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0690() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0690");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getQseqQ();
    double[] doubleArray8 = quarterlyDouble6.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray8);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray8);
    double double11 = quarterlyDouble10.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3600.0d + "'", double7 == 3600.0d);
    org.junit.Assert.assertNotNull(doubleArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
  }

  @Test
  public void test0691() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0691");
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
    double double25 = quarterlyDouble6.getMostRecent();
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
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
  }

  @Test
  public void test0692() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0692");
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
    double double20 = quarterlyDouble9.get((int) (short) 1);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
  }

  @Test
  public void test0693() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0693");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) 0,
        (int) (byte) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0694() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0694");
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
    double double27 = quarterlyDouble7.getTtmAvg();
    java.lang.Class<?> wildcardClass28 = quarterlyDouble7.getClass();
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
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 8.5d + "'", double27 == 8.5d);
    org.junit.Assert.assertNotNull(wildcardClass28);
  }

  @Test
  public void test0695() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0695");
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
    double double23 = quarterlyDouble6.deltaQ((int) 'a', (int) (byte) 1);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str25 = quarterlyDouble6
          .fmtGrowth1Q("\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
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
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + 11.0d + "'", double19 == 11.0d);
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 11.0d + "'", double20 == 11.0d);
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
  }

  @Test
  public void test0696() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0696");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(1, (int) '#');
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0697() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0697");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getCompany("\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(oneCompanyDataList1);
  }

  @Test
  public void test0698() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0698");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) 'a', 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0699() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0699");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getMostRecent();
    double double10 = quarterlyDouble8.getQoQ();
    double double11 = quarterlyDouble8.getTtm();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-90.0d) + "'", double10 == (-90.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 12.0d + "'", double11 == 12.0d);
  }

  @Test
  public void test0700() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0700");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) '#', (int) (short) 10);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0701() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0701");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.get(1);
    double double11 = quarterlyDouble7.getMostRecent();
    double double14 = quarterlyDouble7.deltaQ(10, (int) (byte) 100);
    // The following exception was thrown during execution in test generation
    try {
      double double17 = quarterlyDouble7.deltaQ(1, (int) ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.75d + "'", double8 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
  }

  @Test
  public void test0702() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0702");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double[] doubleArray14 = new double[] { '4', (-1), 100.0d, 3.0d, (byte) 1, 100.0f };
    quarterlyDouble7.dArr = doubleArray14;
    double[] doubleArray16 = quarterlyDouble7.dArr;
    java.lang.String str18 = quarterlyDouble7.fmtGrowth1Q("hi!");
    double double21 = quarterlyDouble7.deltaQ((int) 'a', (int) ' ');
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)" + "'", str18,
        "\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)");
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
  }

  @Test
  public void test0703() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0703");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) 'a',
        (int) (byte) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0704() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0704");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 0, (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, 1, (-1));
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(manyCompanyDataList7);
  }

  @Test
  public void test0705() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0705");
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
    double double12 = quarterlyDouble9.get(1);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
  }

  @Test
  public void test0706() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0706");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double8 = quarterlyDouble7.getTtmAvg();
    double double9 = quarterlyDouble7.getQoQ();
    double double10 = quarterlyDouble7.getTtmAvg();
    java.lang.String str12 = quarterlyDouble7.fmtGrowth1Q(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    double double13 = quarterlyDouble7.getMostRecent();
    java.lang.String str15 = quarterlyDouble7.fmtGrowth4Q("hi!");
    java.lang.String str17 = quarterlyDouble7
        .fmtGrowth1Q("\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.0d + "'", double8 == 3.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-90.0d) + "'", double9 == (-90.0d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
        + "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str12,
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\thi!               :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str15,
        "\thi!               :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str17 + "' != '"
        + "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str17,
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test0707() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0707");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData7 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList4, 0, (int) (byte) -1);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData10 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList4, 1, (int) (byte) 10);
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNull(fieldData7);
    org.junit.Assert.assertNull(fieldData10);
  }

  @Test
  public void test0708() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0708");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (byte) 0, (int) '#');
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0709() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0709");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(0, (int) (short) 10);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0710() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0710");
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
    quarterlyDouble9.dArr = doubleArray33;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 34.0d + "'", double14 == 34.0d);
    org.junit.Assert.assertNotNull(doubleArray20);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + 2.75d + "'", double24 == 2.75d);
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-200.0d) + "'", double25 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + 2.75d + "'", double26 == 2.75d);
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-200.0d) + "'", double27 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray33);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 10.0, 97.0, 1.0, 1.0]");
  }

  @Test
  public void test0711() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0711");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)", 0, (int) '4');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0712() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0712");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) 100,
        (int) (short) 1);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0713() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0713");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 0, (-1));
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0714() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0714");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (byte) -1, (int) ' ');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0715() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0715");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) -1,
        (int) (short) 10);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0716() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0716");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (byte) 10, (int) (byte) 1);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0717() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0717");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double8 = quarterlyDouble7.getTtmAvg();
    double double9 = quarterlyDouble7.getQoQ();
    double double10 = quarterlyDouble7.getTtmAvg();
    java.lang.String str12 = quarterlyDouble7.fmtGrowth1Q(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    double double13 = quarterlyDouble7.getQoQ();
    // The following exception was thrown during execution in test generation
    try {
      double double16 = quarterlyDouble7.deltaQ((int) (short) 1, (int) '4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
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
  }

  @Test
  public void test0718() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0718");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 1,
        (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test0719() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0719");
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
    double double20 = quarterlyDouble7.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str22 = quarterlyDouble7
          .fmtGrowth4Q("\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 10.0, 97.0, 1.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3600.0d + "'", double15 == 3600.0d);
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 34.0d + "'", double20 == 34.0d);
  }

  @Test
  public void test0720() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0720");
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
    double double17 = quarterlyDouble8.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 12.0d + "'", double15 == 12.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 900.0d + "'", double16 == 900.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
  }

  @Test
  public void test0721() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0721");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)", 10,
        (int) (short) 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0722() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0722");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double10 = quarterlyDouble7.deltaQ((int) (byte) 1, (int) (byte) 0);
    double double11 = quarterlyDouble7.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 900.0d + "'", double11 == 900.0d);
  }

  @Test
  public void test0723() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0723");
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
    double double27 = quarterlyDouble6.getQseqQ();
    double[] doubleArray28 = quarterlyDouble6.dArr;
    // The following exception was thrown during execution in test generation
    try {
      double double31 = quarterlyDouble6.deltaQ((int) (byte) -1, (int) (short) 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
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
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.75d + "'", double22 == 2.75d);
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-200.0d) + "'", double23 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + 2.75d + "'", double24 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray25);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-200.0d) + "'", double27 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray28);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0724() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0724");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getQseqQ();
    double[] doubleArray8 = quarterlyDouble6.dArr;
    double double10 = quarterlyDouble6.get(10);
    double[] doubleArray11 = quarterlyDouble6.dArr;
    double double13 = quarterlyDouble6.get((int) (byte) -1);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3600.0d + "'", double7 == 3600.0d);
    org.junit.Assert.assertNotNull(doubleArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9999.9999d) + "'", double13 == (-9999.9999d));
  }

  @Test
  public void test0725() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0725");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getCompany("\thi!               :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(oneCompanyDataList1);
  }

  @Test
  public void test0726() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0726");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(10, (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList2);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(manyCompanyDataList3);
    org.junit.Assert.assertNotNull(companyDataList4);
  }

  @Test
  public void test0727() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0727");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray7);
    double double10 = quarterlyDouble8.get((int) (byte) 1);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
  }

  @Test
  public void test0728() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0728");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    double double12 = quarterlyDouble8.getMostRecent();
    double double14 = quarterlyDouble8.get(0);
    double[] doubleArray15 = quarterlyDouble8.dArr;
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
  }

  @Test
  public void test0729() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0729");
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
    double double23 = quarterlyDouble6.deltaQ((int) 'a', (int) (byte) 1);
    double double24 = quarterlyDouble6.getMostRecent();
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
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
  }

  @Test
  public void test0730() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0730");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (short) 100, (int) (short) -1);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0731() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0731");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) 'a', (-1));
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0732() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0732");
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
    double double15 = quarterlyDouble7.get((int) (byte) 1);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-200.0d) + "'", double12 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
  }

  @Test
  public void test0733() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0733");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) -1, (int) (short) -1);
  }

  @Test
  public void test0734() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0734");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    java.lang.String str2 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    org.junit.Assert.assertEquals("'" + str2 + "' != '"
        + "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str2,
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNotNull(fieldDataList4);
  }

  @Test
  public void test0735() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0735");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (byte) -1,
          (int) (short) 100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0736() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0736");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double8 = quarterlyDouble7.getTtmAvg();
    double double9 = quarterlyDouble7.getQoQ();
    double double10 = quarterlyDouble7.getTtmAvg();
    double double12 = quarterlyDouble7.get(0);
    java.lang.String str14 = quarterlyDouble7
        .fmtGrowth4Q("\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    double double15 = quarterlyDouble7.getTtmAvg();
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
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.0d + "'", double15 == 3.0d);
  }

  @Test
  public void test0737() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0737");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (-1), 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0738() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0738");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 100,
        (int) (short) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    java.lang.Class<?> wildcardClass5 = manyCompanyDataList4.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
    org.junit.Assert.assertNotNull(wildcardClass5);
  }

  @Test
  public void test0739() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0739");
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
      java.lang.String str12 = quarterlyDouble8.fmtGrowth1Q("\t                  :        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
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
  public void test0740() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0740");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.lang.String str4 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList5, (int) (byte) 10, 0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList5, 10, (int) (byte) 0);
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertNull(fieldData8);
    org.junit.Assert.assertNull(fieldData11);
  }

  @Test
  public void test0741() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0741");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        (int) (short) 10, 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0742() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0742");
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
  public void test0743() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0743");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        (-1), (int) (byte) 100);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0744() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0744");
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
    double double16 = quarterlyDouble8.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 900.0d + "'", double15 == 900.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 900.0d + "'", double16 == 900.0d);
  }

  @Test
  public void test0745() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0745");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) 1,
        (int) 'a');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0746() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0746");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 10, 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0747() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0747");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) -1, (int) '#');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0748() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0748");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '"
        + "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str3,
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(fieldDataList4);
  }

  @Test
  public void test0749() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0749");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getCompany(
            "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(oneCompanyDataList1);
  }

  @Test
  public void test0750() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0750");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str23 = quarterlyDouble7.fmtGrowth1Q(
          "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
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
  public void test0751() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0751");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 1,
        (int) '#');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0752() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0752");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    java.lang.String str13 = quarterlyDouble8.fmtGrowth4Q("");
    double double14 = quarterlyDouble8.getTtm();
    java.lang.String str16 = quarterlyDouble8.fmtGrowth1Q("\thi!               :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
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
            + "\t\thi!               :         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'",
        str16, "\t\thi!               :         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test0753() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0753");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) '4', (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, (int) '4', (int) ' ');
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList5);
  }

  @Test
  public void test0754() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0754");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double[] doubleArray14 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    double[] doubleArray16 = quarterlyDouble15.dArr;
    double double18 = quarterlyDouble15.get(0);
    double double20 = quarterlyDouble15.get((int) (byte) 10);
    double double21 = quarterlyDouble15.getTtm();
    double[] doubleArray27 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray27);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray27);
    double double30 = quarterlyDouble29.getMostRecent();
    double double31 = quarterlyDouble29.getTtmAvg();
    double double32 = quarterlyDouble29.getQseqQ();
    double double33 = quarterlyDouble29.getTtmAvg();
    double[] doubleArray34 = quarterlyDouble29.dArr;
    quarterlyDouble15.dArr = doubleArray34;
    quarterlyDouble7.dArr = doubleArray34;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray34);
    // The following exception was thrown during execution in test generation
    try {
      double double38 = quarterlyDouble37.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-9999.9999d) + "'", double20 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 34.0d + "'", double21 == 34.0d);
    org.junit.Assert.assertNotNull(doubleArray27);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double31 + "' != '" + 2.75d + "'", double31 == 2.75d);
    org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-200.0d) + "'", double32 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double33 + "' != '" + 2.75d + "'", double33 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray34);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0755() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0755");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) '#', 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0756() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0756");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 100, 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
  }

  @Test
  public void test0757() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0757");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)");
  }

  @Test
  public void test0758() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0758");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 0,
        (int) (byte) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0759() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0759");
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
    // The following exception was thrown during execution in test generation
    try {
      double double38 = quarterlyDouble35.deltaQ((int) (short) 1, (int) (byte) 10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
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
  public void test0760() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0760");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 10, (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (byte) -1, (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(companyDataList7);
  }

  @Test
  public void test0761() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0761");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)", 1, (-1));
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0762() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0762");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        (int) '#', (int) (short) 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0763() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0763");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 10,
        (int) (short) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0764() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0764");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getCompany("\t                  :        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
    org.junit.Assert.assertNotNull(oneCompanyDataList1);
  }

  @Test
  public void test0765() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0765");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) 100,
        (int) '#');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0766() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0766");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) '#', 10);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0767() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0767");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    double double14 = quarterlyDouble8.deltaQ((int) (short) 10, (int) (short) 100);
    double double15 = quarterlyDouble8.getTtm();
    java.lang.String str17 = quarterlyDouble8.fmtGrowth4Q("\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 12.0d + "'", double15 == 12.0d);
    org.junit.Assert.assertEquals(
        "'" + str17 + "' != '"
            + "\t\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'",
        str17, "\t\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test0768() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0768");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getMostRecent();
    double double11 = quarterlyDouble8.get((int) (short) 100);
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
  }

  @Test
  public void test0769() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0769");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (short) 0,
          (int) ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0770() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0770");
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
    double double28 = quarterlyDouble17.getQseqQ();
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
    org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-200.0d) + "'", double28 == (-200.0d));
  }

  @Test
  public void test0771() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0771");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 100,
        (int) (byte) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
  }

  @Test
  public void test0772() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0772");
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
      java.lang.String str12 = quarterlyDouble8.fmtGrowth1Q(
          "\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
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
  public void test0773() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0773");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) -1,
        (int) 'a');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0774() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0774");
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
    double double53 = quarterlyDouble16.getQseqQ();
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
    org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-200.0d) + "'", double53 == (-200.0d));
  }

  @Test
  public void test0775() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0775");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(100, 1);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0776() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0776");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) -1,
        (int) (short) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
  }

  @Test
  public void test0777() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0777");
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
    // The following exception was thrown during execution in test generation
    try {
      double double28 = quarterlyDouble7.getQoQ();
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
  }

  @Test
  public void test0778() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0778");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) 10,
        (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0779() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0779");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double8 = quarterlyDouble7.getQoQ();
    double[] doubleArray9 = null;
    quarterlyDouble7.dArr = doubleArray9;
    double[] doubleArray16 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray16);
    double[] doubleArray18 = quarterlyDouble17.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray18);
    quarterlyDouble7.dArr = doubleArray18;
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-90.0d) + "'", double8 == (-90.0d));
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray18);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[97.0, 35.0, -1.0, 0.0, 0.0]");
  }

  @Test
  public void test0780() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0780");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.lang.String str4 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    java.lang.String str6 = companyData1.getTicker();
    java.lang.String str7 = companyData1.getTicker();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
  }

  @Test
  public void test0781() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0781");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 10, (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
    org.junit.Assert.assertNotNull(companyDataList5);
  }

  @Test
  public void test0782() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0782");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double8 = quarterlyDouble7.getQoQ();
    double[] doubleArray9 = null;
    quarterlyDouble7.dArr = doubleArray9;
    double[] doubleArray11 = quarterlyDouble7.dArr;
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-90.0d) + "'", double8 == (-90.0d));
    org.junit.Assert.assertNull(doubleArray11);
  }

  @Test
  public void test0783() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0783");
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
    java.lang.String str26 = quarterlyDouble6.fmtGrowth4Q(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
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
    org.junit.Assert.assertEquals("'" + str26 + "' != '"
        + "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str26,
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test0784() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0784");
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
    double double31 = quarterlyDouble7.getTtm();
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
    org.junit.Assert.assertTrue("'" + double31 + "' != '" + 11.0d + "'", double31 == 11.0d);
  }

  @Test
  public void test0785() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0785");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
    java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1,
        fieldDataArray0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) 'a', (int) (short) 10);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (-1), (int) 'a');
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, 100, 10);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData14 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) 'a', (int) (short) 0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData17 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) '4', 0);
    org.junit.Assert.assertNotNull(fieldDataArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNull(fieldData5);
    org.junit.Assert.assertNull(fieldData8);
    org.junit.Assert.assertNull(fieldData11);
    org.junit.Assert.assertNull(fieldData14);
    org.junit.Assert.assertNull(fieldData17);
  }

  @Test
  public void test0786() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0786");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double[] doubleArray14 = new double[] { '4', (-1), 100.0d, 3.0d, (byte) 1, 100.0f };
    quarterlyDouble7.dArr = doubleArray14;
    double[] doubleArray16 = quarterlyDouble7.dArr;
    java.lang.String str18 = quarterlyDouble7.fmtGrowth4Q(
        "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str18 + "' != '"
        + "\t\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)"
        + "'", str18,
        "\t\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
  }

  @Test
  public void test0787() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0787");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (byte) 0, (int) (short) 1);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0788() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0788");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
  }

  @Test
  public void test0789() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0789");
    double[] doubleArray5 = new double[] { 0L, 10.0f, 97.0d, 1.0d, 1.0f };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    java.lang.Class<?> wildcardClass7 = quarterlyDouble6.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 10.0, 97.0, 1.0, 1.0]");
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test0790() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0790");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(0, (int) (short) 10);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0791() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0791");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) -1, 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0792() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0792");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double11 = quarterlyDouble8.deltaQ(10, (int) (short) 0);
    double[] doubleArray17 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    quarterlyDouble8.dArr = doubleArray17;
    double double20 = quarterlyDouble8.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + 34.0d + "'", double20 == 34.0d);
  }

  @Test
  public void test0793() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0793");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 0,
        (int) (short) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0794() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0794");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) '4', (int) (byte) -1);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0795() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0795");
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
    java.lang.String str18 = quarterlyDouble16
        .fmtGrowth1Q("\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    double double19 = quarterlyDouble16.getQoQ();
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
        + "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str18,
        "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-90.0d) + "'", double19 == (-90.0d));
  }

  @Test
  public void test0796() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0796");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) 'a', 10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0797() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0797");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double[] doubleArray9 = quarterlyDouble7.dArr;
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      double double14 = quarterlyDouble7.deltaQ((int) (short) 1, (int) '#');
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
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 11.0d + "'", double11 == 11.0d);
  }

  @Test
  public void test0798() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0798");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 0,
        (int) (byte) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
  }

  @Test
  public void test0799() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0799");
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
    double double22 = quarterlyDouble19.deltaQ(10, (int) '#');
    double double23 = quarterlyDouble19.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2.75d + "'", double23 == 2.75d);
  }

  @Test
  public void test0800() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0800");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getCompany("\t\thi!               :         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(oneCompanyDataList1);
  }

  @Test
  public void test0801() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0801");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(100, (int) (byte) -1);
  }

  @Test
  public void test0802() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0802");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) -1, (int) '4');
    java.lang.Class<?> wildcardClass3 = strList2.getClass();
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(wildcardClass3);
  }

  @Test
  public void test0803() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0803");
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
      double double36 = quarterlyDouble33.deltaQ((int) (short) 1, (int) '#');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
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
  public void test0804() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0804");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    double double14 = quarterlyDouble8.deltaQ((int) (short) 10, (int) (short) 100);
    double double15 = quarterlyDouble8.getTtm();
    double double17 = quarterlyDouble8.get(1);
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + 12.0d + "'", double15 == 12.0d);
    org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
  }

  @Test
  public void test0805() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0805");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.get(1);
    double double11 = quarterlyDouble7.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str13 = quarterlyDouble7.fmtGrowth4Q("hi!");
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
  }

  @Test
  public void test0806() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0806");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)", (int) ' ', (int) (byte) 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0807() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0807");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 1, 100);
  }

  @Test
  public void test0808() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0808");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) 0,
        (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
    org.junit.Assert.assertNotNull(companyDataList5);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test0809() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0809");
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
    double double13 = quarterlyDouble8.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      double double16 = quarterlyDouble8.deltaQ((int) (short) 0, (int) (byte) 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-200.0d) + "'", double9 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 11.0d + "'", double10 == 11.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-200.0d) + "'", double13 == (-200.0d));
  }

  @Test
  public void test0810() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0810");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double9 = quarterlyDouble7.getTtmAvg();
    double double12 = quarterlyDouble7.deltaQ(10, (int) ' ');
    double double13 = quarterlyDouble7.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
  }

  @Test
  public void test0811() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0811");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList2, (int) (short) 10, (int) (byte) 100);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList2, (int) (byte) -1, (int) (short) -1);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList2, (int) (short) 1, (int) '#');
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNull(fieldData5);
    org.junit.Assert.assertNull(fieldData8);
    org.junit.Assert.assertNull(fieldData11);
  }

  @Test
  public void test0812() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0812");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double8 = quarterlyDouble7.getQoQ();
    double double9 = quarterlyDouble7.getMostRecent();
    double double10 = quarterlyDouble7.getTtmAvg();
    double double12 = quarterlyDouble7.get((int) '#');
    double double13 = quarterlyDouble7.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-90.0d) + "'", double8 == (-90.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
  }

  @Test
  public void test0813() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0813");
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
      java.lang.String str16 = quarterlyDouble9.fmtGrowth1Q(
          "\t\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
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
  public void test0814() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0814");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 10,
        (int) (short) 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
  }

  @Test
  public void test0815() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0815");
    double[] doubleArray5 = new double[] { 0L, 10.0f, 97.0d, 1.0d, 1.0f };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray12 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray12);
    double[] doubleArray14 = quarterlyDouble13.dArr;
    double double16 = quarterlyDouble13.get(0);
    double double18 = quarterlyDouble13.get((int) (byte) 10);
    double[] doubleArray19 = quarterlyDouble13.dArr;
    quarterlyDouble6.dArr = doubleArray19;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 10.0, 97.0, 1.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-9999.9999d) + "'", double18 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[97.0, 35.0, -1.0, 0.0, 0.0]");
  }

  @Test
  public void test0816() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0816");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double8 = quarterlyDouble7.getTtmAvg();
    double double9 = quarterlyDouble7.getQoQ();
    double double10 = quarterlyDouble7.getMostRecent();
    java.lang.String str12 = quarterlyDouble7.fmtGrowth1Q(
        "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.0d + "'", double8 == 3.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-90.0d) + "'", double9 == (-90.0d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
        + "\t\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str12,
        "\t\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test0817() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0817");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double10 = quarterlyDouble7.deltaQ((int) '#', 0);
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
  }

  @Test
  public void test0818() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0818");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) '#', 0);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0819() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0819");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 100, (int) (short) 0);
  }

  @Test
  public void test0820() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0820");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) 'a', (int) ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0821() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0821");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 100, 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0822() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0822");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) '4', (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0823() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0823");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    java.lang.String str9 = quarterlyDouble7.fmtGrowth1Q("");
    double double10 = quarterlyDouble7.getQseqQ();
    double double13 = quarterlyDouble7.deltaQ((int) 'a', 100);
    java.lang.Class<?> wildcardClass14 = quarterlyDouble7.getClass();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str9,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 900.0d + "'", double10 == 900.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test0824() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0824");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double9 = quarterlyDouble7.getQseqQ();
    double double10 = quarterlyDouble7.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-200.0d) + "'", double9 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
  }

  @Test
  public void test0825() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0825");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getCompany("\t\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(oneCompanyDataList1);
  }

  @Test
  public void test0826() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0826");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(0, (int) (byte) 1);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0827() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0827");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.get(1);
    double double12 = quarterlyDouble7.get((-1));
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.75d + "'", double8 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
  }

  @Test
  public void test0828() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0828");
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
    double double21 = quarterlyDouble19.get((int) (byte) 1);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray15);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
  }

  @Test
  public void test0829() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0829");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) ' ', (int) ' ');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (byte) 10, (int) (short) 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList9 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (short) 0, 0);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(companyDataList9);
  }

  @Test
  public void test0830() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0830");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str9 = quarterlyDouble6.fmtGrowth4Q(
          "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
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
  public void test0831() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0831");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData7 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList4, (int) (short) 1, (int) (byte) 10);
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNull(fieldData7);
  }

  @Test
  public void test0832() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0832");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 100, (int) (byte) 0);
  }

  @Test
  public void test0833() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0833");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(fieldDataList3);
  }

  @Test
  public void test0834() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0834");
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
      java.lang.String str11 = quarterlyDouble8.fmtGrowth4Q("\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
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
  public void test0835() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0835");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) 'a',
        (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0836() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0836");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 10, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
    org.junit.Assert.assertNotNull(manyCompanyDataList5);
    org.junit.Assert.assertNotNull(manyCompanyDataList6);
  }

  @Test
  public void test0837() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0837");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getQseqQ();
    double double8 = quarterlyDouble6.getQseqQ();
    double double9 = quarterlyDouble6.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3600.0d + "'", double7 == 3600.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3600.0d + "'", double8 == 3600.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 8.5d + "'", double9 == 8.5d);
  }

  @Test
  public void test0838() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0838");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 10, (-1));
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0839() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0839");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(0, (int) (byte) 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, 1, (int) (byte) 100);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList5);
  }

  @Test
  public void test0840() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0840");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(0, (int) (short) 1);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0841() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0841");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData7 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList4, (int) (byte) 1, (int) (byte) 100);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData10 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList4, (int) (byte) -1, (int) (short) 1);
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNull(fieldData7);
    org.junit.Assert.assertNull(fieldData10);
  }

  @Test
  public void test0842() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0842");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.lang.String str3 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData7 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList4, 0, (int) (byte) -1);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData10 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList4, 0, (int) (byte) 100);
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNull(fieldData7);
    org.junit.Assert.assertNull(fieldData10);
  }

  @Test
  public void test0843() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0843");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getQseqQ();
    double[] doubleArray8 = quarterlyDouble6.dArr;
    double double10 = quarterlyDouble6.get(10);
    double[] doubleArray11 = quarterlyDouble6.dArr;
    double double12 = quarterlyDouble6.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3600.0d + "'", double7 == 3600.0d);
    org.junit.Assert.assertNotNull(doubleArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3600.0d + "'", double12 == 3600.0d);
  }

  @Test
  public void test0844() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0844");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) 0,
        (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) '4', (int) (byte) 0);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test0845() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0845");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) 1,
        (int) '4');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0846() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0846");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double11 = quarterlyDouble8.deltaQ(10, (int) (short) 0);
    double[] doubleArray17 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray17);
    quarterlyDouble8.dArr = doubleArray17;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str21 = quarterlyDouble8.fmtGrowth4Q(
          "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[97.0, 35.0, -1.0, 0.0, 0.0]");
  }

  @Test
  public void test0847() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0847");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    org.junit.Assert.assertNotNull(fieldDataList2);
  }

  @Test
  public void test0848() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0848");
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
    double double27 = quarterlyDouble7.deltaQ((int) (short) 10, 0);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str29 = quarterlyDouble7.fmtGrowth1Q(
          "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
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
    org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
  }

  @Test
  public void test0849() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0849");
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
    double[] doubleArray19 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray19);
    double[] doubleArray27 = new double[] { '4', (-1), 100.0d, 3.0d, (byte) 1, 100.0f };
    quarterlyDouble20.dArr = doubleArray27;
    double[] doubleArray29 = quarterlyDouble20.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray29);
    quarterlyDouble8.dArr = doubleArray29;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-200.0d) + "'", double11 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray19);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray27);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    org.junit.Assert.assertNotNull(doubleArray29);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
  }

  @Test
  public void test0850() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0850");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 100, 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0851() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0851");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        1, 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0852() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0852");
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
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str36 = quarterlyDouble34.fmtGrowth1Q("\t                  :        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
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
  public void test0853() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0853");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double10 = quarterlyDouble6.deltaQ((int) (short) 10, 0);
    double double11 = quarterlyDouble6.getQseqQ();
    double double12 = quarterlyDouble6.getTtm();
    double double14 = quarterlyDouble6.get(10);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-200.0d) + "'", double11 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 11.0d + "'", double12 == 11.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
  }

  @Test
  public void test0854() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0854");
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
    double double26 = quarterlyDouble25.getQseqQ();
    double double27 = quarterlyDouble25.getTtm();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str29 = quarterlyDouble25.fmtGrowth4Q(
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
    org.junit.Assert.assertNotNull(doubleArray22);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray23);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-200.0d) + "'", double26 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 11.0d + "'", double27 == 11.0d);
  }

  @Test
  public void test0855() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0855");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(0, (int) '#');
  }

  @Test
  public void test0856() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0856");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    java.lang.String str10 = quarterlyDouble8
        .fmtGrowth4Q("\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    double double12 = quarterlyDouble8.get((int) (short) 1);
    double double13 = quarterlyDouble8.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str10 + "' != '"
        + "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str10,
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
  }

  @Test
  public void test0857() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0857");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double10 = quarterlyDouble7.deltaQ((int) (byte) -1, (int) (short) 0);
    double double12 = quarterlyDouble7.get(100);
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
  }

  @Test
  public void test0858() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0858");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(0, (int) (short) 1);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0859() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0859");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.get(1);
    double double13 = quarterlyDouble7.deltaQ((int) '#', (int) ' ');
    java.lang.Class<?> wildcardClass14 = quarterlyDouble7.getClass();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.75d + "'", double8 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test0860() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0860");
    double[] doubleArray5 = new double[] { 0L, 10.0f, 97.0d, 1.0d, 1.0f };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray13 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray13);
    double double15 = quarterlyDouble14.getMostRecent();
    double double18 = quarterlyDouble14.deltaQ((int) (short) 10, 0);
    double double19 = quarterlyDouble14.getQseqQ();
    double[] doubleArray20 = quarterlyDouble14.dArr;
    quarterlyDouble7.dArr = doubleArray20;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str23 = quarterlyDouble7.fmtGrowth4Q(
          "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 10.0, 97.0, 1.0, 1.0]");
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-200.0d) + "'", double19 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray20);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0861() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0861");
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
    double[] doubleArray21 = quarterlyDouble6.dArr;
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
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0862() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0862");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) 'a', (int) (short) 100);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0863() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0863");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(0, (int) ' ');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0864() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0864");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getCompany("\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(oneCompanyDataList1);
  }

  @Test
  public void test0865() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0865");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double double8 = quarterlyDouble6.getQseqQ();
    double double11 = quarterlyDouble6.deltaQ((int) '#', 100);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-200.0d) + "'", double8 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
  }

  @Test
  public void test0866() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0866");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (-1), (int) (short) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0867() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0867");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        (int) (byte) 0, (-1));
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0868() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0868");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((-1), 100);
  }

  @Test
  public void test0869() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0869");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) ' ', (int) ' ');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
  }

  @Test
  public void test0870() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0870");
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
    double double22 = quarterlyDouble7.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray17);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
  }

  @Test
  public void test0871() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0871");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) ' ',
        (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0872() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0872");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList2, (int) (short) 1, (int) (short) 0);
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNull(fieldData5);
  }

  @Test
  public void test0873() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0873");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 10,
        (int) (short) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0874() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0874");
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
      java.lang.String str15 = quarterlyDouble7.fmtGrowth4Q(
          "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
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
  public void test0875() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0875");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 1,
        (int) '#');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0876() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0876");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\thi!               :         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)", (int) (short) 100,
        10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0877() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0877");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) 0,
        (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
    org.junit.Assert.assertNotNull(manyCompanyDataList5);
  }

  @Test
  public void test0878() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0878");
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
    double[] doubleArray21 = quarterlyDouble16.dArr;
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
    org.junit.Assert.assertNotNull(doubleArray21);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
  }

  @Test
  public void test0879() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0879");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(100, (int) '4');
  }

  @Test
  public void test0880() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0880");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.lang.String str2 = companyData1.getTicker();
    java.lang.String str3 = companyData1.getTicker();
    java.lang.String str4 = companyData1.getTicker();
    java.lang.String str5 = companyData1.getTicker();
    java.lang.String str6 = companyData1.getTicker();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
  }

  @Test
  public void test0881() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0881");
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
    java.lang.String str15 = quarterlyDouble8.fmtGrowth1Q("\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)");
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-90.0d) + "'", double10 == (-90.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.0d + "'", double11 == 3.0d);
    org.junit.Assert.assertEquals("'" + str13 + "' != '"
        + "\t\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str13,
        "\t\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals(
        "'" + str15 + "' != '"
            + "\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'",
        str15, "\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test0882() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0882");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.lang.String str4 = companyData1.getTicker();
    java.lang.String str5 = companyData1.getTicker();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str4,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str5,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test0883() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0883");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) '4',
        (int) (short) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0884() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0884");
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
    double double27 = quarterlyDouble7.getTtmAvg();
    double[] doubleArray28 = quarterlyDouble7.dArr;
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
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 8.5d + "'", double27 == 8.5d);
    org.junit.Assert.assertNotNull(doubleArray28);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[97.0, 35.0, -1.0, 0.0, 0.0]");
  }

  @Test
  public void test0885() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0885");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) ' ',
        (int) (short) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0886() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0886");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 1,
        (int) (short) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0887() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0887");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)", 1, 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0888() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0888");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) -1, 10);
  }

  @Test
  public void test0889() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0889");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double double10 = quarterlyDouble6.deltaQ(10, (int) (short) 1);
    double double11 = quarterlyDouble6.getTtmAvg();
    double double12 = quarterlyDouble6.getQseqQ();
    double double13 = quarterlyDouble6.getQseqQ();
    double double14 = quarterlyDouble6.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-200.0d) + "'", double12 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-200.0d) + "'", double13 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.75d + "'", double14 == 2.75d);
  }

  @Test
  public void test0890() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0890");
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
    double double27 = quarterlyDouble7.deltaQ((int) (short) 10, 0);
    double double29 = quarterlyDouble7.get((int) (short) 0);
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
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
  }

  @Test
  public void test0891() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0891");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (-1), (int) (byte) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0892() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0892");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double8 = quarterlyDouble7.getTtmAvg();
    double double9 = quarterlyDouble7.getQoQ();
    double double10 = quarterlyDouble7.getTtmAvg();
    java.lang.String str12 = quarterlyDouble7.fmtGrowth1Q(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    double double13 = quarterlyDouble7.getMostRecent();
    double double14 = quarterlyDouble7.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.0d + "'", double8 == 3.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-90.0d) + "'", double9 == (-90.0d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
    org.junit.Assert.assertEquals("'" + str12 + "' != '"
        + "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)"
        + "'", str12,
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 900.0d + "'", double14 == 900.0d);
  }

  @Test
  public void test0893() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0893");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) ' ',
        (int) (short) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test0894() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0894");
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
    double[] doubleArray29 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray29);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray29);
    double double32 = quarterlyDouble31.getMostRecent();
    double double33 = quarterlyDouble31.getTtmAvg();
    double double34 = quarterlyDouble31.getQseqQ();
    double double35 = quarterlyDouble31.getTtmAvg();
    double[] doubleArray41 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble42 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray41);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble43 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray41);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble44 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray41);
    quarterlyDouble31.dArr = doubleArray41;
    double double46 = quarterlyDouble31.getQseqQ();
    double[] doubleArray47 = quarterlyDouble31.dArr;
    double double49 = quarterlyDouble31.get((int) (byte) 10);
    double double51 = quarterlyDouble31.get((int) (short) 0);
    double double52 = quarterlyDouble31.getMostRecent();
    double[] doubleArray58 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble59 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray58);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble60 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray58);
    double double61 = quarterlyDouble60.getMostRecent();
    double double62 = quarterlyDouble60.getTtmAvg();
    double double63 = quarterlyDouble60.getQseqQ();
    double double64 = quarterlyDouble60.getTtmAvg();
    double double65 = quarterlyDouble60.getQseqQ();
    double[] doubleArray66 = quarterlyDouble60.dArr;
    quarterlyDouble31.dArr = doubleArray66;
    quarterlyDouble6.dArr = doubleArray66;
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
    org.junit.Assert.assertNotNull(doubleArray29);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double33 + "' != '" + 2.75d + "'", double33 == 2.75d);
    org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-200.0d) + "'", double34 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double35 + "' != '" + 2.75d + "'", double35 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray41);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-200.0d) + "'", double46 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray47);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-9999.9999d) + "'", double49 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-1.0d) + "'", double51 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-1.0d) + "'", double52 == (-1.0d));
    org.junit.Assert.assertNotNull(doubleArray58);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-1.0d) + "'", double61 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double62 + "' != '" + 2.75d + "'", double62 == 2.75d);
    org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-200.0d) + "'", double63 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double64 + "' != '" + 2.75d + "'", double64 == 2.75d);
    org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-200.0d) + "'", double65 == (-200.0d));
    org.junit.Assert.assertNotNull(doubleArray66);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0895() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0895");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) (short) 10, (int) '#');
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0896() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0896");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 1, (int) (byte) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0897() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0897");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getMostRecent();
    double double10 = quarterlyDouble8.getTtmAvg();
    double double11 = quarterlyDouble8.getQoQ();
    java.lang.String str13 = quarterlyDouble8.fmtGrowth1Q("");
    double double14 = quarterlyDouble8.getTtmAvg();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-90.0d) + "'", double11 == (-90.0d));
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str13,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
  }

  @Test
  public void test0898() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0898");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) 100,
        (int) (byte) 100);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
  }

  @Test
  public void test0899() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0899");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double9 = quarterlyDouble8.getTtm();
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
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 11.0d + "'", double9 == 11.0d);
  }

  @Test
  public void test0900() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0900");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    java.lang.String str2 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str2,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNotNull(fieldDataList4);
  }

  @Test
  public void test0901() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0901");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getQseqQ();
    double[] doubleArray8 = quarterlyDouble6.dArr;
    double double10 = quarterlyDouble6.get(10);
    double[] doubleArray11 = quarterlyDouble6.dArr;
    double double13 = quarterlyDouble6.get((int) (short) 100);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3600.0d + "'", double7 == 3600.0d);
    org.junit.Assert.assertNotNull(doubleArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9999.9999d) + "'", double13 == (-9999.9999d));
  }

  @Test
  public void test0902() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0902");
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
    double[] doubleArray26 = quarterlyDouble25.dArr;
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
    org.junit.Assert.assertNotNull(doubleArray26);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0903() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0903");
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
    double double39 = quarterlyDouble9.deltaQ((int) '4', (int) '#');
    double double40 = quarterlyDouble9.getTtm();
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
    org.junit.Assert.assertTrue("'" + double40 + "' != '" + 109.0d + "'", double40 == 109.0d);
  }

  @Test
  public void test0904() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0904");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("",
        (int) (byte) -1, 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0905() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0905");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (byte) 100, (int) '#');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0906() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0906");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 10, (int) (byte) -1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0907() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0907");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) '#',
        (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0908() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0908");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double double10 = quarterlyDouble6.deltaQ(10, (int) (short) 1);
    double double12 = quarterlyDouble6.get((int) (byte) 10);
    double[] doubleArray13 = quarterlyDouble6.dArr;
    double double15 = quarterlyDouble6.get((int) (byte) 100);
    double double18 = quarterlyDouble6.deltaQ(10, (int) (byte) 0);
    double double20 = quarterlyDouble6.get((int) (byte) 100);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
    org.junit.Assert.assertNotNull(doubleArray13);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9999.9999d) + "'", double15 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-9999.9999d) + "'", double20 == (-9999.9999d));
  }

  @Test
  public void test0909() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0909");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 10, (int) (byte) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0910() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0910");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
  }

  @Test
  public void test0911() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0911");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
    java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
    boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1,
        fieldDataArray0);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (short) 10, (int) '4');
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (byte) 100, (int) (short) -1);
    org.junit.Assert.assertNotNull(fieldDataArray0);
    org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    org.junit.Assert.assertNull(fieldData5);
    org.junit.Assert.assertNull(fieldData8);
  }

  @Test
  public void test0912() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0912");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary(1, (int) (short) 10);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0913() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0913");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double[] doubleArray14 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray14);
    double[] doubleArray16 = quarterlyDouble15.dArr;
    double double18 = quarterlyDouble15.get(0);
    double double20 = quarterlyDouble15.get((int) (byte) 10);
    double double21 = quarterlyDouble15.getTtm();
    double[] doubleArray27 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray27);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray27);
    double double30 = quarterlyDouble29.getMostRecent();
    double double31 = quarterlyDouble29.getTtmAvg();
    double double32 = quarterlyDouble29.getQseqQ();
    double double33 = quarterlyDouble29.getTtmAvg();
    double[] doubleArray34 = quarterlyDouble29.dArr;
    quarterlyDouble15.dArr = doubleArray34;
    quarterlyDouble7.dArr = doubleArray34;
    double double37 = quarterlyDouble7.getMostRecent();
    // The following exception was thrown during execution in test generation
    try {
      double double38 = quarterlyDouble7.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    org.junit.Assert.assertNotNull(doubleArray14);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray16);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-9999.9999d) + "'", double20 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double21 + "' != '" + 34.0d + "'", double21 == 34.0d);
    org.junit.Assert.assertNotNull(doubleArray27);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double31 + "' != '" + 2.75d + "'", double31 == 2.75d);
    org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-200.0d) + "'", double32 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double33 + "' != '" + 2.75d + "'", double33 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray34);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1.0d) + "'", double37 == (-1.0d));
  }

  @Test
  public void test0914() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0914");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) 0,
        (int) 'a');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0915() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0915");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (byte) 1, 10);
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0916() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0916");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t                  :        103.00 M (Seq= -101.00% : QoQ= -101.00%)", (int) (byte) 1, (int) (short) 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0917() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0917");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getQseqQ();
    double double8 = quarterlyDouble6.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      double double9 = quarterlyDouble6.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3600.0d + "'", double7 == 3600.0d);
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3600.0d + "'", double8 == 3600.0d);
  }

  @Test
  public void test0918() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0918");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        (int) (short) 0, (int) (short) 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0919() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0919");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 0, (int) (byte) 10);
  }

  @Test
  public void test0920() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0920");
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
    double double55 = quarterlyDouble7.getTtmAvg();
    double double56 = quarterlyDouble7.getTtmAvg();
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
    org.junit.Assert.assertTrue("'" + double55 + "' != '" + 2.75d + "'", double55 == 2.75d);
    org.junit.Assert.assertTrue("'" + double56 + "' != '" + 2.75d + "'", double56 == 2.75d);
  }

  @Test
  public void test0921() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0921");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) -1, (int) '#');
  }

  @Test
  public void test0922() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0922");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 1, (int) (byte) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0923() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0923");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray8 = quarterlyDouble7.dArr;
    double double9 = quarterlyDouble7.getQseqQ();
    double double10 = quarterlyDouble7.getQseqQ();
    double double12 = quarterlyDouble7.get((int) '#');
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-200.0d) + "'", double9 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
  }

  @Test
  public void test0924() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0924");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 1, 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0925() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0925");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double9 = quarterlyDouble7.get(0);
    double double12 = quarterlyDouble7.deltaQ((int) (byte) 100, 0);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str14 = quarterlyDouble7.fmtGrowth4Q(
          "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
  }

  @Test
  public void test0926() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0926");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getCompany(
            "\t\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
    org.junit.Assert.assertNotNull(oneCompanyDataList1);
  }

  @Test
  public void test0927() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0927");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (byte) 0, (int) (byte) 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, (-1), 0);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList5);
  }

  @Test
  public void test0928() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0928");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double double8 = quarterlyDouble6.getQseqQ();
    double double10 = quarterlyDouble6.get((int) (short) 10);
    double double12 = quarterlyDouble6.get((int) '4');
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
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-200.0d) + "'", double8 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
  }

  @Test
  public void test0929() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0929");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) -1,
        (int) (short) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0930() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0930");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(1, (int) '#');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0931() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0931");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) '#', (int) '4');
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0932() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0932");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 10, (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0933() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0933");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 1, (int) (byte) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0934() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0934");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 10,
        (int) (byte) 1);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0935() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0935");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) 'a', (-1));
    org.junit.Assert.assertNotNull(strList2);
  }

  @Test
  public void test0936() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0936");
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
    double double27 = quarterlyDouble26.getTtmAvg();
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
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 8.5d + "'", double27 == 8.5d);
  }

  @Test
  public void test0937() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0937");
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
    double double23 = quarterlyDouble6.getQoQ();
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
    org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-90.0d) + "'", double23 == (-90.0d));
  }

  @Test
  public void test0938() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0938");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) ' ', (int) ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0939() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0939");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    java.lang.Class<?> wildcardClass2 = companyData1.getClass();
    org.junit.Assert.assertNotNull(wildcardClass2);
  }

  @Test
  public void test0940() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0940");
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
      java.lang.String str27 = quarterlyDouble7
          .fmtGrowth1Q("\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
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
  public void test0941() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0941");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 1,
        (int) 'a');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    java.lang.Class<?> wildcardClass6 = companyDataList5.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
    org.junit.Assert.assertNotNull(companyDataList5);
    org.junit.Assert.assertNotNull(wildcardClass6);
  }

  @Test
  public void test0942() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0942");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList2, (-1), (int) ' ');
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList2, 0, (int) 'a');
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNull(fieldData5);
    org.junit.Assert.assertNull(fieldData8);
  }

  @Test
  public void test0943() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0943");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 10, (int) (byte) -1);
  }

  @Test
  public void test0944() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0944");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) '#', 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test0945() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0945");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double10 = quarterlyDouble7.deltaQ((int) (byte) -1, (int) (short) 0);
    double double11 = quarterlyDouble7.getMostRecent();
    double double12 = quarterlyDouble7.getTtm();
    double double13 = quarterlyDouble7.getMostRecent();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 12.0d + "'", double12 == 12.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
  }

  @Test
  public void test0946() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0946");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(0, (int) (byte) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, (int) (short) 1, (int) (short) 0);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList5);
  }

  @Test
  public void test0947() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0947");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray7);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray7);
    double double10 = quarterlyDouble9.getMostRecent();
    double[] doubleArray11 = quarterlyDouble9.dArr;
    double[] doubleArray12 = quarterlyDouble9.dArr;
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
    org.junit.Assert.assertNotNull(doubleArray11);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray12);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 35.0, -1.0, 0.0, 0.0]");
  }

  @Test
  public void test0948() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0948");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)", (-1), 0);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0949() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0949");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 0, (int) '#');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0950() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0950");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray8 = quarterlyDouble7.dArr;
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray8);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0951() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0951");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 10, (int) '#');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
  }

  @Test
  public void test0952() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0952");
    java.util.List<java.lang.String> strList0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
          .getCompanies(strList0, (-1), (int) '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0953() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0953");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) -1,
        (int) (byte) 100);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0954() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0954");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) ' ',
        (int) (short) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0955() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0955");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 100, (int) (byte) 10);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0956() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0956");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompany("\t                  :        103.00 M (Seq= -101.00% : QoQ= -101.00%)", (int) (short) -1, 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0957() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0957");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) 'a', 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0958() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0958");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    double double10 = quarterlyDouble8.getQseqQ();
    java.lang.Class<?> wildcardClass11 = quarterlyDouble8.getClass();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 900.0d + "'", double10 == 900.0d);
    org.junit.Assert.assertNotNull(wildcardClass11);
  }

  @Test
  public void test0959() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0959");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    java.lang.String str9 = quarterlyDouble7.fmtGrowth1Q("");
    double double10 = quarterlyDouble7.getQseqQ();
    double double13 = quarterlyDouble7.deltaQ((int) 'a', 100);
    double double14 = quarterlyDouble7.getMostRecent();
    double double16 = quarterlyDouble7.get((int) (short) 10);
    double double18 = quarterlyDouble7.get((-1));
    double double20 = quarterlyDouble7.get((int) '4');
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str9,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 900.0d + "'", double10 == 900.0d);
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9999.9999d) + "'", double16 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-9999.9999d) + "'", double18 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-9999.9999d) + "'", double20 == (-9999.9999d));
  }

  @Test
  public void test0960() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0960");
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
    double double55 = quarterlyDouble7.getTtmAvg();
    double[] doubleArray56 = quarterlyDouble7.dArr;
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
    org.junit.Assert.assertTrue("'" + double55 + "' != '" + 2.75d + "'", double55 == 2.75d);
    org.junit.Assert.assertNotNull(doubleArray56);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0961() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0961");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double7 = quarterlyDouble6.getMostRecent();
    double double9 = quarterlyDouble6.get((int) (byte) 100);
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
    org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9999.9999d) + "'", double9 == (-9999.9999d));
  }

  @Test
  public void test0962() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0962");
    double[] doubleArray5 = new double[] { 0L, 10.0f, 97.0d, 1.0d, 1.0f };
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
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 10.0, 97.0, 1.0, 1.0]");
  }

  @Test
  public void test0963() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0963");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.lang.String str2 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList5, (int) (short) 1, (int) (byte) 1);
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData
        .getFieldData(fieldDataList5, (int) '#', (int) '#');
    org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertNotNull(fieldDataList4);
    org.junit.Assert.assertNotNull(fieldDataList5);
    org.junit.Assert.assertNull(fieldData8);
    org.junit.Assert.assertNull(fieldData11);
  }

  @Test
  public void test0964() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0964");
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
    double[] doubleArray33 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray33);
    java.lang.String str36 = quarterlyDouble34.fmtGrowth1Q("");
    double double37 = quarterlyDouble34.getQseqQ();
    double double38 = quarterlyDouble34.getTtmAvg();
    double[] doubleArray44 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble45 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray44);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble46 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray44);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble47 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray44);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble48 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray44);
    quarterlyDouble34.dArr = doubleArray44;
    quarterlyDouble7.dArr = doubleArray44;
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
    org.junit.Assert.assertNotNull(doubleArray33);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str36,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double37 + "' != '" + 900.0d + "'", double37 == 900.0d);
    org.junit.Assert.assertTrue("'" + double38 + "' != '" + 3.0d + "'", double38 == 3.0d);
    org.junit.Assert.assertNotNull(doubleArray44);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
  }

  @Test
  public void test0965() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0965");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 1, 100);
    java.lang.Class<?> wildcardClass4 = strList3.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(wildcardClass4);
  }

  @Test
  public void test0966() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0966");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 0, (int) (short) -1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, 10, (int) 'a');
    java.lang.Class<?> wildcardClass7 = strList3.getClass();
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(wildcardClass7);
  }

  @Test
  public void test0967() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0967");
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
    double double27 = quarterlyDouble6.getQseqQ();
    double[] doubleArray28 = quarterlyDouble6.dArr;
    double double29 = quarterlyDouble6.getMostRecent();
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
    org.junit.Assert.assertTrue("'" + double27 + "' != '" + 900.0d + "'", double27 == 900.0d);
    org.junit.Assert.assertNotNull(doubleArray28);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
  }

  @Test
  public void test0968() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0968");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (short) 10,
          (int) (byte) 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0969() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0969");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double[] doubleArray8 = quarterlyDouble6.dArr;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str10 = quarterlyDouble6.fmtGrowth1Q(
          "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
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
  }

  @Test
  public void test0970() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0970");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.get(1);
    double double11 = quarterlyDouble7.getMostRecent();
    double double13 = quarterlyDouble7.get((int) (byte) 1);
    double double15 = quarterlyDouble7.get((int) (byte) 0);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.75d + "'", double8 == 2.75d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
  }

  @Test
  public void test0971() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0971");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 0, 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList4);
    org.junit.Assert.assertNotNull(manyCompanyDataList5);
  }

  @Test
  public void test0972() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0972");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        (int) (byte) -1, (int) (short) 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0973() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0973");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 10, (-1));
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0975() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0975");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
    java.lang.String str4 = companyData1.getTicker();
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
    org.junit.Assert.assertNotNull(fieldDataList2);
    org.junit.Assert.assertNotNull(fieldDataList3);
    org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    org.junit.Assert.assertNotNull(fieldDataList5);
  }

  @Test
  public void test0976() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0976");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 1, 10);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (short) 10, (int) (short) 1);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(manyCompanyDataList4);
    org.junit.Assert.assertNotNull(companyDataList7);
  }

  @Test
  public void test0977() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0977");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (byte) 10,
          (int) (short) 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
    }
    catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
  }

  @Test
  public void test0978() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0978");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getMostRecent();
    double double9 = quarterlyDouble7.getQseqQ();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str11 = quarterlyDouble7.fmtGrowth1Q(
          "\t\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
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
  public void test0979() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0979");
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
    double double13 = quarterlyDouble11.getTtm();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray10);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 11.0d + "'", double13 == 11.0d);
  }

  @Test
  public void test0980() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0980");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double9 = quarterlyDouble8.getTtm();
    java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
    java.lang.String str13 = quarterlyDouble8.fmtGrowth4Q("");
    double double14 = quarterlyDouble8.getQseqQ();
    double double15 = quarterlyDouble8.getQoQ();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
    org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11,
        "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str13,
        "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double14 + "' != '" + 900.0d + "'", double14 == 900.0d);
    org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-90.0d) + "'", double15 == (-90.0d));
  }

  @Test
  public void test0981() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0981");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 0,
        (int) ' ');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) (short) -1, (int) '4');
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
  }

  @Test
  public void test0982() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0982");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (short) 100, 10);
    org.junit.Assert.assertNotNull(companySummaryList2);
  }

  @Test
  public void test0983() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0983");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 10,
        (int) '4');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) 'a', (int) (short) 0);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList9 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList3, (int) 'a', (int) ' ');
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList10 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData
        .createList(strList3);
    org.junit.Assert.assertNotNull(strList3);
    org.junit.Assert.assertNotNull(companyDataList6);
    org.junit.Assert.assertNotNull(companyDataList9);
    org.junit.Assert.assertNotNull(manyCompanyDataList10);
  }

  @Test
  public void test0984() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0984");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double8 = quarterlyDouble7.getTtmAvg();
    double double10 = quarterlyDouble7.get(1);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str12 = quarterlyDouble7.fmtGrowth1Q(
          "\t\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
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
  public void test0985() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0985");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    java.lang.String str9 = quarterlyDouble7.fmtGrowth1Q("");
    double double10 = quarterlyDouble7.getQoQ();
    double double13 = quarterlyDouble7.deltaQ((int) ' ', (int) (short) 10);
    java.lang.Class<?> wildcardClass14 = quarterlyDouble7.getClass();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str9,
        "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-90.0d) + "'", double10 == (-90.0d));
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    org.junit.Assert.assertNotNull(wildcardClass14);
  }

  @Test
  public void test0986() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0986");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray8 = quarterlyDouble7.dArr;
    double double9 = quarterlyDouble7.getQseqQ();
    double double10 = quarterlyDouble7.getQseqQ();
    double double11 = quarterlyDouble7.getQseqQ();
    double double12 = quarterlyDouble7.getQseqQ();
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertNotNull(doubleArray8);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-200.0d) + "'", double9 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-200.0d) + "'", double11 == (-200.0d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-200.0d) + "'", double12 == (-200.0d));
  }

  @Test
  public void test0987() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0987");
    net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 10, 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0988() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0988");
    net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 0, (int) ' ');
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0989() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0989");
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
    double double25 = quarterlyDouble7.getTtm();
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
    org.junit.Assert.assertTrue("'" + double25 + "' != '" + 11.0d + "'", double25 == 11.0d);
  }

  @Test
  public void test0990() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0990");
    double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray6);
    double double8 = quarterlyDouble7.getTtmAvg();
    double double9 = quarterlyDouble7.getQoQ();
    double double11 = quarterlyDouble7.get((int) 'a');
    double double12 = quarterlyDouble7.getQoQ();
    double double13 = quarterlyDouble7.getQoQ();
    org.junit.Assert.assertNotNull(doubleArray6);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.0d + "'", double8 == 3.0d);
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-90.0d) + "'", double9 == (-90.0d));
    org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-90.0d) + "'", double12 == (-90.0d));
    org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-90.0d) + "'", double13 == (-90.0d));
  }

  @Test
  public void test0991() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0991");
    java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(1, 1);
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData
        .getCompanies(strList2, (int) (byte) 100, (int) (byte) 0);
    org.junit.Assert.assertNotNull(strList2);
    org.junit.Assert.assertNotNull(companyDataList5);
  }

  @Test
  public void test0992() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0992");
    double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double[] doubleArray7 = quarterlyDouble6.dArr;
    double double8 = quarterlyDouble6.getTtmAvg();
    double double10 = quarterlyDouble6.get((int) (short) 0);
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertNotNull(doubleArray7);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.5d + "'", double8 == 8.5d);
    org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
  }

  @Test
  public void test0993() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0993");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        (int) ' ', (-1));
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0995() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0995");
    net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData(
        "\t\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
  }

  @Test
  public void test0996() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0996");
    net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
    java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 1,
        (int) (short) 0);
    org.junit.Assert.assertNotNull(strList3);
  }

  @Test
  public void test0997() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0997");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)",
        (int) (short) 10, (int) (byte) 1);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test0998() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0998");
    double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(
        doubleArray5);
    double double9 = quarterlyDouble7.get(0);
    double double12 = quarterlyDouble7.deltaQ((int) (byte) 100, 0);
    // The following exception was thrown during execution in test generation
    try {
      double double13 = quarterlyDouble7.getQoQ();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    org.junit.Assert.assertNotNull(doubleArray5);
    org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
  }

  @Test
  public void test0999() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test0999");
    net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany(
        "\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)",
        (int) (byte) 100, (int) (byte) 10);
    org.junit.Assert.assertNull(fieldData3);
  }

  @Test
  public void test1000() throws Throwable {
    if (debug) System.out.format("%n%s%n", "CollationTests1.test1000");
    java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary
        .getCompanySummary((int) (byte) 100, (int) 'a');
    org.junit.Assert.assertNotNull(companySummaryList2);
  }
}
