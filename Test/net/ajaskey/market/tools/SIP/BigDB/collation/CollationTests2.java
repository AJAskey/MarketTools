package net.ajaskey.market.tools.SIP.BigDB.collation;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CollationTests2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1001");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)", (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1002");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1003");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\t\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1004");
        double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double8 = quarterlyDouble7.getTtm();
        double[] doubleArray15 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        double double18 = quarterlyDouble17.getTtm();
        double[] doubleArray24 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        quarterlyDouble17.dArr = doubleArray24;
        quarterlyDouble7.dArr = doubleArray24;
        double double30 = quarterlyDouble7.get((int) (short) 10);
        double double31 = quarterlyDouble7.getTtmAvg();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 11.0d + "'", double8 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 12.0d + "'", double18 == 12.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-9999.9999d) + "'", double30 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 2.75d + "'", double31 == 2.75d);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1005");
        double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        double double9 = quarterlyDouble8.getMostRecent();
        double double10 = quarterlyDouble8.getTtmAvg();
        double double11 = quarterlyDouble8.getQseqQ();
        double[] doubleArray17 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        double double20 = quarterlyDouble19.getMostRecent();
        double double21 = quarterlyDouble19.getTtmAvg();
        double double22 = quarterlyDouble19.getQseqQ();
        double double23 = quarterlyDouble19.getTtmAvg();
        double[] doubleArray24 = quarterlyDouble19.dArr;
        quarterlyDouble8.dArr = doubleArray24;
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 900.0d + "'", double11 == 900.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2.75d + "'", double21 == 2.75d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-200.0d) + "'", double22 == (-200.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2.75d + "'", double23 == 2.75d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1006");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) -1, (int) '#');
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1007");
        double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        double double9 = quarterlyDouble8.getTtm();
        java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
        java.lang.String str13 = quarterlyDouble8.fmtGrowth4Q("");
        double double14 = quarterlyDouble8.getTtm();
        double[] doubleArray15 = quarterlyDouble8.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        java.lang.String str18 = quarterlyDouble16.fmtGrowth1Q("\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        double[] doubleArray24 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        double double27 = quarterlyDouble26.getMostRecent();
        double double28 = quarterlyDouble26.getTtmAvg();
        double double29 = quarterlyDouble26.getQseqQ();
        double double30 = quarterlyDouble26.getTtmAvg();
        double[] doubleArray36 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray36);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble38 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray36);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray36);
        quarterlyDouble26.dArr = doubleArray36;
        double[] doubleArray41 = quarterlyDouble26.dArr;
        double[] doubleArray47 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble48 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray47);
        double[] doubleArray49 = quarterlyDouble48.dArr;
        double[] doubleArray50 = quarterlyDouble48.dArr;
        quarterlyDouble26.dArr = doubleArray50;
        quarterlyDouble16.dArr = doubleArray50;
        double[] doubleArray58 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble59 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray58);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble60 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray58);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble61 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray58);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble62 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray58);
        double[] doubleArray69 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble70 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray69);
        double double71 = quarterlyDouble70.getTtmAvg();
        double double72 = quarterlyDouble70.getQoQ();
        double double73 = quarterlyDouble70.getTtmAvg();
        double double75 = quarterlyDouble70.get(0);
        java.lang.String str77 = quarterlyDouble70.fmtGrowth4Q("\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        double[] doubleArray83 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble84 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray83);
        double double85 = quarterlyDouble84.getQseqQ();
        double[] doubleArray86 = quarterlyDouble84.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble87 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray86);
        quarterlyDouble70.dArr = doubleArray86;
        quarterlyDouble62.dArr = doubleArray86;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble90 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray86);
        quarterlyDouble16.dArr = doubleArray86;
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11, "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str13, "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 12.0d + "'", double14 == 12.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str18, "\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
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
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 3.0d + "'", double71 == 3.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-90.0d) + "'", double72 == (-90.0d));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 3.0d + "'", double73 == 3.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 1.0d + "'", double75 == 1.0d);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str77, "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[97.0, 35.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 3600.0d + "'", double85 == 3600.0d);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1008");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 1, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1009");
        double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double8 = quarterlyDouble7.getMostRecent();
        double double9 = quarterlyDouble7.getTtmAvg();
        double double10 = quarterlyDouble7.getQseqQ();
        double double11 = quarterlyDouble7.getTtmAvg();
        double[] doubleArray17 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        quarterlyDouble7.dArr = doubleArray17;
        double double22 = quarterlyDouble7.getQseqQ();
        double[] doubleArray23 = quarterlyDouble7.dArr;
        double double25 = quarterlyDouble7.get((int) (byte) 10);
        double double26 = quarterlyDouble7.getQseqQ();
        double[] doubleArray27 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray27);
        double double29 = quarterlyDouble28.getTtmAvg();
        double[] doubleArray30 = quarterlyDouble28.dArr;
        quarterlyDouble7.dArr = doubleArray30;
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
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-200.0d) + "'", double26 == (-200.0d));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1010");
        double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        double double9 = quarterlyDouble8.getTtm();
        double[] doubleArray15 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        quarterlyDouble8.dArr = doubleArray15;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = quarterlyDouble8.fmtGrowth4Q("\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1011");
        double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double8 = quarterlyDouble7.getMostRecent();
        double double9 = quarterlyDouble7.getTtmAvg();
        double double10 = quarterlyDouble7.getQseqQ();
        double double11 = quarterlyDouble7.getTtmAvg();
        double[] doubleArray17 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        quarterlyDouble7.dArr = doubleArray17;
        double[] doubleArray22 = quarterlyDouble7.dArr;
        double[] doubleArray28 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray28);
        double[] doubleArray30 = quarterlyDouble29.dArr;
        double[] doubleArray31 = quarterlyDouble29.dArr;
        quarterlyDouble7.dArr = doubleArray31;
        double double33 = quarterlyDouble7.getTtmAvg();
        double double35 = quarterlyDouble7.get((int) '#');
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
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 2.75d + "'", double33 == 2.75d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-9999.9999d) + "'", double35 == (-9999.9999d));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1012");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 1, 100);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1013");
        double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        double double8 = quarterlyDouble7.getTtmAvg();
        double double9 = quarterlyDouble7.getQoQ();
        double[] doubleArray15 = new double[] { 0L, 10.0f, 97.0d, 1.0d, 1.0f };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        quarterlyDouble7.dArr = doubleArray15;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        double[] doubleArray24 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        double double27 = quarterlyDouble26.getMostRecent();
        double double28 = quarterlyDouble26.getTtmAvg();
        double double29 = quarterlyDouble26.getQseqQ();
        double double30 = quarterlyDouble26.getTtmAvg();
        double[] doubleArray36 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray36);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble38 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray36);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray36);
        quarterlyDouble26.dArr = doubleArray36;
        double[] doubleArray41 = quarterlyDouble26.dArr;
        double[] doubleArray42 = quarterlyDouble26.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble43 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray42);
        quarterlyDouble18.dArr = doubleArray42;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str46 = quarterlyDouble18.fmtGrowth4Q("\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.0d + "'", double8 == 3.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-90.0d) + "'", double9 == (-90.0d));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 10.0, 97.0, 1.0, 1.0]");
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
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1014");
        double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        double double8 = quarterlyDouble7.getTtm();
        java.lang.String str10 = quarterlyDouble7.fmtGrowth4Q("\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 12.0d + "'", double8 == 12.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\t\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str10, "\t\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1015");
        double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double[] doubleArray7 = quarterlyDouble6.dArr;
        double double9 = quarterlyDouble6.get(0);
        double double11 = quarterlyDouble6.get((int) (byte) 10);
        double double12 = quarterlyDouble6.getQseqQ();
        double double13 = quarterlyDouble6.getQseqQ();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3600.0d + "'", double12 == 3600.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3600.0d + "'", double13 == 3600.0d);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1016");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 100, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList6);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1017");
        double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double8 = quarterlyDouble7.getMostRecent();
        double double9 = quarterlyDouble7.getTtmAvg();
        double double10 = quarterlyDouble7.getQseqQ();
        double double11 = quarterlyDouble7.getTtmAvg();
        double[] doubleArray12 = quarterlyDouble7.dArr;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = quarterlyDouble7.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1018");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1019");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(1, (int) '#');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1020");
        double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double[] doubleArray7 = quarterlyDouble6.dArr;
        double double10 = quarterlyDouble6.deltaQ(10, (int) (short) 1);
        double[] doubleArray17 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        double[] doubleArray25 = new double[] { '4', (-1), 100.0d, 3.0d, (byte) 1, 100.0f };
        quarterlyDouble18.dArr = doubleArray25;
        double[] doubleArray27 = quarterlyDouble18.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray27);
        quarterlyDouble6.dArr = doubleArray27;
        double double30 = quarterlyDouble6.getQoQ();
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
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-101.0d) + "'", double30 == (-101.0d));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1021");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) 'a', (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(companyDataList3);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1022");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        java.lang.Class<?> wildcardClass6 = strList3.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
        org.junit.Assert.assertNotNull(manyCompanyDataList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1023");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) '#', (int) '4');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1024");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1025");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1026");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1027");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) 'a', (-1));
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1028");
        double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        java.lang.String str9 = quarterlyDouble7.fmtGrowth1Q("");
        double double10 = quarterlyDouble7.getQseqQ();
        double double13 = quarterlyDouble7.deltaQ(1, 0);
        double double16 = quarterlyDouble7.deltaQ(1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str9, "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 900.0d + "'", double10 == 900.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1029");
        double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double8 = quarterlyDouble7.getMostRecent();
        double double9 = quarterlyDouble7.getTtmAvg();
        double double10 = quarterlyDouble7.getQseqQ();
        double double11 = quarterlyDouble7.getTtmAvg();
        double[] doubleArray17 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
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
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1030");
        double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        double double8 = quarterlyDouble7.getTtmAvg();
        double double9 = quarterlyDouble7.getQoQ();
        double[] doubleArray15 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        quarterlyDouble7.dArr = doubleArray15;
        // The following exception was thrown during execution in test generation
        try {
            double double21 = quarterlyDouble7.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.0d + "'", double8 == 3.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-90.0d) + "'", double9 == (-90.0d));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1031");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1032");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (-1), (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = strList3.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1033");
        double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        java.lang.String str9 = quarterlyDouble7.fmtGrowth1Q("");
        double double10 = quarterlyDouble7.getQseqQ();
        double double13 = quarterlyDouble7.deltaQ((int) 'a', 100);
        double double14 = quarterlyDouble7.getTtm();
        double double15 = quarterlyDouble7.getQseqQ();
        java.lang.String str17 = quarterlyDouble7.fmtGrowth1Q("\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str9, "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 900.0d + "'", double10 == 900.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 12.0d + "'", double14 == 12.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 900.0d + "'", double15 == 900.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\t\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str17, "\t\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1034");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 100, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        java.lang.Class<?> wildcardClass5 = companyDataList4.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1035");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData6 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList3, 0, (int) 'a');
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertNull(fieldData6);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1036");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1037");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 0, 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1038");
        double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double10 = quarterlyDouble7.deltaQ((-1), 1);
        double[] doubleArray11 = quarterlyDouble7.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = quarterlyDouble12.fmtGrowth1Q("\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1039");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) -1, 0);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1040");
        double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double9 = quarterlyDouble8.getQseqQ();
        double double10 = quarterlyDouble8.getTtm();
        double[] doubleArray17 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        double double20 = quarterlyDouble19.getTtm();
        double[] doubleArray26 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray26);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray26);
        quarterlyDouble19.dArr = doubleArray26;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray26);
        quarterlyDouble8.dArr = doubleArray26;
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-200.0d) + "'", double9 == (-200.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 11.0d + "'", double10 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 12.0d + "'", double20 == 12.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1041");
        double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double8 = quarterlyDouble7.getMostRecent();
        double double9 = quarterlyDouble7.getTtmAvg();
        double double10 = quarterlyDouble7.getQseqQ();
        double double11 = quarterlyDouble7.getTtmAvg();
        double double12 = quarterlyDouble7.getQseqQ();
        double[] doubleArray13 = quarterlyDouble7.dArr;
        double[] doubleArray14 = quarterlyDouble7.dArr;
        double[] doubleArray15 = quarterlyDouble7.dArr;
        double double16 = quarterlyDouble7.getQseqQ();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-200.0d) + "'", double12 == (-200.0d));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-200.0d) + "'", double16 == (-200.0d));
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1042");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1043");
        double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double7 = quarterlyDouble6.getMostRecent();
        double double8 = quarterlyDouble6.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = quarterlyDouble6.fmtGrowth4Q("\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.75d + "'", double8 == 2.75d);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1044");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 0, (int) '#');
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1045");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1046");
        double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double[] doubleArray7 = quarterlyDouble6.dArr;
        double double9 = quarterlyDouble6.get(0);
        double double11 = quarterlyDouble6.get((int) (byte) 10);
        double double12 = quarterlyDouble6.getTtm();
        double[] doubleArray18 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        double double21 = quarterlyDouble20.getMostRecent();
        double double22 = quarterlyDouble20.getTtmAvg();
        double double23 = quarterlyDouble20.getQseqQ();
        double double24 = quarterlyDouble20.getTtmAvg();
        double[] doubleArray25 = quarterlyDouble20.dArr;
        quarterlyDouble6.dArr = doubleArray25;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = quarterlyDouble6.fmtGrowth4Q("\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1047");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getCompany("\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        org.junit.Assert.assertNotNull(oneCompanyDataList1);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1048");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.lang.String str2 = companyData1.getTicker();
        java.lang.String str3 = companyData1.getTicker();
        java.lang.String str4 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
        java.lang.String str6 = companyData1.getTicker();
        java.lang.String str7 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = companyData1.getFdList();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList9);
        org.junit.Assert.assertNotNull(fieldDataList10);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1049");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) 10, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1050");
        double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        double double8 = quarterlyDouble7.getTtmAvg();
        double double9 = quarterlyDouble7.getQoQ();
        double double10 = quarterlyDouble7.getTtmAvg();
        java.lang.String str12 = quarterlyDouble7.fmtGrowth1Q("\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        double double13 = quarterlyDouble7.getQoQ();
        java.lang.String str15 = quarterlyDouble7.fmtGrowth4Q("\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)");
        double double16 = quarterlyDouble7.getQoQ();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.0d + "'", double8 == 3.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-90.0d) + "'", double9 == (-90.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str12, "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-90.0d) + "'", double13 == (-90.0d));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str15, "\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-90.0d) + "'", double16 == (-90.0d));
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1051");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) ' ', (int) (short) 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1052");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 100, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1053");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)", (int) (short) -1, 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1054");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) 'a', 0);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1055");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.lang.String str4 = companyData1.getTicker();
        java.lang.Class<?> wildcardClass5 = companyData1.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1056");
        double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        double double9 = quarterlyDouble7.get((int) '4');
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9999.9999d) + "'", double9 == (-9999.9999d));
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1057");
        double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        double double8 = quarterlyDouble7.getTtmAvg();
        double double9 = quarterlyDouble7.getQoQ();
        double double11 = quarterlyDouble7.get((int) 'a');
        double[] doubleArray12 = quarterlyDouble7.dArr;
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.0d + "'", double8 == 3.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-90.0d) + "'", double9 == (-90.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1058");
        double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        double double8 = quarterlyDouble7.getTtmAvg();
        double double9 = quarterlyDouble7.getQoQ();
        double double10 = quarterlyDouble7.getTtmAvg();
        double double12 = quarterlyDouble7.get(0);
        java.lang.String str14 = quarterlyDouble7.fmtGrowth4Q("\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        double[] doubleArray20 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        double double22 = quarterlyDouble21.getQseqQ();
        double[] doubleArray23 = quarterlyDouble21.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray23);
        quarterlyDouble7.dArr = doubleArray23;
        // The following exception was thrown during execution in test generation
        try {
            double double26 = quarterlyDouble7.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.0d + "'", double8 == 3.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-90.0d) + "'", double9 == (-90.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str14, "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[97.0, 35.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 3600.0d + "'", double22 == 3600.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1059");
        double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        double[] doubleArray14 = new double[] { '4', (-1), 100.0d, 3.0d, (byte) 1, 100.0f };
        quarterlyDouble7.dArr = doubleArray14;
        double[] doubleArray16 = quarterlyDouble7.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray16);
        java.lang.String str19 = quarterlyDouble17.fmtGrowth4Q("\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)");
        java.lang.String str21 = quarterlyDouble17.fmtGrowth1Q("\t\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        java.lang.String str23 = quarterlyDouble17.fmtGrowth4Q("\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)" + "'", str19, "\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\t\t\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         -1.00 M (Seq= -101.00% : QoQ= -101.00%)" + "'", str21, "\t\t\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         -1.00 M (Seq= -101.00% : QoQ= -101.00%)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)" + "'", str23, "\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1060");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) (short) 10, (int) (byte) 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) (byte) -1, (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) '#', (int) '#');
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNull(fieldData5);
        org.junit.Assert.assertNull(fieldData8);
        org.junit.Assert.assertNull(fieldData11);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1061");
        double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        double[] doubleArray14 = new double[] { '4', (-1), 100.0d, 3.0d, (byte) 1, 100.0f };
        quarterlyDouble7.dArr = doubleArray14;
        double[] doubleArray16 = quarterlyDouble7.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray16);
        double double18 = quarterlyDouble17.getTtm();
        double[] doubleArray25 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray25);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray25);
        double double28 = quarterlyDouble27.getTtm();
        java.lang.String str30 = quarterlyDouble27.fmtGrowth1Q("hi!");
        double double33 = quarterlyDouble27.deltaQ((int) (short) 10, (int) (short) 100);
        double double34 = quarterlyDouble27.getTtm();
        double double35 = quarterlyDouble27.getQseqQ();
        double[] doubleArray42 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble43 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray42);
        double[] doubleArray50 = new double[] { '4', (-1), 100.0d, 3.0d, (byte) 1, 100.0f };
        quarterlyDouble43.dArr = doubleArray50;
        double[] doubleArray52 = quarterlyDouble43.dArr;
        quarterlyDouble27.dArr = doubleArray52;
        quarterlyDouble17.dArr = doubleArray52;
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 103.0d + "'", double18 == 103.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 12.0d + "'", double28 == 12.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str30, "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 12.0d + "'", double34 == 12.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 900.0d + "'", double35 == 900.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1062");
        double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double8 = quarterlyDouble7.getMostRecent();
        double double9 = quarterlyDouble7.getTtmAvg();
        double double10 = quarterlyDouble7.getQseqQ();
        double double11 = quarterlyDouble7.getTtmAvg();
        double[] doubleArray17 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        quarterlyDouble7.dArr = doubleArray17;
        double double22 = quarterlyDouble7.getQseqQ();
        double[] doubleArray23 = quarterlyDouble7.dArr;
        java.lang.Class<?> wildcardClass24 = quarterlyDouble7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1063");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1064");
        double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double9 = quarterlyDouble8.getTtmAvg();
        double double10 = quarterlyDouble8.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = quarterlyDouble8.fmtGrowth1Q("\t\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 11.0d + "'", double10 == 11.0d);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1065");
        double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        double double8 = quarterlyDouble7.getTtmAvg();
        double double9 = quarterlyDouble7.getQoQ();
        double double11 = quarterlyDouble7.get((int) 'a');
        double double12 = quarterlyDouble7.getTtm();
        double double14 = quarterlyDouble7.get((int) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.0d + "'", double8 == 3.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-90.0d) + "'", double9 == (-90.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 12.0d + "'", double12 == 12.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1066");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 10, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
        org.junit.Assert.assertNotNull(companyDataList5);
        org.junit.Assert.assertNotNull(manyCompanyDataList6);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1067");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) 100, 1);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1068");
        double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        double double9 = quarterlyDouble8.getTtm();
        java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
        java.lang.String str13 = quarterlyDouble8.fmtGrowth4Q("");
        java.lang.String str15 = quarterlyDouble8.fmtGrowth1Q("");
        double double16 = quarterlyDouble8.getMostRecent();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11, "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str13, "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str15, "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1069");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getCompany("\t\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        org.junit.Assert.assertNotNull(oneCompanyDataList1);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1070");
        double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        double[] doubleArray14 = new double[] { '4', (-1), 100.0d, 3.0d, (byte) 1, 100.0f };
        quarterlyDouble7.dArr = doubleArray14;
        double[] doubleArray16 = quarterlyDouble7.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray16);
        java.lang.String str19 = quarterlyDouble17.fmtGrowth4Q("\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)");
        java.lang.String str21 = quarterlyDouble17.fmtGrowth1Q("\t\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        java.lang.String str23 = quarterlyDouble17.fmtGrowth4Q("\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)" + "'", str19, "\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\t\t\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         -1.00 M (Seq= -101.00% : QoQ= -101.00%)" + "'", str21, "\t\t\t                  :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         -1.00 M (Seq= -101.00% : QoQ= -101.00%)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)" + "'", str23, "\t\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1071");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 100, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) (byte) -1, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(companyDataList7);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1072");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = strList3.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1073");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 10, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) '4', (int) (byte) 1);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList6);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1074");
        double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double8 = quarterlyDouble7.getQseqQ();
        double double11 = quarterlyDouble7.deltaQ((int) '4', (int) ' ');
        double double12 = quarterlyDouble7.getMostRecent();
        double double13 = quarterlyDouble7.getTtmAvg();
        double double14 = quarterlyDouble7.getQseqQ();
        double[] doubleArray15 = quarterlyDouble7.dArr;
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3600.0d + "'", double8 == 3600.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 8.5d + "'", double13 == 8.5d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3600.0d + "'", double14 == 3600.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1075");
        double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double[] doubleArray7 = quarterlyDouble6.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double11 = quarterlyDouble8.deltaQ((int) '4', (int) (byte) 10);
        double double12 = quarterlyDouble8.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = quarterlyDouble8.fmtGrowth1Q("\t\t                  :        103.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.5d + "'", double12 == 8.5d);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1076");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) ' ', (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(manyCompanyDataList3);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1077");
        double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double8 = quarterlyDouble7.getMostRecent();
        double double9 = quarterlyDouble7.getTtmAvg();
        double double10 = quarterlyDouble7.getQseqQ();
        double double11 = quarterlyDouble7.getTtmAvg();
        double double12 = quarterlyDouble7.getQseqQ();
        double[] doubleArray13 = quarterlyDouble7.dArr;
        double[] doubleArray14 = quarterlyDouble7.dArr;
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
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1078");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) '4', (int) ' ');
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1079");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary((int) (short) 100, 10);
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1080");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 100, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
        org.junit.Assert.assertNotNull(manyCompanyDataList5);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1081");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.lang.String str2 = companyData1.getTicker();
        java.lang.String str3 = companyData1.getTicker();
        java.lang.String str4 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList5, (int) (byte) 10, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList5, (int) (short) -1, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList5);
        org.junit.Assert.assertNull(fieldData8);
        org.junit.Assert.assertNull(fieldData11);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1082");
        double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double8 = quarterlyDouble7.getQseqQ();
        double double11 = quarterlyDouble7.deltaQ((int) '4', (int) ' ');
        double double12 = quarterlyDouble7.getQseqQ();
        double double13 = quarterlyDouble7.getMostRecent();
        double double14 = quarterlyDouble7.getMostRecent();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3600.0d + "'", double8 == 3600.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3600.0d + "'", double12 == 3600.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1083");
        double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double8 = quarterlyDouble7.getMostRecent();
        double double9 = quarterlyDouble7.getTtmAvg();
        double double10 = quarterlyDouble7.getQseqQ();
        double double11 = quarterlyDouble7.getTtmAvg();
        double[] doubleArray17 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        quarterlyDouble7.dArr = doubleArray17;
        double[] doubleArray22 = quarterlyDouble7.dArr;
        double[] doubleArray28 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray28);
        double[] doubleArray30 = quarterlyDouble29.dArr;
        double[] doubleArray31 = quarterlyDouble29.dArr;
        quarterlyDouble7.dArr = doubleArray31;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray31);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray31);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble35 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray31);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray31);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray31);
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
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1084");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 100, (int) 'a');
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1085");
        double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double8 = quarterlyDouble7.getMostRecent();
        double double9 = quarterlyDouble7.getTtmAvg();
        double double10 = quarterlyDouble7.getQseqQ();
        double double11 = quarterlyDouble7.getTtmAvg();
        double[] doubleArray17 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        quarterlyDouble7.dArr = doubleArray17;
        double[] doubleArray22 = quarterlyDouble7.dArr;
        double[] doubleArray23 = quarterlyDouble7.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = quarterlyDouble24.fmtGrowth4Q("\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1086");
        double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        java.lang.String str9 = quarterlyDouble7.fmtGrowth1Q("");
        double double10 = quarterlyDouble7.getQoQ();
        double double13 = quarterlyDouble7.deltaQ((int) (short) 10, (int) (byte) 0);
        double double16 = quarterlyDouble7.deltaQ((int) '#', 0);
        double double17 = quarterlyDouble7.getQseqQ();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str9, "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-90.0d) + "'", double10 == (-90.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 900.0d + "'", double17 == 900.0d);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1087");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 10, 0);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1088");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 0, (int) ' ');
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1089");
        double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        double[] doubleArray14 = new double[] { '4', (-1), 100.0d, 3.0d, (byte) 1, 100.0f };
        quarterlyDouble7.dArr = doubleArray14;
        double double16 = quarterlyDouble7.getTtm();
        double double17 = quarterlyDouble7.getTtm();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 103.0d + "'", double16 == 103.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 103.0d + "'", double17 == 103.0d);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1090");
        double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double8 = quarterlyDouble7.getMostRecent();
        double double9 = quarterlyDouble7.getTtmAvg();
        double double10 = quarterlyDouble7.getQseqQ();
        double double11 = quarterlyDouble7.getTtmAvg();
        double[] doubleArray17 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        quarterlyDouble7.dArr = doubleArray17;
        double[] doubleArray22 = quarterlyDouble7.dArr;
        double double23 = quarterlyDouble7.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            double double24 = quarterlyDouble7.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-200.0d) + "'", double23 == (-200.0d));
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1091");
        double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double7 = quarterlyDouble6.getTtm();
        double double9 = quarterlyDouble6.get(100);
        double double10 = quarterlyDouble6.getQseqQ();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 34.0d + "'", double7 == 34.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9999.9999d) + "'", double9 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3600.0d + "'", double10 == 3600.0d);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1092");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 100, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1093");
        double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double8 = quarterlyDouble7.getMostRecent();
        double double9 = quarterlyDouble7.getTtmAvg();
        double double10 = quarterlyDouble7.getQseqQ();
        double double11 = quarterlyDouble7.getTtmAvg();
        double[] doubleArray17 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        quarterlyDouble7.dArr = doubleArray17;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        double double25 = quarterlyDouble24.getQseqQ();
        double[] doubleArray31 = new double[] { 100.0d, 900.0d, 0.0d, '#', (short) 1 };
        quarterlyDouble24.dArr = doubleArray31;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray31);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray31);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-200.0d) + "'", double25 == (-200.0d));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 900.0, 0.0, 35.0, 1.0]");
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1094");
        double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double[] doubleArray7 = quarterlyDouble6.dArr;
        double double9 = quarterlyDouble6.get(0);
        double[] doubleArray16 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray16);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray16);
        quarterlyDouble6.dArr = doubleArray16;
        double double20 = quarterlyDouble6.getTtmAvg();
        double double21 = quarterlyDouble6.getMostRecent();
        double double23 = quarterlyDouble6.get((int) '#');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 3.0d + "'", double20 == 3.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-9999.9999d) + "'", double23 == (-9999.9999d));
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1095");
        double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double7 = quarterlyDouble6.getQseqQ();
        double[] doubleArray8 = quarterlyDouble6.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3600.0d + "'", double7 == 3600.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1096");
        double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double[] doubleArray7 = quarterlyDouble6.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double[] doubleArray14 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray14);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray14);
        quarterlyDouble8.dArr = doubleArray14;
        double double18 = quarterlyDouble8.getTtm();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 11.0d + "'", double18 == 11.0d);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1097");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1098");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)", (int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1099");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        java.lang.String str2 = companyData1.getTicker();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str2, "\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1100");
        double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        java.lang.String str9 = quarterlyDouble7.fmtGrowth1Q("");
        double double10 = quarterlyDouble7.getQseqQ();
        double double13 = quarterlyDouble7.deltaQ((int) 'a', 100);
        double double14 = quarterlyDouble7.getQoQ();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str9, "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 900.0d + "'", double10 == 900.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-90.0d) + "'", double14 == (-90.0d));
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1101");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1102");
        double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double7 = quarterlyDouble6.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = quarterlyDouble6.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 3600.0d + "'", double7 == 3600.0d);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1103");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary((int) (byte) 100, (int) 'a');
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1104");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1105");
        double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        double[] doubleArray14 = new double[] { '4', (-1), 100.0d, 3.0d, (byte) 1, 100.0f };
        quarterlyDouble7.dArr = doubleArray14;
        double[] doubleArray16 = quarterlyDouble7.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray16);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[52.0, -1.0, 100.0, 3.0, 1.0, 100.0]");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1106");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) -1, 1);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1107");
        double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double[] doubleArray7 = quarterlyDouble6.dArr;
        double double9 = quarterlyDouble6.get(0);
        double[] doubleArray16 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray16);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray16);
        quarterlyDouble6.dArr = doubleArray16;
        double double20 = quarterlyDouble6.getTtmAvg();
        double double21 = quarterlyDouble6.getMostRecent();
        double[] doubleArray22 = quarterlyDouble6.dArr;
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 3.0d + "'", double20 == 3.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1108");
        double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        double double9 = quarterlyDouble8.getTtm();
        double[] doubleArray15 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        quarterlyDouble8.dArr = doubleArray15;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1109");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1110");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary((int) ' ', (int) (byte) 10);
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1111");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 1, 1);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1112");
        double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        java.lang.String str9 = quarterlyDouble7.fmtGrowth1Q("");
        double double10 = quarterlyDouble7.getQseqQ();
        double double11 = quarterlyDouble7.getTtmAvg();
        double[] doubleArray12 = quarterlyDouble7.dArr;
        double double13 = quarterlyDouble7.getQoQ();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str9, "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 900.0d + "'", double10 == 900.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 3.0d + "'", double11 == 3.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-90.0d) + "'", double13 == (-90.0d));
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1113");
        double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double[] doubleArray7 = quarterlyDouble6.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double11 = quarterlyDouble8.deltaQ((int) '4', (int) (byte) 10);
        double double14 = quarterlyDouble8.deltaQ((int) ' ', (int) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1114");
        double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double8 = quarterlyDouble7.getMostRecent();
        double double9 = quarterlyDouble7.getTtmAvg();
        double double10 = quarterlyDouble7.getQseqQ();
        double double11 = quarterlyDouble7.getTtmAvg();
        double[] doubleArray17 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        quarterlyDouble7.dArr = doubleArray17;
        double[] doubleArray22 = quarterlyDouble7.dArr;
        double[] doubleArray28 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray28);
        double[] doubleArray30 = quarterlyDouble29.dArr;
        double[] doubleArray31 = quarterlyDouble29.dArr;
        quarterlyDouble7.dArr = doubleArray31;
        double double33 = quarterlyDouble7.getTtmAvg();
        double double34 = quarterlyDouble7.getQseqQ();
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
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 2.75d + "'", double33 == 2.75d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-200.0d) + "'", double34 == (-200.0d));
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1115");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1116");
        double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double8 = quarterlyDouble7.getTtm();
        double[] doubleArray15 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        double double18 = quarterlyDouble17.getTtm();
        double[] doubleArray24 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        quarterlyDouble17.dArr = doubleArray24;
        quarterlyDouble7.dArr = doubleArray24;
        double[] doubleArray29 = quarterlyDouble7.dArr;
        double[] doubleArray36 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray36);
        java.lang.String str39 = quarterlyDouble37.fmtGrowth1Q("");
        double double40 = quarterlyDouble37.getQseqQ();
        double double41 = quarterlyDouble37.getTtmAvg();
        double[] doubleArray42 = quarterlyDouble37.dArr;
        java.lang.String str44 = quarterlyDouble37.fmtGrowth1Q("\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        double[] doubleArray45 = quarterlyDouble37.dArr;
        quarterlyDouble7.dArr = doubleArray45;
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
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str39, "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 900.0d + "'", double40 == 900.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 3.0d + "'", double41 == 3.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str44, "\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1117");
        java.util.List<java.lang.String> strList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList0, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1118");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) -1, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) (byte) -1, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList9 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) (short) 1, (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList12 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) 'a', (int) '#');
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(companyDataList9);
        org.junit.Assert.assertNotNull(companyDataList12);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1119");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.lang.String str2 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData6 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList3, (int) (byte) 1, (int) (byte) 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData9 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList3, (int) ' ', (int) ' ');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData12 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList3, (int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertNull(fieldData6);
        org.junit.Assert.assertNull(fieldData9);
        org.junit.Assert.assertNull(fieldData12);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1120");
        double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double8 = quarterlyDouble7.getMostRecent();
        double double9 = quarterlyDouble7.getTtmAvg();
        double double10 = quarterlyDouble7.getQseqQ();
        double double11 = quarterlyDouble7.getTtmAvg();
        double double12 = quarterlyDouble7.getQseqQ();
        double[] doubleArray18 = new double[] { 0L, 10.0f, 97.0d, 1.0d, 1.0f };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        quarterlyDouble7.dArr = doubleArray18;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        double double23 = quarterlyDouble22.getMostRecent();
        double double26 = quarterlyDouble22.deltaQ((int) (byte) 100, 1);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.75d + "'", double9 == 2.75d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-200.0d) + "'", double10 == (-200.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-200.0d) + "'", double12 == (-200.0d));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 10.0, 97.0, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1121");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, fieldDataArray0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, 100, (int) (byte) -1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, 100, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (short) 0, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData14 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) '4', (int) (byte) 10);
        org.junit.Assert.assertNotNull(fieldDataArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(fieldData5);
        org.junit.Assert.assertNull(fieldData8);
        org.junit.Assert.assertNull(fieldData11);
        org.junit.Assert.assertNull(fieldData14);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1122");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\t                  :        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
        java.lang.String str2 = companyData1.getTicker();
        java.lang.String str3 = companyData1.getTicker();
        java.lang.String str4 = companyData1.getTicker();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\t                  :        103.00 M (Seq= -101.00% : QoQ= -101.00%)" + "'", str2, "\t                  :        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\t                  :        103.00 M (Seq= -101.00% : QoQ= -101.00%)" + "'", str3, "\t                  :        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t                  :        103.00 M (Seq= -101.00% : QoQ= -101.00%)" + "'", str4, "\t                  :        103.00 M (Seq= -101.00% : QoQ= -101.00%)");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1123");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        java.lang.String str2 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.lang.String str4 = companyData1.getTicker();
        java.lang.String str5 = companyData1.getTicker();
        java.lang.String str6 = companyData1.getTicker();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str2, "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str4, "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str5, "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str6, "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1124");
        double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        java.lang.String str10 = quarterlyDouble8.fmtGrowth4Q("\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        double double12 = quarterlyDouble8.get((int) (short) 1);
        double double13 = quarterlyDouble8.getMostRecent();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str10, "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1125");
        double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        double double9 = quarterlyDouble8.getMostRecent();
        double double10 = quarterlyDouble8.getTtmAvg();
        double double11 = quarterlyDouble8.getQoQ();
        java.lang.String str13 = quarterlyDouble8.fmtGrowth1Q("");
        java.lang.String str15 = quarterlyDouble8.fmtGrowth4Q("\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-90.0d) + "'", double11 == (-90.0d));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str13, "\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\t\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str15, "\t\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1126");
        double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        double double9 = quarterlyDouble8.getTtm();
        java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
        double[] doubleArray12 = quarterlyDouble8.dArr;
        double double13 = quarterlyDouble8.getQseqQ();
        double double14 = quarterlyDouble8.getQoQ();
        java.lang.String str16 = quarterlyDouble8.fmtGrowth1Q("\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11, "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 900.0d + "'", double13 == 900.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-90.0d) + "'", double14 == (-90.0d));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str16, "\t\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1127");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, fieldDataArray0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, 0, 0);
        org.junit.Assert.assertNotNull(fieldDataArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(fieldData5);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1128");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(1, (int) ' ');
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1129");
        double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        double double9 = quarterlyDouble8.getTtm();
        java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
        java.lang.String str13 = quarterlyDouble8.fmtGrowth4Q("");
        double double14 = quarterlyDouble8.getTtm();
        double[] doubleArray20 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        double double24 = quarterlyDouble23.getTtmAvg();
        double double25 = quarterlyDouble23.getTtm();
        double double26 = quarterlyDouble23.getTtmAvg();
        double[] doubleArray27 = quarterlyDouble23.dArr;
        quarterlyDouble8.dArr = doubleArray27;
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11, "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str13, "\t                  :         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 12.0d + "'", double14 == 12.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 2.75d + "'", double24 == 2.75d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 11.0d + "'", double25 == 11.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 2.75d + "'", double26 == 2.75d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1130");
        double[] doubleArray5 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double[] doubleArray7 = quarterlyDouble6.dArr;
        double double9 = quarterlyDouble6.get(0);
        double[] doubleArray16 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray16);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray16);
        quarterlyDouble6.dArr = doubleArray16;
        double double20 = quarterlyDouble6.getTtm();
        double double23 = quarterlyDouble6.deltaQ((int) (byte) 10, (int) (short) -1);
        double double25 = quarterlyDouble6.get((int) '4');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 35.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 35.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 12.0d + "'", double20 == 12.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-9999.9999d) + "'", double25 == (-9999.9999d));
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1131");
        double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        java.lang.String str9 = quarterlyDouble7.fmtGrowth4Q("\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        double double12 = quarterlyDouble7.deltaQ((int) (short) 10, (int) (short) 100);
        java.lang.String str14 = quarterlyDouble7.fmtGrowth4Q("\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%)");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str9, "\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str14, "\t\thi!               :         -1.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1132");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (short) 100, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
        org.junit.Assert.assertNotNull(companyDataList5);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1133");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1134");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):        103.00 M (Seq= -101.00% : QoQ= -101.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)", 0, (int) (short) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1135");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.lang.String str2 = companyData1.getTicker();
        java.lang.String str3 = companyData1.getTicker();
        java.lang.String str4 = companyData1.getTicker();
        java.lang.String str5 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
        java.lang.String str7 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList8);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1136");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(100, (int) (short) 0);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1137");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.lang.String str3 = companyData1.getTicker();
        java.lang.String str4 = companyData1.getTicker();
        java.lang.String str5 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData9 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList6, (int) ' ', (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData12 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList6, 1, (int) (short) 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData15 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList6, 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNull(fieldData9);
        org.junit.Assert.assertNull(fieldData12);
        org.junit.Assert.assertNull(fieldData15);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1138");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.lang.String str3 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
        java.lang.String str5 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData9 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList6, (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNull(fieldData9);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1139");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 0, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) '#', (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
        org.junit.Assert.assertNotNull(companyDataList7);
        org.junit.Assert.assertNotNull(manyCompanyDataList8);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1140");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1141");
        double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        double double9 = quarterlyDouble8.getTtm();
        java.lang.String str11 = quarterlyDouble8.fmtGrowth1Q("hi!");
        double[] doubleArray12 = quarterlyDouble8.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        double[] doubleArray14 = quarterlyDouble13.dArr;
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 12.0d + "'", double9 == 12.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str11, "\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1142");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1143");
        double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double8 = quarterlyDouble7.getMostRecent();
        double double9 = quarterlyDouble7.getTtmAvg();
        double double10 = quarterlyDouble7.getQseqQ();
        double double11 = quarterlyDouble7.getTtmAvg();
        double[] doubleArray17 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        quarterlyDouble7.dArr = doubleArray17;
        double double22 = quarterlyDouble7.getQseqQ();
        double[] doubleArray23 = quarterlyDouble7.dArr;
        double double24 = quarterlyDouble7.getTtmAvg();
        double[] doubleArray25 = quarterlyDouble7.dArr;
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
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1144");
        double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double8 = quarterlyDouble7.getTtmAvg();
        double double10 = quarterlyDouble7.get(1);
        double double11 = quarterlyDouble7.getMostRecent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = quarterlyDouble7.fmtGrowth1Q("\thi!               :         10.00 M (Seq=  900.00% : QoQ=  -90.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.75d + "'", double8 == 2.75d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1145");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) -1, (int) '#');
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1146");
        double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double8 = quarterlyDouble7.getMostRecent();
        double double9 = quarterlyDouble7.getTtmAvg();
        double double10 = quarterlyDouble7.getQseqQ();
        double double11 = quarterlyDouble7.getTtmAvg();
        double[] doubleArray17 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        quarterlyDouble7.dArr = doubleArray17;
        double double22 = quarterlyDouble7.getQseqQ();
        double[] doubleArray23 = quarterlyDouble7.dArr;
        double[] doubleArray29 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray29);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray29);
        double double32 = quarterlyDouble31.getQseqQ();
        double double35 = quarterlyDouble31.deltaQ((int) '4', (int) ' ');
        double[] doubleArray41 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble42 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray41);
        double[] doubleArray43 = quarterlyDouble42.dArr;
        double double45 = quarterlyDouble42.get(0);
        double[] doubleArray52 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble53 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray52);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble54 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray52);
        quarterlyDouble42.dArr = doubleArray52;
        double double56 = quarterlyDouble42.getTtm();
        double double57 = quarterlyDouble42.getMostRecent();
        double[] doubleArray58 = quarterlyDouble42.dArr;
        quarterlyDouble31.dArr = doubleArray58;
        quarterlyDouble7.dArr = doubleArray58;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble61 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray58);
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
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[97.0, 35.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 3600.0d + "'", double32 == 3600.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[97.0, 35.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[97.0, 35.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 97.0d + "'", double45 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 12.0d + "'", double56 == 12.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 10.0d + "'", double57 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1147");
        double[] doubleArray6 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        double double8 = quarterlyDouble7.getTtmAvg();
        double double9 = quarterlyDouble7.getQoQ();
        double double10 = quarterlyDouble7.getTtmAvg();
        double double12 = quarterlyDouble7.get(0);
        double[] doubleArray19 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray19);
        quarterlyDouble7.dArr = doubleArray19;
        double[] doubleArray27 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray27);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray27);
        double double30 = quarterlyDouble29.getMostRecent();
        double double31 = quarterlyDouble29.getTtmAvg();
        double double32 = quarterlyDouble29.getQseqQ();
        double double33 = quarterlyDouble29.getTtmAvg();
        double double34 = quarterlyDouble29.getQseqQ();
        double[] doubleArray40 = new double[] { 0L, 10.0f, 97.0d, 1.0d, 1.0f };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray40);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble42 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray40);
        quarterlyDouble29.dArr = doubleArray40;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble44 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray40);
        double double46 = quarterlyDouble44.get((int) ' ');
        double[] doubleArray47 = quarterlyDouble44.dArr;
        double[] doubleArray53 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble54 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray53);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble55 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray53);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble56 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray53);
        quarterlyDouble44.dArr = doubleArray53;
        quarterlyDouble7.dArr = doubleArray53;
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.0d + "'", double8 == 3.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-90.0d) + "'", double9 == (-90.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 2.75d + "'", double31 == 2.75d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-200.0d) + "'", double32 == (-200.0d));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 2.75d + "'", double33 == 2.75d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-200.0d) + "'", double34 == (-200.0d));
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 10.0, 97.0, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-9999.9999d) + "'", double46 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 10.0, 97.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1148");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1149");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1150");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) 'a', 0);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1151");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, fieldDataArray0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(fieldDataArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(fieldData5);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1152");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1153");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 100, (int) (short) 1);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1154");
        double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double[] doubleArray7 = quarterlyDouble6.dArr;
        double double10 = quarterlyDouble6.deltaQ(10, (int) (short) 1);
        double double11 = quarterlyDouble6.getTtmAvg();
        double[] doubleArray18 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        double double20 = quarterlyDouble19.getTtmAvg();
        double double21 = quarterlyDouble19.getQoQ();
        double double22 = quarterlyDouble19.getTtmAvg();
        double double24 = quarterlyDouble19.get(0);
        java.lang.String str26 = quarterlyDouble19.fmtGrowth4Q("\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        double[] doubleArray32 = new double[] { 'a', '#', (short) -1, 0L, 0.0d };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray32);
        double double34 = quarterlyDouble33.getQseqQ();
        double[] doubleArray35 = quarterlyDouble33.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray35);
        quarterlyDouble19.dArr = doubleArray35;
        quarterlyDouble6.dArr = doubleArray35;
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.75d + "'", double11 == 2.75d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 10.0, 1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 3.0d + "'", double20 == 3.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-90.0d) + "'", double21 == (-90.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 3.0d + "'", double22 == 3.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)" + "'", str26, "\t\t\t                  :         10.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%):         12.00 M (Seq=  900.00% : QoQ=  -90.00%)");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[97.0, 35.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 3600.0d + "'", double34 == 3600.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[97.0, 35.0, -1.0, 0.0, 0.0]");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1155");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) -1, 1);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1156");
        double[] doubleArray5 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double8 = quarterlyDouble7.getTtm();
        double[] doubleArray15 = new double[] { (short) 1, 10L, (byte) 1, 1.0d, (short) 0, (byte) 100 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        double double18 = quarterlyDouble17.getTtm();
        double[] doubleArray24 = new double[] { (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        quarterlyDouble17.dArr = doubleArray24;
        quarterlyDouble7.dArr = doubleArray24;
        double[] doubleArray29 = quarterlyDouble7.dArr;
        double[] doubleArray30 = quarterlyDouble7.dArr;
        double double31 = quarterlyDouble7.getQseqQ();
        double double32 = quarterlyDouble7.getTtmAvg();
        double double33 = quarterlyDouble7.getQseqQ();
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
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-200.0d) + "'", double31 == (-200.0d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 2.75d + "'", double32 == 2.75d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-200.0d) + "'", double33 == (-200.0d));
    }
}

