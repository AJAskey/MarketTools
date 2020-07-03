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
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) 'a', 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList9 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) (byte) 10, 10);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
        org.junit.Assert.assertNotNull(manyCompanyDataList5);
        org.junit.Assert.assertNotNull(manyCompanyDataList6);
        org.junit.Assert.assertNotNull(companyDataList9);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1002");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) ' ', (int) (short) 0);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1003");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
        double double8 = quarterlyDouble4.getTtm();
        double[] doubleArray9 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        double double11 = quarterlyDouble10.getTtm();
        double[] doubleArray12 = quarterlyDouble10.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = quarterlyDouble13.getQoQ();
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1004");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (byte) 1, (-1));
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1005");
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
        double double15 = quarterlyDouble14.getTtm();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1006");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1007");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double double8 = quarterlyDouble1.getTtm();
        double double9 = quarterlyDouble1.get2QTtm();
        double double10 = quarterlyDouble1.getTtmAvg();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1008");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.getTtm();
        java.lang.String str5 = quarterlyDouble1.fmtGrowth1Q("\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        double double6 = quarterlyDouble1.getTtmAvg();
        double double7 = quarterlyDouble1.getTtm();
        double double8 = quarterlyDouble1.getQoQ();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str5, "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1009");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
        double[] doubleArray8 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        quarterlyDouble4.dArr = doubleArray8;
        double double12 = quarterlyDouble4.get((int) 'a');
        double double13 = quarterlyDouble4.getPrevTtm();
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
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1010");
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
        java.lang.String str22 = quarterlyDouble4.toString();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1011");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) 'a', (int) ' ');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1012");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
        double double8 = quarterlyDouble4.getTtm();
        double double9 = quarterlyDouble4.getPrevTtm();
        java.lang.String str10 = quarterlyDouble4.toString();
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1013");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.getTtm();
        java.lang.String str5 = quarterlyDouble1.fmtGrowth1Q("\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        double double7 = quarterlyDouble1.get(100);
        double double9 = quarterlyDouble1.get((int) (short) 1);
        java.lang.String str11 = quarterlyDouble1.fmtGrowth1Q("\t\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str5, "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t\t\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str11, "\t\t\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1014");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double double7 = quarterlyDouble4.get(1);
        java.lang.String str8 = quarterlyDouble4.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = quarterlyDouble4.fmtGrowth1Q("\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str8, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1015");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 100, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList4);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1016");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 10, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
        org.junit.Assert.assertNotNull(manyCompanyDataList5);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1017");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double4 = quarterlyDouble1.deltaQ(100, (int) (short) 10);
        double double5 = quarterlyDouble1.getQseqQ();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1018");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double9 = quarterlyDouble4.get2QTtm();
        double double12 = quarterlyDouble4.deltaQ((int) (short) 0, (int) (short) -1);
        double double13 = quarterlyDouble4.getPrevTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1019");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) '#', (int) '#');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1020");
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
        double[] doubleArray21 = quarterlyDouble4.dArr;
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
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1021");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        double double6 = quarterlyDouble1.deltaQ((int) (byte) 10, (int) (short) -1);
        double double8 = quarterlyDouble1.get((int) (byte) 100);
        double double9 = quarterlyDouble1.getTtm();
        double double10 = quarterlyDouble1.getTtmAvg();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9999.9999d) + "'", double8 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1022");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 100, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, 1, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(companyDataList7);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1023");
        java.util.List<java.lang.String> strList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList0, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1024");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 1, (int) (short) 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1025");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.lang.String str3 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
        java.lang.String str5 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData10 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList7, (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNull(fieldData10);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1026");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) 'a', 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) '#', 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList10 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass11 = strList3.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
        org.junit.Assert.assertNotNull(companyDataList7);
        org.junit.Assert.assertNotNull(companyDataList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1027");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (short) -1, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(companyDataList3);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1028");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double double8 = quarterlyDouble4.getMostRecent();
        double double9 = quarterlyDouble4.get2QTtm();
        double double10 = quarterlyDouble4.get2QTtm();
        double double12 = quarterlyDouble4.get((int) (short) 0);
        double double13 = quarterlyDouble4.getMostRecent();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1029");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) ' ', (-1));
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1030");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = quarterlyDouble14.deltaQ((int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
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
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1031");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) ' ', (int) (byte) 1);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1032");
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
        double[] doubleArray47 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble48 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray47);
        double double49 = quarterlyDouble48.getTtm();
        double double51 = quarterlyDouble48.get((int) (byte) 1);
        double[] doubleArray52 = quarterlyDouble48.dArr;
        double[] doubleArray56 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble57 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray56);
        quarterlyDouble48.dArr = doubleArray56;
        double[] doubleArray62 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble63 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray62);
        double double64 = quarterlyDouble63.getTtm();
        double double66 = quarterlyDouble63.get((int) (byte) 1);
        double[] doubleArray67 = quarterlyDouble63.dArr;
        double[] doubleArray68 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble69 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray68);
        quarterlyDouble63.dArr = doubleArray68;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble71 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray68);
        quarterlyDouble48.dArr = doubleArray68;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble73 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray68);
        double double75 = quarterlyDouble73.get((-1));
        double double76 = quarterlyDouble73.getPrevTtm();
        double[] doubleArray77 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble78 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray77);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble79 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray77);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble80 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray77);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble81 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray77);
        double[] doubleArray82 = quarterlyDouble81.dArr;
        java.lang.String str83 = quarterlyDouble81.toString();
        double[] doubleArray87 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble88 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray87);
        double double89 = quarterlyDouble88.getMostRecent();
        double double90 = quarterlyDouble88.getTtm();
        double[] doubleArray91 = quarterlyDouble88.dArr;
        quarterlyDouble81.dArr = doubleArray91;
        quarterlyDouble73.dArr = doubleArray91;
        quarterlyDouble4.dArr = doubleArray91;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble95 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray91);
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
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.0d + "'", double51 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 1.0d + "'", double66 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-9999.9999d) + "'", double75 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[]");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 1.0d + "'", double89 == 1.0d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.0d + "'", double90 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[100.0, 1.0, -1.0]");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1033");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        double double6 = quarterlyDouble1.deltaQ((int) (byte) 10, (int) (short) -1);
        double double8 = quarterlyDouble1.get((int) (byte) 100);
        double double10 = quarterlyDouble1.get((-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9999.9999d) + "'", double8 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1034");
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
        double double24 = quarterlyDouble1.get2QTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = quarterlyDouble1.fmtGrowth1Q("\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
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
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1035");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        quarterlyDouble4.dArr = doubleArray12;
        double double15 = quarterlyDouble4.getMostRecent();
        double double16 = quarterlyDouble4.getTtmAvg();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = quarterlyDouble4.fmtGrowth4Q("");
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1036");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 1, 100);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1037");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) '#', (int) (short) -1);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1038");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double double7 = quarterlyDouble4.get(1);
        double double8 = quarterlyDouble4.getTtmAvg();
        double double9 = quarterlyDouble4.getQseqQ();
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 200.0d + "'", double9 == 200.0d);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1039");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1040");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double11 = quarterlyDouble4.deltaQ((int) 'a', 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = quarterlyDouble4.fmtGrowth1Q("\t\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1041");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get((int) (short) 100, 0, snpEnum2, dowEnum3, exchEnum4, (-1.0d), (long) (short) -1);
        java.lang.Class<?> wildcardClass8 = strList7.getClass();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1042");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double[] doubleArray8 = quarterlyDouble1.dArr;
        double double10 = quarterlyDouble1.get((int) 'a');
        double double11 = quarterlyDouble1.get2QTtm();
        double double12 = quarterlyDouble1.getMostRecent();
        java.lang.String str13 = quarterlyDouble1.toString();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9999.9999d) + "'", double10 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str13, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1043");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1044");
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
        double[] doubleArray58 = quarterlyDouble4.dArr;
        // The following exception was thrown during execution in test generation
        try {
            double double59 = quarterlyDouble4.getQseqQ();
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
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[]");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1045");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) -1, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList6);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1046");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) 'a', (int) 'a');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1047");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, 10, (int) ' ');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1048");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray8 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        double double12 = quarterlyDouble9.deltaQ((int) (byte) 0, 0);
        double double15 = quarterlyDouble9.deltaQ((int) (short) 100, 10);
        double double16 = quarterlyDouble9.getQseqQ();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 200.0d + "'", double16 == 200.0d);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1049");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double double8 = quarterlyDouble4.getMostRecent();
        double double9 = quarterlyDouble4.get2QTtm();
        double double10 = quarterlyDouble4.getPrevTtm();
        double[] doubleArray11 = quarterlyDouble4.dArr;
        java.lang.String str12 = quarterlyDouble4.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = quarterlyDouble4.fmtGrowth4Q("\t\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str12, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1050");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) '4', (-1));
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1051");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double double8 = quarterlyDouble4.getMostRecent();
        double double9 = quarterlyDouble4.get2QTtm();
        double double12 = quarterlyDouble4.deltaQ((int) (byte) 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = quarterlyDouble4.getQoQ();
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
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1052");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) -1, 1);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1053");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray7 = quarterlyDouble4.dArr;
        double double8 = quarterlyDouble4.get2QTtm();
        double double9 = quarterlyDouble4.getQseqQ();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 200.0d + "'", double9 == 200.0d);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1054");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList3, (int) (byte) 100, 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList10 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList3, (int) (byte) 10, (int) (byte) -1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList13 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList3, (int) '#', (int) (short) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList16 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies((java.util.List<java.lang.String>) strList3, (int) '4', 0);
        java.lang.Class<?> wildcardClass17 = companyDataList16.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(companyDataList7);
        org.junit.Assert.assertNotNull(companyDataList10);
        org.junit.Assert.assertNotNull(companyDataList13);
        org.junit.Assert.assertNotNull(companyDataList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1055");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double5 = quarterlyDouble1.getQoQ();
        java.lang.String str7 = quarterlyDouble1.fmtGrowth4Q("\t i=0 -1.0000");
        double[] doubleArray8 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        double double10 = quarterlyDouble9.getPrevTtm();
        double double11 = quarterlyDouble9.get2QTtm();
        java.lang.String str12 = quarterlyDouble9.toString();
        double double15 = quarterlyDouble9.deltaQ((int) (byte) 100, 0);
        double double16 = quarterlyDouble9.getQoQ();
        double double17 = quarterlyDouble9.getTtmAvg();
        double double18 = quarterlyDouble9.getQseqQ();
        double[] doubleArray19 = quarterlyDouble9.dArr;
        quarterlyDouble1.dArr = doubleArray19;
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\t\t i=0 -1.0000     :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str7, "\t\t i=0 -1.0000     :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str12, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1056");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.lang.String str3 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
        java.lang.String str5 = companyData1.getTicker();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str3, "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str5, "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1057");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.lang.String str3 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
        java.lang.String str5 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
        java.lang.String str9 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList10 = companyData1.getFdList();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertNotNull(fieldDataList7);
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList10);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1058");
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
        double[] doubleArray47 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble48 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray47);
        double double49 = quarterlyDouble48.getTtm();
        double double51 = quarterlyDouble48.get((int) (byte) 1);
        double[] doubleArray52 = quarterlyDouble48.dArr;
        double[] doubleArray56 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble57 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray56);
        quarterlyDouble48.dArr = doubleArray56;
        double[] doubleArray62 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble63 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray62);
        double double64 = quarterlyDouble63.getTtm();
        double double66 = quarterlyDouble63.get((int) (byte) 1);
        double[] doubleArray67 = quarterlyDouble63.dArr;
        double[] doubleArray68 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble69 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray68);
        quarterlyDouble63.dArr = doubleArray68;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble71 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray68);
        quarterlyDouble48.dArr = doubleArray68;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble73 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray68);
        double double75 = quarterlyDouble73.get((-1));
        double double76 = quarterlyDouble73.getPrevTtm();
        double[] doubleArray77 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble78 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray77);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble79 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray77);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble80 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray77);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble81 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray77);
        double[] doubleArray82 = quarterlyDouble81.dArr;
        java.lang.String str83 = quarterlyDouble81.toString();
        double[] doubleArray87 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble88 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray87);
        double double89 = quarterlyDouble88.getMostRecent();
        double double90 = quarterlyDouble88.getTtm();
        double[] doubleArray91 = quarterlyDouble88.dArr;
        quarterlyDouble81.dArr = doubleArray91;
        quarterlyDouble73.dArr = doubleArray91;
        quarterlyDouble4.dArr = doubleArray91;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str96 = quarterlyDouble4.fmtGrowth1Q("");
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
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.0d + "'", double51 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 1.0d + "'", double66 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-9999.9999d) + "'", double75 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[]");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 1.0d + "'", double89 == 1.0d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.0d + "'", double90 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[100.0, 1.0, -1.0]");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1059");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t i=0 -1.0000", (int) (short) -1, (int) '4');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1060");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.lang.String str4 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
        java.lang.String str6 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList7);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1061");
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
        double double22 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray26 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray26);
        double double28 = quarterlyDouble27.getTtm();
        double double30 = quarterlyDouble27.get((int) (byte) 1);
        double[] doubleArray31 = quarterlyDouble27.dArr;
        double[] doubleArray35 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray35);
        quarterlyDouble27.dArr = doubleArray35;
        double[] doubleArray41 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble42 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray41);
        double double43 = quarterlyDouble42.getTtm();
        double double45 = quarterlyDouble42.get((int) (byte) 1);
        double[] doubleArray46 = quarterlyDouble42.dArr;
        double[] doubleArray47 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble48 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray47);
        quarterlyDouble42.dArr = doubleArray47;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble50 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray47);
        quarterlyDouble27.dArr = doubleArray47;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble52 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray47);
        quarterlyDouble4.dArr = doubleArray47;
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
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0d + "'", double45 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1062");
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
        double double15 = quarterlyDouble4.deltaQ((int) (short) 10, 10);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1063");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) '#', (int) (short) -1);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1064");
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
        double double14 = quarterlyDouble1.getTtm();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1065");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double double8 = quarterlyDouble4.get2QTtm();
        java.lang.String str9 = quarterlyDouble4.toString();
        double double10 = quarterlyDouble4.getQseqQ();
        double[] doubleArray11 = quarterlyDouble4.dArr;
        double double12 = quarterlyDouble4.get2QTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str9, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 200.0d + "'", double10 == 200.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1066");
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
        double double27 = quarterlyDouble24.deltaQ((int) '#', (int) (byte) 1);
        double double28 = quarterlyDouble24.getQseqQ();
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
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 200.0d + "'", double28 == 200.0d);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1067");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double double8 = quarterlyDouble1.getTtm();
        double double9 = quarterlyDouble1.getPrevTtm();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1068");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.lang.String str3 = companyData1.getTicker();
        java.lang.String str4 = companyData1.getTicker();
        java.lang.String str5 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
        java.lang.String str7 = companyData1.getTicker();
        java.lang.String str8 = companyData1.getTicker();
        java.lang.String str9 = companyData1.getTicker();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1069");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) 'a', (int) (byte) 100);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1070");
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
        java.lang.String str32 = quarterlyDouble4.toString();
        double[] doubleArray33 = quarterlyDouble4.dArr;
        double double34 = quarterlyDouble4.getTtmAvg();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1071");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double5 = quarterlyDouble1.getQoQ();
        double double6 = quarterlyDouble1.getMostRecent();
        double[] doubleArray10 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        double double12 = quarterlyDouble11.getTtm();
        double double13 = quarterlyDouble11.getPrevTtm();
        double double14 = quarterlyDouble11.getTtmAvg();
        double[] doubleArray18 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        double double20 = quarterlyDouble19.getTtm();
        double double21 = quarterlyDouble19.getPrevTtm();
        double double22 = quarterlyDouble19.getTtmAvg();
        double[] doubleArray26 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray26);
        double double28 = quarterlyDouble27.getTtm();
        double double30 = quarterlyDouble27.get((int) (byte) 1);
        double[] doubleArray31 = quarterlyDouble27.dArr;
        double[] doubleArray35 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble36 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray35);
        quarterlyDouble27.dArr = doubleArray35;
        quarterlyDouble19.dArr = doubleArray35;
        double[] doubleArray39 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble40 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray39);
        double double41 = quarterlyDouble40.getPrevTtm();
        double double42 = quarterlyDouble40.get2QTtm();
        double[] doubleArray46 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble47 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray46);
        double double48 = quarterlyDouble47.getTtmAvg();
        double[] doubleArray49 = new double[] {};
        quarterlyDouble47.dArr = doubleArray49;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble51 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray49);
        quarterlyDouble40.dArr = doubleArray49;
        quarterlyDouble19.dArr = doubleArray49;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble54 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray49);
        quarterlyDouble11.dArr = doubleArray49;
        quarterlyDouble1.dArr = doubleArray49;
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[]");
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1072");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (-1), (int) 'a');
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1073");
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
        double double27 = quarterlyDouble4.deltaQ((int) (short) 10, 0);
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
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1074");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(100, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1075");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble3 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double[] doubleArray5 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = quarterlyDouble6.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1076");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary((int) '4', (int) (byte) 0);
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1077");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        java.lang.String str6 = quarterlyDouble4.toString();
        double double7 = quarterlyDouble4.getQseqQ();
        double[] doubleArray9 = new double[] { (short) -1 };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        quarterlyDouble4.dArr = doubleArray9;
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str6, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 200.0d + "'", double7 == 200.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1078");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray8 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        double double12 = quarterlyDouble9.deltaQ((int) (byte) 100, (int) (short) 100);
        double double14 = quarterlyDouble9.get((int) (byte) 100);
        double double16 = quarterlyDouble9.get((int) (short) -1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9999.9999d) + "'", double16 == (-9999.9999d));
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1079");
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
            double double58 = quarterlyDouble4.getQseqQ();
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
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1080");
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
        double double20 = quarterlyDouble17.get((int) (byte) 1);
        double[] doubleArray21 = quarterlyDouble17.dArr;
        double double22 = quarterlyDouble17.getTtmAvg();
        double[] doubleArray26 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray26);
        double double28 = quarterlyDouble27.getTtmAvg();
        double[] doubleArray29 = new double[] {};
        quarterlyDouble27.dArr = doubleArray29;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble31 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray29);
        quarterlyDouble17.dArr = doubleArray29;
        quarterlyDouble4.dArr = doubleArray29;
        // The following exception was thrown during execution in test generation
        try {
            double double34 = quarterlyDouble4.getQseqQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
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
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1081");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get((int) (byte) -1, (int) (short) 1, snpEnum2, dowEnum3, exchEnum4, (double) 0, 100L);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1082");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double9 = quarterlyDouble4.get2QTtm();
        double double12 = quarterlyDouble4.deltaQ((int) (short) 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = quarterlyDouble4.fmtGrowth1Q("\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1083");
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
        double[] doubleArray16 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray16);
        double double18 = quarterlyDouble17.getPrevTtm();
        double double19 = quarterlyDouble17.get2QTtm();
        double double20 = quarterlyDouble17.getMostRecent();
        double[] doubleArray21 = quarterlyDouble17.dArr;
        quarterlyDouble1.dArr = doubleArray21;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble23 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray21);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-9999.9999d) + "'", double15 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1084");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1085");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write(100, 10);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1086");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        quarterlyDouble4.dArr = doubleArray12;
        double double15 = quarterlyDouble4.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = quarterlyDouble4.fmtGrowth4Q("\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 200.0d + "'", double15 == 200.0d);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1087");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("", (int) ' ', (-1));
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1088");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double4 = quarterlyDouble1.get((int) ' ');
        double double5 = quarterlyDouble1.getQoQ();
        double double6 = quarterlyDouble1.getTtmAvg();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-9999.9999d) + "'", double4 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1089");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.getQseqQ();
        double double11 = quarterlyDouble4.deltaQ(100, (int) (byte) 10);
        double double12 = quarterlyDouble4.get2QTtm();
        double double13 = quarterlyDouble4.getTtmAvg();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 200.0d + "'", double8 == 200.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1090");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double double8 = quarterlyDouble4.getMostRecent();
        double double9 = quarterlyDouble4.get2QTtm();
        double double10 = quarterlyDouble4.getPrevTtm();
        double[] doubleArray11 = quarterlyDouble4.dArr;
        java.lang.String str12 = quarterlyDouble4.toString();
        double double13 = quarterlyDouble4.getMostRecent();
        double double14 = quarterlyDouble4.getQseqQ();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str12, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 200.0d + "'", double14 == 200.0d);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1091");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 1, (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, 0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList6);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1092");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        java.lang.String str4 = quarterlyDouble1.fmtGrowth4Q("hi!");
        java.lang.String str6 = quarterlyDouble1.fmtGrowth1Q("hi!");
        java.lang.String str8 = quarterlyDouble1.fmtGrowth1Q("\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        double double9 = quarterlyDouble1.getTtmAvg();
        double double11 = quarterlyDouble1.get((int) (byte) 100);
        double double14 = quarterlyDouble1.deltaQ((int) '#', (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str4, "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str6, "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str8, "\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1093");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(0, (int) (short) 1);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1094");
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
        double double26 = quarterlyDouble25.getMostRecent();
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
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1095");
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
        double double28 = quarterlyDouble4.get((int) (short) -1);
        java.lang.Class<?> wildcardClass29 = quarterlyDouble4.getClass();
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
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-9999.9999d) + "'", double28 == (-9999.9999d));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1096");
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
        double[] doubleArray12 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        double double14 = quarterlyDouble13.getPrevTtm();
        double double15 = quarterlyDouble13.get2QTtm();
        double double16 = quarterlyDouble13.getMostRecent();
        double[] doubleArray17 = quarterlyDouble13.dArr;
        double double19 = quarterlyDouble13.get((int) (short) 10);
        double[] doubleArray20 = quarterlyDouble13.dArr;
        quarterlyDouble1.dArr = doubleArray20;
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-9999.9999d) + "'", double19 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1097");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 100, (int) ' ');
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1098");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) 1, (int) '4');
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1099");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (-1), 1);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1100");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.lang.String str3 = companyData1.getTicker();
        java.lang.String str4 = companyData1.getTicker();
        java.lang.String str5 = companyData1.getTicker();
        java.lang.String str6 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList7 = companyData1.getFdList();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str3, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str4, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str5, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str6, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertNotNull(fieldDataList7);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1101");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        java.lang.String str2 = quarterlyDouble1.toString();
        double double3 = quarterlyDouble1.getPrevTtm();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = quarterlyDouble1.getMostRecent();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1102");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.getTtm();
        java.lang.String str5 = quarterlyDouble1.fmtGrowth1Q("\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        double double6 = quarterlyDouble1.get2QTtm();
        double double7 = quarterlyDouble1.getPrevTtm();
        java.lang.String str9 = quarterlyDouble1.fmtGrowth4Q("\t\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str5, "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t\t\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str9, "\t\t\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1103");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double11 = quarterlyDouble4.deltaQ((int) 'a', 10);
        double double12 = quarterlyDouble4.getPrevTtm();
        double double13 = quarterlyDouble4.getTtmAvg();
        double double14 = quarterlyDouble4.get2QTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1104");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) (short) 0, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList4);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1105");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1106");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (-1), (int) (short) 10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) (short) -1, (int) ' ');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNull(fieldData5);
        org.junit.Assert.assertNull(fieldData8);
        org.junit.Assert.assertNull(fieldData11);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1107");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double double8 = quarterlyDouble4.getMostRecent();
        double double9 = quarterlyDouble4.get2QTtm();
        double double10 = quarterlyDouble4.getPrevTtm();
        double[] doubleArray11 = quarterlyDouble4.dArr;
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0, -1.0]");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1108");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) -1, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) '#', 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList10 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (-1), 0);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList11 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList4);
        org.junit.Assert.assertNotNull(companyDataList7);
        org.junit.Assert.assertNotNull(companyDataList10);
        org.junit.Assert.assertNotNull(manyCompanyDataList11);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1109");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get((int) (byte) 100, (int) (short) 0, snpEnum2, dowEnum3, exchEnum4, (double) (byte) 10, (long) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList7);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(companyDataList8);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1110");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double7 = quarterlyDouble4.deltaQ(0, 0);
        double double9 = quarterlyDouble4.get((int) (byte) 100);
        double double10 = quarterlyDouble4.getQseqQ();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9999.9999d) + "'", double9 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 200.0d + "'", double10 == 200.0d);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1111");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 100, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1112");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get((int) (byte) -1, (int) '4', snpEnum2, dowEnum3, exchEnum4, (double) 1L, 100L);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList7);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(manyCompanyDataList8);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1113");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.deltaQ((int) 'a', (int) (short) 10);
        double double9 = quarterlyDouble4.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = quarterlyDouble4.deltaQ((int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
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
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1114");
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
        double double17 = quarterlyDouble4.getMostRecent();
        java.lang.Class<?> wildcardClass18 = quarterlyDouble4.getClass();
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1115");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
        double double8 = quarterlyDouble4.getTtm();
        double[] doubleArray9 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        double double11 = quarterlyDouble10.getTtm();
        double double13 = quarterlyDouble10.get((int) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9999.9999d) + "'", double13 == (-9999.9999d));
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1116");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double double8 = quarterlyDouble4.get2QTtm();
        double double10 = quarterlyDouble4.get((int) (byte) 0);
        double double11 = quarterlyDouble4.getPrevTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1117");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 0, 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1118");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getCompany("\t i=0 -1.0000");
        org.junit.Assert.assertNotNull(oneCompanyDataList1);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1119");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble41 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = quarterlyDouble41.fmtGrowth1Q("\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
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
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1120");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1121");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double double8 = quarterlyDouble4.get2QTtm();
        double double9 = quarterlyDouble4.getTtmAvg();
        double double10 = quarterlyDouble4.getMostRecent();
        double double11 = quarterlyDouble4.getPrevTtm();
        java.lang.String str12 = quarterlyDouble4.toString();
        double double13 = quarterlyDouble4.getQseqQ();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str12, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 200.0d + "'", double13 == 200.0d);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1122");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double9 = quarterlyDouble4.get2QTtm();
        double double11 = quarterlyDouble4.get((int) 'a');
        double double13 = quarterlyDouble4.get((int) '4');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9999.9999d) + "'", double13 == (-9999.9999d));
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1123");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (-1), (int) (short) 10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) (short) -1, (int) ' ');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) (byte) 100, (int) '#');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData14 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, 100, (int) (byte) 10);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData17 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) (byte) -1, (-1));
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNull(fieldData5);
        org.junit.Assert.assertNull(fieldData8);
        org.junit.Assert.assertNull(fieldData11);
        org.junit.Assert.assertNull(fieldData14);
        org.junit.Assert.assertNull(fieldData17);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1124");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.lang.String str2 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList3);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1125");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        java.lang.String str2 = quarterlyDouble1.toString();
        double[] doubleArray6 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble7 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        double double8 = quarterlyDouble7.getTtm();
        double double10 = quarterlyDouble7.get((int) (byte) 1);
        double[] doubleArray11 = quarterlyDouble7.dArr;
        double[] doubleArray15 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        quarterlyDouble7.dArr = doubleArray15;
        double double18 = quarterlyDouble7.get2QTtm();
        double double19 = quarterlyDouble7.getTtmAvg();
        double[] doubleArray20 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble21 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        double double22 = quarterlyDouble21.getPrevTtm();
        java.lang.String str24 = quarterlyDouble21.fmtGrowth4Q("hi!");
        java.lang.String str26 = quarterlyDouble21.fmtGrowth1Q("hi!");
        java.lang.String str28 = quarterlyDouble21.fmtGrowth1Q("\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        double[] doubleArray32 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray32);
        double double34 = quarterlyDouble33.getTtmAvg();
        double double35 = quarterlyDouble33.getTtmAvg();
        double double37 = quarterlyDouble33.get(1);
        double double38 = quarterlyDouble33.getPrevTtm();
        double[] doubleArray42 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble43 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray42);
        double double44 = quarterlyDouble43.getTtm();
        double double45 = quarterlyDouble43.getPrevTtm();
        double double46 = quarterlyDouble43.getTtmAvg();
        double double47 = quarterlyDouble43.getQseqQ();
        double[] doubleArray51 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble52 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray51);
        double double53 = quarterlyDouble52.getTtmAvg();
        double[] doubleArray54 = new double[] {};
        quarterlyDouble52.dArr = doubleArray54;
        quarterlyDouble43.dArr = doubleArray54;
        quarterlyDouble33.dArr = doubleArray54;
        double[] doubleArray58 = quarterlyDouble33.dArr;
        quarterlyDouble21.dArr = doubleArray58;
        quarterlyDouble7.dArr = doubleArray58;
        double[] doubleArray61 = quarterlyDouble7.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble62 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray61);
        quarterlyDouble1.dArr = doubleArray61;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str65 = quarterlyDouble1.fmtGrowth4Q("\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str24, "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str26, "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str28, "\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 200.0d + "'", double47 == 200.0d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[]");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1126");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double double8 = quarterlyDouble1.getQoQ();
        java.lang.String str9 = quarterlyDouble1.toString();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str9, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1127");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.get2QTtm();
        double double10 = quarterlyDouble4.getTtmAvg();
        double double11 = quarterlyDouble4.get2QTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 200.0d + "'", double8 == 200.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1128");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = quarterlyDouble4.fmtGrowth4Q("\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str25, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str26, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1129");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1130");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = quarterlyDouble4.fmtGrowth4Q("\t\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1131");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.get((int) 'a');
        double[] doubleArray9 = quarterlyDouble4.dArr;
        double double10 = quarterlyDouble4.get2QTtm();
        java.lang.String str11 = quarterlyDouble4.toString();
        double double12 = quarterlyDouble4.getPrevTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9999.9999d) + "'", double8 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str11, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1132");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        java.lang.String str4 = quarterlyDouble1.fmtGrowth4Q("hi!");
        java.lang.String str6 = quarterlyDouble1.fmtGrowth1Q("hi!");
        java.lang.String str8 = quarterlyDouble1.fmtGrowth1Q("\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        double double9 = quarterlyDouble1.getTtmAvg();
        double double11 = quarterlyDouble1.get((int) (byte) 100);
        double double12 = quarterlyDouble1.getQoQ();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str4, "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str6, "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str8, "\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1133");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.getTtm();
        double double4 = quarterlyDouble1.get2QTtm();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1134");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double double7 = quarterlyDouble4.get(1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1135");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        double double4 = quarterlyDouble1.getMostRecent();
        java.lang.String str6 = quarterlyDouble1.fmtGrowth1Q("");
        double double9 = quarterlyDouble1.deltaQ((int) (byte) 0, (-1));
        double double10 = quarterlyDouble1.getTtm();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str6, "\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1136");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double double8 = quarterlyDouble4.get2QTtm();
        double double9 = quarterlyDouble4.getTtmAvg();
        double double10 = quarterlyDouble4.get2QTtm();
        double double11 = quarterlyDouble4.getTtmAvg();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1137");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 100, (int) '#');
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1138");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray12);
        quarterlyDouble4.dArr = doubleArray12;
        double double15 = quarterlyDouble4.getQseqQ();
        double double16 = quarterlyDouble4.getMostRecent();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 200.0d + "'", double15 == 200.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1139");
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
        double[] doubleArray47 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble48 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray47);
        double double49 = quarterlyDouble48.getTtm();
        double double51 = quarterlyDouble48.get((int) (byte) 1);
        double[] doubleArray52 = quarterlyDouble48.dArr;
        double[] doubleArray56 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble57 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray56);
        quarterlyDouble48.dArr = doubleArray56;
        double[] doubleArray62 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble63 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray62);
        double double64 = quarterlyDouble63.getTtm();
        double double66 = quarterlyDouble63.get((int) (byte) 1);
        double[] doubleArray67 = quarterlyDouble63.dArr;
        double[] doubleArray68 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble69 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray68);
        quarterlyDouble63.dArr = doubleArray68;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble71 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray68);
        quarterlyDouble48.dArr = doubleArray68;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble73 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray68);
        double double75 = quarterlyDouble73.get((-1));
        double double76 = quarterlyDouble73.getPrevTtm();
        double[] doubleArray77 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble78 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray77);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble79 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray77);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble80 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray77);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble81 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray77);
        double[] doubleArray82 = quarterlyDouble81.dArr;
        java.lang.String str83 = quarterlyDouble81.toString();
        double[] doubleArray87 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble88 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray87);
        double double89 = quarterlyDouble88.getMostRecent();
        double double90 = quarterlyDouble88.getTtm();
        double[] doubleArray91 = quarterlyDouble88.dArr;
        quarterlyDouble81.dArr = doubleArray91;
        quarterlyDouble73.dArr = doubleArray91;
        quarterlyDouble4.dArr = doubleArray91;
        java.lang.Class<?> wildcardClass95 = doubleArray91.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.0d + "'", double51 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 1.0d + "'", double66 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-9999.9999d) + "'", double75 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[]");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 1.0d + "'", double89 == 1.0d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.0d + "'", double90 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1140");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (byte) 10, (int) '#');
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1141");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double double7 = quarterlyDouble4.get(1);
        double double8 = quarterlyDouble4.getTtmAvg();
        double double9 = quarterlyDouble4.getTtm();
        double double10 = quarterlyDouble4.getMostRecent();
        double double11 = quarterlyDouble4.getPrevTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1142");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double double6 = quarterlyDouble4.getQseqQ();
        java.lang.String str7 = quarterlyDouble4.toString();
        double double8 = quarterlyDouble4.getTtmAvg();
        double double11 = quarterlyDouble4.deltaQ((int) ' ', (int) ' ');
        double double12 = quarterlyDouble4.get2QTtm();
        double double13 = quarterlyDouble4.getQseqQ();
        java.lang.String str14 = quarterlyDouble4.toString();
        double double15 = quarterlyDouble4.getTtmAvg();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 200.0d + "'", double6 == 200.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str7, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 200.0d + "'", double13 == 200.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str14, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1143");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) 'a', (-1));
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1144");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double9 = quarterlyDouble4.getTtm();
        java.lang.String str10 = quarterlyDouble4.toString();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str10, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1145");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) (short) 10, 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1146");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary((int) (short) 10, (int) '#');
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1147");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) (byte) 0, 0);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1148");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double double8 = quarterlyDouble1.getQoQ();
        double double9 = quarterlyDouble1.getTtmAvg();
        double[] doubleArray10 = quarterlyDouble1.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble11 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1149");
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
        double double28 = quarterlyDouble4.deltaQ((int) (byte) 1, (int) (byte) -1);
        double double29 = quarterlyDouble4.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            double double32 = quarterlyDouble4.deltaQ((int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str25, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1150");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        double double4 = quarterlyDouble1.getMostRecent();
        double double5 = quarterlyDouble1.getQoQ();
        double double6 = quarterlyDouble1.get2QTtm();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1151");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData5 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) (byte) 0, 0);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) ' ', (int) ' ');
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, 0, (int) (byte) 100);
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData14 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList2, (int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNull(fieldData5);
        org.junit.Assert.assertNull(fieldData8);
        org.junit.Assert.assertNull(fieldData11);
        org.junit.Assert.assertNull(fieldData14);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1152");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        double double4 = quarterlyDouble1.getMostRecent();
        double[] doubleArray5 = quarterlyDouble1.dArr;
        double double6 = quarterlyDouble1.getQoQ();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1153");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get(0, (int) (byte) 10, snpEnum2, dowEnum3, exchEnum4, (double) (byte) 10, (long) ' ');
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1154");
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
        double double12 = quarterlyDouble1.get2QTtm();
        double double13 = quarterlyDouble1.getQoQ();
        double[] doubleArray14 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble15 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray14);
        double double16 = quarterlyDouble15.getPrevTtm();
        double double17 = quarterlyDouble15.get2QTtm();
        java.lang.String str18 = quarterlyDouble15.toString();
        double double21 = quarterlyDouble15.deltaQ((int) (byte) 100, 0);
        double double22 = quarterlyDouble15.getQoQ();
        double double23 = quarterlyDouble15.getTtmAvg();
        double double24 = quarterlyDouble15.getQseqQ();
        double double25 = quarterlyDouble15.getTtmAvg();
        double[] doubleArray26 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble27 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray26);
        double double28 = quarterlyDouble27.getPrevTtm();
        double double29 = quarterlyDouble27.get2QTtm();
        java.lang.String str30 = quarterlyDouble27.toString();
        double double33 = quarterlyDouble27.deltaQ((int) (byte) 100, 0);
        double double34 = quarterlyDouble27.getQoQ();
        double double35 = quarterlyDouble27.getTtmAvg();
        double double36 = quarterlyDouble27.getQseqQ();
        double[] doubleArray37 = quarterlyDouble27.dArr;
        double[] doubleArray41 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble42 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray41);
        double double43 = quarterlyDouble42.getTtm();
        double double45 = quarterlyDouble42.get((int) (byte) 1);
        double double46 = quarterlyDouble42.get2QTtm();
        java.lang.String str47 = quarterlyDouble42.toString();
        double[] doubleArray51 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble52 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray51);
        double double53 = quarterlyDouble52.getTtm();
        double double55 = quarterlyDouble52.get((int) (byte) 1);
        double[] doubleArray56 = quarterlyDouble52.dArr;
        double double57 = quarterlyDouble52.getTtmAvg();
        double[] doubleArray61 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble62 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray61);
        double double63 = quarterlyDouble62.getTtmAvg();
        double[] doubleArray64 = new double[] {};
        quarterlyDouble62.dArr = doubleArray64;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble66 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray64);
        quarterlyDouble52.dArr = doubleArray64;
        quarterlyDouble42.dArr = doubleArray64;
        quarterlyDouble27.dArr = doubleArray64;
        quarterlyDouble15.dArr = doubleArray64;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble71 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray64);
        double[] doubleArray72 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble73 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray72);
        double double74 = quarterlyDouble73.getPrevTtm();
        double double75 = quarterlyDouble73.get2QTtm();
        java.lang.String str76 = quarterlyDouble73.toString();
        double double79 = quarterlyDouble73.deltaQ((int) (byte) 100, 0);
        double double80 = quarterlyDouble73.getQoQ();
        double double81 = quarterlyDouble73.getTtmAvg();
        double double82 = quarterlyDouble73.getQseqQ();
        double[] doubleArray83 = quarterlyDouble73.dArr;
        quarterlyDouble71.dArr = doubleArray83;
        quarterlyDouble1.dArr = doubleArray83;
        double double86 = quarterlyDouble1.getTtmAvg();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str18, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str30, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0d + "'", double45 == 1.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str47, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 1.0d + "'", double55 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str76, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.0d + "'", double86 == 0.0d);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1155");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) 'a', (int) ' ');
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1156");
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
        double double33 = quarterlyDouble29.getTtmAvg();
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
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1157");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary> companySummaryList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getCompanySummary((int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertNotNull(companySummaryList2);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1158");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double4 = quarterlyDouble1.deltaQ((int) (short) 10, (int) 'a');
        double double6 = quarterlyDouble1.get(100);
        double double7 = quarterlyDouble1.getPrevTtm();
        double[] doubleArray8 = quarterlyDouble1.dArr;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = quarterlyDouble1.fmtGrowth4Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-9999.9999d) + "'", double6 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1159");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        java.lang.String str2 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList4 = companyData1.getFdList();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str2, "\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertNotNull(fieldDataList4);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1160");
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
        java.lang.String str39 = quarterlyDouble4.toString();
        java.lang.String str40 = quarterlyDouble4.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = quarterlyDouble4.fmtGrowth4Q("\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1161");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
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
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1162");
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
        java.lang.String str32 = quarterlyDouble4.toString();
        double[] doubleArray33 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray33);
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1163");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) '4', (int) (short) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1164");
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
        double double67 = quarterlyDouble1.getPrevTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str69 = quarterlyDouble1.fmtGrowth4Q("\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1165");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double5 = quarterlyDouble1.getQoQ();
        double double7 = quarterlyDouble1.get((int) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1166");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble3 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double[] doubleArray6 = quarterlyDouble5.dArr;
        double double8 = quarterlyDouble5.get(0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9999.9999d) + "'", double8 == (-9999.9999d));
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1167");
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
        double double19 = quarterlyDouble1.getTtm();
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
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1168");
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
        double double28 = quarterlyDouble4.deltaQ((int) (byte) 1, (int) (byte) -1);
        double double29 = quarterlyDouble4.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = quarterlyDouble4.fmtGrowth4Q("\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str25, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1169");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (short) -1, 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1170");
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
        double double14 = quarterlyDouble13.getQseqQ();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 200.0d + "'", double14 == 200.0d);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1171");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) '#', 100);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1172");
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
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble24 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray20);
        double double25 = quarterlyDouble24.getMostRecent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = quarterlyDouble24.fmtGrowth1Q("\t i=0 -1.0000");
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1173");
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
        double double14 = quarterlyDouble4.getTtm();
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
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1174");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 0, (int) 'a');
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1175");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double double8 = quarterlyDouble1.getQoQ();
        double double9 = quarterlyDouble1.getQseqQ();
        double[] doubleArray10 = quarterlyDouble1.dArr;
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1176");
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
        // The following exception was thrown during execution in test generation
        try {
            double double19 = quarterlyDouble1.getQoQ();
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
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1177");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (byte) 10, (int) ' ');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1178");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.lang.String str4 = companyData1.getTicker();
        java.lang.String str5 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
        java.lang.String str7 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
        java.lang.String str9 = companyData1.getTicker();
        java.lang.String str10 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList11 = companyData1.getFdList();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList11);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1179");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double11 = quarterlyDouble4.deltaQ((int) 'a', 10);
        double double12 = quarterlyDouble4.getPrevTtm();
        double double13 = quarterlyDouble4.getPrevTtm();
        java.lang.String str14 = quarterlyDouble4.toString();
        double double16 = quarterlyDouble4.get((-1));
        double[] doubleArray17 = quarterlyDouble4.dArr;
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str14, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9999.9999d) + "'", double16 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 1.0, -1.0]");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1180");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (byte) 1, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1181");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get((int) '#', (int) 'a', snpEnum2, dowEnum3, exchEnum4, (double) '4', (long) 10);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1182");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double double6 = quarterlyDouble4.getQseqQ();
        java.lang.String str7 = quarterlyDouble4.toString();
        double double8 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.get2QTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 200.0d + "'", double6 == 200.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str7, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 200.0d + "'", double8 == 200.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1183");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(snpEnum0, (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1184");
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
        double double17 = quarterlyDouble4.getQseqQ();
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 200.0d + "'", double17 == 200.0d);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1185");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble3 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble5 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double[] doubleArray6 = quarterlyDouble5.dArr;
        double[] doubleArray7 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray7);
        double double9 = quarterlyDouble8.getPrevTtm();
        double double10 = quarterlyDouble8.get2QTtm();
        double double11 = quarterlyDouble8.getMostRecent();
        double[] doubleArray12 = quarterlyDouble8.dArr;
        quarterlyDouble5.dArr = doubleArray12;
        java.lang.String str15 = quarterlyDouble5.fmtGrowth1Q("\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\t\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str15, "\t\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1186");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get((-1), (int) (short) 1, snpEnum2, dowEnum3, exchEnum4, (double) (short) 10, 0L);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1187");
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
            double double32 = quarterlyDouble1.deltaQ((int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
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
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1188");
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 200.0d + "'", double16 == 200.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1189");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double9 = quarterlyDouble4.getTtmAvg();
        double double11 = quarterlyDouble4.get((int) (byte) 10);
        java.lang.String str12 = quarterlyDouble4.toString();
        double[] doubleArray13 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray13);
        double double15 = quarterlyDouble14.getPrevTtm();
        double double16 = quarterlyDouble14.get2QTtm();
        double double17 = quarterlyDouble14.get2QTtm();
        java.lang.String str19 = quarterlyDouble14.fmtGrowth4Q("\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        double[] doubleArray20 = quarterlyDouble14.dArr;
        quarterlyDouble4.dArr = doubleArray20;
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str12, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\t\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str19, "\t\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1190");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = quarterlyDouble4.deltaQ((int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
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
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1191");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, 0, (int) '#');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList4);
        org.junit.Assert.assertNotNull(companyDataList7);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1192");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 1, 100);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1193");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, 1, (int) (byte) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList4);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1194");
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
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1195");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList0, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1196");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        double double4 = quarterlyDouble1.getMostRecent();
        double double5 = quarterlyDouble1.getQoQ();
        double double6 = quarterlyDouble1.getQoQ();
        double double9 = quarterlyDouble1.deltaQ((int) 'a', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1197");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("");
        java.lang.String str2 = companyData1.getTicker();
        java.lang.String str3 = companyData1.getTicker();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1198");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, (int) '4', (int) '4');
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1199");
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
        double double16 = quarterlyDouble4.getPrevTtm();
        double double17 = quarterlyDouble4.getQseqQ();
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 200.0d + "'", double17 == 200.0d);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1200");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 0, (int) '4');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) ' ', (int) 'a');
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList4);
        org.junit.Assert.assertNotNull(companyDataList7);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1201");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.getQseqQ();
        double double9 = quarterlyDouble4.getQseqQ();
        double double10 = quarterlyDouble4.get2QTtm();
        double double11 = quarterlyDouble4.getTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 200.0d + "'", double8 == 200.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 200.0d + "'", double9 == 200.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1202");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble8 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray6);
        double[] doubleArray9 = quarterlyDouble8.dArr;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = quarterlyDouble8.getQseqQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1203");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers((int) (byte) 100, (int) ' ');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1204");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double[] doubleArray8 = quarterlyDouble1.dArr;
        double double9 = quarterlyDouble1.getTtmAvg();
        double double10 = quarterlyDouble1.getMostRecent();
        java.lang.String str12 = quarterlyDouble1.fmtGrowth4Q("\t i=0 -1.0000");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t\t i=0 -1.0000     :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str12, "\t\t i=0 -1.0000     :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1205");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get((-1), 100, snpEnum2, dowEnum3, exchEnum4, (double) (-1), (long) '#');
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1206");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (byte) 1, (-1));
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1207");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        java.lang.String str6 = quarterlyDouble4.toString();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double9 = quarterlyDouble4.get((int) ' ');
        java.lang.String str10 = quarterlyDouble4.toString();
        double double11 = quarterlyDouble4.getPrevTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str6, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9999.9999d) + "'", double9 == (-9999.9999d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str10, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1208");
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
        double double41 = quarterlyDouble39.getTtm();
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
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1209");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get((int) (byte) 100, (int) ' ', snpEnum2, dowEnum3, exchEnum4, (double) (short) 100, (long) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList7);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(manyCompanyDataList8);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1210");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) '4', (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList3 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(manyCompanyDataList3);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1211");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double[] doubleArray9 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        quarterlyDouble4.dArr = doubleArray9;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        double[] doubleArray16 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble17 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray16);
        double double18 = quarterlyDouble17.getTtm();
        double double19 = quarterlyDouble17.getPrevTtm();
        double double20 = quarterlyDouble17.getTtmAvg();
        double[] doubleArray24 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble25 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray24);
        double double26 = quarterlyDouble25.getTtm();
        double double28 = quarterlyDouble25.get((int) (byte) 1);
        double[] doubleArray29 = quarterlyDouble25.dArr;
        double[] doubleArray33 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble34 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray33);
        quarterlyDouble25.dArr = doubleArray33;
        quarterlyDouble17.dArr = doubleArray33;
        double double37 = quarterlyDouble17.get2QTtm();
        java.lang.String str38 = quarterlyDouble17.toString();
        double double41 = quarterlyDouble17.deltaQ((int) (byte) 1, (int) (byte) -1);
        double[] doubleArray42 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble43 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray42);
        double double44 = quarterlyDouble43.getPrevTtm();
        double[] doubleArray48 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble49 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray48);
        double double50 = quarterlyDouble49.getTtm();
        double double52 = quarterlyDouble49.get((int) (byte) 1);
        double[] doubleArray53 = quarterlyDouble49.dArr;
        quarterlyDouble43.dArr = doubleArray53;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble55 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray53);
        quarterlyDouble17.dArr = doubleArray53;
        quarterlyDouble12.dArr = doubleArray53;
        // The following exception was thrown during execution in test generation
        try {
            double double58 = quarterlyDouble12.getQoQ();
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
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str38, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[100.0, 1.0, -1.0]");
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1212");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, 100, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, 10, (int) ' ');
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList6);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1213");
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
        java.lang.String str32 = quarterlyDouble4.toString();
        java.lang.String str33 = quarterlyDouble4.toString();
        double double35 = quarterlyDouble4.get((int) (short) 0);
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-9999.9999d) + "'", double35 == (-9999.9999d));
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1214");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.write((int) (byte) 0, (int) (short) 100);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1215");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.lang.String str4 = companyData1.getTicker();
        java.lang.String str5 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
        java.lang.String str7 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
        java.lang.String str9 = companyData1.getTicker();
        java.lang.String str10 = companyData1.getTicker();
        java.lang.String str11 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList12 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList13 = companyData1.getFdList();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList12);
        org.junit.Assert.assertNotNull(fieldDataList13);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1216");
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
        java.lang.String str50 = quarterlyDouble1.toString();
        double double51 = quarterlyDouble1.get2QTtm();
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
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1217");
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
            java.lang.String str18 = quarterlyDouble4.fmtGrowth4Q("\t\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1218");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double double8 = quarterlyDouble1.getTtm();
        double double9 = quarterlyDouble1.get2QTtm();
        java.lang.String str11 = quarterlyDouble1.fmtGrowth4Q("\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        double[] doubleArray12 = quarterlyDouble1.dArr;
        java.lang.String str14 = quarterlyDouble1.fmtGrowth1Q("hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str11, "\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str14, "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1219");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double5 = quarterlyDouble1.getQoQ();
        java.lang.String str7 = quarterlyDouble1.fmtGrowth4Q("\t i=0 -1.0000");
        double double8 = quarterlyDouble1.getQoQ();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\t\t i=0 -1.0000     :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str7, "\t\t i=0 -1.0000     :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1220");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        java.lang.String str2 = companyData1.getTicker();
        java.lang.String str3 = companyData1.getTicker();
        java.lang.String str4 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData8 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList5, (int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str2, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str3, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertNotNull(fieldDataList5);
        org.junit.Assert.assertNull(fieldData8);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1221");
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
        // The following exception was thrown during execution in test generation
        try {
            double double20 = quarterlyDouble4.getQoQ();
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1222");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        double double6 = quarterlyDouble1.deltaQ((int) (byte) 10, (int) (short) -1);
        double double8 = quarterlyDouble1.get((int) (byte) 100);
        double double9 = quarterlyDouble1.getTtm();
        double double10 = quarterlyDouble1.getTtm();
        double double11 = quarterlyDouble1.getTtmAvg();
        double[] doubleArray15 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble16 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray15);
        double double17 = quarterlyDouble16.getMostRecent();
        double double18 = quarterlyDouble16.getTtm();
        double[] doubleArray19 = quarterlyDouble16.dArr;
        quarterlyDouble1.dArr = doubleArray19;
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9999.9999d) + "'", double8 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 1.0, -1.0]");
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1223");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (-1), (int) (byte) 1);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1224");
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
        double[] doubleArray24 = quarterlyDouble1.dArr;
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
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1225");
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
        java.lang.String str13 = quarterlyDouble1.fmtGrowth1Q("\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        double double16 = quarterlyDouble1.deltaQ((int) ' ', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str13, "\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1226");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
        double[] doubleArray8 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        quarterlyDouble4.dArr = doubleArray8;
        double double12 = quarterlyDouble4.get((int) (short) -1);
        java.lang.String str13 = quarterlyDouble4.toString();
        double double16 = quarterlyDouble4.deltaQ((int) (byte) 1, 0);
        double double17 = quarterlyDouble4.getPrevTtm();
        double double18 = quarterlyDouble4.getPrevTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1227");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double9 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray10 = quarterlyDouble4.dArr;
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 1.0, -1.0]");
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1228");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 1, (int) (short) 10);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) (byte) 0, 10);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList6);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1229");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.getQseqQ();
        double[] doubleArray9 = quarterlyDouble4.dArr;
        double double10 = quarterlyDouble4.getTtm();
        double double11 = quarterlyDouble4.getTtmAvg();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 200.0d + "'", double8 == 200.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1230");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(dowEnum0, 100, (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList4 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(manyCompanyDataList4);
        org.junit.Assert.assertNotNull(companyDataList5);
        org.junit.Assert.assertNotNull(companyDataList8);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1231");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double double6 = quarterlyDouble4.getQseqQ();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double8 = quarterlyDouble4.getMostRecent();
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 200.0d + "'", double6 == 200.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1232");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
        double[] doubleArray8 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble9 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray8);
        quarterlyDouble4.dArr = doubleArray8;
        double double12 = quarterlyDouble4.get((int) 'a');
        double double14 = quarterlyDouble4.get(1);
        double double15 = quarterlyDouble4.getPrevTtm();
        java.lang.String str16 = quarterlyDouble4.toString();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9999.9999d) + "'", double14 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1233");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData6 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList3, (int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertNull(fieldData6);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1234");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        java.lang.String str4 = quarterlyDouble1.fmtGrowth4Q("hi!");
        java.lang.String str6 = quarterlyDouble1.fmtGrowth1Q("hi!");
        double double9 = quarterlyDouble1.deltaQ(0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str4, "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str6, "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1235");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.getTtm();
        double double5 = quarterlyDouble1.get(10);
        java.lang.String str7 = quarterlyDouble1.fmtGrowth4Q("\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        double[] doubleArray8 = quarterlyDouble1.dArr;
        double double9 = quarterlyDouble1.getTtm();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-9999.9999d) + "'", double5 == (-9999.9999d));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\t\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str7, "\t\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1236");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
        double double8 = quarterlyDouble4.getTtm();
        double double9 = quarterlyDouble4.getPrevTtm();
        java.lang.String str10 = quarterlyDouble4.toString();
        double double12 = quarterlyDouble4.get((int) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1237");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, (int) '4', (int) '#');
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1238");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double double8 = quarterlyDouble1.getQoQ();
        double double9 = quarterlyDouble1.getPrevTtm();
        java.lang.String str11 = quarterlyDouble1.fmtGrowth4Q("\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        double double12 = quarterlyDouble1.getTtmAvg();
        double double13 = quarterlyDouble1.getTtm();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str11, "\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1239");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        double double4 = quarterlyDouble1.getTtm();
        double double5 = quarterlyDouble1.getQseqQ();
        java.lang.String str7 = quarterlyDouble1.fmtGrowth1Q("hi!");
        double double8 = quarterlyDouble1.getQoQ();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str7, "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1240");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        double double4 = quarterlyDouble1.getTtm();
        double double5 = quarterlyDouble1.getQseqQ();
        java.lang.String str7 = quarterlyDouble1.fmtGrowth1Q("hi!");
        double[] doubleArray8 = quarterlyDouble1.dArr;
        java.lang.String str9 = quarterlyDouble1.toString();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str7, "\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str9, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1241");
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
        double double58 = quarterlyDouble4.getPrevTtm();
        double double61 = quarterlyDouble4.deltaQ((int) '4', (int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1242");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get(1, (int) (byte) 100, snpEnum2, dowEnum3, exchEnum4, (double) 1.0f, (long) ' ');
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1243");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double double8 = quarterlyDouble4.getMostRecent();
        double double9 = quarterlyDouble4.get2QTtm();
        double[] doubleArray10 = quarterlyDouble4.dArr;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = quarterlyDouble4.getQoQ();
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
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 1.0, -1.0]");
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1244");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) 'a', (int) (byte) 100);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1245");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getTickers(exchEnum0, 1, 10);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1246");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\t\thi!               :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) (short) 1, (int) 'a');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1247");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData> oneCompanyDataList1 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getCompany("\t\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertNotNull(oneCompanyDataList1);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1248");
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
        double double20 = quarterlyDouble4.getTtmAvg();
        double double23 = quarterlyDouble4.deltaQ((int) 'a', (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1249");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double double7 = quarterlyDouble4.get(1);
        double double8 = quarterlyDouble4.getTtmAvg();
        double double9 = quarterlyDouble4.getTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = quarterlyDouble4.fmtGrowth4Q("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1250");
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
        double[] doubleArray29 = quarterlyDouble4.dArr;
        double double31 = quarterlyDouble4.get((int) ' ');
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
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-9999.9999d) + "'", double31 == (-9999.9999d));
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1251");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        java.lang.String str4 = quarterlyDouble1.toString();
        double double7 = quarterlyDouble1.deltaQ((int) (byte) 100, 0);
        double double8 = quarterlyDouble1.getQoQ();
        double double9 = quarterlyDouble1.getPrevTtm();
        double double10 = quarterlyDouble1.getMostRecent();
        double double11 = quarterlyDouble1.getTtm();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1252");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double double6 = quarterlyDouble4.getTtmAvg();
        java.lang.String str7 = quarterlyDouble4.toString();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str7, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1253");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1254");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        java.lang.String str6 = quarterlyDouble4.toString();
        double double7 = quarterlyDouble4.getTtmAvg();
        double double9 = quarterlyDouble4.get((int) ' ');
        java.lang.String str10 = quarterlyDouble4.toString();
        double double11 = quarterlyDouble4.getTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str6, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-9999.9999d) + "'", double9 == (-9999.9999d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str10, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1255");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double3 = quarterlyDouble1.get((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = quarterlyDouble1.getMostRecent();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9999.9999d) + "'", double3 == (-9999.9999d));
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1256");
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
        java.lang.String str13 = quarterlyDouble1.fmtGrowth1Q("\t i=0 -1.0000");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str4, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t\t i=0 -1.0000     :          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str13, "\t\t i=0 -1.0000     :          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1257");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get(0, (int) (short) 10, snpEnum2, dowEnum3, exchEnum4, (double) 0L, 0L);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList7);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList9 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList7);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(manyCompanyDataList8);
        org.junit.Assert.assertNotNull(manyCompanyDataList9);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1258");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double[] doubleArray5 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble6 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray5);
        double double7 = quarterlyDouble6.getTtmAvg();
        double[] doubleArray8 = new double[] {};
        quarterlyDouble6.dArr = doubleArray8;
        quarterlyDouble1.dArr = doubleArray8;
        double[] doubleArray11 = quarterlyDouble1.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble13 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1259");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) 'a', 0);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1260");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) (byte) 1, 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList5 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList2, (int) '4', (int) (short) 100);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList2);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(companyDataList5);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(companyDataList7);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1261");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        double double4 = quarterlyDouble1.getMostRecent();
        double double5 = quarterlyDouble1.getTtmAvg();
        double double6 = quarterlyDouble1.getPrevTtm();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1262");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        java.lang.String str6 = quarterlyDouble4.toString();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str6, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1263");
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
        double double18 = quarterlyDouble4.get2QTtm();
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
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1264");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        double double4 = quarterlyDouble1.get2QTtm();
        java.lang.String str6 = quarterlyDouble1.fmtGrowth4Q("\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
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
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\t\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str6, "\t\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1265");
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
        java.lang.String str32 = quarterlyDouble4.toString();
        double double33 = quarterlyDouble4.getTtm();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1266");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getMostRecent();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = quarterlyDouble4.getQoQ();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1267");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) (short) 0, (int) '#');
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1268");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, 100, (int) (short) 100);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1269");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.getTtm();
        java.lang.String str5 = quarterlyDouble1.fmtGrowth1Q("\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        double double7 = quarterlyDouble1.get(100);
        double[] doubleArray8 = quarterlyDouble1.dArr;
        java.lang.String str10 = quarterlyDouble1.fmtGrowth1Q("\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str5, "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9999.9999d) + "'", double7 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str10, "\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1270");
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
        double double30 = quarterlyDouble1.get2QTtm();
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
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1271");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double4 = quarterlyDouble1.deltaQ((int) (short) 10, (int) 'a');
        double double6 = quarterlyDouble1.get(100);
        double double7 = quarterlyDouble1.getTtmAvg();
        double double10 = quarterlyDouble1.deltaQ((int) (byte) 10, (int) ' ');
        double[] doubleArray11 = quarterlyDouble1.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-9999.9999d) + "'", double6 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1272");
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
        java.lang.String str30 = quarterlyDouble29.toString();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1273");
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getDow(dowEnum0, (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1274");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getTtm();
        java.lang.String str7 = quarterlyDouble4.toString();
        double double8 = quarterlyDouble4.getTtmAvg();
        double double11 = quarterlyDouble4.deltaQ((int) (short) 100, (int) ' ');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str7, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1275");
        double[] doubleArray0 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble2 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble3 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double[] doubleArray5 = quarterlyDouble4.dArr;
        java.lang.String str6 = quarterlyDouble4.toString();
        double double7 = quarterlyDouble4.getTtmAvg();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1276");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double9 = quarterlyDouble4.getTtmAvg();
        double double10 = quarterlyDouble4.getMostRecent();
        double double12 = quarterlyDouble4.get((int) (byte) -1);
        double[] doubleArray13 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble14 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray13);
        double double15 = quarterlyDouble14.getPrevTtm();
        double double16 = quarterlyDouble14.get2QTtm();
        double double17 = quarterlyDouble14.getMostRecent();
        double[] doubleArray18 = quarterlyDouble14.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble19 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray18);
        quarterlyDouble4.dArr = doubleArray18;
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9999.9999d) + "'", double12 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1277");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, (int) (short) 0, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) '#', (int) ' ');
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList6);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1278");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray6 = new double[] {};
        quarterlyDouble4.dArr = doubleArray6;
        double double8 = quarterlyDouble4.getTtm();
        double[] doubleArray9 = quarterlyDouble4.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        double double13 = quarterlyDouble10.deltaQ((int) '#', (int) (byte) -1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1279");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr((int) 'a', (int) (short) 100);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1280");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getSnp(snpEnum0, (int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1281");
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum0 = null;
        java.util.List<java.lang.String> strList3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getExch(exchEnum0, 0, (int) (byte) 1);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList6 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList3, (int) (short) 100, (int) 'a');
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList7 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData> manyCompanyDataList8 = net.ajaskey.market.tools.SIP.BigDB.collation.ManyCompanyData.createList(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(companyDataList6);
        org.junit.Assert.assertNotNull(manyCompanyDataList7);
        org.junit.Assert.assertNotNull(manyCompanyDataList8);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1282");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.lang.String str4 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList5 = companyData1.getFdList();
        java.lang.String str6 = companyData1.getTicker();
        java.lang.String str7 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData11 = net.ajaskey.market.tools.SIP.BigDB.collation.OneCompanyData.getFieldData(fieldDataList8, (int) (byte) -1, 1);
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNull(fieldData11);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1283");
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
            java.lang.String str15 = quarterlyDouble4.fmtGrowth4Q("\t\t\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
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
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1284");
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
        double[] doubleArray58 = quarterlyDouble4.dArr;
        java.lang.Class<?> wildcardClass59 = quarterlyDouble4.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[]");
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1285");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray11 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray11);
        double double13 = quarterlyDouble12.getTtm();
        double double14 = quarterlyDouble12.getPrevTtm();
        double double15 = quarterlyDouble12.getTtmAvg();
        double[] doubleArray19 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble20 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray19);
        double double21 = quarterlyDouble20.getTtm();
        double double23 = quarterlyDouble20.get((int) (byte) 1);
        double[] doubleArray24 = quarterlyDouble20.dArr;
        double[] doubleArray28 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble29 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray28);
        quarterlyDouble20.dArr = doubleArray28;
        quarterlyDouble12.dArr = doubleArray28;
        double[] doubleArray32 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble33 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray32);
        double double34 = quarterlyDouble33.getPrevTtm();
        double double35 = quarterlyDouble33.get2QTtm();
        double[] doubleArray39 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble40 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray39);
        double double41 = quarterlyDouble40.getTtmAvg();
        double[] doubleArray42 = new double[] {};
        quarterlyDouble40.dArr = doubleArray42;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble44 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray42);
        quarterlyDouble33.dArr = doubleArray42;
        quarterlyDouble12.dArr = doubleArray42;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble47 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray42);
        quarterlyDouble4.dArr = doubleArray42;
        java.lang.String str49 = quarterlyDouble4.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str51 = quarterlyDouble4.fmtGrowth1Q("\t\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[]");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1286");
        double[] doubleArray0 = null;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble1 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray0);
        double double2 = quarterlyDouble1.getPrevTtm();
        double double3 = quarterlyDouble1.get2QTtm();
        double double4 = quarterlyDouble1.get2QTtm();
        java.lang.String str5 = quarterlyDouble1.toString();
        double[] doubleArray6 = quarterlyDouble1.dArr;
        double double7 = quarterlyDouble1.getQoQ();
        double double8 = quarterlyDouble1.getQseqQ();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000" + "'", str5, "\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1287");
        java.util.List<java.lang.String> strList2 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.getAdr(100, (int) ' ');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1288");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getPrevTtm();
        double double7 = quarterlyDouble4.getTtmAvg();
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double9 = quarterlyDouble4.get2QTtm();
        double double11 = quarterlyDouble4.get((int) 'a');
        double[] doubleArray12 = quarterlyDouble4.dArr;
        double double13 = quarterlyDouble4.getTtm();
        double double14 = quarterlyDouble4.get2QTtm();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1289");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getPrevTtm();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = quarterlyDouble4.fmtGrowth1Q("\t\t\t                  :          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1290");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double double6 = quarterlyDouble4.getQseqQ();
        java.lang.String str7 = quarterlyDouble4.toString();
        double double8 = quarterlyDouble4.getTtmAvg();
        double double11 = quarterlyDouble4.deltaQ((int) ' ', (int) ' ');
        double double12 = quarterlyDouble4.get2QTtm();
        double double13 = quarterlyDouble4.getQseqQ();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = quarterlyDouble4.getQoQ();
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 200.0d + "'", double13 == 200.0d);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1291");
        net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData fieldData3 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompany("\t\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%)", (int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertNull(fieldData3);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1292");
        net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData companyData1 = new net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData("hi!");
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList2 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList3 = companyData1.getFdList();
        java.lang.String str4 = companyData1.getTicker();
        java.lang.String str5 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList6 = companyData1.getFdList();
        java.lang.String str7 = companyData1.getTicker();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList8 = companyData1.getFdList();
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.dataio.FieldData> fieldDataList9 = companyData1.getFdList();
        org.junit.Assert.assertNotNull(fieldDataList2);
        org.junit.Assert.assertNotNull(fieldDataList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(fieldDataList8);
        org.junit.Assert.assertNotNull(fieldDataList9);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1293");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double double7 = quarterlyDouble4.get(1);
        double double8 = quarterlyDouble4.getTtmAvg();
        double double9 = quarterlyDouble4.getTtm();
        double double12 = quarterlyDouble4.deltaQ((-1), (int) (short) -1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1294");
        net.ajaskey.market.tools.SIP.BigDB.SnpEnum snpEnum2 = null;
        net.ajaskey.market.tools.SIP.BigDB.DowEnum dowEnum3 = null;
        net.ajaskey.market.tools.SIP.BigDB.ExchEnum exchEnum4 = null;
        java.util.List<java.lang.String> strList7 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanySummary.get((int) (byte) -1, (int) '4', snpEnum2, dowEnum3, exchEnum4, (double) 0.0f, (long) (-1));
        java.util.List<net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData> companyDataList10 = net.ajaskey.market.tools.SIP.BigDB.collation.CompanyData.getCompanies(strList7, (int) (byte) 100, 0);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(companyDataList10);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1295");
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
        double double18 = quarterlyDouble4.deltaQ((int) (byte) 100, (int) (short) 0);
        java.lang.String str19 = quarterlyDouble4.toString();
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str19, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1296");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double double9 = quarterlyDouble4.getQseqQ();
        double double10 = quarterlyDouble4.getPrevTtm();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 200.0d + "'", double9 == 200.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1297");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.get((int) (byte) 1);
        double[] doubleArray8 = quarterlyDouble4.dArr;
        double[] doubleArray9 = new double[] {};
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble10 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        quarterlyDouble4.dArr = doubleArray9;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble12 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray9);
        double double13 = quarterlyDouble12.getPrevTtm();
        double[] doubleArray14 = quarterlyDouble12.dArr;
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1298");
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
        double[] doubleArray25 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble26 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray25);
        double double27 = quarterlyDouble26.getTtm();
        double double28 = quarterlyDouble26.getPrevTtm();
        double double29 = quarterlyDouble26.getTtmAvg();
        double[] doubleArray30 = quarterlyDouble26.dArr;
        double double31 = quarterlyDouble26.get2QTtm();
        double double33 = quarterlyDouble26.get((int) 'a');
        double[] doubleArray34 = quarterlyDouble26.dArr;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble35 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray34);
        quarterlyDouble9.dArr = doubleArray34;
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble37 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray34);
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
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-9999.9999d) + "'", double33 == (-9999.9999d));
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 1.0, -1.0]");
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1299");
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
        double double21 = quarterlyDouble4.get2QTtm();
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
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1300");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getTtm();
        double double6 = quarterlyDouble4.getTtm();
        double double7 = quarterlyDouble4.getMostRecent();
        double double8 = quarterlyDouble4.getQseqQ();
        double double11 = quarterlyDouble4.deltaQ(100, (int) (byte) 10);
        double double14 = quarterlyDouble4.deltaQ((int) '4', 10);
        double double16 = quarterlyDouble4.get(10);
        double double17 = quarterlyDouble4.getQseqQ();
        double double20 = quarterlyDouble4.deltaQ(10, (int) (short) 100);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 200.0d + "'", double8 == 200.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9999.9999d) + "'", double16 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 200.0d + "'", double17 == 200.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1301");
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
        java.lang.String str28 = quarterlyDouble4.fmtGrowth1Q("\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\t\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)" + "'", str28, "\t\t\t\t\t i=0 0.0000\t i=1 0.0000\t i=2 0.0000\t i=3 0.0000\t i=4 0.0000\t i=5 0.0000\t i=6 0.0000\t i=7 0.0000\t i=8 0.0000\t i=9 0.0000:          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%):          0.00 M (Seq=    0.00% : QoQ=    0.00%)");
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CollationTests2.test1302");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble quarterlyDouble4 = new net.ajaskey.market.tools.SIP.BigDB.collation.QuarterlyDouble(doubleArray3);
        double double5 = quarterlyDouble4.getMostRecent();
        double double6 = quarterlyDouble4.getQseqQ();
        java.lang.String str7 = quarterlyDouble4.toString();
        double double8 = quarterlyDouble4.getPrevTtm();
        double double9 = quarterlyDouble4.get2QTtm();
        double double11 = quarterlyDouble4.get((int) (short) 10);
        double double12 = quarterlyDouble4.getTtmAvg();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 200.0d + "'", double6 == 200.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000" + "'", str7, "\t i=0 100.0000\t i=1 1.0000\t i=2 -1.0000");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9999.9999d) + "'", double11 == (-9999.9999d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }
}

