package net.ajaskey.market.tools.SIP.BigDB.collation;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CollationTests1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0501");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 1, (-1));
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0502");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double double8 = quarterlyDouble1.getQoQ();
        double double9 = quarterlyDouble1.getPrevTtm();
        double double10 = quarterlyDouble1.getTtm();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0503");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double[] doubleArray8 = quarterlyDouble1.dArr;
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        double double14 = quarterlyDouble13.getTtm();
        double double15 = quarterlyDouble13.getPrevTtm();
        double double16 = quarterlyDouble13.getTtmAvg();
        double double17 = quarterlyDouble13.getQseqQ();
        double[] doubleArray21 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray21);
        double double23 = quarterlyDouble22.getTtmAvg();
        double[] doubleArray24 = new double[] {};
        quarterlyDouble22.dArr = doubleArray24;
        quarterlyDouble13.dArr = doubleArray24;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        quarterlyDouble1.dArr = doubleArray24;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 200.0d + "'", double17 == 200.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0504");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 10, (int) '#');
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0505");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double double8 = quarterlyDouble4.get2QTtm();
        java.lang.String str9 = quarterlyDouble4.toString();
        double[] doubleArray13 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray13);
        double double15 = quarterlyDouble14.getTtm();
        double double17 = quarterlyDouble14.get((int) (byte) 1);
        double[] doubleArray18 = quarterlyDouble14.dArr;
        double double19 = quarterlyDouble14.getTtmAvg();
        double[] doubleArray23 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray23);
        double double25 = quarterlyDouble24.getTtmAvg();
        double[] doubleArray26 = new double[] {};
        quarterlyDouble24.dArr = doubleArray26;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray26);
        quarterlyDouble14.dArr = doubleArray26;
        quarterlyDouble4.dArr = doubleArray26;
        double double31 = quarterlyDouble4.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = quarterlyDouble4.fmtGrowth1Q("\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str9, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0506");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double double6 = quarterlyDouble4.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 200.0d + "'", double6 == 200.0d);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0507");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(1, (int) '4');
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0508");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (byte) 1, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList2, (int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(companyDataList5);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0509");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) ' ', (int) (short) -1);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0510");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, 100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNull(fieldData5);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0511");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray11 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double double13 = quarterlyDouble12.getTtm();
        double double15 = quarterlyDouble12.get((int) (byte) 1);
        double[] doubleArray16 = quarterlyDouble12.dArr;
        double[] doubleArray20 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        quarterlyDouble12.dArr = doubleArray20;
        quarterlyDouble4.dArr = doubleArray20;
        java.lang.String str24 = quarterlyDouble4.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = quarterlyDouble4.fmtGrowth4Q("\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str24, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0512");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        java.lang.String str2 = companyData1.getTicker();
        java.lang.String str3 = companyData1.getTicker();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str2, "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str3, "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0513");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 100, (int) ' ');
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0514");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(10, (-1));
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0515");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
        double[] doubleArray8 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        quarterlyDouble4.dArr = doubleArray8;
        double double12 = quarterlyDouble4.get((int) (short) -1);
        double[] doubleArray16 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray16);
        double double18 = quarterlyDouble17.getTtm();
        double double19 = quarterlyDouble17.getPrevTtm();
        double double20 = quarterlyDouble17.getTtmAvg();
        double double21 = quarterlyDouble17.getQseqQ();
        double[] doubleArray25 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray25);
        double double27 = quarterlyDouble26.getTtmAvg();
        double[] doubleArray28 = new double[] {};
        quarterlyDouble26.dArr = doubleArray28;
        quarterlyDouble17.dArr = doubleArray28;
        quarterlyDouble4.dArr = doubleArray28;
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 200.0d + "'", double21 == 200.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0516");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        double[] doubleArray13 = quarterlyDouble12.dArr;
        quarterlyDouble4.dArr = doubleArray13;
        double double15 = quarterlyDouble4.getPrevTtm();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = quarterlyDouble4.getQseqQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0517");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double4 = quarterlyDouble1.deltaQ((int) (short) 10, (int) 'a');
        double double6 = quarterlyDouble1.get(100);
        double double7 = quarterlyDouble1.getPrevTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = quarterlyDouble1.fmtGrowth4Q("\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-9999.9999d) + "'", double6 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0518");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0519");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0520");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.getQseqQ();
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        double double14 = quarterlyDouble13.getTtmAvg();
        double[] doubleArray15 = new double[] {};
        quarterlyDouble13.dArr = doubleArray15;
        quarterlyDouble4.dArr = doubleArray15;
        java.lang.String str18 = quarterlyDouble4.toString();
        double double19 = quarterlyDouble4.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = quarterlyDouble4.fmtGrowth1Q("\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 200.0d + "'", double8 == 200.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0521");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.lang.String str3 = companyData1.getTicker();
        java.lang.String str4 = companyData1.getTicker();
        java.lang.String str5 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData9 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList6, (int) (short) 100, (int) ' ');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData12 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList6, 0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNull(fieldData9);
        org.junit.Assert.assertNull(fieldData12);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0522");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 10, (int) (byte) 100);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0523");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) ' ', (int) (byte) -1);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0524");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = quarterlyDouble4.fmtGrowth1Q("\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0525");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) (byte) 100, (int) (byte) 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) '4', (int) (byte) 1);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNull(fieldData5);
        org.junit.Assert.assertNull(fieldData8);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0526");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray11 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double double13 = quarterlyDouble12.getTtm();
        double double15 = quarterlyDouble12.get((int) (byte) 1);
        double[] doubleArray16 = quarterlyDouble12.dArr;
        double[] doubleArray20 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        quarterlyDouble12.dArr = doubleArray20;
        quarterlyDouble4.dArr = doubleArray20;
        double[] doubleArray24 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        double double26 = quarterlyDouble25.getPrevTtm();
        double double27 = quarterlyDouble25.get2QTtm();
        double[] doubleArray31 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray31);
        double double33 = quarterlyDouble32.getTtmAvg();
        double[] doubleArray34 = new double[] {};
        quarterlyDouble32.dArr = doubleArray34;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray34);
        quarterlyDouble25.dArr = doubleArray34;
        quarterlyDouble4.dArr = doubleArray34;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray34);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble40 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray34);
        java.lang.String str41 = quarterlyDouble40.toString();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0527");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.getQseqQ();
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        double double14 = quarterlyDouble13.getTtmAvg();
        double[] doubleArray15 = new double[] {};
        quarterlyDouble13.dArr = doubleArray15;
        quarterlyDouble4.dArr = doubleArray15;
        java.lang.String str18 = quarterlyDouble4.toString();
        double double19 = quarterlyDouble4.getTtm();
        java.lang.Class<?> wildcardClass20 = quarterlyDouble4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 200.0d + "'", double8 == 200.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0528");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000", 10, (int) (short) -1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0529");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) -1, 100);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0530");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.get(1);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0531");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.getTtm();
        java.lang.String str5 = quarterlyDouble1.fmtGrowth1Q("\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        double double6 = quarterlyDouble1.get2QTtm();
        double double7 = quarterlyDouble1.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = quarterlyDouble1.deltaQ((int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str5, "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0532");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0533");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary((int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0534");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double[] doubleArray9 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        quarterlyDouble4.dArr = doubleArray9;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        double double13 = quarterlyDouble12.get2QTtm();
        double double14 = quarterlyDouble12.get2QTtm();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = quarterlyDouble12.getMostRecent();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0535");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double[] doubleArray9 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        quarterlyDouble4.dArr = doubleArray9;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        double double13 = quarterlyDouble12.get2QTtm();
        double double14 = quarterlyDouble12.getTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0536");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray11 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double double13 = quarterlyDouble12.getTtm();
        double double15 = quarterlyDouble12.get((int) (byte) 1);
        double[] doubleArray16 = quarterlyDouble12.dArr;
        double[] doubleArray20 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        quarterlyDouble12.dArr = doubleArray20;
        quarterlyDouble4.dArr = doubleArray20;
        double double24 = quarterlyDouble4.get2QTtm();
        double double25 = quarterlyDouble4.getQseqQ();
        java.lang.String str26 = quarterlyDouble4.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double27 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 200.0d + "'", double25 == 200.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str26, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0537");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double[] doubleArray8 = quarterlyDouble1.dArr;
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        double double14 = quarterlyDouble13.getTtm();
        double double15 = quarterlyDouble13.getPrevTtm();
        double double16 = quarterlyDouble13.getTtmAvg();
        double double17 = quarterlyDouble13.getQseqQ();
        double[] doubleArray21 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray21);
        double double23 = quarterlyDouble22.getTtmAvg();
        double[] doubleArray24 = new double[] {};
        quarterlyDouble22.dArr = doubleArray24;
        quarterlyDouble13.dArr = doubleArray24;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        quarterlyDouble1.dArr = doubleArray24;
        double double29 = quarterlyDouble1.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            double double30 = quarterlyDouble1.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 200.0d + "'", double17 == 200.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0538");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        double double6 = quarterlyDouble1.deltaQ((int) (byte) 10, (int) (short) -1);
        double double8 = quarterlyDouble1.get((int) (byte) 100);
        double double9 = quarterlyDouble1.getMostRecent();
        java.lang.String str11 = quarterlyDouble1.fmtGrowth1Q("\t\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9999.9999d) + "'", double8 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t\t\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str11, "\t\t\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0539");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double double8 = quarterlyDouble1.getQoQ();
        double double9 = quarterlyDouble1.getMostRecent();
        double double10 = quarterlyDouble1.getQseqQ();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0540");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\t\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0541");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        double double4 = quarterlyDouble1.getMostRecent();
        java.lang.String str6 = quarterlyDouble1.fmtGrowth1Q("");
        double double8 = quarterlyDouble1.get(10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str6, "\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9999.9999d) + "'", double8 == (-9999.9999d));
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0542");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double double8 = quarterlyDouble4.getMostRecent();
        double double9 = quarterlyDouble4.get2QTtm();
        double double12 = quarterlyDouble4.deltaQ((int) (byte) 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = quarterlyDouble4.fmtGrowth4Q("\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0543");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList10 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList13 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList3, 10, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(companyDataList7);
        org.junit.Assert.assertNotNull(companyDataList10);
        org.junit.Assert.assertNotNull(companyDataList13);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0544");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
        double[] doubleArray8 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        quarterlyDouble4.dArr = doubleArray8;
        double double12 = quarterlyDouble4.get((int) 'a');
        double double13 = quarterlyDouble4.getTtm();
        double double16 = quarterlyDouble4.deltaQ((int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0545");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, fieldDataArray0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (byte) -1, (int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (byte) 10, 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(fieldDataArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(fieldData5);
        org.junit.Assert.assertNull(fieldData8);
        org.junit.Assert.assertNull(fieldData11);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0546");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) ' ', (int) (byte) 10);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0547");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        java.lang.String str6 = quarterlyDouble4.toString();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double9 = quarterlyDouble4.get((int) ' ');
        double double10 = quarterlyDouble4.getQseqQ();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str6, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9999.9999d) + "'", double9 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 200.0d + "'", double10 == 200.0d);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0548");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double[] doubleArray9 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        quarterlyDouble4.dArr = doubleArray9;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        java.lang.String str13 = quarterlyDouble12.toString();
        double double16 = quarterlyDouble12.deltaQ((int) '4', (int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0549");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) 'a', (int) '#');
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0550");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, fieldDataArray0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (short) 100, (int) (byte) 10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, 10, (int) (short) 1);
        org.junit.Assert.assertNotNull(fieldDataArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(fieldData5);
        org.junit.Assert.assertNull(fieldData8);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0551");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double double8 = quarterlyDouble1.getQoQ();
        double double9 = quarterlyDouble1.getPrevTtm();
        double double10 = quarterlyDouble1.getQseqQ();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0552");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double[] doubleArray8 = quarterlyDouble1.dArr;
        double double9 = quarterlyDouble1.getTtmAvg();
        double double10 = quarterlyDouble1.getMostRecent();
        double double11 = quarterlyDouble1.getQoQ();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0553");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 0, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0554");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double double7 = quarterlyDouble4.get(1);
        double double8 = quarterlyDouble4.getQseqQ();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 200.0d + "'", double8 == 200.0d);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0555");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double[] doubleArray9 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        double double11 = quarterlyDouble10.getTtm();
        double double13 = quarterlyDouble10.get((int) (byte) 1);
        double[] doubleArray14 = quarterlyDouble10.dArr;
        quarterlyDouble4.dArr = doubleArray14;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 1.0, -1.0]");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0556");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) '#', (int) '4');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0557");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double double8 = quarterlyDouble4.get2QTtm();
        java.lang.String str9 = quarterlyDouble4.toString();
        double double10 = quarterlyDouble4.getQseqQ();
        double[] doubleArray11 = quarterlyDouble4.dArr;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = quarterlyDouble4.deltaQ((int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str9, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 200.0d + "'", double10 == 200.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0, -1.0]");
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0558");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (-1), (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
        org.junit.Assert.assertNotNull(companyDataList5);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0559");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary((int) (short) -1, 1);
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0560");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) (byte) 0, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) ' ', (int) ' ');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, 0, (int) (byte) 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData14 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) (byte) 1, (int) (byte) -1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData17 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (-1), (int) (byte) 100);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNull(fieldData5);
        org.junit.Assert.assertNull(fieldData8);
        org.junit.Assert.assertNull(fieldData11);
        org.junit.Assert.assertNull(fieldData14);
        org.junit.Assert.assertNull(fieldData17);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0561");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 100, 0);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0562");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\t\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) (short) 10, 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0563");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double4 = quarterlyDouble1.get((int) ' ');
        double double7 = quarterlyDouble1.deltaQ((int) '#', (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-9999.9999d) + "'", double4 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0564");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double double8 = quarterlyDouble4.get2QTtm();
        java.lang.String str9 = quarterlyDouble4.toString();
        double[] doubleArray13 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray13);
        double double15 = quarterlyDouble14.getTtm();
        double double17 = quarterlyDouble14.get((int) (byte) 1);
        double[] doubleArray18 = quarterlyDouble14.dArr;
        double double19 = quarterlyDouble14.getTtmAvg();
        double[] doubleArray23 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray23);
        double double25 = quarterlyDouble24.getTtmAvg();
        double[] doubleArray26 = new double[] {};
        quarterlyDouble24.dArr = doubleArray26;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray26);
        quarterlyDouble14.dArr = doubleArray26;
        quarterlyDouble4.dArr = doubleArray26;
        // The following exception was thrown during execution in test generation
        try {
            double double31 = quarterlyDouble4.getQseqQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str9, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0565");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 1, (int) (short) 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0566");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        double double4 = quarterlyDouble1.getMostRecent();
        double double5 = quarterlyDouble1.getQoQ();
        double double6 = quarterlyDouble1.getMostRecent();
        double double7 = quarterlyDouble1.getQseqQ();
        double double8 = quarterlyDouble1.getPrevTtm();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0567");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (short) 10, (int) ' ');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0568");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) 'a', 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0569");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000", (int) '4', (int) 'a');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0570");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.getTtm();
        java.lang.String str5 = quarterlyDouble1.fmtGrowth1Q("\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        double double7 = quarterlyDouble1.get(100);
        java.lang.Class<?> wildcardClass8 = quarterlyDouble1.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str5, "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0571");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) ' ', (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) ' ', (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList9 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, 0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(companyDataList9);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0572");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) 1, (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0573");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get((int) (byte) -1, 10, snpEnum2, dowEnum3, exchEnum4, (double) 0, (long) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList10 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList7, (int) 'a', 0);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(companyDataList10);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0574");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.lang.String str4 = companyData1.getTicker();
        java.lang.String str5 = companyData1.getTicker();
        java.lang.String str6 = companyData1.getTicker();
        java.lang.String str7 = companyData1.getTicker();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0575");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double double8 = quarterlyDouble4.getMostRecent();
        double double9 = quarterlyDouble4.get2QTtm();
        double double12 = quarterlyDouble4.deltaQ((int) (byte) 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = quarterlyDouble4.fmtGrowth1Q("\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0576");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) ' ', (int) (short) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) '#', (int) (short) -1);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
        org.junit.Assert.assertNotNull(companyDataList7);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0577");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        quarterlyDouble4.dArr = doubleArray12;
        double[] doubleArray18 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        double double20 = quarterlyDouble19.getTtm();
        double double22 = quarterlyDouble19.get((int) (byte) 1);
        double[] doubleArray23 = quarterlyDouble19.dArr;
        double[] doubleArray24 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        quarterlyDouble19.dArr = doubleArray24;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        quarterlyDouble4.dArr = doubleArray24;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        double double31 = quarterlyDouble29.get((-1));
        double double32 = quarterlyDouble29.get2QTtm();
        // The following exception was thrown during execution in test generation
        try {
            double double33 = quarterlyDouble29.getMostRecent();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-9999.9999d) + "'", double31 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0578");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double double8 = quarterlyDouble1.getQoQ();
        java.lang.String str10 = quarterlyDouble1.fmtGrowth1Q("\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        double double11 = quarterlyDouble1.getMostRecent();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str10, "\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0579");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        quarterlyDouble4.dArr = doubleArray12;
        double[] doubleArray18 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        double double20 = quarterlyDouble19.getTtm();
        double double22 = quarterlyDouble19.get((int) (byte) 1);
        double[] doubleArray23 = quarterlyDouble19.dArr;
        double[] doubleArray24 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        quarterlyDouble19.dArr = doubleArray24;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        quarterlyDouble4.dArr = doubleArray24;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        double double31 = quarterlyDouble29.get((-1));
        double double32 = quarterlyDouble29.getPrevTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = quarterlyDouble29.fmtGrowth4Q("\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-9999.9999d) + "'", double31 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0580");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (short) -1, (int) '#');
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0581");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\t\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) '#', 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0582");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double double8 = quarterlyDouble4.get2QTtm();
        java.lang.String str9 = quarterlyDouble4.toString();
        double[] doubleArray13 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray13);
        double double15 = quarterlyDouble14.getTtm();
        double double17 = quarterlyDouble14.get((int) (byte) 1);
        double[] doubleArray18 = quarterlyDouble14.dArr;
        double double19 = quarterlyDouble14.getTtmAvg();
        double[] doubleArray23 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray23);
        double double25 = quarterlyDouble24.getTtmAvg();
        double[] doubleArray26 = new double[] {};
        quarterlyDouble24.dArr = doubleArray26;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray26);
        quarterlyDouble14.dArr = doubleArray26;
        quarterlyDouble4.dArr = doubleArray26;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = quarterlyDouble4.fmtGrowth1Q("\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str9, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0583");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0584");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double9 = quarterlyDouble4.get2QTtm();
        double double12 = quarterlyDouble4.deltaQ(100, 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0585");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 10, 0);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0586");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get((int) ' ', (int) (short) 10, snpEnum2, dowEnum3, exchEnum4, (-9999.9999d), (long) 100);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0587");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) (byte) 1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = fieldData5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNull(fieldData5);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0588");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        java.lang.String str2 = quarterlyDouble1.toString();
        double double3 = quarterlyDouble1.getTtmAvg();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0589");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 10, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
        org.junit.Assert.assertNotNull(companyDataList5);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0590");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getCompany("\t\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertNotNull(oneCompanyDataList1);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0591");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.lang.String str4 = companyData1.getTicker();
        java.lang.String str5 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData10 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList7, (int) (short) 1, (-1));
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNull(fieldData10);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0592");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) '#', (int) (short) -1);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0593");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary((int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0594");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(0, (int) (byte) 100);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0595");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double double7 = quarterlyDouble4.get(1);
        double double8 = quarterlyDouble4.getMostRecent();
        java.lang.String str9 = quarterlyDouble4.toString();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str9, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0596");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 10, (int) ' ');
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0597");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double[] doubleArray6 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        double double8 = quarterlyDouble7.getTtm();
        double double10 = quarterlyDouble7.get((int) (byte) 1);
        double[] doubleArray11 = quarterlyDouble7.dArr;
        quarterlyDouble1.dArr = doubleArray11;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = quarterlyDouble14.fmtGrowth4Q("\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0, -1.0]");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0598");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble3 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double[] doubleArray5 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double[] doubleArray7 = quarterlyDouble6.dArr;
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0599");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) '#', (int) (byte) 1);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0600");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary((int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0601");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble4.deltaQ(0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = quarterlyDouble4.fmtGrowth1Q("\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0602");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        java.lang.String str8 = quarterlyDouble4.toString();
        double double9 = quarterlyDouble4.getMostRecent();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str8, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0603");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) -1, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) (byte) 1, 100);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList6);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0604");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
        double double8 = quarterlyDouble4.getTtm();
        double[] doubleArray9 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = quarterlyDouble10.fmtGrowth1Q("\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0605");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 100, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0606");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\t\t\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0607");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        java.lang.String str8 = quarterlyDouble4.toString();
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        double double14 = quarterlyDouble13.getTtm();
        java.lang.String str15 = quarterlyDouble13.toString();
        double[] doubleArray19 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray19);
        double double21 = quarterlyDouble20.getTtmAvg();
        double double22 = quarterlyDouble20.getTtmAvg();
        double[] doubleArray23 = quarterlyDouble20.dArr;
        quarterlyDouble13.dArr = doubleArray23;
        quarterlyDouble4.dArr = doubleArray23;
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str8, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str15, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 1.0, -1.0]");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0608");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.getTtm();
        double[] doubleArray7 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double9 = quarterlyDouble8.getTtmAvg();
        double[] doubleArray10 = new double[] {};
        quarterlyDouble8.dArr = doubleArray10;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble1.dArr = doubleArray10;
        double double16 = quarterlyDouble1.deltaQ((int) (byte) -1, 0);
        double double18 = quarterlyDouble1.get(0);
        double[] doubleArray19 = quarterlyDouble1.dArr;
        // The following exception was thrown during execution in test generation
        try {
            double double20 = quarterlyDouble1.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-9999.9999d) + "'", double18 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0609");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (-1), (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList4);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0610");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double4 = quarterlyDouble1.deltaQ(100, (int) (short) 10);
        java.lang.String str5 = quarterlyDouble1.toString();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str5, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0611");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        java.lang.String str6 = quarterlyDouble4.toString();
        double double7 = quarterlyDouble4.get2QTtm();
        double double8 = quarterlyDouble4.getMostRecent();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str6, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0612");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) (short) 1, 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNull(fieldData5);
        org.junit.Assert.assertNull(fieldData8);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0613");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 10, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0614");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.getQseqQ();
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        double double14 = quarterlyDouble13.getTtmAvg();
        double[] doubleArray15 = new double[] {};
        quarterlyDouble13.dArr = doubleArray15;
        quarterlyDouble4.dArr = doubleArray15;
        double double19 = quarterlyDouble4.get((int) (byte) 10);
        java.lang.String str20 = quarterlyDouble4.toString();
        double[] doubleArray21 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray21);
        double double23 = quarterlyDouble22.getPrevTtm();
        double double24 = quarterlyDouble22.getTtm();
        double[] doubleArray28 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray28);
        double double30 = quarterlyDouble29.getTtmAvg();
        double[] doubleArray31 = new double[] {};
        quarterlyDouble29.dArr = doubleArray31;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray31);
        quarterlyDouble22.dArr = doubleArray31;
        double double37 = quarterlyDouble22.deltaQ((int) (byte) -1, 0);
        double double39 = quarterlyDouble22.get(0);
        double[] doubleArray40 = quarterlyDouble22.dArr;
        quarterlyDouble4.dArr = doubleArray40;
        double double43 = quarterlyDouble4.get((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double46 = quarterlyDouble4.deltaQ((int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 200.0d + "'", double8 == 200.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-9999.9999d) + "'", double19 == (-9999.9999d));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-9999.9999d) + "'", double39 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-9999.9999d) + "'", double43 == (-9999.9999d));
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0615");
        java.util.List<java.lang.String> strList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList0, (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0616");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) -1, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, 1, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(companyDataList7);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0617");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double[] doubleArray8 = quarterlyDouble1.dArr;
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        double double14 = quarterlyDouble13.getTtm();
        double double15 = quarterlyDouble13.getPrevTtm();
        double double16 = quarterlyDouble13.getTtmAvg();
        double double17 = quarterlyDouble13.getQseqQ();
        double[] doubleArray21 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray21);
        double double23 = quarterlyDouble22.getTtmAvg();
        double[] doubleArray24 = new double[] {};
        quarterlyDouble22.dArr = doubleArray24;
        quarterlyDouble13.dArr = doubleArray24;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        quarterlyDouble1.dArr = doubleArray24;
        double double29 = quarterlyDouble1.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            double double30 = quarterlyDouble1.getQseqQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 200.0d + "'", double17 == 200.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0618");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble3 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double[] doubleArray5 = quarterlyDouble4.dArr;
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getPrevTtm();
        double[] doubleArray8 = quarterlyDouble4.dArr;
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0619");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 10, 100);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0620");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double double8 = quarterlyDouble4.get2QTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = quarterlyDouble4.fmtGrowth4Q("\t\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0621");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double5 = quarterlyDouble1.getTtmAvg();
        java.lang.String str7 = quarterlyDouble1.fmtGrowth4Q("");
        double double9 = quarterlyDouble1.get(0);
        double double10 = quarterlyDouble1.getQseqQ();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str7, "\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0622");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double double8 = quarterlyDouble1.getQoQ();
        double double9 = quarterlyDouble1.getTtmAvg();
        double double10 = quarterlyDouble1.getQseqQ();
        double double11 = quarterlyDouble1.getTtmAvg();
        double[] doubleArray12 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        double double14 = quarterlyDouble13.getPrevTtm();
        double double15 = quarterlyDouble13.get2QTtm();
        java.lang.String str16 = quarterlyDouble13.toString();
        double double19 = quarterlyDouble13.deltaQ((int) (byte) 100, 0);
        double double20 = quarterlyDouble13.getQoQ();
        double double21 = quarterlyDouble13.getTtmAvg();
        double double22 = quarterlyDouble13.getQseqQ();
        double[] doubleArray23 = quarterlyDouble13.dArr;
        double[] doubleArray27 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray27);
        double double29 = quarterlyDouble28.getTtm();
        double double31 = quarterlyDouble28.get((int) (byte) 1);
        double double32 = quarterlyDouble28.get2QTtm();
        java.lang.String str33 = quarterlyDouble28.toString();
        double[] doubleArray37 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble38 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray37);
        double double39 = quarterlyDouble38.getTtm();
        double double41 = quarterlyDouble38.get((int) (byte) 1);
        double[] doubleArray42 = quarterlyDouble38.dArr;
        double double43 = quarterlyDouble38.getTtmAvg();
        double[] doubleArray47 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble48 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray47);
        double double49 = quarterlyDouble48.getTtmAvg();
        double[] doubleArray50 = new double[] {};
        quarterlyDouble48.dArr = doubleArray50;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble52 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray50);
        quarterlyDouble38.dArr = doubleArray50;
        quarterlyDouble28.dArr = doubleArray50;
        quarterlyDouble13.dArr = doubleArray50;
        quarterlyDouble1.dArr = doubleArray50;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble57 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray50);
        java.lang.Class<?> wildcardClass58 = quarterlyDouble57.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str16, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str33, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[]");
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0623");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.getQseqQ();
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        double double14 = quarterlyDouble13.getTtmAvg();
        double[] doubleArray15 = new double[] {};
        quarterlyDouble13.dArr = doubleArray15;
        quarterlyDouble4.dArr = doubleArray15;
        double double19 = quarterlyDouble4.get((int) (byte) 10);
        java.lang.String str20 = quarterlyDouble4.toString();
        double[] doubleArray21 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray21);
        double double23 = quarterlyDouble22.getPrevTtm();
        double double24 = quarterlyDouble22.getTtm();
        double[] doubleArray28 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray28);
        double double30 = quarterlyDouble29.getTtmAvg();
        double[] doubleArray31 = new double[] {};
        quarterlyDouble29.dArr = doubleArray31;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray31);
        quarterlyDouble22.dArr = doubleArray31;
        double double37 = quarterlyDouble22.deltaQ((int) (byte) -1, 0);
        double double39 = quarterlyDouble22.get(0);
        double[] doubleArray40 = quarterlyDouble22.dArr;
        quarterlyDouble4.dArr = doubleArray40;
        double double43 = quarterlyDouble4.get((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double44 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 200.0d + "'", double8 == 200.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-9999.9999d) + "'", double19 == (-9999.9999d));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-9999.9999d) + "'", double39 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-9999.9999d) + "'", double43 == (-9999.9999d));
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0624");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get(0, (int) '#', snpEnum2, dowEnum3, exchEnum4, (double) (byte) 10, 1L);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList7);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(manyCompanyDataList8);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0625");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (short) 100, 100);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0626");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList10 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList3, (int) (byte) -1, (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList13 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList3, 0, (int) (short) 100);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(companyDataList7);
        org.junit.Assert.assertNotNull(companyDataList10);
        org.junit.Assert.assertNotNull(companyDataList13);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0627");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary((int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0628");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 1, 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0629");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray11 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double double13 = quarterlyDouble12.getTtm();
        double double15 = quarterlyDouble12.get((int) (byte) 1);
        double[] doubleArray16 = quarterlyDouble12.dArr;
        double[] doubleArray20 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        quarterlyDouble12.dArr = doubleArray20;
        quarterlyDouble4.dArr = doubleArray20;
        double double24 = quarterlyDouble4.get2QTtm();
        java.lang.String str25 = quarterlyDouble4.toString();
        java.lang.String str26 = quarterlyDouble4.toString();
        double double27 = quarterlyDouble4.getMostRecent();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str25, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str26, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0630");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
        double[] doubleArray8 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        quarterlyDouble4.dArr = doubleArray8;
        double double12 = quarterlyDouble4.get((int) 'a');
        double double13 = quarterlyDouble4.get2QTtm();
        java.lang.String str14 = quarterlyDouble4.toString();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0631");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double double8 = quarterlyDouble1.getTtm();
        java.lang.Class<?> wildcardClass9 = quarterlyDouble1.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0632");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.getQseqQ();
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        double double14 = quarterlyDouble13.getTtmAvg();
        double[] doubleArray15 = new double[] {};
        quarterlyDouble13.dArr = doubleArray15;
        quarterlyDouble4.dArr = doubleArray15;
        double double18 = quarterlyDouble4.getTtmAvg();
        double double20 = quarterlyDouble4.get((int) (byte) 0);
        double double21 = quarterlyDouble4.getTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 200.0d + "'", double8 == 200.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-9999.9999d) + "'", double20 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0633");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double4 = quarterlyDouble1.get((int) (byte) 10);
        double double5 = quarterlyDouble1.getQoQ();
        double double8 = quarterlyDouble1.deltaQ((int) (byte) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-9999.9999d) + "'", double4 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0634");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) 'a', 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) (byte) 0, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList9 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(companyDataList9);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0635");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double double6 = quarterlyDouble4.getQseqQ();
        java.lang.String str7 = quarterlyDouble4.toString();
        double double8 = quarterlyDouble4.getTtmAvg();
        double double10 = quarterlyDouble4.get((int) (short) 10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 200.0d + "'", double6 == 200.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str7, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0636");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 10, (int) '#');
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0637");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double4 = quarterlyDouble1.get((int) ' ');
        double[] doubleArray5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double7 = quarterlyDouble6.getPrevTtm();
        double double8 = quarterlyDouble6.get2QTtm();
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        double double14 = quarterlyDouble13.getTtmAvg();
        double[] doubleArray15 = new double[] {};
        quarterlyDouble13.dArr = doubleArray15;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        quarterlyDouble6.dArr = doubleArray15;
        quarterlyDouble1.dArr = doubleArray15;
        // The following exception was thrown during execution in test generation
        try {
            double double20 = quarterlyDouble1.getQseqQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-9999.9999d) + "'", double4 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0638");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get((int) (short) 10, (int) (short) 100, snpEnum2, dowEnum3, exchEnum4, (double) 'a', (long) (byte) -1);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0639");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray8 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        double double12 = quarterlyDouble9.deltaQ((int) (byte) 0, 0);
        double double15 = quarterlyDouble9.deltaQ((int) (short) 100, 10);
        double double17 = quarterlyDouble9.get(10);
        double double19 = quarterlyDouble9.get((int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9999.9999d) + "'", double17 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0640");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
        double double8 = quarterlyDouble4.getTtm();
        double[] doubleArray9 = quarterlyDouble4.dArr;
        double double11 = quarterlyDouble4.get((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double12 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0641");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        java.lang.String str8 = quarterlyDouble4.toString();
        double[] doubleArray9 = quarterlyDouble4.dArr;
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str8, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 1.0, -1.0]");
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0642");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        double[] doubleArray7 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double9 = quarterlyDouble8.getTtmAvg();
        double[] doubleArray10 = new double[] {};
        quarterlyDouble8.dArr = doubleArray10;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble1.dArr = doubleArray10;
        double double15 = quarterlyDouble1.get((-1));
        double double16 = quarterlyDouble1.get2QTtm();
        java.lang.String str17 = quarterlyDouble1.toString();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9999.9999d) + "'", double15 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0643");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get((int) '4', 0, snpEnum2, dowEnum3, exchEnum4, (double) ' ', 10L);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0644");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)", 100, 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0645");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getCompany("\t\t\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertNotNull(oneCompanyDataList1);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0646");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        quarterlyDouble4.dArr = doubleArray12;
        double double15 = quarterlyDouble4.get2QTtm();
        double double16 = quarterlyDouble4.getTtmAvg();
        double double17 = quarterlyDouble4.getMostRecent();
        double double18 = quarterlyDouble4.getPrevTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = quarterlyDouble4.fmtGrowth1Q("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0647");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, 10, 10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, 10, (int) (short) 0);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNull(fieldData5);
        org.junit.Assert.assertNull(fieldData8);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0648");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
        double double10 = quarterlyDouble4.deltaQ(1, (int) (short) -1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0649");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) (byte) 1, 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0650");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (-1), (int) (short) 10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) (short) -1, (int) ' ');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) (byte) 100, (int) '#');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData14 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) ' ', (int) (short) 10);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNull(fieldData5);
        org.junit.Assert.assertNull(fieldData8);
        org.junit.Assert.assertNull(fieldData11);
        org.junit.Assert.assertNull(fieldData14);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0651");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double[] doubleArray8 = quarterlyDouble1.dArr;
        double double9 = quarterlyDouble1.get2QTtm();
        double double11 = quarterlyDouble1.get(0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0652");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double4 = quarterlyDouble1.get((int) ' ');
        double double5 = quarterlyDouble1.getQoQ();
        double double6 = quarterlyDouble1.getPrevTtm();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-9999.9999d) + "'", double4 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0653");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (byte) 0, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) ' ', 0);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList6);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0654");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double4 = quarterlyDouble1.deltaQ(100, (int) (short) 10);
        double double5 = quarterlyDouble1.getTtm();
        double double6 = quarterlyDouble1.getMostRecent();
        double double8 = quarterlyDouble1.get((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9999.9999d) + "'", double8 == (-9999.9999d));
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0655");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
        double double8 = quarterlyDouble4.getTtm();
        double[] doubleArray9 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        double double12 = quarterlyDouble10.get(0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0656");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double[] doubleArray8 = quarterlyDouble1.dArr;
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        double double14 = quarterlyDouble13.getTtm();
        double double15 = quarterlyDouble13.getPrevTtm();
        double double16 = quarterlyDouble13.getTtmAvg();
        double double17 = quarterlyDouble13.getQseqQ();
        double[] doubleArray21 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray21);
        double double23 = quarterlyDouble22.getTtmAvg();
        double[] doubleArray24 = new double[] {};
        quarterlyDouble22.dArr = doubleArray24;
        quarterlyDouble13.dArr = doubleArray24;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        quarterlyDouble1.dArr = doubleArray24;
        double double29 = quarterlyDouble1.get2QTtm();
        java.lang.Class<?> wildcardClass30 = quarterlyDouble1.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 200.0d + "'", double17 == 200.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0657");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary((-1), 100);
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0658");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 10, (int) (short) 100);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0659");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double[] doubleArray8 = quarterlyDouble1.dArr;
        double double9 = quarterlyDouble1.getTtmAvg();
        double double10 = quarterlyDouble1.getMostRecent();
        java.lang.String str11 = quarterlyDouble1.toString();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str11, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0660");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double double8 = quarterlyDouble1.getQoQ();
        double double9 = quarterlyDouble1.getTtmAvg();
        double double10 = quarterlyDouble1.getQseqQ();
        double[] doubleArray11 = quarterlyDouble1.dArr;
        double double12 = quarterlyDouble1.get2QTtm();
        double double13 = quarterlyDouble1.getMostRecent();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0661");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double double8 = quarterlyDouble4.get2QTtm();
        java.lang.String str9 = quarterlyDouble4.toString();
        double double10 = quarterlyDouble4.getQseqQ();
        double[] doubleArray11 = quarterlyDouble4.dArr;
        double double12 = quarterlyDouble4.getMostRecent();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str9, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 200.0d + "'", double10 == 200.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0662");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double9 = quarterlyDouble4.get2QTtm();
        double double10 = quarterlyDouble4.get2QTtm();
        double double11 = quarterlyDouble4.getTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0663");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) (byte) 0, 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0664");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) ' ', (int) (byte) 10);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0665");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double[] doubleArray8 = quarterlyDouble1.dArr;
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        double double14 = quarterlyDouble13.getTtm();
        double double15 = quarterlyDouble13.getPrevTtm();
        double double16 = quarterlyDouble13.getTtmAvg();
        double double17 = quarterlyDouble13.getQseqQ();
        double[] doubleArray21 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray21);
        double double23 = quarterlyDouble22.getTtmAvg();
        double[] doubleArray24 = new double[] {};
        quarterlyDouble22.dArr = doubleArray24;
        quarterlyDouble13.dArr = doubleArray24;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        quarterlyDouble1.dArr = doubleArray24;
        double double29 = quarterlyDouble1.getTtmAvg();
        java.lang.String str30 = quarterlyDouble1.toString();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 200.0d + "'", double17 == 200.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0666");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double4 = quarterlyDouble1.deltaQ((int) (short) 10, (int) 'a');
        double double5 = quarterlyDouble1.getTtm();
        double double6 = quarterlyDouble1.getPrevTtm();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0667");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble3 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double[] doubleArray5 = quarterlyDouble4.dArr;
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getPrevTtm();
        double double8 = quarterlyDouble4.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = quarterlyDouble4.getMostRecent();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0668");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble3 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double[] doubleArray5 = quarterlyDouble4.dArr;
        double double8 = quarterlyDouble4.deltaQ(1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0669");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double double8 = quarterlyDouble4.get2QTtm();
        double double10 = quarterlyDouble4.get((int) (byte) 1);
        double double13 = quarterlyDouble4.deltaQ(100, 10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0670");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double[] doubleArray5 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double7 = quarterlyDouble6.getTtmAvg();
        double[] doubleArray8 = new double[] {};
        quarterlyDouble6.dArr = doubleArray8;
        quarterlyDouble1.dArr = doubleArray8;
        double[] doubleArray11 = quarterlyDouble1.dArr;
        double double12 = quarterlyDouble1.getTtmAvg();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0671");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) (byte) 0, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) ' ', (int) ' ');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, 0, (int) (byte) 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData14 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (-1), (int) (short) -1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData17 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) (short) 0, 0);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNull(fieldData5);
        org.junit.Assert.assertNull(fieldData8);
        org.junit.Assert.assertNull(fieldData11);
        org.junit.Assert.assertNull(fieldData14);
        org.junit.Assert.assertNull(fieldData17);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0672");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.getQseqQ();
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        double double14 = quarterlyDouble13.getTtmAvg();
        double[] doubleArray15 = new double[] {};
        quarterlyDouble13.dArr = doubleArray15;
        quarterlyDouble4.dArr = doubleArray15;
        double double18 = quarterlyDouble4.getTtmAvg();
        double double20 = quarterlyDouble4.get((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = quarterlyDouble4.fmtGrowth4Q("\t\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 200.0d + "'", double8 == 200.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-9999.9999d) + "'", double20 == (-9999.9999d));
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0673");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.getTtm();
        double double9 = quarterlyDouble4.getMostRecent();
        java.lang.String str10 = quarterlyDouble4.toString();
        double double11 = quarterlyDouble4.getTtmAvg();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str10, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0674");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray11 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double double13 = quarterlyDouble12.getTtm();
        double double15 = quarterlyDouble12.get((int) (byte) 1);
        double[] doubleArray16 = quarterlyDouble12.dArr;
        double[] doubleArray20 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        quarterlyDouble12.dArr = doubleArray20;
        quarterlyDouble4.dArr = doubleArray20;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        java.lang.String str26 = quarterlyDouble25.toString();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str26, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0675");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray11 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double double13 = quarterlyDouble12.getTtm();
        double double15 = quarterlyDouble12.get((int) (byte) 1);
        double[] doubleArray16 = quarterlyDouble12.dArr;
        double[] doubleArray20 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        quarterlyDouble12.dArr = doubleArray20;
        quarterlyDouble4.dArr = doubleArray20;
        double[] doubleArray24 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        double double26 = quarterlyDouble25.getPrevTtm();
        double double27 = quarterlyDouble25.get2QTtm();
        double[] doubleArray31 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray31);
        double double33 = quarterlyDouble32.getTtmAvg();
        double[] doubleArray34 = new double[] {};
        quarterlyDouble32.dArr = doubleArray34;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray34);
        quarterlyDouble25.dArr = doubleArray34;
        quarterlyDouble4.dArr = doubleArray34;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray34);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble40 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = quarterlyDouble40.fmtGrowth4Q("\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0676");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 100, (int) 'a');
        java.lang.Class<?> wildcardClass4 = strList3.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0677");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) (short) 1, 100);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0678");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(1, (int) '4');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0679");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double4 = quarterlyDouble1.get((int) (byte) 10);
        double double5 = quarterlyDouble1.getQseqQ();
        java.lang.String str6 = quarterlyDouble1.toString();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-9999.9999d) + "'", double4 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str6, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0680");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray8 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        double double12 = quarterlyDouble9.deltaQ((int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = quarterlyDouble9.fmtGrowth1Q("\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0681");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double double8 = quarterlyDouble4.getMostRecent();
        double double9 = quarterlyDouble4.get2QTtm();
        double double10 = quarterlyDouble4.get2QTtm();
        double double12 = quarterlyDouble4.get((int) (short) 0);
        double double15 = quarterlyDouble4.deltaQ((-1), (int) (byte) -1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0682");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.getTtm();
        double double5 = quarterlyDouble1.get(10);
        double double6 = quarterlyDouble1.get2QTtm();
        double[] doubleArray7 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double9 = quarterlyDouble8.getQoQ();
        double double10 = quarterlyDouble8.getPrevTtm();
        double[] doubleArray11 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double[] doubleArray16 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray16);
        double double18 = quarterlyDouble17.getTtmAvg();
        double[] doubleArray19 = new double[] {};
        quarterlyDouble17.dArr = doubleArray19;
        quarterlyDouble12.dArr = doubleArray19;
        quarterlyDouble8.dArr = doubleArray19;
        quarterlyDouble1.dArr = doubleArray19;
        // The following exception was thrown during execution in test generation
        try {
            double double24 = quarterlyDouble1.getQseqQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-9999.9999d) + "'", double5 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0683");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0684");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        quarterlyDouble4.dArr = doubleArray12;
        double[] doubleArray18 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        double double20 = quarterlyDouble19.getTtm();
        double double22 = quarterlyDouble19.get((int) (byte) 1);
        double[] doubleArray23 = quarterlyDouble19.dArr;
        double[] doubleArray24 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        quarterlyDouble19.dArr = doubleArray24;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        quarterlyDouble4.dArr = doubleArray24;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        double double31 = quarterlyDouble29.get((-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = quarterlyDouble29.fmtGrowth1Q("\t\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-9999.9999d) + "'", double31 == (-9999.9999d));
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0685");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, 0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNull(fieldData5);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0686");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getPrevTtm();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0687");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.lang.Class<?> wildcardClass3 = fieldDataList2.getClass();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0688");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000", (int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0689");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.getTtm();
        double[] doubleArray7 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double9 = quarterlyDouble8.getTtmAvg();
        double[] doubleArray10 = new double[] {};
        quarterlyDouble8.dArr = doubleArray10;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble1.dArr = doubleArray10;
        double double16 = quarterlyDouble1.deltaQ((int) (byte) -1, 0);
        double double18 = quarterlyDouble1.get(0);
        double double19 = quarterlyDouble1.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = quarterlyDouble1.fmtGrowth4Q("\t\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-9999.9999d) + "'", double18 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0690");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble3 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double[] doubleArray5 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double9 = quarterlyDouble6.deltaQ((-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = quarterlyDouble6.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0691");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.getQseqQ();
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        double double14 = quarterlyDouble13.getTtmAvg();
        double[] doubleArray15 = new double[] {};
        quarterlyDouble13.dArr = doubleArray15;
        quarterlyDouble4.dArr = doubleArray15;
        double double19 = quarterlyDouble4.get((int) (byte) 10);
        java.lang.Class<?> wildcardClass20 = quarterlyDouble4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 200.0d + "'", double8 == 200.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-9999.9999d) + "'", double19 == (-9999.9999d));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0692");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get((int) '#', (int) (byte) 1, snpEnum2, dowEnum3, exchEnum4, (double) 100.0f, (long) (byte) 0);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0693");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 100, 0);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0694");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 1, (-1));
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0695");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) ' ', (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList4);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0696");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.getQseqQ();
        double double11 = quarterlyDouble4.deltaQ(100, (int) (byte) 10);
        double double12 = quarterlyDouble4.getPrevTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 200.0d + "'", double8 == 200.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0697");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble3 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double5 = quarterlyDouble4.getTtm();
        double double8 = quarterlyDouble4.deltaQ((int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0698");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) ' ', (int) (byte) 1);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0699");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary((int) ' ', (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = companySummaryList2.getClass();
        org.junit.Assert.assertNotNull(companySummaryList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0700");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.lang.String str3 = companyData1.getTicker();
        java.lang.String str4 = companyData1.getTicker();
        java.lang.String str5 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str3, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str4, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str5, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertNotNull(fieldDataList6);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0701");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary((int) (byte) 100, 100);
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0702");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double[] doubleArray8 = quarterlyDouble1.dArr;
        double double10 = quarterlyDouble1.get((int) 'a');
        double double12 = quarterlyDouble1.get((int) (short) 100);
        double double13 = quarterlyDouble1.getQoQ();
        double double14 = quarterlyDouble1.getTtm();
        double double15 = quarterlyDouble1.getPrevTtm();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0703");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) 'a', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList4);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0704");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        java.lang.String str6 = quarterlyDouble4.toString();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double9 = quarterlyDouble4.get((int) ' ');
        double double10 = quarterlyDouble4.getPrevTtm();
        double[] doubleArray11 = quarterlyDouble4.dArr;
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str6, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9999.9999d) + "'", double9 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0, -1.0]");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0705");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get((int) 'a', (int) (short) 1, snpEnum2, dowEnum3, exchEnum4, 0.0d, 0L);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList10 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList7, 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(companyDataList10);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0706");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get((int) 'a', 0, snpEnum2, dowEnum3, exchEnum4, (double) 'a', (long) (byte) 10);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0707");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) -1, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList4);
        org.junit.Assert.assertNotNull(companyDataList5);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0708");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) 'a', (int) (short) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
        org.junit.Assert.assertNotNull(companyDataList5);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0709");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double[] doubleArray9 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        double double11 = quarterlyDouble10.getTtm();
        double double13 = quarterlyDouble10.get((int) (byte) 1);
        double[] doubleArray14 = quarterlyDouble10.dArr;
        quarterlyDouble4.dArr = doubleArray14;
        double double16 = quarterlyDouble4.getMostRecent();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0710");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        double[] doubleArray7 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double9 = quarterlyDouble8.getTtmAvg();
        double[] doubleArray10 = new double[] {};
        quarterlyDouble8.dArr = doubleArray10;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble1.dArr = doubleArray10;
        double double15 = quarterlyDouble1.get((-1));
        // The following exception was thrown during execution in test generation
        try {
            double double16 = quarterlyDouble1.getMostRecent();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9999.9999d) + "'", double15 == (-9999.9999d));
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0711");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double double8 = quarterlyDouble4.get2QTtm();
        double double10 = quarterlyDouble4.get((int) (short) 0);
        double double11 = quarterlyDouble4.getTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0712");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double double8 = quarterlyDouble1.getQoQ();
        double double9 = quarterlyDouble1.getTtmAvg();
        double double10 = quarterlyDouble1.getQseqQ();
        double[] doubleArray11 = quarterlyDouble1.dArr;
        double[] doubleArray15 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        double double17 = quarterlyDouble16.getTtm();
        double double19 = quarterlyDouble16.get((int) (byte) 1);
        double double20 = quarterlyDouble16.get2QTtm();
        java.lang.String str21 = quarterlyDouble16.toString();
        double[] doubleArray25 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray25);
        double double27 = quarterlyDouble26.getTtm();
        double double29 = quarterlyDouble26.get((int) (byte) 1);
        double[] doubleArray30 = quarterlyDouble26.dArr;
        double double31 = quarterlyDouble26.getTtmAvg();
        double[] doubleArray35 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray35);
        double double37 = quarterlyDouble36.getTtmAvg();
        double[] doubleArray38 = new double[] {};
        quarterlyDouble36.dArr = doubleArray38;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble40 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray38);
        quarterlyDouble26.dArr = doubleArray38;
        quarterlyDouble16.dArr = doubleArray38;
        quarterlyDouble1.dArr = doubleArray38;
        double[] doubleArray47 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble48 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray47);
        double double49 = quarterlyDouble48.getTtmAvg();
        double double50 = quarterlyDouble48.getTtmAvg();
        double double52 = quarterlyDouble48.get(1);
        double[] doubleArray56 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble57 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray56);
        double double58 = quarterlyDouble57.getTtm();
        double double60 = quarterlyDouble57.get((int) (byte) 1);
        double[] doubleArray61 = quarterlyDouble57.dArr;
        double[] doubleArray62 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble63 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray62);
        quarterlyDouble57.dArr = doubleArray62;
        quarterlyDouble48.dArr = doubleArray62;
        quarterlyDouble1.dArr = doubleArray62;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str68 = quarterlyDouble1.fmtGrowth4Q("\t\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str21, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 1.0d + "'", double60 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[]");
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0713");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double[] doubleArray8 = quarterlyDouble1.dArr;
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        double double14 = quarterlyDouble13.getTtm();
        double double15 = quarterlyDouble13.getPrevTtm();
        double double16 = quarterlyDouble13.getTtmAvg();
        double double17 = quarterlyDouble13.getQseqQ();
        double[] doubleArray21 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray21);
        double double23 = quarterlyDouble22.getTtmAvg();
        double[] doubleArray24 = new double[] {};
        quarterlyDouble22.dArr = doubleArray24;
        quarterlyDouble13.dArr = doubleArray24;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        quarterlyDouble1.dArr = doubleArray24;
        double double29 = quarterlyDouble1.get2QTtm();
        // The following exception was thrown during execution in test generation
        try {
            double double30 = quarterlyDouble1.getQseqQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 200.0d + "'", double17 == 200.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0714");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary((int) ' ', 0);
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0715");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double double6 = quarterlyDouble4.getQseqQ();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.getPrevTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 200.0d + "'", double6 == 200.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0716");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        double double4 = quarterlyDouble1.get2QTtm();
        java.lang.String str6 = quarterlyDouble1.fmtGrowth4Q("\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        double[] doubleArray7 = quarterlyDouble1.dArr;
        java.lang.String str9 = quarterlyDouble1.fmtGrowth1Q("\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        double double10 = quarterlyDouble1.get2QTtm();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\t\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str6, "\t\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str9, "\t\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0717");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        java.lang.String str6 = quarterlyDouble4.toString();
        double[] doubleArray10 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        double double12 = quarterlyDouble11.getTtmAvg();
        double double13 = quarterlyDouble11.getTtmAvg();
        double[] doubleArray14 = quarterlyDouble11.dArr;
        quarterlyDouble4.dArr = doubleArray14;
        java.lang.Class<?> wildcardClass16 = doubleArray14.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str6, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0718");
        double[] doubleArray1 = new double[] { (short) -1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray1);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble3 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray1);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray1);
        double double5 = quarterlyDouble4.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = quarterlyDouble4.fmtGrowth1Q("\t\t\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0719");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary((int) 'a', 0);
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0720");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double double8 = quarterlyDouble4.getMostRecent();
        double double9 = quarterlyDouble4.get2QTtm();
        double double10 = quarterlyDouble4.get2QTtm();
        double double11 = quarterlyDouble4.getPrevTtm();
        java.lang.String str12 = quarterlyDouble4.toString();
        double double13 = quarterlyDouble4.getTtmAvg();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str12, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0721");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) ' ', (int) '#');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0722");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble3 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double5 = quarterlyDouble4.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = quarterlyDouble4.fmtGrowth1Q("\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0723");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double double6 = quarterlyDouble4.getTtm();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double[] doubleArray8 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        double double10 = quarterlyDouble9.getPrevTtm();
        double double11 = quarterlyDouble9.get2QTtm();
        double double12 = quarterlyDouble9.get2QTtm();
        java.lang.String str14 = quarterlyDouble9.fmtGrowth4Q("\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        double[] doubleArray15 = quarterlyDouble9.dArr;
        quarterlyDouble4.dArr = doubleArray15;
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\t\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str14, "\t\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0724");
        double[] doubleArray1 = new double[] { (short) -1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray1);
        double double3 = quarterlyDouble2.get2QTtm();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0725");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double9 = quarterlyDouble4.getTtmAvg();
        double double11 = quarterlyDouble4.get((int) (byte) 10);
        double double12 = quarterlyDouble4.getTtmAvg();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0726");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray8 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        double double12 = quarterlyDouble9.deltaQ((int) (byte) 100, (int) (short) 100);
        double double14 = quarterlyDouble9.get((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = quarterlyDouble9.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0727");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
        double[] doubleArray8 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        quarterlyDouble4.dArr = doubleArray8;
        double double12 = quarterlyDouble4.get((int) 'a');
        double double13 = quarterlyDouble4.getTtm();
        double double15 = quarterlyDouble4.get((int) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9999.9999d) + "'", double15 == (-9999.9999d));
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0728");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble3 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double[] doubleArray5 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        java.lang.String str7 = quarterlyDouble6.toString();
        double[] doubleArray11 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double double13 = quarterlyDouble12.getTtm();
        double double15 = quarterlyDouble12.get((int) (byte) 1);
        double[] doubleArray16 = quarterlyDouble12.dArr;
        double[] doubleArray20 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        quarterlyDouble12.dArr = doubleArray20;
        quarterlyDouble6.dArr = doubleArray20;
        double double24 = quarterlyDouble6.getTtmAvg();
        double double25 = quarterlyDouble6.getQseqQ();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 200.0d + "'", double25 == 200.0d);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0729");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        double[] doubleArray7 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double9 = quarterlyDouble8.getTtmAvg();
        double[] doubleArray10 = new double[] {};
        quarterlyDouble8.dArr = doubleArray10;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble1.dArr = doubleArray10;
        double double16 = quarterlyDouble1.deltaQ((int) (byte) -1, (int) (byte) 0);
        double double17 = quarterlyDouble1.getTtm();
        double[] doubleArray18 = quarterlyDouble1.dArr;
        double double19 = quarterlyDouble1.getTtmAvg();
        double[] doubleArray20 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        double double22 = quarterlyDouble21.getPrevTtm();
        double double23 = quarterlyDouble21.get2QTtm();
        java.lang.String str24 = quarterlyDouble21.toString();
        double double27 = quarterlyDouble21.deltaQ((int) (byte) 100, 0);
        double[] doubleArray28 = quarterlyDouble21.dArr;
        double[] doubleArray32 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray32);
        double double34 = quarterlyDouble33.getTtm();
        double double35 = quarterlyDouble33.getPrevTtm();
        double double36 = quarterlyDouble33.getTtmAvg();
        double double37 = quarterlyDouble33.getQseqQ();
        double[] doubleArray41 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble42 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray41);
        double double43 = quarterlyDouble42.getTtmAvg();
        double[] doubleArray44 = new double[] {};
        quarterlyDouble42.dArr = doubleArray44;
        quarterlyDouble33.dArr = doubleArray44;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble47 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray44);
        quarterlyDouble21.dArr = doubleArray44;
        quarterlyDouble1.dArr = doubleArray44;
        double double50 = quarterlyDouble1.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            double double51 = quarterlyDouble1.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str24, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 200.0d + "'", double37 == 200.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0730");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble3 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double[] doubleArray5 = quarterlyDouble4.dArr;
        double double6 = quarterlyDouble4.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = quarterlyDouble4.fmtGrowth4Q("\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0731");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, 1, 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0732");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double double8 = quarterlyDouble1.getTtm();
        double double9 = quarterlyDouble1.get2QTtm();
        java.lang.String str11 = quarterlyDouble1.fmtGrowth4Q("\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str11, "\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0733");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        java.lang.String str2 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.lang.String str4 = companyData1.getTicker();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str2, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0734");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0735");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble3 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double[] doubleArray5 = quarterlyDouble4.dArr;
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0736");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 100, 0);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0737");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.getQseqQ();
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        double double14 = quarterlyDouble13.getTtmAvg();
        double[] doubleArray15 = new double[] {};
        quarterlyDouble13.dArr = doubleArray15;
        quarterlyDouble4.dArr = doubleArray15;
        double double19 = quarterlyDouble4.get((int) (byte) 10);
        java.lang.String str20 = quarterlyDouble4.toString();
        double[] doubleArray21 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray21);
        double double23 = quarterlyDouble22.getPrevTtm();
        double double24 = quarterlyDouble22.getTtm();
        double[] doubleArray28 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray28);
        double double30 = quarterlyDouble29.getTtmAvg();
        double[] doubleArray31 = new double[] {};
        quarterlyDouble29.dArr = doubleArray31;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray31);
        quarterlyDouble22.dArr = doubleArray31;
        double double37 = quarterlyDouble22.deltaQ((int) (byte) -1, 0);
        double double39 = quarterlyDouble22.get(0);
        double[] doubleArray40 = quarterlyDouble22.dArr;
        quarterlyDouble4.dArr = doubleArray40;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = quarterlyDouble4.fmtGrowth1Q("\t\t\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 200.0d + "'", double8 == 200.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-9999.9999d) + "'", double19 == (-9999.9999d));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-9999.9999d) + "'", double39 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0738");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)", 10, 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0739");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) 'a', 100);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0740");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0741");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (-1), (int) (short) 10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) (short) -1, (int) ' ');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) (byte) 100, (int) '#');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData14 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) ' ', (int) (short) 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData17 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNull(fieldData5);
        org.junit.Assert.assertNull(fieldData8);
        org.junit.Assert.assertNull(fieldData11);
        org.junit.Assert.assertNull(fieldData14);
        org.junit.Assert.assertNull(fieldData17);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0742");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.getTtm();
        java.lang.String str5 = quarterlyDouble1.fmtGrowth1Q("\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        double[] doubleArray6 = quarterlyDouble1.dArr;
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str5, "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0743");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double9 = quarterlyDouble4.get2QTtm();
        double double10 = quarterlyDouble4.getQseqQ();
        double[] doubleArray14 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray14);
        double double16 = quarterlyDouble15.getTtmAvg();
        double[] doubleArray17 = new double[] {};
        quarterlyDouble15.dArr = doubleArray17;
        double[] doubleArray19 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray19);
        quarterlyDouble15.dArr = doubleArray19;
        quarterlyDouble4.dArr = doubleArray19;
        // The following exception was thrown during execution in test generation
        try {
            double double25 = quarterlyDouble4.deltaQ(0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 200.0d + "'", double10 == 200.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0744");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        quarterlyDouble4.dArr = doubleArray12;
        double double15 = quarterlyDouble4.get2QTtm();
        double double17 = quarterlyDouble4.get((int) (byte) 10);
        double[] doubleArray18 = quarterlyDouble4.dArr;
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9999.9999d) + "'", double17 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 1.0, -1.0]");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0745");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (-1), (int) '#');
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0746");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double4 = quarterlyDouble1.deltaQ((int) (short) 10, (int) 'a');
        double double6 = quarterlyDouble1.get(100);
        double double7 = quarterlyDouble1.getTtmAvg();
        double double8 = quarterlyDouble1.get2QTtm();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-9999.9999d) + "'", double6 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0747");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.lang.String str3 = companyData1.getTicker();
        java.lang.String str4 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
        java.lang.String str6 = companyData1.getTicker();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str3, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str4, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertNotNull(fieldDataList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str6, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0748");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (short) 0, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(companyDataList3);
        org.junit.Assert.assertNotNull(companyDataList4);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0749");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0750");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        double double4 = quarterlyDouble1.getMostRecent();
        double double5 = quarterlyDouble1.getTtmAvg();
        double double6 = quarterlyDouble1.get2QTtm();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0751");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        java.lang.String str2 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str2, "\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertNotNull(fieldDataList3);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0752");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.lang.String str3 = companyData1.getTicker();
        java.lang.String str4 = companyData1.getTicker();
        java.lang.String str5 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList7);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0753");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList0, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0754");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) 1, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList4);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0755");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.get((int) 'a');
        double[] doubleArray9 = quarterlyDouble4.dArr;
        double double10 = quarterlyDouble4.get2QTtm();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = quarterlyDouble4.deltaQ((int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9999.9999d) + "'", double8 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0756");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData6 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList3, (-1), (int) (byte) 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData9 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList3, (int) (short) 1, (-1));
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData12 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList3, (int) (byte) -1, 100);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertNull(fieldData6);
        org.junit.Assert.assertNull(fieldData9);
        org.junit.Assert.assertNull(fieldData12);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0757");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble3 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double[] doubleArray5 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double9 = quarterlyDouble6.deltaQ((-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = quarterlyDouble6.fmtGrowth4Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0758");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        java.lang.String str8 = quarterlyDouble4.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = quarterlyDouble4.fmtGrowth1Q("\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str8, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0759");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray11 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double double13 = quarterlyDouble12.getTtm();
        double double15 = quarterlyDouble12.get((int) (byte) 1);
        double[] doubleArray16 = quarterlyDouble12.dArr;
        double[] doubleArray20 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        quarterlyDouble12.dArr = doubleArray20;
        quarterlyDouble4.dArr = doubleArray20;
        double[] doubleArray24 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        double double26 = quarterlyDouble25.getPrevTtm();
        double double27 = quarterlyDouble25.get2QTtm();
        double[] doubleArray31 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray31);
        double double33 = quarterlyDouble32.getTtmAvg();
        double[] doubleArray34 = new double[] {};
        quarterlyDouble32.dArr = doubleArray34;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray34);
        quarterlyDouble25.dArr = doubleArray34;
        quarterlyDouble4.dArr = doubleArray34;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray34);
        double double40 = quarterlyDouble39.getPrevTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0760");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0761");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 0, (int) ' ');
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0762");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray11 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double double13 = quarterlyDouble12.getTtm();
        double double15 = quarterlyDouble12.get((int) (byte) 1);
        double[] doubleArray16 = quarterlyDouble12.dArr;
        double[] doubleArray20 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        quarterlyDouble12.dArr = doubleArray20;
        quarterlyDouble4.dArr = doubleArray20;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        double double26 = quarterlyDouble24.get((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double27 = quarterlyDouble24.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0763");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) ' ', (-1));
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0764");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 1, (int) ' ');
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0765");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        java.lang.String str2 = companyData1.getTicker();
        java.lang.String str3 = companyData1.getTicker();
        java.lang.String str4 = companyData1.getTicker();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str2, "\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str3, "\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str4, "\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0766");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double double8 = quarterlyDouble1.getQoQ();
        double double9 = quarterlyDouble1.getPrevTtm();
        java.lang.String str11 = quarterlyDouble1.fmtGrowth4Q("\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        double double14 = quarterlyDouble1.deltaQ((int) 'a', (int) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str11, "\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0767");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000", (int) (byte) 100, 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0768");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (-1), (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (-1), (int) (byte) 100);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList6);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0769");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getCompany("\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertNotNull(oneCompanyDataList1);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0770");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get((int) '#', (int) '#', snpEnum2, dowEnum3, exchEnum4, 0.0d, (long) (byte) 100);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0771");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.getQseqQ();
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        double double14 = quarterlyDouble13.getTtmAvg();
        double[] doubleArray15 = new double[] {};
        quarterlyDouble13.dArr = doubleArray15;
        quarterlyDouble4.dArr = doubleArray15;
        double double19 = quarterlyDouble4.get((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = quarterlyDouble4.fmtGrowth4Q("\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 200.0d + "'", double8 == 200.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-9999.9999d) + "'", double19 == (-9999.9999d));
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0772");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble3 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double[] doubleArray5 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        java.lang.String str7 = quarterlyDouble6.toString();
        double[] doubleArray11 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double double13 = quarterlyDouble12.getTtm();
        double double15 = quarterlyDouble12.get((int) (byte) 1);
        double[] doubleArray16 = quarterlyDouble12.dArr;
        double[] doubleArray20 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        quarterlyDouble12.dArr = doubleArray20;
        quarterlyDouble6.dArr = doubleArray20;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = quarterlyDouble6.fmtGrowth1Q("\t\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 1.0, -1.0]");
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0773");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray11 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double double13 = quarterlyDouble12.getTtm();
        double double15 = quarterlyDouble12.get((int) (byte) 1);
        double[] doubleArray16 = quarterlyDouble12.dArr;
        double[] doubleArray20 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        quarterlyDouble12.dArr = doubleArray20;
        quarterlyDouble4.dArr = doubleArray20;
        double[] doubleArray24 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        double double26 = quarterlyDouble25.getPrevTtm();
        double double27 = quarterlyDouble25.get2QTtm();
        double[] doubleArray31 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray31);
        double double33 = quarterlyDouble32.getTtmAvg();
        double[] doubleArray34 = new double[] {};
        quarterlyDouble32.dArr = doubleArray34;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray34);
        quarterlyDouble25.dArr = doubleArray34;
        quarterlyDouble4.dArr = doubleArray34;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray34);
        double double40 = quarterlyDouble39.get2QTtm();
        java.lang.String str41 = quarterlyDouble39.toString();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0774");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double[] doubleArray9 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        quarterlyDouble4.dArr = doubleArray9;
        double[] doubleArray15 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        double double17 = quarterlyDouble16.getTtm();
        double double19 = quarterlyDouble16.get((int) (byte) 1);
        double[] doubleArray20 = quarterlyDouble16.dArr;
        double[] doubleArray24 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        quarterlyDouble16.dArr = doubleArray24;
        double[] doubleArray30 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray30);
        double double32 = quarterlyDouble31.getTtm();
        double double34 = quarterlyDouble31.get((int) (byte) 1);
        double[] doubleArray35 = quarterlyDouble31.dArr;
        double[] doubleArray36 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray36);
        quarterlyDouble31.dArr = doubleArray36;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray36);
        quarterlyDouble16.dArr = doubleArray36;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray36);
        quarterlyDouble4.dArr = doubleArray36;
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[]");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0775");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        java.lang.String str6 = quarterlyDouble4.toString();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.getPrevTtm();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = quarterlyDouble4.deltaQ(0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str6, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0776");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double9 = quarterlyDouble4.getTtmAvg();
        double double10 = quarterlyDouble4.getTtm();
        java.lang.String str11 = quarterlyDouble4.toString();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str11, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0777");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        double[] doubleArray7 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double9 = quarterlyDouble8.getTtmAvg();
        double[] doubleArray10 = new double[] {};
        quarterlyDouble8.dArr = doubleArray10;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble1.dArr = doubleArray10;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        double double15 = quarterlyDouble14.getPrevTtm();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0778");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) (short) -1, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(companyDataList7);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0779");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.getQseqQ();
        double double11 = quarterlyDouble4.deltaQ(100, (int) (byte) 10);
        double double14 = quarterlyDouble4.deltaQ((int) '4', 10);
        double double15 = quarterlyDouble4.get2QTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 200.0d + "'", double8 == 200.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0780");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) 'a', (int) (short) 0);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0781");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.deltaQ((int) 'a', (int) (short) 10);
        double double9 = quarterlyDouble4.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0782");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double double6 = quarterlyDouble4.getQseqQ();
        java.lang.String str7 = quarterlyDouble4.toString();
        double double8 = quarterlyDouble4.getTtmAvg();
        double double11 = quarterlyDouble4.deltaQ((int) ' ', (int) ' ');
        double double12 = quarterlyDouble4.getMostRecent();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 200.0d + "'", double6 == 200.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str7, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0783");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.lang.String str4 = companyData1.getTicker();
        java.lang.String str5 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData10 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList7, 10, (int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData13 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList7, 1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNull(fieldData10);
        org.junit.Assert.assertNull(fieldData13);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0784");
        double[] doubleArray1 = new double[] { (short) -1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray1);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble3 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray1);
        java.lang.String str4 = quarterlyDouble3.toString();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 -1.0000" + "'", str4, "\t i=0 -1.0000");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0785");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray8 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        double double10 = quarterlyDouble9.getTtm();
        double[] doubleArray14 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray14);
        double double16 = quarterlyDouble15.getTtmAvg();
        double[] doubleArray17 = new double[] {};
        quarterlyDouble15.dArr = doubleArray17;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        double[] doubleArray20 = quarterlyDouble19.dArr;
        quarterlyDouble9.dArr = doubleArray20;
        // The following exception was thrown during execution in test generation
        try {
            double double22 = quarterlyDouble9.getMostRecent();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0786");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double[] doubleArray8 = quarterlyDouble1.dArr;
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        double double14 = quarterlyDouble13.getTtm();
        double double15 = quarterlyDouble13.getPrevTtm();
        double double16 = quarterlyDouble13.getTtmAvg();
        double double17 = quarterlyDouble13.getQseqQ();
        double[] doubleArray21 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray21);
        double double23 = quarterlyDouble22.getTtmAvg();
        double[] doubleArray24 = new double[] {};
        quarterlyDouble22.dArr = doubleArray24;
        quarterlyDouble13.dArr = doubleArray24;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        quarterlyDouble1.dArr = doubleArray24;
        double double29 = quarterlyDouble1.getTtmAvg();
        double double30 = quarterlyDouble1.getTtm();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 200.0d + "'", double17 == 200.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0787");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0788");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble3 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double[] doubleArray5 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double7 = quarterlyDouble6.getTtmAvg();
        double double10 = quarterlyDouble6.deltaQ((int) (byte) 100, (int) '#');
        double double11 = quarterlyDouble6.get2QTtm();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0789");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) (short) 1, 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNull(fieldData5);
        org.junit.Assert.assertNull(fieldData8);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0790");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        double[] doubleArray7 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double9 = quarterlyDouble8.getTtmAvg();
        double[] doubleArray10 = new double[] {};
        quarterlyDouble8.dArr = doubleArray10;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble1.dArr = doubleArray10;
        java.lang.String str14 = quarterlyDouble1.toString();
        double double16 = quarterlyDouble1.get((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = quarterlyDouble1.fmtGrowth1Q("\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9999.9999d) + "'", double16 == (-9999.9999d));
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0791");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray8 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        double double12 = quarterlyDouble9.deltaQ((int) (byte) 0, 0);
        double double15 = quarterlyDouble9.deltaQ((int) (short) 100, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = quarterlyDouble9.fmtGrowth4Q("\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0792");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double9 = quarterlyDouble4.get2QTtm();
        double double10 = quarterlyDouble4.getTtm();
        double double13 = quarterlyDouble4.deltaQ((int) '4', (int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0793");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) ' ', (int) (byte) 10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) (byte) 100, (int) 'a');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, 0, (int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData14 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, 0, (int) (short) 10);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNull(fieldData5);
        org.junit.Assert.assertNull(fieldData8);
        org.junit.Assert.assertNull(fieldData11);
        org.junit.Assert.assertNull(fieldData14);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0794");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        quarterlyDouble4.dArr = doubleArray12;
        double double15 = quarterlyDouble4.get2QTtm();
        double double16 = quarterlyDouble4.getPrevTtm();
        double[] doubleArray17 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 1.0, -1.0]");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0795");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.lang.String str4 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList5, (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList5);
        org.junit.Assert.assertNull(fieldData8);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0796");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
        double double8 = quarterlyDouble4.getTtm();
        double[] doubleArray9 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        double double11 = quarterlyDouble10.getTtm();
        double double12 = quarterlyDouble10.getTtmAvg();
        double double14 = quarterlyDouble10.get((int) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0797");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double[] doubleArray8 = quarterlyDouble1.dArr;
        double double10 = quarterlyDouble1.get((int) 'a');
        double double11 = quarterlyDouble1.getTtm();
        double double12 = quarterlyDouble1.getPrevTtm();
        java.lang.Class<?> wildcardClass13 = quarterlyDouble1.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0798");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (-1), (int) (short) 10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) (short) -1, (int) ' ');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) (byte) 0, 10);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNull(fieldData5);
        org.junit.Assert.assertNull(fieldData8);
        org.junit.Assert.assertNull(fieldData11);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0799");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\t i=0 -1.0000");
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0800");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble3 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double[] doubleArray5 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        java.lang.String str7 = quarterlyDouble6.toString();
        double[] doubleArray11 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double double13 = quarterlyDouble12.getTtm();
        double double15 = quarterlyDouble12.get((int) (byte) 1);
        double[] doubleArray16 = quarterlyDouble12.dArr;
        double[] doubleArray20 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        quarterlyDouble12.dArr = doubleArray20;
        quarterlyDouble6.dArr = doubleArray20;
        double[] doubleArray24 = null;
        quarterlyDouble6.dArr = doubleArray24;
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 1.0, -1.0]");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0801");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getCompany("\t\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertNotNull(oneCompanyDataList1);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0802");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (short) 0, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) (byte) -1, (int) '4');
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
        org.junit.Assert.assertNotNull(companyDataList7);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0803");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) ' ', (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(manyCompanyDataList3);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0804");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
        double double10 = quarterlyDouble4.deltaQ((int) (byte) 0, (int) (short) 1);
        java.lang.String str11 = quarterlyDouble4.toString();
        double[] doubleArray12 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        double double14 = quarterlyDouble13.getPrevTtm();
        double double15 = quarterlyDouble13.getTtm();
        double double17 = quarterlyDouble13.get(10);
        double double18 = quarterlyDouble13.get2QTtm();
        double[] doubleArray19 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray19);
        double double21 = quarterlyDouble20.getQoQ();
        double double22 = quarterlyDouble20.getPrevTtm();
        double[] doubleArray23 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray23);
        double[] doubleArray28 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray28);
        double double30 = quarterlyDouble29.getTtmAvg();
        double[] doubleArray31 = new double[] {};
        quarterlyDouble29.dArr = doubleArray31;
        quarterlyDouble24.dArr = doubleArray31;
        quarterlyDouble20.dArr = doubleArray31;
        quarterlyDouble13.dArr = doubleArray31;
        quarterlyDouble4.dArr = doubleArray31;
        java.lang.String str37 = quarterlyDouble4.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = quarterlyDouble4.fmtGrowth4Q("\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-9999.9999d) + "'", double17 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0805");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) '4', 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList4);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0806");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) '4', 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0807");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double double8 = quarterlyDouble1.getQoQ();
        double double9 = quarterlyDouble1.getTtmAvg();
        double double10 = quarterlyDouble1.getQseqQ();
        double[] doubleArray11 = quarterlyDouble1.dArr;
        double double12 = quarterlyDouble1.getMostRecent();
        double double13 = quarterlyDouble1.getTtm();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0808");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray11 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double double13 = quarterlyDouble12.getTtm();
        double double15 = quarterlyDouble12.get((int) (byte) 1);
        double[] doubleArray16 = quarterlyDouble12.dArr;
        double[] doubleArray20 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        quarterlyDouble12.dArr = doubleArray20;
        quarterlyDouble4.dArr = doubleArray20;
        double double24 = quarterlyDouble4.get2QTtm();
        java.lang.String str25 = quarterlyDouble4.toString();
        double double26 = quarterlyDouble4.getTtmAvg();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str25, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0809");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        java.lang.String str6 = quarterlyDouble4.toString();
        double double7 = quarterlyDouble4.get2QTtm();
        double double8 = quarterlyDouble4.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str6, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0810");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double[] doubleArray8 = quarterlyDouble1.dArr;
        double double9 = quarterlyDouble1.getTtmAvg();
        double double10 = quarterlyDouble1.getPrevTtm();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0811");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double[] doubleArray9 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        quarterlyDouble4.dArr = doubleArray9;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        java.lang.String str13 = quarterlyDouble12.toString();
        double double14 = quarterlyDouble12.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = quarterlyDouble12.getQseqQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0812");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.getQseqQ();
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        double double14 = quarterlyDouble13.getTtmAvg();
        double[] doubleArray15 = new double[] {};
        quarterlyDouble13.dArr = doubleArray15;
        quarterlyDouble4.dArr = doubleArray15;
        double double19 = quarterlyDouble4.get((int) (byte) 10);
        java.lang.String str20 = quarterlyDouble4.toString();
        double[] doubleArray21 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray21);
        double double23 = quarterlyDouble22.getPrevTtm();
        double double24 = quarterlyDouble22.getTtm();
        double[] doubleArray28 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray28);
        double double30 = quarterlyDouble29.getTtmAvg();
        double[] doubleArray31 = new double[] {};
        quarterlyDouble29.dArr = doubleArray31;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray31);
        quarterlyDouble22.dArr = doubleArray31;
        double double37 = quarterlyDouble22.deltaQ((int) (byte) -1, 0);
        double double39 = quarterlyDouble22.get(0);
        double[] doubleArray40 = quarterlyDouble22.dArr;
        quarterlyDouble4.dArr = doubleArray40;
        // The following exception was thrown during execution in test generation
        try {
            double double42 = quarterlyDouble4.getQseqQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 200.0d + "'", double8 == 200.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-9999.9999d) + "'", double19 == (-9999.9999d));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-9999.9999d) + "'", double39 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0813");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 1, (int) (byte) -1);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0814");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) -1, (int) (byte) -1);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0815");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get((int) (short) 100, (int) (byte) 0, snpEnum2, dowEnum3, exchEnum4, 0.0d, (long) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList10 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList7, (-1), (int) (byte) 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList11 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList7);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(companyDataList10);
        org.junit.Assert.assertNotNull(companyDataList11);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0816");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double9 = quarterlyDouble4.get2QTtm();
        double double10 = quarterlyDouble4.get2QTtm();
        double[] doubleArray11 = quarterlyDouble4.dArr;
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0, -1.0]");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0817");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.getTtm();
        java.lang.String str5 = quarterlyDouble1.fmtGrowth1Q("\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        double double6 = quarterlyDouble1.getTtmAvg();
        double double7 = quarterlyDouble1.getTtm();
        double double9 = quarterlyDouble1.get((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str5, "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0818");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\t\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) 'a', (int) (short) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0819");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0820");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) '4', (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0821");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double9 = quarterlyDouble4.get2QTtm();
        double double10 = quarterlyDouble4.getQseqQ();
        double double11 = quarterlyDouble4.getTtm();
        double double12 = quarterlyDouble4.get2QTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 200.0d + "'", double10 == 200.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0822");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        java.lang.Class<?> wildcardClass6 = quarterlyDouble4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0823");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.getQseqQ();
        double[] doubleArray9 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 200.0d + "'", double8 == 200.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 1.0, -1.0]");
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0824");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double3 = quarterlyDouble1.get((-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9999.9999d) + "'", double3 == (-9999.9999d));
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0825");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double9 = quarterlyDouble4.deltaQ(0, 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0826");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (short) 1, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(manyCompanyDataList3);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0827");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray8 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        double double12 = quarterlyDouble9.deltaQ((int) (byte) 0, 0);
        double double13 = quarterlyDouble9.getMostRecent();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = quarterlyDouble9.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0828");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (byte) 1, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList2, (int) '4', (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(companyDataList5);
        org.junit.Assert.assertNotNull(manyCompanyDataList6);
        org.junit.Assert.assertNotNull(manyCompanyDataList7);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0829");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        double[] doubleArray7 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double9 = quarterlyDouble8.getTtmAvg();
        double[] doubleArray10 = new double[] {};
        quarterlyDouble8.dArr = doubleArray10;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble1.dArr = doubleArray10;
        double double16 = quarterlyDouble1.deltaQ((int) (byte) -1, (int) (byte) 0);
        double double17 = quarterlyDouble1.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = quarterlyDouble1.fmtGrowth4Q("\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0830");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) ' ', (int) (byte) 10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) (byte) 100, (int) 'a');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, 0, (int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData14 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, 100, (int) '4');
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNull(fieldData5);
        org.junit.Assert.assertNull(fieldData8);
        org.junit.Assert.assertNull(fieldData11);
        org.junit.Assert.assertNull(fieldData14);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0831");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNull(fieldData5);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0832");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        quarterlyDouble4.dArr = doubleArray12;
        double double15 = quarterlyDouble4.get2QTtm();
        double double16 = quarterlyDouble4.getTtmAvg();
        double double17 = quarterlyDouble4.get2QTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0833");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.getTtm();
        double double9 = quarterlyDouble4.getMostRecent();
        double[] doubleArray10 = quarterlyDouble4.dArr;
        double double11 = quarterlyDouble4.getQseqQ();
        java.lang.String str12 = quarterlyDouble4.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = quarterlyDouble4.fmtGrowth4Q("\t i=0 -1.0000");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 200.0d + "'", double11 == 200.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str12, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0834");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary((int) '#', 10);
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0835");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(0, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList2, (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(companyDataList5);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0836");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.getTtm();
        double double5 = quarterlyDouble1.get(10);
        double double6 = quarterlyDouble1.getQoQ();
        java.lang.String str8 = quarterlyDouble1.fmtGrowth4Q("\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        double[] doubleArray9 = quarterlyDouble1.dArr;
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-9999.9999d) + "'", double5 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str8, "\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0837");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0838");
        double[] doubleArray3 = new double[] { 1, ' ', (short) -1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 32.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0839");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get((int) (short) 10, (int) '#', snpEnum2, dowEnum3, exchEnum4, (double) 1.0f, 0L);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0840");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.deltaQ((int) 'a', (int) (short) 10);
        double double9 = quarterlyDouble4.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = quarterlyDouble4.fmtGrowth1Q("\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0841");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
        double double8 = quarterlyDouble4.getTtm();
        double[] doubleArray9 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        double[] doubleArray13 = quarterlyDouble12.dArr;
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0842");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) (byte) 0, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) ' ', (int) ' ');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) '4', (int) '#');
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNull(fieldData5);
        org.junit.Assert.assertNull(fieldData8);
        org.junit.Assert.assertNull(fieldData11);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0843");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.lang.String str4 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList5, 1, 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList5, (int) ' ', (int) '4');
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList5);
        org.junit.Assert.assertNull(fieldData8);
        org.junit.Assert.assertNull(fieldData11);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0844");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0845");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (byte) 1, (int) (byte) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(manyCompanyDataList3);
        org.junit.Assert.assertNotNull(companyDataList4);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0846");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
        double double8 = quarterlyDouble4.getTtm();
        double[] doubleArray9 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        double double11 = quarterlyDouble10.get2QTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0847");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        java.lang.String str4 = quarterlyDouble1.fmtGrowth4Q("hi!");
        java.lang.String str6 = quarterlyDouble1.fmtGrowth1Q("hi!");
        java.lang.String str8 = quarterlyDouble1.fmtGrowth1Q("\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        double double9 = quarterlyDouble1.getTtmAvg();
        double double11 = quarterlyDouble1.get((int) (byte) 100);
        double double12 = quarterlyDouble1.getQseqQ();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str4, "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str6, "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str8, "\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0848");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(0, (int) (short) 100);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0849");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.lang.String str3 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData7 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList4, (int) (byte) 10, (int) 'a');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData10 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList4, (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertNull(fieldData7);
        org.junit.Assert.assertNull(fieldData10);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0850");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble3 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = quarterlyDouble4.getQseqQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0851");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray8 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        double double10 = quarterlyDouble9.getQseqQ();
        double double11 = quarterlyDouble9.getMostRecent();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = quarterlyDouble9.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 200.0d + "'", double10 == 200.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0852");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0853");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        java.lang.String str8 = quarterlyDouble1.toString();
        double double10 = quarterlyDouble1.get((int) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str8, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0854");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get((int) '4', (int) (byte) 0, snpEnum2, dowEnum3, exchEnum4, (double) (short) 10, (long) (short) 0);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0855");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 100, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
        org.junit.Assert.assertNotNull(manyCompanyDataList5);
        org.junit.Assert.assertNotNull(companyDataList6);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0856");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) -1, 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
        org.junit.Assert.assertNotNull(companyDataList7);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0857");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.lang.String str4 = companyData1.getTicker();
        java.lang.String str5 = companyData1.getTicker();
        java.lang.String str6 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
        java.lang.String str8 = companyData1.getTicker();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0858");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double double6 = quarterlyDouble4.getQseqQ();
        java.lang.String str7 = quarterlyDouble4.toString();
        double double8 = quarterlyDouble4.getPrevTtm();
        double double10 = quarterlyDouble4.get((int) (byte) -1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 200.0d + "'", double6 == 200.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str7, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0859");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double4 = quarterlyDouble1.get((int) (byte) 10);
        double double5 = quarterlyDouble1.getQseqQ();
        double double6 = quarterlyDouble1.getQseqQ();
        double double7 = quarterlyDouble1.getMostRecent();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-9999.9999d) + "'", double4 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0860");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double11 = quarterlyDouble4.deltaQ((int) (short) -1, (int) (short) -1);
        double[] doubleArray12 = quarterlyDouble4.dArr;
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0861");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double[] doubleArray9 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        double double11 = quarterlyDouble10.getTtm();
        double double13 = quarterlyDouble10.get((int) (byte) 1);
        double[] doubleArray14 = quarterlyDouble10.dArr;
        quarterlyDouble4.dArr = doubleArray14;
        double double16 = quarterlyDouble4.getQseqQ();
        java.lang.String str17 = quarterlyDouble4.toString();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 200.0d + "'", double16 == 200.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str17, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0862");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray8 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        double double10 = quarterlyDouble9.getTtm();
        double[] doubleArray14 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray14);
        double double16 = quarterlyDouble15.getTtmAvg();
        double[] doubleArray17 = new double[] {};
        quarterlyDouble15.dArr = doubleArray17;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        double[] doubleArray20 = quarterlyDouble19.dArr;
        quarterlyDouble9.dArr = doubleArray20;
        double double22 = quarterlyDouble9.getPrevTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0863");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getMostRecent();
        double[] doubleArray8 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        quarterlyDouble4.dArr = doubleArray8;
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0864");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray11 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double double13 = quarterlyDouble12.getTtm();
        double double15 = quarterlyDouble12.get((int) (byte) 1);
        double[] doubleArray16 = quarterlyDouble12.dArr;
        double[] doubleArray20 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        quarterlyDouble12.dArr = doubleArray20;
        quarterlyDouble4.dArr = doubleArray20;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        double double27 = quarterlyDouble26.getTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0865");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double5 = quarterlyDouble1.getQoQ();
        double double6 = quarterlyDouble1.getMostRecent();
        double double7 = quarterlyDouble1.getQseqQ();
        java.lang.String str8 = quarterlyDouble1.toString();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str8, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0866");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get((int) (short) -1, (int) (short) 1, snpEnum2, dowEnum3, exchEnum4, (double) 0, (long) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList7);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList9 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList7);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList10 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList7);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList11 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList7);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList14 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList7, 1, 10);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(companyDataList8);
        org.junit.Assert.assertNotNull(companyDataList9);
        org.junit.Assert.assertNotNull(manyCompanyDataList10);
        org.junit.Assert.assertNotNull(companyDataList11);
        org.junit.Assert.assertNotNull(companyDataList14);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0867");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        java.lang.String str8 = quarterlyDouble1.toString();
        java.lang.Class<?> wildcardClass9 = quarterlyDouble1.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str8, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0868");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.getQseqQ();
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        double double14 = quarterlyDouble13.getTtmAvg();
        double[] doubleArray15 = new double[] {};
        quarterlyDouble13.dArr = doubleArray15;
        quarterlyDouble4.dArr = doubleArray15;
        double double19 = quarterlyDouble4.get((int) (byte) 10);
        java.lang.String str20 = quarterlyDouble4.toString();
        double[] doubleArray21 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray21);
        double double23 = quarterlyDouble22.getPrevTtm();
        double double24 = quarterlyDouble22.getTtm();
        double[] doubleArray28 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray28);
        double double30 = quarterlyDouble29.getTtmAvg();
        double[] doubleArray31 = new double[] {};
        quarterlyDouble29.dArr = doubleArray31;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray31);
        quarterlyDouble22.dArr = doubleArray31;
        double double37 = quarterlyDouble22.deltaQ((int) (byte) -1, 0);
        double double39 = quarterlyDouble22.get(0);
        double[] doubleArray40 = quarterlyDouble22.dArr;
        quarterlyDouble4.dArr = doubleArray40;
        double double43 = quarterlyDouble4.get((int) (short) -1);
        double double44 = quarterlyDouble4.getTtmAvg();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 200.0d + "'", double8 == 200.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-9999.9999d) + "'", double19 == (-9999.9999d));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-9999.9999d) + "'", double39 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-9999.9999d) + "'", double43 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0869");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get((int) ' ', (int) '4', snpEnum2, dowEnum3, exchEnum4, (double) 100, (long) 10);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0870");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.getTtm();
        java.lang.String str5 = quarterlyDouble1.fmtGrowth1Q("");
        double[] doubleArray9 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        double double11 = quarterlyDouble10.getTtm();
        double double12 = quarterlyDouble10.getPrevTtm();
        double double13 = quarterlyDouble10.getTtmAvg();
        double[] doubleArray14 = quarterlyDouble10.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray14);
        quarterlyDouble1.dArr = doubleArray14;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray14);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str5, "\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 1.0, -1.0]");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0871");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getCompany("\t\t i=0 -1.0000     :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertNotNull(oneCompanyDataList1);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0872");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, fieldDataArray0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (short) 100, (int) (byte) 10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (short) 1, (int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(fieldDataArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(fieldData5);
        org.junit.Assert.assertNull(fieldData8);
        org.junit.Assert.assertNull(fieldData11);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0873");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble3 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double[] doubleArray5 = quarterlyDouble4.dArr;
        java.lang.String str6 = quarterlyDouble4.toString();
        double[] doubleArray10 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        double double12 = quarterlyDouble11.getMostRecent();
        double double13 = quarterlyDouble11.getTtm();
        double[] doubleArray14 = quarterlyDouble11.dArr;
        quarterlyDouble4.dArr = doubleArray14;
        java.lang.String str16 = quarterlyDouble4.toString();
        double double17 = quarterlyDouble4.getTtm();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str16, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0874");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(100, (int) (byte) -1);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0875");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        double[] doubleArray13 = quarterlyDouble12.dArr;
        quarterlyDouble4.dArr = doubleArray13;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = quarterlyDouble4.fmtGrowth4Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0876");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = quarterlyDouble4.deltaQ(0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0877");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        quarterlyDouble4.dArr = doubleArray12;
        double[] doubleArray18 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        double double20 = quarterlyDouble19.getTtm();
        double double22 = quarterlyDouble19.get((int) (byte) 1);
        double[] doubleArray23 = quarterlyDouble19.dArr;
        double[] doubleArray24 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        quarterlyDouble19.dArr = doubleArray24;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        quarterlyDouble4.dArr = doubleArray24;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0878");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.getTtm();
        double double9 = quarterlyDouble4.getMostRecent();
        java.lang.String str10 = quarterlyDouble4.toString();
        double double11 = quarterlyDouble4.getTtm();
        double double14 = quarterlyDouble4.deltaQ((int) (byte) 1, (-1));
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str10, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0879");
        double[] doubleArray1 = new double[] { (short) -1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray1);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble3 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray1);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = quarterlyDouble4.fmtGrowth1Q("\t\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-1.0]");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0880");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
        double[] doubleArray8 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        quarterlyDouble4.dArr = doubleArray8;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = quarterlyDouble4.getMostRecent();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0881");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        java.lang.String str3 = quarterlyDouble1.toString();
        double double4 = quarterlyDouble1.get2QTtm();
        double[] doubleArray5 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double7 = quarterlyDouble6.getPrevTtm();
        double double8 = quarterlyDouble6.get2QTtm();
        java.lang.String str9 = quarterlyDouble6.toString();
        double double12 = quarterlyDouble6.deltaQ((int) (byte) 100, 0);
        double double13 = quarterlyDouble6.getQoQ();
        double double14 = quarterlyDouble6.getTtmAvg();
        double double15 = quarterlyDouble6.getQseqQ();
        double[] doubleArray16 = quarterlyDouble6.dArr;
        double[] doubleArray20 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        double double22 = quarterlyDouble21.getTtm();
        double double24 = quarterlyDouble21.get((int) (byte) 1);
        double double25 = quarterlyDouble21.get2QTtm();
        java.lang.String str26 = quarterlyDouble21.toString();
        double[] doubleArray30 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray30);
        double double32 = quarterlyDouble31.getTtm();
        double double34 = quarterlyDouble31.get((int) (byte) 1);
        double[] doubleArray35 = quarterlyDouble31.dArr;
        double double36 = quarterlyDouble31.getTtmAvg();
        double[] doubleArray40 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray40);
        double double42 = quarterlyDouble41.getTtmAvg();
        double[] doubleArray43 = new double[] {};
        quarterlyDouble41.dArr = doubleArray43;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble45 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray43);
        quarterlyDouble31.dArr = doubleArray43;
        quarterlyDouble21.dArr = doubleArray43;
        quarterlyDouble6.dArr = doubleArray43;
        double[] doubleArray52 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble53 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray52);
        double double54 = quarterlyDouble53.getTtmAvg();
        double double55 = quarterlyDouble53.getTtmAvg();
        double double57 = quarterlyDouble53.get(1);
        double[] doubleArray61 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble62 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray61);
        double double63 = quarterlyDouble62.getTtm();
        double double65 = quarterlyDouble62.get((int) (byte) 1);
        double[] doubleArray66 = quarterlyDouble62.dArr;
        double[] doubleArray67 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble68 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray67);
        quarterlyDouble62.dArr = doubleArray67;
        quarterlyDouble53.dArr = doubleArray67;
        quarterlyDouble6.dArr = doubleArray67;
        quarterlyDouble1.dArr = doubleArray67;
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str3, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str9, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str26, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 1.0d + "'", double57 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 1.0d + "'", double65 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[]");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0882");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.get(1);
        double double9 = quarterlyDouble4.getPrevTtm();
        double[] doubleArray13 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray13);
        double double15 = quarterlyDouble14.getTtm();
        double double16 = quarterlyDouble14.getPrevTtm();
        double double17 = quarterlyDouble14.getTtmAvg();
        double double18 = quarterlyDouble14.getQseqQ();
        double[] doubleArray22 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray22);
        double double24 = quarterlyDouble23.getTtmAvg();
        double[] doubleArray25 = new double[] {};
        quarterlyDouble23.dArr = doubleArray25;
        quarterlyDouble14.dArr = doubleArray25;
        quarterlyDouble4.dArr = doubleArray25;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = quarterlyDouble4.fmtGrowth4Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 200.0d + "'", double18 == 200.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0883");
        java.lang.String[] strArray9 = new java.lang.String[] { "\t\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)", "\t\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)", "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)", "\t\t i=0 -1.0000     :          0.00 M (Seq=    0.00% : QoQ=    0.00%)", "\t\t i=0 -1.0000     :          0.00 M (Seq=    0.00% : QoQ=    0.00%)", "hi!", "hi!", "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000", "\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList12 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList((java.util.List<java.lang.String>) strList10);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(manyCompanyDataList12);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0884");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        java.lang.String str4 = quarterlyDouble1.fmtGrowth4Q("hi!");
        java.lang.String str6 = quarterlyDouble1.fmtGrowth1Q("hi!");
        java.lang.String str8 = quarterlyDouble1.fmtGrowth1Q("\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        double double14 = quarterlyDouble13.getTtmAvg();
        double double15 = quarterlyDouble13.getTtmAvg();
        double double17 = quarterlyDouble13.get(1);
        double double18 = quarterlyDouble13.getPrevTtm();
        double[] doubleArray22 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray22);
        double double24 = quarterlyDouble23.getTtm();
        double double25 = quarterlyDouble23.getPrevTtm();
        double double26 = quarterlyDouble23.getTtmAvg();
        double double27 = quarterlyDouble23.getQseqQ();
        double[] doubleArray31 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray31);
        double double33 = quarterlyDouble32.getTtmAvg();
        double[] doubleArray34 = new double[] {};
        quarterlyDouble32.dArr = doubleArray34;
        quarterlyDouble23.dArr = doubleArray34;
        quarterlyDouble13.dArr = doubleArray34;
        double[] doubleArray38 = quarterlyDouble13.dArr;
        quarterlyDouble1.dArr = doubleArray38;
        java.lang.String str40 = quarterlyDouble1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = quarterlyDouble1.fmtGrowth4Q("\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str4, "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str6, "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str8, "\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 200.0d + "'", double27 == 200.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0885");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (-1), (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0886");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) ' ', 1);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0887");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.getTtm();
        double double9 = quarterlyDouble4.getMostRecent();
        double[] doubleArray10 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 1.0, -1.0]");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0888");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble3 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double6 = quarterlyDouble3.deltaQ(10, (int) (short) 1);
        double double7 = quarterlyDouble3.getTtm();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0889");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) ' ', (int) 'a');
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0890");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.lang.String str3 = companyData1.getTicker();
        java.lang.String str4 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList5, 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList5);
        org.junit.Assert.assertNull(fieldData8);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0891");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double double8 = quarterlyDouble4.getMostRecent();
        double double9 = quarterlyDouble4.get2QTtm();
        double double10 = quarterlyDouble4.getQseqQ();
        double double11 = quarterlyDouble4.getPrevTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 200.0d + "'", double10 == 200.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0892");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double[] doubleArray8 = quarterlyDouble1.dArr;
        double double10 = quarterlyDouble1.get((int) 'a');
        double double12 = quarterlyDouble1.get((int) (short) 100);
        double double13 = quarterlyDouble1.getQoQ();
        java.lang.String str14 = quarterlyDouble1.toString();
        double[] doubleArray15 = quarterlyDouble1.dArr;
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str14, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0893");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\t i=0 -1.0000     :          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) (short) 1, 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0894");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) '#', (int) (short) 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, 0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNull(fieldData5);
        org.junit.Assert.assertNull(fieldData8);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0895");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getQoQ();
        java.lang.String str4 = quarterlyDouble1.fmtGrowth1Q("\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        double[] doubleArray5 = quarterlyDouble1.dArr;
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str4, "\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0896");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray11 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double double13 = quarterlyDouble12.getTtm();
        double double15 = quarterlyDouble12.get((int) (byte) 1);
        double[] doubleArray16 = quarterlyDouble12.dArr;
        double[] doubleArray20 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        quarterlyDouble12.dArr = doubleArray20;
        quarterlyDouble4.dArr = doubleArray20;
        double[] doubleArray24 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        double double26 = quarterlyDouble25.getPrevTtm();
        double double27 = quarterlyDouble25.get2QTtm();
        double[] doubleArray31 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray31);
        double double33 = quarterlyDouble32.getTtmAvg();
        double[] doubleArray34 = new double[] {};
        quarterlyDouble32.dArr = doubleArray34;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray34);
        quarterlyDouble25.dArr = doubleArray34;
        quarterlyDouble4.dArr = doubleArray34;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray34);
        double double40 = quarterlyDouble39.getTtmAvg();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0897");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double double6 = quarterlyDouble4.getQseqQ();
        java.lang.String str7 = quarterlyDouble4.toString();
        double double8 = quarterlyDouble4.getTtmAvg();
        double double11 = quarterlyDouble4.deltaQ((int) ' ', (int) ' ');
        double double12 = quarterlyDouble4.get2QTtm();
        double double13 = quarterlyDouble4.getTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 200.0d + "'", double6 == 200.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str7, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0898");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble3 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double[] doubleArray5 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double10 = quarterlyDouble7.deltaQ(1, 0);
        java.lang.Class<?> wildcardClass11 = quarterlyDouble7.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0899");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.lang.String str4 = companyData1.getTicker();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0900");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.lang.String str3 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
        java.lang.String str5 = companyData1.getTicker();
        java.lang.String str6 = companyData1.getTicker();
        java.lang.String str7 = companyData1.getTicker();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0901");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 1, (int) '4');
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0902");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", 10, 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0903");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, 0, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList6);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0904");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.getQseqQ();
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        double double14 = quarterlyDouble13.getTtmAvg();
        double[] doubleArray15 = new double[] {};
        quarterlyDouble13.dArr = doubleArray15;
        quarterlyDouble4.dArr = doubleArray15;
        double double18 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray19 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray19);
        double double21 = quarterlyDouble20.getPrevTtm();
        double double22 = quarterlyDouble20.get2QTtm();
        double double23 = quarterlyDouble20.getMostRecent();
        double[] doubleArray24 = quarterlyDouble20.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        quarterlyDouble4.dArr = doubleArray24;
        double[] doubleArray27 = quarterlyDouble4.dArr;
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 200.0d + "'", double8 == 200.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0905");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.get2QTtm();
        double double10 = quarterlyDouble4.getTtm();
        double double11 = quarterlyDouble4.getTtm();
        double double12 = quarterlyDouble4.getTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 200.0d + "'", double8 == 200.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0906");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double[] doubleArray8 = quarterlyDouble1.dArr;
        double double10 = quarterlyDouble1.get((int) 'a');
        double double12 = quarterlyDouble1.get((int) (short) 100);
        double[] doubleArray16 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray16);
        double double18 = quarterlyDouble17.getTtmAvg();
        double double19 = quarterlyDouble17.getTtmAvg();
        double[] doubleArray20 = quarterlyDouble17.dArr;
        quarterlyDouble1.dArr = doubleArray20;
        double[] doubleArray22 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray22);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray22);
        quarterlyDouble1.dArr = doubleArray22;
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0907");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.lang.String str3 = companyData1.getTicker();
        java.lang.String str4 = companyData1.getTicker();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str3, "\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str4, "\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0908");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray8 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        double double12 = quarterlyDouble9.deltaQ((int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = quarterlyDouble9.fmtGrowth1Q("\t\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0909");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (short) 10, (int) 'a');
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0910");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.getTtm();
        double[] doubleArray7 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double9 = quarterlyDouble8.getTtmAvg();
        double[] doubleArray10 = new double[] {};
        quarterlyDouble8.dArr = doubleArray10;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble1.dArr = doubleArray10;
        double double16 = quarterlyDouble1.deltaQ((int) (byte) -1, 0);
        double double17 = quarterlyDouble1.getTtmAvg();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0911");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble3 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double[] doubleArray5 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        java.lang.String str7 = quarterlyDouble6.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = quarterlyDouble6.getMostRecent();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0912");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        quarterlyDouble4.dArr = doubleArray12;
        double[] doubleArray18 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        double double20 = quarterlyDouble19.getTtm();
        double double22 = quarterlyDouble19.get((int) (byte) 1);
        double[] doubleArray23 = quarterlyDouble19.dArr;
        double[] doubleArray24 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        quarterlyDouble19.dArr = doubleArray24;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        quarterlyDouble4.dArr = doubleArray24;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        double double31 = quarterlyDouble29.get((-1));
        double double32 = quarterlyDouble29.getPrevTtm();
        double[] doubleArray33 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray33);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble35 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray33);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray33);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray33);
        double[] doubleArray38 = quarterlyDouble37.dArr;
        java.lang.String str39 = quarterlyDouble37.toString();
        double[] doubleArray43 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble44 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray43);
        double double45 = quarterlyDouble44.getMostRecent();
        double double46 = quarterlyDouble44.getTtm();
        double[] doubleArray47 = quarterlyDouble44.dArr;
        quarterlyDouble37.dArr = doubleArray47;
        quarterlyDouble29.dArr = doubleArray47;
        double double50 = quarterlyDouble29.getPrevTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str52 = quarterlyDouble29.fmtGrowth1Q("\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-9999.9999d) + "'", double31 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0d + "'", double45 == 1.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0913");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
        double[] doubleArray8 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        quarterlyDouble4.dArr = doubleArray8;
        double double12 = quarterlyDouble4.get((int) 'a');
        double double13 = quarterlyDouble4.get2QTtm();
        double double14 = quarterlyDouble4.getPrevTtm();
        java.lang.Class<?> wildcardClass15 = quarterlyDouble4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0914");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        java.lang.String str4 = quarterlyDouble1.fmtGrowth4Q("hi!");
        java.lang.String str6 = quarterlyDouble1.fmtGrowth1Q("\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        double double9 = quarterlyDouble1.deltaQ((int) (short) 1, 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str4, "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\t\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str6, "\t\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0915");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) '4', 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, 0, (int) (short) 100);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList6);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0916");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary((int) (byte) 1, 100);
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0917");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary((int) '4', 10);
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0918");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double4 = quarterlyDouble1.deltaQ(100, (int) (short) 10);
        double double5 = quarterlyDouble1.getTtm();
        java.lang.String str6 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.get2QTtm();
        double double8 = quarterlyDouble1.get2QTtm();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str6, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0919");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double4 = quarterlyDouble1.deltaQ((int) (short) 10, (int) 'a');
        double double6 = quarterlyDouble1.get(100);
        double double7 = quarterlyDouble1.getPrevTtm();
        double double8 = quarterlyDouble1.get2QTtm();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-9999.9999d) + "'", double6 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0920");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
        double double8 = quarterlyDouble4.getTtm();
        double double9 = quarterlyDouble4.getPrevTtm();
        java.lang.String str10 = quarterlyDouble4.toString();
        java.lang.String str11 = quarterlyDouble4.toString();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0921");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary((int) 'a', (int) (byte) -1);
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0922");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double[] doubleArray6 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        double double8 = quarterlyDouble7.getTtm();
        double double10 = quarterlyDouble7.get((int) (byte) 1);
        double[] doubleArray11 = quarterlyDouble7.dArr;
        quarterlyDouble1.dArr = doubleArray11;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double double15 = quarterlyDouble14.getQseqQ();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 200.0d + "'", double15 == 200.0d);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0923");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double double6 = quarterlyDouble4.getQseqQ();
        java.lang.String str7 = quarterlyDouble4.toString();
        double double8 = quarterlyDouble4.getPrevTtm();
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        double double14 = quarterlyDouble13.getTtm();
        double double16 = quarterlyDouble13.get((int) (byte) 1);
        double[] doubleArray17 = quarterlyDouble13.dArr;
        double double18 = quarterlyDouble13.getPrevTtm();
        double[] doubleArray22 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray22);
        double double24 = quarterlyDouble23.getTtmAvg();
        double[] doubleArray25 = new double[] {};
        quarterlyDouble23.dArr = doubleArray25;
        double double29 = quarterlyDouble23.deltaQ((int) (byte) 0, (int) (short) 1);
        java.lang.String str30 = quarterlyDouble23.toString();
        double[] doubleArray31 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble32 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray31);
        double double33 = quarterlyDouble32.getPrevTtm();
        double double34 = quarterlyDouble32.getTtm();
        double double36 = quarterlyDouble32.get(10);
        double double37 = quarterlyDouble32.get2QTtm();
        double[] doubleArray38 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray38);
        double double40 = quarterlyDouble39.getQoQ();
        double double41 = quarterlyDouble39.getPrevTtm();
        double[] doubleArray42 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble43 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray42);
        double[] doubleArray47 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble48 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray47);
        double double49 = quarterlyDouble48.getTtmAvg();
        double[] doubleArray50 = new double[] {};
        quarterlyDouble48.dArr = doubleArray50;
        quarterlyDouble43.dArr = doubleArray50;
        quarterlyDouble39.dArr = doubleArray50;
        quarterlyDouble32.dArr = doubleArray50;
        quarterlyDouble23.dArr = doubleArray50;
        quarterlyDouble13.dArr = doubleArray50;
        quarterlyDouble4.dArr = doubleArray50;
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 200.0d + "'", double6 == 200.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str7, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-9999.9999d) + "'", double36 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[]");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0924");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double double8 = quarterlyDouble1.getQoQ();
        double double9 = quarterlyDouble1.getTtmAvg();
        double double10 = quarterlyDouble1.getQseqQ();
        double double11 = quarterlyDouble1.getTtmAvg();
        double[] doubleArray12 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        double double14 = quarterlyDouble13.getPrevTtm();
        double double15 = quarterlyDouble13.get2QTtm();
        java.lang.String str16 = quarterlyDouble13.toString();
        double double19 = quarterlyDouble13.deltaQ((int) (byte) 100, 0);
        double double20 = quarterlyDouble13.getQoQ();
        double double21 = quarterlyDouble13.getTtmAvg();
        double double22 = quarterlyDouble13.getQseqQ();
        double[] doubleArray23 = quarterlyDouble13.dArr;
        double[] doubleArray27 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble28 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray27);
        double double29 = quarterlyDouble28.getTtm();
        double double31 = quarterlyDouble28.get((int) (byte) 1);
        double double32 = quarterlyDouble28.get2QTtm();
        java.lang.String str33 = quarterlyDouble28.toString();
        double[] doubleArray37 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble38 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray37);
        double double39 = quarterlyDouble38.getTtm();
        double double41 = quarterlyDouble38.get((int) (byte) 1);
        double[] doubleArray42 = quarterlyDouble38.dArr;
        double double43 = quarterlyDouble38.getTtmAvg();
        double[] doubleArray47 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble48 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray47);
        double double49 = quarterlyDouble48.getTtmAvg();
        double[] doubleArray50 = new double[] {};
        quarterlyDouble48.dArr = doubleArray50;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble52 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray50);
        quarterlyDouble38.dArr = doubleArray50;
        quarterlyDouble28.dArr = doubleArray50;
        quarterlyDouble13.dArr = doubleArray50;
        quarterlyDouble1.dArr = doubleArray50;
        double double57 = quarterlyDouble1.getTtmAvg();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str16, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str33, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0925");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0926");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(0, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList2, (int) '#', (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(companyDataList5);
        org.junit.Assert.assertNotNull(companyDataList6);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0927");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 0, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, 100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList6);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0928");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getQoQ();
        double double3 = quarterlyDouble1.getPrevTtm();
        double[] doubleArray4 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray4);
        double[] doubleArray9 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        double double11 = quarterlyDouble10.getTtmAvg();
        double[] doubleArray12 = new double[] {};
        quarterlyDouble10.dArr = doubleArray12;
        quarterlyDouble5.dArr = doubleArray12;
        quarterlyDouble1.dArr = doubleArray12;
        java.lang.String str16 = quarterlyDouble1.toString();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0929");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double4 = quarterlyDouble1.deltaQ(100, (int) (short) 10);
        double double5 = quarterlyDouble1.getTtm();
        java.lang.String str6 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.get2QTtm();
        java.lang.String str9 = quarterlyDouble1.fmtGrowth4Q("\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str6, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str9, "\t\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0930");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get((int) 'a', (int) ' ', snpEnum2, dowEnum3, exchEnum4, (double) '4', (long) (-1));
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0931");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary((int) '4', (int) (byte) -1);
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0932");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double double8 = quarterlyDouble4.getMostRecent();
        double double9 = quarterlyDouble4.get2QTtm();
        double double12 = quarterlyDouble4.deltaQ((int) (byte) 100, (int) (short) -1);
        double double15 = quarterlyDouble4.deltaQ((int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = quarterlyDouble4.fmtGrowth1Q("\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0933");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double[] doubleArray8 = quarterlyDouble1.dArr;
        double double10 = quarterlyDouble1.get((int) 'a');
        double double12 = quarterlyDouble1.get((int) (short) 100);
        double double13 = quarterlyDouble1.getQoQ();
        java.lang.String str14 = quarterlyDouble1.toString();
        double double16 = quarterlyDouble1.get((int) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str14, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9999.9999d) + "'", double16 == (-9999.9999d));
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0934");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.lang.String str3 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str3, "\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0935");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.getTtm();
        double double5 = quarterlyDouble1.get(10);
        double double6 = quarterlyDouble1.get2QTtm();
        double[] doubleArray7 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double9 = quarterlyDouble8.getQoQ();
        double double10 = quarterlyDouble8.getPrevTtm();
        double[] doubleArray11 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double[] doubleArray16 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray16);
        double double18 = quarterlyDouble17.getTtmAvg();
        double[] doubleArray19 = new double[] {};
        quarterlyDouble17.dArr = doubleArray19;
        quarterlyDouble12.dArr = doubleArray19;
        quarterlyDouble8.dArr = doubleArray19;
        quarterlyDouble1.dArr = doubleArray19;
        // The following exception was thrown during execution in test generation
        try {
            double double24 = quarterlyDouble1.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-9999.9999d) + "'", double5 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0936");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.getQseqQ();
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        double double14 = quarterlyDouble13.getTtmAvg();
        double[] doubleArray15 = new double[] {};
        quarterlyDouble13.dArr = doubleArray15;
        quarterlyDouble4.dArr = doubleArray15;
        double double19 = quarterlyDouble4.get((int) (byte) 10);
        java.lang.String str20 = quarterlyDouble4.toString();
        double[] doubleArray21 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray21);
        double double23 = quarterlyDouble22.getPrevTtm();
        double double24 = quarterlyDouble22.getTtm();
        double[] doubleArray28 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray28);
        double double30 = quarterlyDouble29.getTtmAvg();
        double[] doubleArray31 = new double[] {};
        quarterlyDouble29.dArr = doubleArray31;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray31);
        quarterlyDouble22.dArr = doubleArray31;
        double double37 = quarterlyDouble22.deltaQ((int) (byte) -1, 0);
        double double39 = quarterlyDouble22.get(0);
        double[] doubleArray40 = quarterlyDouble22.dArr;
        quarterlyDouble4.dArr = doubleArray40;
        double double42 = quarterlyDouble4.getPrevTtm();
        double double43 = quarterlyDouble4.get2QTtm();
        double double44 = quarterlyDouble4.getTtmAvg();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 200.0d + "'", double8 == 200.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-9999.9999d) + "'", double19 == (-9999.9999d));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-9999.9999d) + "'", double39 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0937");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double double8 = quarterlyDouble1.getQoQ();
        java.lang.String str10 = quarterlyDouble1.fmtGrowth1Q("\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        double double11 = quarterlyDouble1.getQoQ();
        double double13 = quarterlyDouble1.get((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\t\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str10, "\t\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0938");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000", (int) (byte) 100, 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0939");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(10, 100);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0940");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        double double6 = quarterlyDouble1.deltaQ((int) (byte) 10, (int) (short) -1);
        double double8 = quarterlyDouble1.get((int) (byte) 100);
        double double9 = quarterlyDouble1.getTtm();
        double[] doubleArray10 = quarterlyDouble1.dArr;
        double double11 = quarterlyDouble1.getTtm();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9999.9999d) + "'", double8 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0941");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0942");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double double8 = quarterlyDouble1.getMostRecent();
        double double9 = quarterlyDouble1.getTtmAvg();
        double[] doubleArray10 = null;
        quarterlyDouble1.dArr = doubleArray10;
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0943");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 100, 1);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0944");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        quarterlyDouble4.dArr = doubleArray12;
        double double15 = quarterlyDouble4.get2QTtm();
        double double16 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray17 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble18 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        double double19 = quarterlyDouble18.getPrevTtm();
        java.lang.String str21 = quarterlyDouble18.fmtGrowth4Q("hi!");
        java.lang.String str23 = quarterlyDouble18.fmtGrowth1Q("hi!");
        java.lang.String str25 = quarterlyDouble18.fmtGrowth1Q("\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        double[] doubleArray29 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray29);
        double double31 = quarterlyDouble30.getTtmAvg();
        double double32 = quarterlyDouble30.getTtmAvg();
        double double34 = quarterlyDouble30.get(1);
        double double35 = quarterlyDouble30.getPrevTtm();
        double[] doubleArray39 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble40 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray39);
        double double41 = quarterlyDouble40.getTtm();
        double double42 = quarterlyDouble40.getPrevTtm();
        double double43 = quarterlyDouble40.getTtmAvg();
        double double44 = quarterlyDouble40.getQseqQ();
        double[] doubleArray48 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble49 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray48);
        double double50 = quarterlyDouble49.getTtmAvg();
        double[] doubleArray51 = new double[] {};
        quarterlyDouble49.dArr = doubleArray51;
        quarterlyDouble40.dArr = doubleArray51;
        quarterlyDouble30.dArr = doubleArray51;
        double[] doubleArray55 = quarterlyDouble30.dArr;
        quarterlyDouble18.dArr = doubleArray55;
        quarterlyDouble4.dArr = doubleArray55;
        // The following exception was thrown during execution in test generation
        try {
            double double58 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str21, "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str23, "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str25, "\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 200.0d + "'", double44 == 200.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[]");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0945");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        double[] doubleArray7 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double9 = quarterlyDouble8.getTtmAvg();
        double[] doubleArray10 = new double[] {};
        quarterlyDouble8.dArr = doubleArray10;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        quarterlyDouble1.dArr = doubleArray10;
        double double16 = quarterlyDouble1.deltaQ((int) (byte) -1, (int) (byte) 0);
        double double17 = quarterlyDouble1.getTtm();
        double[] doubleArray18 = quarterlyDouble1.dArr;
        double double19 = quarterlyDouble1.getTtmAvg();
        double[] doubleArray20 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        double double22 = quarterlyDouble21.getPrevTtm();
        double double23 = quarterlyDouble21.get2QTtm();
        java.lang.String str24 = quarterlyDouble21.toString();
        double double27 = quarterlyDouble21.deltaQ((int) (byte) 100, 0);
        double[] doubleArray28 = quarterlyDouble21.dArr;
        double[] doubleArray32 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray32);
        double double34 = quarterlyDouble33.getTtm();
        double double35 = quarterlyDouble33.getPrevTtm();
        double double36 = quarterlyDouble33.getTtmAvg();
        double double37 = quarterlyDouble33.getQseqQ();
        double[] doubleArray41 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble42 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray41);
        double double43 = quarterlyDouble42.getTtmAvg();
        double[] doubleArray44 = new double[] {};
        quarterlyDouble42.dArr = doubleArray44;
        quarterlyDouble33.dArr = doubleArray44;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble47 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray44);
        quarterlyDouble21.dArr = doubleArray44;
        quarterlyDouble1.dArr = doubleArray44;
        double double50 = quarterlyDouble1.getTtm();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str24, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 200.0d + "'", double37 == 200.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0946");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(0, (int) '4');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0947");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.getQseqQ();
        double double10 = quarterlyDouble4.get2QTtm();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = quarterlyDouble4.deltaQ((int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 200.0d + "'", double8 == 200.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 200.0d + "'", double9 == 200.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0948");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble3 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double[] doubleArray5 = quarterlyDouble4.dArr;
        java.lang.String str6 = quarterlyDouble4.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0949");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.lang.String str4 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList5);
        org.junit.Assert.assertNotNull(fieldDataList6);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0950");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        double double4 = quarterlyDouble1.get2QTtm();
        java.lang.String str5 = quarterlyDouble1.toString();
        double double6 = quarterlyDouble1.getTtmAvg();
        java.lang.String str8 = quarterlyDouble1.fmtGrowth4Q("\t i=0 -1.0000");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str5, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t\t i=0 -1.0000     :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str8, "\t\t i=0 -1.0000     :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0951");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.getTtm();
        java.lang.String str5 = quarterlyDouble1.fmtGrowth1Q("\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        double double7 = quarterlyDouble1.get(100);
        double double8 = quarterlyDouble1.getQoQ();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str5, "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0952");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double double6 = quarterlyDouble4.getQseqQ();
        java.lang.String str7 = quarterlyDouble4.toString();
        double double8 = quarterlyDouble4.getPrevTtm();
        double double10 = quarterlyDouble4.get((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = quarterlyDouble4.fmtGrowth1Q("\t\t\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 200.0d + "'", double6 == 200.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str7, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0953");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double9 = quarterlyDouble4.getPrevTtm();
        double[] doubleArray13 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray13);
        double double15 = quarterlyDouble14.getTtmAvg();
        double[] doubleArray16 = new double[] {};
        quarterlyDouble14.dArr = doubleArray16;
        double double20 = quarterlyDouble14.deltaQ((int) (byte) 0, (int) (short) 1);
        java.lang.String str21 = quarterlyDouble14.toString();
        double[] doubleArray22 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray22);
        double double24 = quarterlyDouble23.getPrevTtm();
        double double25 = quarterlyDouble23.getTtm();
        double double27 = quarterlyDouble23.get(10);
        double double28 = quarterlyDouble23.get2QTtm();
        double[] doubleArray29 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble30 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray29);
        double double31 = quarterlyDouble30.getQoQ();
        double double32 = quarterlyDouble30.getPrevTtm();
        double[] doubleArray33 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray33);
        double[] doubleArray38 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble39 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray38);
        double double40 = quarterlyDouble39.getTtmAvg();
        double[] doubleArray41 = new double[] {};
        quarterlyDouble39.dArr = doubleArray41;
        quarterlyDouble34.dArr = doubleArray41;
        quarterlyDouble30.dArr = doubleArray41;
        quarterlyDouble23.dArr = doubleArray41;
        quarterlyDouble14.dArr = doubleArray41;
        quarterlyDouble4.dArr = doubleArray41;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble48 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray41);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-9999.9999d) + "'", double27 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0954");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.getTtm();
        java.lang.String str5 = quarterlyDouble1.fmtGrowth1Q("\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        double double7 = quarterlyDouble1.get(100);
        double double9 = quarterlyDouble1.get((int) (short) 1);
        double[] doubleArray10 = quarterlyDouble1.dArr;
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str5, "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0955");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double[] doubleArray8 = quarterlyDouble1.dArr;
        double double9 = quarterlyDouble1.getTtmAvg();
        double double10 = quarterlyDouble1.getTtmAvg();
        double double11 = quarterlyDouble1.getTtmAvg();
        double double12 = quarterlyDouble1.get2QTtm();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0956");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0957");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        double[] doubleArray13 = quarterlyDouble12.dArr;
        quarterlyDouble4.dArr = doubleArray13;
        double double17 = quarterlyDouble4.deltaQ((int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = quarterlyDouble4.getQseqQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0958");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray8 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        double double10 = quarterlyDouble9.getTtm();
        double[] doubleArray14 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray14);
        double double16 = quarterlyDouble15.getTtmAvg();
        double[] doubleArray17 = new double[] {};
        quarterlyDouble15.dArr = doubleArray17;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray17);
        double[] doubleArray20 = quarterlyDouble19.dArr;
        quarterlyDouble9.dArr = doubleArray20;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0959");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) -1, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) '4', (int) (byte) 0);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList4);
        org.junit.Assert.assertNotNull(companyDataList7);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0960");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.lang.String str3 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
        java.lang.String str5 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList8, (int) (short) -1, (int) '#');
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNull(fieldData11);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0961");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.get((int) 'a');
        double[] doubleArray9 = quarterlyDouble4.dArr;
        double double11 = quarterlyDouble4.get(1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9999.9999d) + "'", double8 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0962");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) 'a', (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList4);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0963");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double double8 = quarterlyDouble4.get2QTtm();
        double double9 = quarterlyDouble4.getMostRecent();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0964");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.lang.String str2 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(fieldDataList3);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0965");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(1, (-1));
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0966");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.lang.String str3 = companyData1.getTicker();
        java.lang.String str4 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList5);
        org.junit.Assert.assertNotNull(fieldDataList6);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0967");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
        double[] doubleArray8 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        quarterlyDouble4.dArr = doubleArray8;
        double double12 = quarterlyDouble4.get((int) 'a');
        double double13 = quarterlyDouble4.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0968");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.getQseqQ();
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        double double14 = quarterlyDouble13.getTtmAvg();
        double[] doubleArray15 = new double[] {};
        quarterlyDouble13.dArr = doubleArray15;
        quarterlyDouble4.dArr = doubleArray15;
        double double18 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray19 = quarterlyDouble4.dArr;
        double double22 = quarterlyDouble4.deltaQ((int) 'a', (int) '4');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 200.0d + "'", double8 == 200.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0969");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.getTtm();
        java.lang.String str5 = quarterlyDouble1.fmtGrowth1Q("\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        double double6 = quarterlyDouble1.getTtmAvg();
        double double8 = quarterlyDouble1.get((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str5, "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0970");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double double8 = quarterlyDouble1.getQoQ();
        double double9 = quarterlyDouble1.getTtmAvg();
        double double10 = quarterlyDouble1.getQseqQ();
        double[] doubleArray11 = quarterlyDouble1.dArr;
        double[] doubleArray15 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        double double17 = quarterlyDouble16.getTtm();
        double double19 = quarterlyDouble16.get((int) (byte) 1);
        double double20 = quarterlyDouble16.get2QTtm();
        java.lang.String str21 = quarterlyDouble16.toString();
        double[] doubleArray25 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray25);
        double double27 = quarterlyDouble26.getTtm();
        double double29 = quarterlyDouble26.get((int) (byte) 1);
        double[] doubleArray30 = quarterlyDouble26.dArr;
        double double31 = quarterlyDouble26.getTtmAvg();
        double[] doubleArray35 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray35);
        double double37 = quarterlyDouble36.getTtmAvg();
        double[] doubleArray38 = new double[] {};
        quarterlyDouble36.dArr = doubleArray38;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble40 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray38);
        quarterlyDouble26.dArr = doubleArray38;
        quarterlyDouble16.dArr = doubleArray38;
        quarterlyDouble1.dArr = doubleArray38;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble44 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray38);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble45 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray38);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str21, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0971");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double9 = quarterlyDouble4.get2QTtm();
        double double11 = quarterlyDouble4.get((int) 'a');
        double[] doubleArray12 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        double double15 = quarterlyDouble13.get((int) (short) 10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9999.9999d) + "'", double15 == (-9999.9999d));
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0972");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.lang.String str4 = companyData1.getTicker();
        java.lang.String str5 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
        java.lang.String str7 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
        java.lang.String str9 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = companyData1.getFdList();
        java.lang.String str11 = companyData1.getTicker();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0973");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        double double6 = quarterlyDouble1.deltaQ((int) (byte) 10, (int) (short) -1);
        double double7 = quarterlyDouble1.getTtmAvg();
        double double9 = quarterlyDouble1.get((int) (byte) 100);
        java.lang.String str11 = quarterlyDouble1.fmtGrowth4Q("\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9999.9999d) + "'", double9 == (-9999.9999d));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str11, "\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0974");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        java.lang.String str4 = quarterlyDouble1.fmtGrowth4Q("hi!");
        double[] doubleArray5 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        quarterlyDouble1.dArr = doubleArray5;
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str4, "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0975");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.getTtm();
        java.lang.String str5 = quarterlyDouble1.fmtGrowth1Q("\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        double double6 = quarterlyDouble1.getTtmAvg();
        java.lang.String str7 = quarterlyDouble1.toString();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str5, "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str7, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0976");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) '#', 0);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0977");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        java.lang.String str2 = companyData1.getTicker();
        java.lang.String str3 = companyData1.getTicker();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str2, "\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str3, "\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0978");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] fieldDataArray0 = new net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData[] {};
        java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList1 = new java.util.ArrayList<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, fieldDataArray0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (short) 100, (int) (byte) 10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (short) 1, (int) (short) 1);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData((java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData>) fieldDataList1, (int) (short) 100, (-1));
        org.junit.Assert.assertNotNull(fieldDataArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(fieldData5);
        org.junit.Assert.assertNull(fieldData8);
        org.junit.Assert.assertNull(fieldData11);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0979");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double[] doubleArray8 = quarterlyDouble1.dArr;
        double double10 = quarterlyDouble1.get((int) 'a');
        double double12 = quarterlyDouble1.get((int) (short) 100);
        double[] doubleArray16 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray16);
        double double18 = quarterlyDouble17.getTtmAvg();
        double double19 = quarterlyDouble17.getTtmAvg();
        double[] doubleArray20 = quarterlyDouble17.dArr;
        quarterlyDouble1.dArr = doubleArray20;
        double[] doubleArray27 = new double[] { '4', 100, (byte) -1, (short) 100, (byte) -1 };
        quarterlyDouble1.dArr = doubleArray27;
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[52.0, 100.0, -1.0, 100.0, -1.0]");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0980");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        quarterlyDouble4.dArr = doubleArray12;
        double[] doubleArray18 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        double double20 = quarterlyDouble19.getTtm();
        double double22 = quarterlyDouble19.get((int) (byte) 1);
        double[] doubleArray23 = quarterlyDouble19.dArr;
        double[] doubleArray24 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        quarterlyDouble19.dArr = doubleArray24;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        quarterlyDouble4.dArr = doubleArray24;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        double double31 = quarterlyDouble29.get((-1));
        double double32 = quarterlyDouble29.get2QTtm();
        double double35 = quarterlyDouble29.deltaQ((int) '4', (int) (short) -1);
        java.lang.String str36 = quarterlyDouble29.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double37 = quarterlyDouble29.getMostRecent();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-9999.9999d) + "'", double31 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0981");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        quarterlyDouble4.dArr = doubleArray12;
        double double15 = quarterlyDouble4.getMostRecent();
        double double16 = quarterlyDouble4.getQseqQ();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 200.0d + "'", double16 == 200.0d);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0982");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double9 = quarterlyDouble4.getTtm();
        double double10 = quarterlyDouble4.get2QTtm();
        double double11 = quarterlyDouble4.getTtm();
        double double12 = quarterlyDouble4.getTtm();
        java.lang.String str13 = quarterlyDouble4.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = quarterlyDouble4.fmtGrowth4Q("\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str13, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0983");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (-1), (int) (byte) 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0984");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        java.lang.String str4 = quarterlyDouble1.fmtGrowth4Q("hi!");
        java.lang.String str6 = quarterlyDouble1.fmtGrowth1Q("\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        java.lang.String str8 = quarterlyDouble1.fmtGrowth4Q("\t\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str4, "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\t\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str6, "\t\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t\t\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str8, "\t\t\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0985");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.get(1);
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        double double14 = quarterlyDouble13.getTtm();
        double double16 = quarterlyDouble13.get((int) (byte) 1);
        double[] doubleArray17 = quarterlyDouble13.dArr;
        double[] doubleArray18 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        quarterlyDouble13.dArr = doubleArray18;
        quarterlyDouble4.dArr = doubleArray18;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble22 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = quarterlyDouble23.getMostRecent();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0986");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (short) 100, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList4);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0987");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        quarterlyDouble4.dArr = doubleArray12;
        double double15 = quarterlyDouble4.get2QTtm();
        double double16 = quarterlyDouble4.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = quarterlyDouble4.fmtGrowth4Q("\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 200.0d + "'", double16 == 200.0d);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0988");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) (short) -1, (-1));
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNull(fieldData5);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0989");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\t\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) (short) -1, 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0990");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) '4', (int) (byte) 100);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0991");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double double8 = quarterlyDouble4.get2QTtm();
        java.lang.String str9 = quarterlyDouble4.toString();
        double double10 = quarterlyDouble4.getQseqQ();
        double double11 = quarterlyDouble4.getTtm();
        double double12 = quarterlyDouble4.getQseqQ();
        double double13 = quarterlyDouble4.getMostRecent();
        double double14 = quarterlyDouble4.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = quarterlyDouble4.fmtGrowth1Q("\t i=0 -1.0000");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str9, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 200.0d + "'", double10 == 200.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 200.0d + "'", double12 == 200.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 200.0d + "'", double14 == 200.0d);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0992");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) ' ', (int) (byte) 100);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0993");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) '#', 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0994");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.get(1);
        double double9 = quarterlyDouble4.getQseqQ();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 200.0d + "'", double9 == 200.0d);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0995");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, 1, (int) (short) 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0996");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (short) 100, (int) ' ');
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0997");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        quarterlyDouble4.dArr = doubleArray12;
        double double15 = quarterlyDouble4.getMostRecent();
        double double16 = quarterlyDouble4.getPrevTtm();
        double double18 = quarterlyDouble4.get(0);
        double[] doubleArray19 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray19);
        double double21 = quarterlyDouble20.getPrevTtm();
        double double22 = quarterlyDouble20.get2QTtm();
        double double23 = quarterlyDouble20.getMostRecent();
        double[] doubleArray24 = quarterlyDouble20.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        quarterlyDouble4.dArr = doubleArray24;
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0998");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get(10, (int) '#', snpEnum2, dowEnum3, exchEnum4, (double) 0, (long) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList7);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList9 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList7);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(companyDataList8);
        org.junit.Assert.assertNotNull(manyCompanyDataList9);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test0999");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests1.test1000");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray8 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        double double10 = quarterlyDouble9.getTtm();
        double double11 = quarterlyDouble9.getTtm();
        double[] doubleArray12 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        double double14 = quarterlyDouble13.getPrevTtm();
        double double15 = quarterlyDouble13.getTtm();
        java.lang.String str17 = quarterlyDouble13.fmtGrowth1Q("\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        double double19 = quarterlyDouble13.get(100);
        double[] doubleArray20 = quarterlyDouble13.dArr;
        quarterlyDouble9.dArr = doubleArray20;
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str17, "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-9999.9999d) + "'", double19 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }
}

